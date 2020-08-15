package day10_IfStatements;
/*
HTTP is the protocol that governs communications between webservers and web clients (i.e. browsers). Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request. Some of the codes and their meanings arelisted below:
    status code:
        200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable

1. declare an int variable called StatusCode
2. write a if statement that prints out, on a line by itself, the appropriate label from the above list based on status.
                    Example:
                        if status code = 200
                        output: ok
                        if status code = 201:
                        output: Created
            NOTE: use single if statements ONLY. DO NOT use more that one print statement

 */
public class HTTP_Status {

    public static void main(String[] args) {

        int statusCode = 202;
        String outPut = "";

        if (statusCode == 200){
            outPut = "OK";
        }else if (statusCode == 201){
            outPut = "Created";
        }else if (statusCode == 202){
            outPut = "Accepted";
        }else if (statusCode == 301){
            outPut = "Moved Permanently";
        }else if (statusCode == 303){
            outPut = "See Other";
        }else if (statusCode == 304){
            outPut = "Not Modified";
        }else if (statusCode == 307){
            outPut = "Temporary Redirect";
        }else if (statusCode == 400){
            outPut = "Bad Request";
        }else if (statusCode == 401){
            outPut = "Unauthorized";
        }else if (statusCode == 403){
            outPut = "Forbidden";
        }else if (statusCode == 404){
            outPut = "Not Found";
        }else if (statusCode == 410){
            outPut = "Gone";
        }else if (statusCode == 500) {
            outPut = "Internal Server error";
        }else if (statusCode == 503){
            outPut = "Service Unavailable";
        }else {
            outPut = "N/A";
        }
        System.out.println(outPut);

    }

}
