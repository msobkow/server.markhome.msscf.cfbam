
// Description: Java 11 Factory interface for StringCol.

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
 *	CFBamStringColFactory interface for StringCol
 */
public interface ICFBamStringColFactory
{

	/**
	 *	Allocate a TableIdx key over StringCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamStringColByTableIdxKey newTableIdxKey();

	/**
	 *	Allocate a StringCol instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamStringColBuff newBuff();

	/**
	 *	Allocate a StringCol history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamStringColHBuff newHBuff();

}
