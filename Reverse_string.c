# include <stdio.h>
# include <String.h>
int main(){
    int i,len;
    char str[50],rev[50];
    printf("Enter a String: ");
    scanf("%s",str);
    len = strlen(str);
    for(i=0;i<len;i++){
        rev[i] = str[len-i-1];
    }
    rev[i] = '\0';
    printf("reversed string : %s",rev);
    return 0;
}