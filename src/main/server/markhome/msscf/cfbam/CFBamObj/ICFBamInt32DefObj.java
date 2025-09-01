// Description: Java 11 Object interface for CFBam Int32Def.

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

public interface ICFBamInt32DefObj
	extends ICFBamAtomObj
{
	/**
	 *	Get the current edition of this Int32Def instance as a ICFBamInt32DefEditObj.
	 *
	 *	@return	The ICFBamInt32DefEditObj edition of this instance.
	 */
	ICFBamInt32DefEditObj getEditAsInt32Def();

	/**
	 *	Get the ICFBamInt32DefTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamInt32DefTableObj table cache which manages this instance.
	 */
	ICFBamInt32DefTableObj getInt32DefTable();

	/**
	 *	Get the CFBamInt32DefBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamInt32DefBuff instance which currently backs this object.
	 */
	CFBamInt32DefBuff getInt32DefBuff();

	/**
	 *	Get the optional Integer attribute InitValue.
	 *
	 *	@return	The optional Integer attribute InitValue.
	 */
	Integer getOptionalInitValue();

	/**
	 *	Get the optional Integer attribute MinValue.
	 *
	 *	@return	The optional Integer attribute MinValue.
	 */
	Integer getOptionalMinValue();

	/**
	 *	Get the optional Integer attribute MaxValue.
	 *
	 *	@return	The optional Integer attribute MaxValue.
	 */
	Integer getOptionalMaxValue();

}
