// Description: Java 11 Object interface for CFBam BoolDef.

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

public interface ICFBamBoolDefObj
	extends ICFBamAtomObj
{
	/**
	 *	Get the current edition of this BoolDef instance as a ICFBamBoolDefEditObj.
	 *
	 *	@return	The ICFBamBoolDefEditObj edition of this instance.
	 */
	ICFBamBoolDefEditObj getEditAsBoolDef();

	/**
	 *	Get the ICFBamBoolDefTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamBoolDefTableObj table cache which manages this instance.
	 */
	ICFBamBoolDefTableObj getBoolDefTable();

	/**
	 *	Get the CFBamBoolDefBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamBoolDefBuff instance which currently backs this object.
	 */
	CFBamBoolDefBuff getBoolDefBuff();

	/**
	 *	Get the optional Boolean attribute InitValue.
	 *
	 *	@return	The optional Boolean attribute InitValue.
	 */
	Boolean getOptionalInitValue();

	/**
	 *	Get the optional String attribute FalseString.
	 *
	 *	@return	The optional String attribute FalseString.
	 */
	String getOptionalFalseString();

	/**
	 *	Get the optional String attribute TrueString.
	 *
	 *	@return	The optional String attribute TrueString.
	 */
	String getOptionalTrueString();

	/**
	 *	Get the optional String attribute NullString.
	 *
	 *	@return	The optional String attribute NullString.
	 */
	String getOptionalNullString();

}
