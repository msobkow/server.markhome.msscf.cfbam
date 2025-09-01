// Description: Java 11 Object interface for CFBam StringDef.

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

public interface ICFBamStringDefObj
	extends ICFBamAtomObj
{
	/**
	 *	Get the current edition of this StringDef instance as a ICFBamStringDefEditObj.
	 *
	 *	@return	The ICFBamStringDefEditObj edition of this instance.
	 */
	ICFBamStringDefEditObj getEditAsStringDef();

	/**
	 *	Get the ICFBamStringDefTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamStringDefTableObj table cache which manages this instance.
	 */
	ICFBamStringDefTableObj getStringDefTable();

	/**
	 *	Get the CFBamStringDefBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamStringDefBuff instance which currently backs this object.
	 */
	CFBamStringDefBuff getStringDefBuff();

	/**
	 *	Get the required int attribute MaxLen.
	 *
	 *	@return	The required int attribute MaxLen.
	 */
	int getRequiredMaxLen();

	/**
	 *	Get the required boolean attribute IsPolymorph.
	 *
	 *	@return	The required boolean attribute IsPolymorph.
	 */
	boolean getRequiredIsPolymorph();

	/**
	 *	Get the optional String attribute InitValue.
	 *
	 *	@return	The optional String attribute InitValue.
	 */
	String getOptionalInitValue();

}
