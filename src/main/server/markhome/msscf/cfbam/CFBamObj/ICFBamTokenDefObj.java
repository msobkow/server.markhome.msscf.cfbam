// Description: Java 11 Object interface for CFBam TokenDef.

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

public interface ICFBamTokenDefObj
	extends ICFBamAtomObj
{
	/**
	 *	Get the current edition of this TokenDef instance as a ICFBamTokenDefEditObj.
	 *
	 *	@return	The ICFBamTokenDefEditObj edition of this instance.
	 */
	ICFBamTokenDefEditObj getEditAsTokenDef();

	/**
	 *	Get the ICFBamTokenDefTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamTokenDefTableObj table cache which manages this instance.
	 */
	ICFBamTokenDefTableObj getTokenDefTable();

	/**
	 *	Get the CFBamTokenDefBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamTokenDefBuff instance which currently backs this object.
	 */
	CFBamTokenDefBuff getTokenDefBuff();

	/**
	 *	Get the required int attribute MaxLen.
	 *
	 *	@return	The required int attribute MaxLen.
	 */
	int getRequiredMaxLen();

	/**
	 *	Get the optional String attribute InitValue.
	 *
	 *	@return	The optional String attribute InitValue.
	 */
	String getOptionalInitValue();

}
