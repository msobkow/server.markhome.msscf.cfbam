// Description: Java 11 implementation of a TableCol by DataIdx index key object.

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

public class CFBamTableColByDataIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Long optionalDataTenantId;
	protected Long optionalDataId;
	public CFBamTableColByDataIdxKey() {
		optionalDataTenantId = null;
		optionalDataId = null;
	}

	public Long getOptionalDataTenantId() {
		return( optionalDataTenantId );
	}

	public void setOptionalDataTenantId( Long value ) {
		if( value == null ) {
			optionalDataTenantId = null;
		}
		else if( value < CFBamTableColBuff.DATATENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalDataTenantId",
				1,
				"value",
				value,
				CFBamTableColBuff.DATATENANTID_MIN_VALUE );
		}
		else {
			optionalDataTenantId = value;
		}
	}

	public Long getOptionalDataId() {
		return( optionalDataId );
	}

	public void setOptionalDataId( Long value ) {
		if( value == null ) {
			optionalDataId = null;
		}
		else if( value < CFBamTableColBuff.DATAID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalDataId",
				1,
				"value",
				value,
				CFBamTableColBuff.DATAID_MIN_VALUE );
		}
		else {
			optionalDataId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamTableColByDataIdxKey ) {
			CFBamTableColByDataIdxKey rhs = (CFBamTableColByDataIdxKey)obj;
			if( getOptionalDataTenantId() != null ) {
				if( rhs.getOptionalDataTenantId() != null ) {
					if( ! getOptionalDataTenantId().equals( rhs.getOptionalDataTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDataTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalDataId() != null ) {
				if( rhs.getOptionalDataId() != null ) {
					if( ! getOptionalDataId().equals( rhs.getOptionalDataId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDataId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFBamTableColBuff ) {
			CFBamTableColBuff rhs = (CFBamTableColBuff)obj;
			if( getOptionalDataTenantId() != null ) {
				if( rhs.getOptionalDataTenantId() != null ) {
					if( ! getOptionalDataTenantId().equals( rhs.getOptionalDataTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDataTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalDataId() != null ) {
				if( rhs.getOptionalDataId() != null ) {
					if( ! getOptionalDataId().equals( rhs.getOptionalDataId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDataId() != null ) {
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
		if( getOptionalDataTenantId() != null ) {
			hashCode = hashCode + getOptionalDataTenantId().hashCode();
		}
		if( getOptionalDataId() != null ) {
			hashCode = hashCode + getOptionalDataId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamTableColByDataIdxKey ) {
			CFBamTableColByDataIdxKey rhs = (CFBamTableColByDataIdxKey)obj;
			if( getOptionalDataTenantId() != null ) {
				Long lhsDataTenantId = getOptionalDataTenantId();
				if( rhs.getOptionalDataTenantId() != null ) {
					Long rhsDataTenantId = rhs.getOptionalDataTenantId();
					int cmp = lhsDataTenantId.compareTo( rhsDataTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDataTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDataId() != null ) {
				Long lhsDataId = getOptionalDataId();
				if( rhs.getOptionalDataId() != null ) {
					Long rhsDataId = rhs.getOptionalDataId();
					int cmp = lhsDataId.compareTo( rhsDataId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDataId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFBamTableColBuff ) {
			CFBamTableColBuff rhs = (CFBamTableColBuff)obj;
			if( getOptionalDataTenantId() != null ) {
				Long lhsDataTenantId = getOptionalDataTenantId();
				if( rhs.getOptionalDataTenantId() != null ) {
					Long rhsDataTenantId = rhs.getOptionalDataTenantId();
					int cmp = lhsDataTenantId.compareTo( rhsDataTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDataTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDataId() != null ) {
				Long lhsDataId = getOptionalDataId();
				if( rhs.getOptionalDataId() != null ) {
					Long rhsDataId = rhs.getOptionalDataId();
					int cmp = lhsDataId.compareTo( rhsDataId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDataId() != null ) {
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
		String ret = "<CFBamTableColByDataIdx"
			+ " OptionalDataTenantId=" + ( ( getOptionalDataTenantId() == null ) ? "null" : "\"" + getOptionalDataTenantId().toString() + "\"" )
			+ " OptionalDataId=" + ( ( getOptionalDataId() == null ) ? "null" : "\"" + getOptionalDataId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
