
// Description: Java 11 Default Factory implementation for TZTimeType.

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
	 *	CFBamTZTimeTypeFactory implementation for TZTimeType
	 */
public class CFBamTZTimeTypeDefaultFactory
	implements ICFBamTZTimeTypeFactory
{
	public CFBamTZTimeTypeDefaultFactory() {
	}

	public CFBamTZTimeTypeBySchemaIdxKey newSchemaIdxKey() {
		CFBamTZTimeTypeBySchemaIdxKey key =
			new CFBamTZTimeTypeBySchemaIdxKey();
		return( key );
	}

	public CFBamTZTimeTypeBuff newBuff() {
		CFBamTZTimeTypeBuff buff =
			new CFBamTZTimeTypeBuff();
		return( buff );
	}

	public CFBamTZTimeTypeHBuff newHBuff() {
		CFBamTZTimeTypeHBuff hbuff =
			new CFBamTZTimeTypeHBuff();
		return( hbuff );
	}
}
