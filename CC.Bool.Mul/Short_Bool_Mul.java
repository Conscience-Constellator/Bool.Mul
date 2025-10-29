package CC.Util.Bool;

import CC.Bool.Short$Bool;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.Encycloped.Concept.Bool.BLoopr;
import CC.Encycloped.Concept.Bool.BLoopr_W_List_Havr.BLoopr_W_List_Havr_ConcrEt;
import CC.$.$Q.Bool_SOrc_List;
import java.util.List;

public class Short_Bool_Mul extends BLoopr_W_List_Havr_ConcrEt<Short$Bool> implements Short$Bool
{
	public static final Clas_Rap Class=Init_StRt(Short_Bool_Mul.class,
		Clas_Rap.class,
		Short$Bool.class
	);/*Dep done*/

	@Override
	public boolean Short$Bool(short Short)
	{
		return Get_BLoopr().$Bool(new Bool_SOrc_List<>(List().iterator())
		{
			@Override
			public boolean $Bool()
			{return next().To_Bool(Short);}
		});
	}

	public Short_Bool_Mul(BLoopr Boopr,List<Short$Bool> List){super(Boopr,List);}
		public Short_Bool_Mul(BLoopr Boopr,Short$Bool... List){super(Boopr,List);}
	public Short_Bool_Mul(){}

	static{Init_Nd(Short_Bool_Mul.class);}
}