
// Description: Java 11 Default Factory implementation for MimeType.

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
	 *	CFBamMimeTypeFactory implementation for MimeType
	 */
public class CFBamMimeTypeDefaultFactory
	extends CFIntMimeTypeDefaultFactory
	implements ICFBamMimeTypeFactory
{
	public CFBamMimeTypeDefaultFactory() {
		super();
	}

	public CFIntMimeTypePKey newPKey() {
		CFIntMimeTypePKey pkey =
			new CFIntMimeTypePKey();
		return( pkey );
	}

	public CFIntMimeTypeHPKey newHPKey() {
		CFIntMimeTypeHPKey hpkey =
			new CFIntMimeTypeHPKey();
		return( hpkey );
	}

	public CFIntMimeTypeByUNameIdxKey newUNameIdxKey() {
		CFIntMimeTypeByUNameIdxKey key =
			new CFIntMimeTypeByUNameIdxKey();
		return( key );
	}

	public CFIntMimeTypeBuff newBuff() {
		CFIntMimeTypeBuff buff =
			new CFIntMimeTypeBuff();
		return( buff );
	}

	public CFIntMimeTypeHBuff newHBuff() {
		CFIntMimeTypeHBuff hbuff =
			new CFIntMimeTypeHBuff();
		return( hbuff );
	}
}
