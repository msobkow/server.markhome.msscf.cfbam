
// Description: Java 11 Default Factory implementation for TimeType.

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
	 *	CFBamTimeTypeFactory implementation for TimeType
	 */
public class CFBamTimeTypeDefaultFactory
	implements ICFBamTimeTypeFactory
{
	public CFBamTimeTypeDefaultFactory() {
	}

	public CFBamTimeTypeBySchemaIdxKey newSchemaIdxKey() {
		CFBamTimeTypeBySchemaIdxKey key =
			new CFBamTimeTypeBySchemaIdxKey();
		return( key );
	}

	public CFBamTimeTypeBuff newBuff() {
		CFBamTimeTypeBuff buff =
			new CFBamTimeTypeBuff();
		return( buff );
	}

	public CFBamTimeTypeHBuff newHBuff() {
		CFBamTimeTypeHBuff hbuff =
			new CFBamTimeTypeHBuff();
		return( hbuff );
	}
}
