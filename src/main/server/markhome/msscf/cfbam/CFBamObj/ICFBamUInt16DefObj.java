// Description: Java 11 Object interface for CFBam UInt16Def.

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

public interface ICFBamUInt16DefObj
	extends ICFBamAtomObj
{
	/**
	 *	Get the current edition of this UInt16Def instance as a ICFBamUInt16DefEditObj.
	 *
	 *	@return	The ICFBamUInt16DefEditObj edition of this instance.
	 */
	ICFBamUInt16DefEditObj getEditAsUInt16Def();

	/**
	 *	Get the ICFBamUInt16DefTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamUInt16DefTableObj table cache which manages this instance.
	 */
	ICFBamUInt16DefTableObj getUInt16DefTable();

	/**
	 *	Get the CFBamUInt16DefBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamUInt16DefBuff instance which currently backs this object.
	 */
	CFBamUInt16DefBuff getUInt16DefBuff();

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
