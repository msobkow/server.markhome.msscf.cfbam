
// Description: Java 11 Default Factory implementation for UuidCol.

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
	 *	CFBamUuidColFactory implementation for UuidCol
	 */
public class CFBamUuidColDefaultFactory
	implements ICFBamUuidColFactory
{
	public CFBamUuidColDefaultFactory() {
	}

	public CFBamUuidColByTableIdxKey newTableIdxKey() {
		CFBamUuidColByTableIdxKey key =
			new CFBamUuidColByTableIdxKey();
		return( key );
	}

	public CFBamUuidColBuff newBuff() {
		CFBamUuidColBuff buff =
			new CFBamUuidColBuff();
		return( buff );
	}

	public CFBamUuidColHBuff newHBuff() {
		CFBamUuidColHBuff hbuff =
			new CFBamUuidColHBuff();
		return( hbuff );
	}
}
