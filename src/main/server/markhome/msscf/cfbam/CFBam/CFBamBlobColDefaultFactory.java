
// Description: Java 11 Default Factory implementation for BlobCol.

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
	 *	CFBamBlobColFactory implementation for BlobCol
	 */
public class CFBamBlobColDefaultFactory
	implements ICFBamBlobColFactory
{
	public CFBamBlobColDefaultFactory() {
	}

	public CFBamBlobColByTableIdxKey newTableIdxKey() {
		CFBamBlobColByTableIdxKey key =
			new CFBamBlobColByTableIdxKey();
		return( key );
	}

	public CFBamBlobColBuff newBuff() {
		CFBamBlobColBuff buff =
			new CFBamBlobColBuff();
		return( buff );
	}

	public CFBamBlobColHBuff newHBuff() {
		CFBamBlobColHBuff hbuff =
			new CFBamBlobColHBuff();
		return( hbuff );
	}
}
