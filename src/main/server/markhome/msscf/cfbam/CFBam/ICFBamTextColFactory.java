
// Description: Java 11 Factory interface for TextCol.

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
 *	CFBamTextColFactory interface for TextCol
 */
public interface ICFBamTextColFactory
{

	/**
	 *	Allocate a TableIdx key over TextCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamTextColByTableIdxKey newTableIdxKey();

	/**
	 *	Allocate a TextCol instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTextColBuff newBuff();

	/**
	 *	Allocate a TextCol history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTextColHBuff newHBuff();

}
