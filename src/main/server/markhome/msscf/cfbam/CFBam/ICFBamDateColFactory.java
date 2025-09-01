
// Description: Java 11 Factory interface for DateCol.

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
 *	CFBamDateColFactory interface for DateCol
 */
public interface ICFBamDateColFactory
{

	/**
	 *	Allocate a TableIdx key over DateCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamDateColByTableIdxKey newTableIdxKey();

	/**
	 *	Allocate a DateCol instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamDateColBuff newBuff();

	/**
	 *	Allocate a DateCol history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamDateColHBuff newHBuff();

}
