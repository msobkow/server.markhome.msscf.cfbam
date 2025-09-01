
// Description: Java 11 Default Factory implementation for TZTimestampCol.

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
	 *	CFBamTZTimestampColFactory implementation for TZTimestampCol
	 */
public class CFBamTZTimestampColDefaultFactory
	implements ICFBamTZTimestampColFactory
{
	public CFBamTZTimestampColDefaultFactory() {
	}

	public CFBamTZTimestampColByTableIdxKey newTableIdxKey() {
		CFBamTZTimestampColByTableIdxKey key =
			new CFBamTZTimestampColByTableIdxKey();
		return( key );
	}

	public CFBamTZTimestampColBuff newBuff() {
		CFBamTZTimestampColBuff buff =
			new CFBamTZTimestampColBuff();
		return( buff );
	}

	public CFBamTZTimestampColHBuff newHBuff() {
		CFBamTZTimestampColHBuff hbuff =
			new CFBamTZTimestampColHBuff();
		return( hbuff );
	}
}
