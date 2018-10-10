class Soliution
{
public static int countBuildings(int num[])
{
  int currentMax = num[0];
  int count =1;
  for(int i = 1; i <num.length; i++)
  {
    if(a[i]>currentMax)
    {
    count++;
    currentMax=arr[i]; 
    }
  }
  
  return count;
  
}

}
   
   
   
