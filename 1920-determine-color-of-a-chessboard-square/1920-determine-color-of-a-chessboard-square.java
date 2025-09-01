class Solution {
    public boolean squareIsWhite(String coordinates) {
        char a=coordinates.charAt(0);
        int x;
        if(a=='a'){
            x=1;
        }
        else if(a=='b'){
            x=2;
        }
        else if(a=='c'){
            x=3;
        }
        else if(a=='d'){
            x=4;
        }
        else if(a=='e'){
            x=5;
        }
        else if(a=='f'){
            x=6;
        }
        else if(a=='g'){
            x=7;
        }
        else if(a=='h'){
            x=8;
        }
        else{
            x=0;
        }
        int y=coordinates.charAt(1)-'0';
        if((x+y)%2==0)return false;
        else return true;


    }
}