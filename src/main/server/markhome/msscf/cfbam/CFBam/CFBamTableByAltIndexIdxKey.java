// Description: Java 11 implementation of a Table by AltIndexIdx index key object.

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
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;

public class CFBamTableByAltIndexIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Long optionalAltIndexTenantId;
	protected Long optionalAltIndexId;
	public CFBamTableByAltIndexIdxKey() {
		optionalAltIndexTenantId = null;
		optionalAltIndexId = null;
	}

	public Long getOptionalAltIndexTenantId() {
		return( optionalAltIndexTenantId );
	}

	public void setOptionalAltIndexTenantId( Long value ) {
		if( value == null ) {
			optionalAltIndexTenantId = null;
		}
		else if( value < CFBamTableBuff.ALTINDEXTENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalAltIndexTenantId",
				1,
				"value",
				value,
				CFBamTableBuff.ALTINDEXTENANTID_MIN_VALUE );
		}
		else {
			optionalAltIndexTenantId = value;
		}
	}

	public Long getOptionalAltIndexId() {
		return( optionalAltIndexId );
	}

	public void setOptionalAltIndexId( Long value ) {
		if( value == null ) {
			optionalAltIndexId = null;
		}
		else if( value < CFBamTableBuff.ALTINDEXID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalAltIndexId",
				1,
				"value",
				value,
				CFBamTableBuff.ALTINDEXID_MIN_VALUE );
		}
		else {
			optionalAltIndexId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamTableByAltIndexIdxKey ) {
			CFBamTableByAltIndexIdxKey rhs = (CFBamTableByAltIndexIdxKey)obj;
			if( getOptionalAltIndexTenantId() != null ) {
				if( rhs.getOptionalAltIndexTenantId() != null ) {
					if( ! getOptionalAltIndexTenantId().equals( rhs.getOptionalAltIndexTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalAltIndexTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalAltIndexId() != null ) {
				if( rhs.getOptionalAltIndexId() != null ) {
					if( ! getOptionalAltIndexId().equals( rhs.getOptionalAltIndexId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalAltIndexId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFBamTableBuff ) {
			CFBamTableBuff rhs = (CFBamTableBuff)obj;
			if( getOptionalAltIndexTenantId() != null ) {
				if( rhs.getOptionalAltIndexTenantId() != null ) {
					if( ! getOptionalAltIndexTenantId().equals( rhs.getOptionalAltIndexTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalAltIndexTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalAltIndexId() != null ) {
				if( rhs.getOptionalAltIndexId() != null ) {
					if( ! getOptionalAltIndexId().equals( rhs.getOptionalAltIndexId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalAltIndexId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else {
			return( false );
		}
	}

	public int hashCode() {
		int hashCode = 0;
		if( getOptionalAltIndexTenantId() != null ) {
			hashCode = hashCode + getOptionalAltIndexTenantId().hashCode();
		}
		if( getOptionalAltIndexId() != null ) {
			hashCode = hashCode + getOptionalAltIndexId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamTableByAltIndexIdxKey ) {
			CFBamTableByAltIndexIdxKey rhs = (CFBamTableByAltIndexIdxKey)obj;
			if( getOptionalAltIndexTenantId() != null ) {
				Long lhsAltIndexTenantId = getOptionalAltIndexTenantId();
				if( rhs.getOptionalAltIndexTenantId() != null ) {
					Long rhsAltIndexTenantId = rhs.getOptionalAltIndexTenantId();
					int cmp = lhsAltIndexTenantId.compareTo( rhsAltIndexTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalAltIndexTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalAltIndexId() != null ) {
				Long lhsAltIndexId = getOptionalAltIndexId();
				if( rhs.getOptionalAltIndexId() != null ) {
					Long rhsAltIndexId = rhs.getOptionalAltIndexId();
					int cmp = lhsAltIndexId.compareTo( rhsAltIndexId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalAltIndexId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFBamTableBuff ) {
			CFBamTableBuff rhs = (CFBamTableBuff)obj;
			if( getOptionalAltIndexTenantId() != null ) {
				Long lhsAltIndexTenantId = getOptionalAltIndexTenantId();
				if( rhs.getOptionalAltIndexTenantId() != null ) {
					Long rhsAltIndexTenantId = rhs.getOptionalAltIndexTenantId();
					int cmp = lhsAltIndexTenantId.compareTo( rhsAltIndexTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalAltIndexTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalAltIndexId() != null ) {
				Long lhsAltIndexId = getOptionalAltIndexId();
				if( rhs.getOptionalAltIndexId() != null ) {
					Long rhsAltIndexId = rhs.getOptionalAltIndexId();
					int cmp = lhsAltIndexId.compareTo( rhsAltIndexId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalAltIndexId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	public String toString() {
		String ret = "<CFBamTableByAltIndexIdx"
			+ " OptionalAltIndexTenantId=" + ( ( getOptionalAltIndexTenantId() == null ) ? "null" : "\"" + getOptionalAltIndexTenantId().toString() + "\"" )
			+ " OptionalAltIndexId=" + ( ( getOptionalAltIndexId() == null ) ? "null" : "\"" + getOptionalAltIndexId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
