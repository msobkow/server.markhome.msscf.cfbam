// Description: Java 11 Object interface for CFBam TZTimeDef.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import server.markhome.msscf.cfbam.CFBam.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBam.*;

public interface ICFBamTZTimeDefObj
	extends ICFBamAtomObj
{
	/**
	 *	Get the current edition of this TZTimeDef instance as a ICFBamTZTimeDefEditObj.
	 *
	 *	@return	The ICFBamTZTimeDefEditObj edition of this instance.
	 */
	ICFBamTZTimeDefEditObj getEditAsTZTimeDef();

	/**
	 *	Get the ICFBamTZTimeDefTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamTZTimeDefTableObj table cache which manages this instance.
	 */
	ICFBamTZTimeDefTableObj getTZTimeDefTable();

	/**
	 *	Get the CFBamTZTimeDefBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamTZTimeDefBuff instance which currently backs this object.
	 */
	CFBamTZTimeDefBuff getTZTimeDefBuff();

	/**
	 *	Get the optional String attribute Dummy.
	 *
	 *	@return	The optional String attribute Dummy.
	 */
	String getOptionalDummy();

}
