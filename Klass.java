import java.awt.image.*;
import javax.imageio.*;
import java.awt.*;
import java.net.*;
import java.io.*;
public class Klass{
    protected String readFrom;
    public Klass(String url){
        readFrom = url;
    }
    public int readFile(){
        BufferedImage bi=new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
        Graphics g=bi.createGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 400, 300);
        String aadress=readFrom;
        BufferedReader br=new BufferedReader(new InputStreamReader(
          new URL(aadress).openStream()));
        String rida=br.readLine();
        rida=br.readLine();
        int mKeskm = 0;
        int nKeskm = 0;
        while(rida!=null){
            String[] m=rida.split(",");
            if(m[3].equals("m")){
                mKeskm+=Integer.parseInt(m[3]);
            }else{
                nKeskm+=Integer.parseInt(m[3]);
            }
            rida=br.readLine();
        }

        return System.out.println(mKeskm);
        /*g.fillRect(Integer.parseInt(m[1]), Integer.parseInt(m[2])*4, 5, 5);
        ImageIO.write(bi, "png", new File("5.png"));*/
    }
    /*@Override
    public String toString(){
        return mKeskm+"  -  "+nKeskm;
    }*/
}