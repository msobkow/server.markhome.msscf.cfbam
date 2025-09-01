
// Description: Java 11 Factory interface for TimestampCol.

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
 *	CFBamTimestampColFactory interface for TimestampCol
 */
public interface ICFBamTimestampColFactory
{

	/**
	 *	Allocate a TableIdx key over TimestampCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamTimestampColByTableIdxKey newTableIdxKey();

	/**
	 *	Allocate a TimestampCol instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTimestampColBuff newBuff();

	/**
	 *	Allocate a TimestampCol history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTimestampColHBuff newHBuff();

}
