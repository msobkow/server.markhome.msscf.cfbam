
// Description: Java 11 Factory interface for UuidCol.

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
 *	CFBamUuidColFactory interface for UuidCol
 */
public interface ICFBamUuidColFactory
{

	/**
	 *	Allocate a TableIdx key over UuidCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamUuidColByTableIdxKey newTableIdxKey();

	/**
	 *	Allocate a UuidCol instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUuidColBuff newBuff();

	/**
	 *	Allocate a UuidCol history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUuidColHBuff newHBuff();

}
