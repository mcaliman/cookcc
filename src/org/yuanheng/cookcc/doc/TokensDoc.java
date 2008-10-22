/*
 * Copyright (c) 2008, Heng Yuan
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the Heng Yuan nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY Heng Yuan ''AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL Heng Yuan BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.yuanheng.cookcc.doc;

import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * @author Heng Yuan
 * @version $Id$
 */
public class TokensDoc extends TreeDoc
{
	private String m_type;
	private String[] m_tokens;
	private int m_lineNumber;

	public TokensDoc ()
	{
	}

	public void setType (String type)
	{
		m_type = type;
	}

	public String getType ()
	{
		return m_type;
	}

	public String[] getTokens ()
	{
		return m_tokens;
	}

	public void setTokens (String tokens)
	{
		StringTokenizer tokenizer = new StringTokenizer (tokens, ", \r\n");
		LinkedList<String> list = new LinkedList<String> ();
		while (tokenizer.hasMoreTokens ())
		{
			String tok = tokenizer.nextToken ().trim ();
			if (tok.length () == 0)
				continue;
			if (!list.contains (tok))
				list.add (tok);
		}
		m_tokens = list.toArray (new String[list.size ()]);
	}

	public int getLineNumber ()
	{
		return m_lineNumber;
	}

	public void setLineNumber (int lineNumber)
	{
		m_lineNumber = lineNumber;
	}
}
