
// Description: Java 11 Factory interface for Id16Gen.

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
 *	CFBamId16GenFactory interface for Id16Gen
 */
public interface ICFBamId16GenFactory
{

	/**
	 *	Allocate a DispIdx key over Id16Gen instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamId16GenByDispIdxKey newDispIdxKey();

	/**
	 *	Allocate a Id16Gen instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamId16GenBuff newBuff();

	/**
	 *	Allocate a Id16Gen history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamId16GenHBuff newHBuff();

}
