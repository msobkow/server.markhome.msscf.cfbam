
// Description: Java 11 Default Factory implementation for TZTimestampType.

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
	 *	CFBamTZTimestampTypeFactory implementation for TZTimestampType
	 */
public class CFBamTZTimestampTypeDefaultFactory
	implements ICFBamTZTimestampTypeFactory
{
	public CFBamTZTimestampTypeDefaultFactory() {
	}

	public CFBamTZTimestampTypeBySchemaIdxKey newSchemaIdxKey() {
		CFBamTZTimestampTypeBySchemaIdxKey key =
			new CFBamTZTimestampTypeBySchemaIdxKey();
		return( key );
	}

	public CFBamTZTimestampTypeBuff newBuff() {
		CFBamTZTimestampTypeBuff buff =
			new CFBamTZTimestampTypeBuff();
		return( buff );
	}

	public CFBamTZTimestampTypeHBuff newHBuff() {
		CFBamTZTimestampTypeHBuff hbuff =
			new CFBamTZTimestampTypeHBuff();
		return( hbuff );
	}
}
