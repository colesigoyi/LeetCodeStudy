/**
 * @ program: LeetCodeStudy
 * @ author:  TaoXueFeng
 * @ create: 2019-07-16 21:04
 * @ desc: 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本
 * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
 * 输入：address = "255.100.50.0"
 * 输出："255[.]100[.]50[.]0"
 **/

public class deFangIPAddr {

    public String defangIPaddr(String address){
        String str = address;
        String defangIP = str.replace(".", "[.]");
        return defangIP;
    }
}
