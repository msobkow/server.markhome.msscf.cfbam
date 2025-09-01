
// Description: Java 11 Factory interface for TimeCol.

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
 *	CFBamTimeColFactory interface for TimeCol
 */
public interface ICFBamTimeColFactory
{

	/**
	 *	Allocate a TableIdx key over TimeCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamTimeColByTableIdxKey newTableIdxKey();

	/**
	 *	Allocate a TimeCol instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTimeColBuff newBuff();

	/**
	 *	Allocate a TimeCol history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTimeColHBuff newHBuff();

}
