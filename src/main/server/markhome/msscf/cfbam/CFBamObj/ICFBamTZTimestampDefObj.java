// Description: Java 11 Object interface for CFBam TZTimestampDef.

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

public interface ICFBamTZTimestampDefObj
	extends ICFBamAtomObj
{
	/**
	 *	Get the current edition of this TZTimestampDef instance as a ICFBamTZTimestampDefEditObj.
	 *
	 *	@return	The ICFBamTZTimestampDefEditObj edition of this instance.
	 */
	ICFBamTZTimestampDefEditObj getEditAsTZTimestampDef();

	/**
	 *	Get the ICFBamTZTimestampDefTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamTZTimestampDefTableObj table cache which manages this instance.
	 */
	ICFBamTZTimestampDefTableObj getTZTimestampDefTable();

	/**
	 *	Get the CFBamTZTimestampDefBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamTZTimestampDefBuff instance which currently backs this object.
	 */
	CFBamTZTimestampDefBuff getTZTimestampDefBuff();

	/**
	 *	Get the optional String attribute Dummy.
	 *
	 *	@return	The optional String attribute Dummy.
	 */
	String getOptionalDummy();

}
