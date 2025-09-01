// Description: Java 11 Object interface for CFBam FloatDef.

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

public interface ICFBamFloatDefObj
	extends ICFBamAtomObj
{
	/**
	 *	Get the current edition of this FloatDef instance as a ICFBamFloatDefEditObj.
	 *
	 *	@return	The ICFBamFloatDefEditObj edition of this instance.
	 */
	ICFBamFloatDefEditObj getEditAsFloatDef();

	/**
	 *	Get the ICFBamFloatDefTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamFloatDefTableObj table cache which manages this instance.
	 */
	ICFBamFloatDefTableObj getFloatDefTable();

	/**
	 *	Get the CFBamFloatDefBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamFloatDefBuff instance which currently backs this object.
	 */
	CFBamFloatDefBuff getFloatDefBuff();

	/**
	 *	Get the optional Float attribute InitValue.
	 *
	 *	@return	The optional Float attribute InitValue.
	 */
	Float getOptionalInitValue();

	/**
	 *	Get the optional Float attribute MinValue.
	 *
	 *	@return	The optional Float attribute MinValue.
	 */
	Float getOptionalMinValue();

	/**
	 *	Get the optional Float attribute MaxValue.
	 *
	 *	@return	The optional Float attribute MaxValue.
	 */
	Float getOptionalMaxValue();

}
