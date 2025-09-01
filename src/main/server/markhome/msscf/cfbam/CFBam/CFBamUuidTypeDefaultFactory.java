
// Description: Java 11 Default Factory implementation for UuidType.

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
	 *	CFBamUuidTypeFactory implementation for UuidType
	 */
public class CFBamUuidTypeDefaultFactory
	implements ICFBamUuidTypeFactory
{
	public CFBamUuidTypeDefaultFactory() {
	}

	public CFBamUuidTypeBySchemaIdxKey newSchemaIdxKey() {
		CFBamUuidTypeBySchemaIdxKey key =
			new CFBamUuidTypeBySchemaIdxKey();
		return( key );
	}

	public CFBamUuidTypeBuff newBuff() {
		CFBamUuidTypeBuff buff =
			new CFBamUuidTypeBuff();
		return( buff );
	}

	public CFBamUuidTypeHBuff newHBuff() {
		CFBamUuidTypeHBuff hbuff =
			new CFBamUuidTypeHBuff();
		return( hbuff );
	}
}
