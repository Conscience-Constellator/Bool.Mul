package CC.Util.Bool;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.Encycloped.Concept.Bool.BLoopr;
import CC.Encycloped.Concept.Bool.BLoopr_W_List_Havr.BLoopr_W_List_Havr_ConcrEt;
import CC.$.$Q.Bool_SOrc_List;
import java.util.List;

public class Byt_Bool_Mul extends BLoopr_W_List_Havr_ConcrEt<Byt$Bool> implements Byt$Bool
{
	public static final Clas_Rap Class=Init_StRt(Byt_Bool_Mul.class
		,Clas_Rap.class
		,Byt$Bool.class
	);/*Dep done*/

	@Override
	public boolean To_Bool(byte Byt)
	{
		return Get_BLoopr().$Bool(
			new Bool_SOrc_List<>(List().iterator())
			{
				@Override public boolean $Bool()
				{return next().To_Bool(Byt);}
			}
		);
	}

	public Byt_Bool_Mul(BLoopr BLoopr,List<Byt$Bool> List)
	{super(BLoopr,List);}
		public Byt_Bool_Mul(BLoopr BLoopr,Byt$Bool... List)
		{super(BLoopr,List);}
	public Byt_Bool_Mul()
	{}

	static{Init_Nd(Byt_Bool_Mul.class);}
}