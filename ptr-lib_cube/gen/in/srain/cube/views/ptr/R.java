/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package in.srain.cube.views.ptr;

public final class R {
    public static final class attr {
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int ptr_content=0x7f010001;
        /** <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int ptr_duration_to_close=0x7f010004;
        /** <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int ptr_duration_to_close_header=0x7f010005;
        /**  Optional. If you put header and content in xml, you can you these to specify them. 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int ptr_header=0x7f010000;
        /**  keep header when refreshing
         <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int ptr_keep_header_when_refresh=0x7f010007;
        /**  pull to refresh, otherwise release to refresh, default is release to refresh 
         <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int ptr_pull_to_fresh=0x7f010006;
        /**  the ration of the height of the header to trigger refresh 
         <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int ptr_ratio_of_header_height_to_refresh=0x7f010003;
        /**  the resistance when you are moving the frame 
         <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int ptr_resistance=0x7f010002;
        /** <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int ptr_rotate_ani_time=0x7f010008;
    }
    public static final class drawable {
        public static int buildings=0x7f020000;
        public static int ptr_rotate_arrow=0x7f020001;
        public static int sky=0x7f020002;
        public static int sun=0x7f020003;
    }
    public static final class id {
        public static int ptr_classic_header_rotate_view=0x7f050003;
        public static int ptr_classic_header_rotate_view_header_last_update=0x7f050002;
        public static int ptr_classic_header_rotate_view_header_text=0x7f050000;
        public static int ptr_classic_header_rotate_view_header_title=0x7f050001;
        public static int ptr_classic_header_rotate_view_progressbar=0x7f050004;
    }
    public static final class layout {
        public static int cube_ptr_classic_default_header=0x7f030000;
        public static int cube_ptr_simple_loading=0x7f030001;
    }
    public static final class string {
        public static int cube_ptr_hours_ago=0x7f040008;
        public static int cube_ptr_last_update=0x7f040005;
        public static int cube_ptr_minutes_ago=0x7f040007;
        public static int cube_ptr_pull_down=0x7f040000;
        public static int cube_ptr_pull_down_to_refresh=0x7f040001;
        public static int cube_ptr_refresh_complete=0x7f040004;
        public static int cube_ptr_refreshing=0x7f040003;
        public static int cube_ptr_release_to_refresh=0x7f040002;
        public static int cube_ptr_seconds_ago=0x7f040006;
    }
    public static final class styleable {
        /** Attributes that can be used with a PtrClassicHeader.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #PtrClassicHeader_ptr_rotate_ani_time in.srain.cube.views.ptr:ptr_rotate_ani_time}</code></td><td></td></tr>
           </table>
           @see #PtrClassicHeader_ptr_rotate_ani_time
         */
        public static final int[] PtrClassicHeader = {
            0x7f010008
        };
        /**
          <p>This symbol is the offset where the {@link in.srain.cube.views.ptr.R.attr#ptr_rotate_ani_time}
          attribute's value can be found in the {@link #PtrClassicHeader} array.


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name in.srain.cube.views.ptr:ptr_rotate_ani_time
        */
        public static final int PtrClassicHeader_ptr_rotate_ani_time = 0;
        /** Attributes that can be used with a PtrFrameLayout.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #PtrFrameLayout_ptr_content in.srain.cube.views.ptr:ptr_content}</code></td><td></td></tr>
           <tr><td><code>{@link #PtrFrameLayout_ptr_duration_to_close in.srain.cube.views.ptr:ptr_duration_to_close}</code></td><td></td></tr>
           <tr><td><code>{@link #PtrFrameLayout_ptr_duration_to_close_header in.srain.cube.views.ptr:ptr_duration_to_close_header}</code></td><td></td></tr>
           <tr><td><code>{@link #PtrFrameLayout_ptr_header in.srain.cube.views.ptr:ptr_header}</code></td><td> Optional.</td></tr>
           <tr><td><code>{@link #PtrFrameLayout_ptr_keep_header_when_refresh in.srain.cube.views.ptr:ptr_keep_header_when_refresh}</code></td><td> keep header when refreshing</td></tr>
           <tr><td><code>{@link #PtrFrameLayout_ptr_pull_to_fresh in.srain.cube.views.ptr:ptr_pull_to_fresh}</code></td><td> pull to refresh, otherwise release to refresh, default is release to refresh </td></tr>
           <tr><td><code>{@link #PtrFrameLayout_ptr_ratio_of_header_height_to_refresh in.srain.cube.views.ptr:ptr_ratio_of_header_height_to_refresh}</code></td><td> the ration of the height of the header to trigger refresh </td></tr>
           <tr><td><code>{@link #PtrFrameLayout_ptr_resistance in.srain.cube.views.ptr:ptr_resistance}</code></td><td> the resistance when you are moving the frame </td></tr>
           </table>
           @see #PtrFrameLayout_ptr_content
           @see #PtrFrameLayout_ptr_duration_to_close
           @see #PtrFrameLayout_ptr_duration_to_close_header
           @see #PtrFrameLayout_ptr_header
           @see #PtrFrameLayout_ptr_keep_header_when_refresh
           @see #PtrFrameLayout_ptr_pull_to_fresh
           @see #PtrFrameLayout_ptr_ratio_of_header_height_to_refresh
           @see #PtrFrameLayout_ptr_resistance
         */
        public static final int[] PtrFrameLayout = {
            0x7f010000, 0x7f010001, 0x7f010002, 0x7f010003,
            0x7f010004, 0x7f010005, 0x7f010006, 0x7f010007
        };
        /**
          <p>This symbol is the offset where the {@link in.srain.cube.views.ptr.R.attr#ptr_content}
          attribute's value can be found in the {@link #PtrFrameLayout} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name in.srain.cube.views.ptr:ptr_content
        */
        public static final int PtrFrameLayout_ptr_content = 1;
        /**
          <p>This symbol is the offset where the {@link in.srain.cube.views.ptr.R.attr#ptr_duration_to_close}
          attribute's value can be found in the {@link #PtrFrameLayout} array.


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name in.srain.cube.views.ptr:ptr_duration_to_close
        */
        public static final int PtrFrameLayout_ptr_duration_to_close = 4;
        /**
          <p>This symbol is the offset where the {@link in.srain.cube.views.ptr.R.attr#ptr_duration_to_close_header}
          attribute's value can be found in the {@link #PtrFrameLayout} array.


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name in.srain.cube.views.ptr:ptr_duration_to_close_header
        */
        public static final int PtrFrameLayout_ptr_duration_to_close_header = 5;
        /**
          <p>
          @attr description
           Optional. If you put header and content in xml, you can you these to specify them. 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name in.srain.cube.views.ptr:ptr_header
        */
        public static final int PtrFrameLayout_ptr_header = 0;
        /**
          <p>
          @attr description
           keep header when refreshing


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name in.srain.cube.views.ptr:ptr_keep_header_when_refresh
        */
        public static final int PtrFrameLayout_ptr_keep_header_when_refresh = 7;
        /**
          <p>
          @attr description
           pull to refresh, otherwise release to refresh, default is release to refresh 


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name in.srain.cube.views.ptr:ptr_pull_to_fresh
        */
        public static final int PtrFrameLayout_ptr_pull_to_fresh = 6;
        /**
          <p>
          @attr description
           the ration of the height of the header to trigger refresh 


          <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name in.srain.cube.views.ptr:ptr_ratio_of_header_height_to_refresh
        */
        public static final int PtrFrameLayout_ptr_ratio_of_header_height_to_refresh = 3;
        /**
          <p>
          @attr description
           the resistance when you are moving the frame 


          <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name in.srain.cube.views.ptr:ptr_resistance
        */
        public static final int PtrFrameLayout_ptr_resistance = 2;
    };
}
