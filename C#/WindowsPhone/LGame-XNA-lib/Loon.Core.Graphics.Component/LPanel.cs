using System;
using System.Collections.Generic;
using Loon.Core.Graphics.Opengl;

namespace Loon.Core.Graphics.Component
{
    public class LPanel : LContainer {

	public LPanel(int x, int y, int w, int h):base(x, y, w, h) {
		this.customRendering = true;
	}

    public override string GetUIName()
    {
		return "Panel";
	}

    public override void CreateUI(GLEx g, int x, int y, LComponent component,
			LTexture[] buttonImage) {
     

	}
}

}
