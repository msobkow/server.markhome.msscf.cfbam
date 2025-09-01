
// Description: Java 11 Factory interface for BoolCol.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;

/*
 *	CFBamBoolColFactory interface for BoolCol
 */
public interface ICFBamBoolColFactory
{

	/**
	 *	Allocate a TableIdx key over BoolCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamBoolColByTableIdxKey newTableIdxKey();

	/**
	 *	Allocate a BoolCol instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamBoolColBuff newBuff();

	/**
	 *	Allocate a BoolCol history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamBoolColHBuff newHBuff();

}
