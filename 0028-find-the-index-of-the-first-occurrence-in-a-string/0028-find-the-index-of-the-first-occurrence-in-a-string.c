int strStr(char* haystack, char* needle) {
    char * res;
    res=strstr(haystack,needle);
    if(res!=NULL){
        return res - haystack; 
    }
    else{
        return -1;
    }
}