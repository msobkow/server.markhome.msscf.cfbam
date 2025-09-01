
// Description: Java 11 Default Factory implementation for Param.

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
	 *	CFBamParamFactory implementation for Param
	 */
public class CFBamParamDefaultFactory
	implements ICFBamParamFactory
{
	public CFBamParamDefaultFactory() {
	}

	public CFBamParamPKey newPKey() {
		CFBamParamPKey pkey =
			new CFBamParamPKey();
		return( pkey );
	}

	public CFBamParamHPKey newHPKey() {
		CFBamParamHPKey hpkey =
			new CFBamParamHPKey();
		return( hpkey );
	}

	public CFBamParamByUNameIdxKey newUNameIdxKey() {
		CFBamParamByUNameIdxKey key =
			new CFBamParamByUNameIdxKey();
		return( key );
	}

	public CFBamParamByValTentIdxKey newValTentIdxKey() {
		CFBamParamByValTentIdxKey key =
			new CFBamParamByValTentIdxKey();
		return( key );
	}

	public CFBamParamByServerMethodIdxKey newServerMethodIdxKey() {
		CFBamParamByServerMethodIdxKey key =
			new CFBamParamByServerMethodIdxKey();
		return( key );
	}

	public CFBamParamByDefSchemaIdxKey newDefSchemaIdxKey() {
		CFBamParamByDefSchemaIdxKey key =
			new CFBamParamByDefSchemaIdxKey();
		return( key );
	}

	public CFBamParamByServerTypeIdxKey newServerTypeIdxKey() {
		CFBamParamByServerTypeIdxKey key =
			new CFBamParamByServerTypeIdxKey();
		return( key );
	}

	public CFBamParamByPrevIdxKey newPrevIdxKey() {
		CFBamParamByPrevIdxKey key =
			new CFBamParamByPrevIdxKey();
		return( key );
	}

	public CFBamParamByNextIdxKey newNextIdxKey() {
		CFBamParamByNextIdxKey key =
			new CFBamParamByNextIdxKey();
		return( key );
	}

	public CFBamParamByContPrevIdxKey newContPrevIdxKey() {
		CFBamParamByContPrevIdxKey key =
			new CFBamParamByContPrevIdxKey();
		return( key );
	}

	public CFBamParamByContNextIdxKey newContNextIdxKey() {
		CFBamParamByContNextIdxKey key =
			new CFBamParamByContNextIdxKey();
		return( key );
	}

	public CFBamParamBuff newBuff() {
		CFBamParamBuff buff =
			new CFBamParamBuff();
		return( buff );
	}

	public CFBamParamHBuff newHBuff() {
		CFBamParamHBuff hbuff =
			new CFBamParamHBuff();
		return( hbuff );
	}
}
