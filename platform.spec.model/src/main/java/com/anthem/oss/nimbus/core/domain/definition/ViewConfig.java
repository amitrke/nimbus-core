/**
 * 
 */
package com.anthem.oss.nimbus.core.domain.definition;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Soham Chakravarti
 *
 */
public class ViewConfig {
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target(value={ElementType.ANNOTATION_TYPE})
	@Inherited
	public @interface DomainMeta {
		
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target(value={ElementType.ANNOTATION_TYPE})
	@Inherited
	public @interface ViewParamBehavior {
		
	}
	@Retention(RetentionPolicy.RUNTIME)
	@Target(value={ElementType.ANNOTATION_TYPE})
	@Inherited
	public @interface ViewStyle {
		
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@DomainMeta
	public @interface ConceptId {
		String value() default "";
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewParamBehavior
	public @interface Hints {
		public enum AlignOptions {
			Left,
			Right,
			Center,
			Inherit;
		}
		AlignOptions value() default AlignOptions.Inherit;
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewParamBehavior
	public @interface Initialize {
		String alias() default "initialize";
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewParamBehavior
	public @interface Mode {
		public enum Options {
			ReadOnly,
			Hidden,
			Inherit
		}
		Options value() default Options.Inherit;
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.TYPE})
	@ViewStyle
	public @interface ViewRoot {
		String alias() default "root";
		String layout() default "";
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface Page {
		String alias() default "page";
		String route() default "";
		String breadCrumb() default "none";
		String imgSrc() default "";
		String styleClass() default "";
		boolean defaultPage() default false;
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface Tile {
		public enum Size {
			XSmall,
			Small,
			Medium,
			Large
		}
		String alias() default "Tile";
		String imgSrc() default "";
		String title() default "";
		Size size() default Size.Large;
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface Header {
		public enum Size {
			H1,
			H2,
			H3,
			H4,
			H5
		}
		String alias() default "Header";
		Size size() default Size.H3;
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface CardDetailsGrid {
		String alias() default "CardDetailsGrid";
		String editUrl() default "";
		boolean draggable() default false;
		boolean onLoad() default false;
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface CardDetail {
		String alias() default "CardDetail";
		String cssClass() default "contentBox right-gutter bg-light mt-1";
		String imgSrc() default "";
		boolean editable() default false;
		String modelPath() default "";
		String title() default "";
		boolean draggable() default false;
		
		@Retention(RetentionPolicy.RUNTIME)
		@Target({ElementType.FIELD})
		@ViewStyle
		public @interface Tag {
			String alias() default "CardDetailsTag";
			String cssClass() default "";
		}
		
		@Retention(RetentionPolicy.RUNTIME)
		@Target({ElementType.FIELD})
		@ViewStyle
		public @interface Header {
			String alias() default "CardDetailsHeader";
			String cssClass() default "";
		}
		
		@Retention(RetentionPolicy.RUNTIME)
		@Target({ElementType.FIELD})
		@ViewStyle
		public @interface Body {
			String alias() default "CardDetailsBody";
			String cssClass() default "";
		}
		
		@Retention(RetentionPolicy.RUNTIME)
		@Target({ElementType.FIELD})
		@ViewStyle
		public @interface Footer {
			String alias() default "CardDetailsFooter";
			String cssClass() default "";
		}
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface FieldValue {
		public enum Type {
			Field,
			Divider
		}
		String alias() default "FieldValue";
		Type type() default Type.Field;
		String imgSrc() default "";
		String cssClass() default "";
		boolean showName() default true;
		String cols() default "1";
		String iconField() default "";
		boolean inplaceEdit() default false;
		String inplaceEditType() default "";
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ ElementType.FIELD })
	@ViewStyle
	public @interface Modal {
		String alias() default "Modal";

		Type type() default Type.dialog;

		public enum Type {
			dialog, slider
		}
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface Section {
		
		public enum Type {
			HEADER,
			FOOTER,
			LEFTBAR,
			RIGHTBAR,
			BODY,
			DEFAULT;
		}
		
		Type value() default Type.DEFAULT;
		String alias() default "Section";
		String imgSrc() default "";
		String cssClass() default "";
		String defaultFlow() default ""; // applicable only to Section type BODY.
	}
		
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface Form {
		String alias() default "Form";
		String submitUrl() default "";
		String b() default "";
		String cssClass() default "";
		boolean submitButton() default true;
		
		String navLink() default "";
	}	
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface ButtonGroup {	
		String alias() default "ButtonGroup";
		String cssClass() default "text-sm-right";
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface Assessment {	
		String alias() default "Assessment";
		String cssClass() default "text-sm-right";
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface Button {	
		public enum Style {
			PRIMARY,
			SECONDARY,
			PLAIN,
			DESTRUCTIVE;
		}
		
		public enum Type {
			submit,
			reset,
			button
		}
		
		Type type() default Type.button;
		String alias() default "Button";
		String url() default "";
		String b() default "$execute";
		String method() default "GET";
		String imgSrc() default "";
		Style style() default Style.PLAIN;
		String payload() default "";
		String cssClass() default "btn btn-primary";
		boolean browserBack() default false;
		boolean formReset() default true;
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface FilterButton {
		String alias() default "FilterButton";
		String url() default "";
		String b() default "$execute";
		String method() default "GET";
		String imgSrc() default "";
		String cssClass() default "btn btn-primary";
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface Menu {
		public enum Type {
			CONTEXT;
		}
		Type value() default Type.CONTEXT;
		String alias() default "Menu";		
		String cssClass() default "";
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface Link {
		public enum Type {
			MENU,
			DEFAULT;
		}
		Type value() default Type.DEFAULT;
		String url() default "";
		String method() default "GET";
		String b() default "$executeAnd$nav";
		String imgSrc() default "";
		String cssClass() default "";
		String altText() default "";
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface InPlaceEdit {
		String alias() default "InPlaceEdit";
		String type() default "text";
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewParamBehavior
	public @interface PageHeader {
		public enum Property {
			LOGO,
			APPTITLE,
			SUBTITLE,
			USERNAME,
			USERROLE,
			SUBHEADER,
			MENU,
			DEFAULT;
		}
		Property value() default Property.DEFAULT;
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewParamBehavior
	public @interface PageFooter {
		public enum Property {
			TOU,
			VERSION,
			COPYRIGHT,
			SSLCERT,
			PRIVACY,
			DEFAULT
		}
		Property value() default Property.DEFAULT;
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface Paragraph {
		String alias() default "Paragraph";
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface Image {
		String alias() default "Image";
		String imgSrc() default "";
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface TextBox {
		String alias() default "TextBox";
		boolean hidden() default false;
		boolean readOnly() default false;
		String help() default "";
		String labelClass() default "anthem-label";
		String type() default "text";
		boolean postEventOnChange() default false;
		String controlId() default "";
	}
	
	@Retention(RetentionPolicy.RUNTIME) 
	@Target({ElementType.FIELD}) 
	@ViewStyle 
	public @interface TextArea { 
		String alias() default "TextArea"; 
		boolean hidden() default false; 
		boolean readOnly() default false; 
		String help() default ""; 
		String labelClass() default "anthem-label"; 
		String type() default "textarea"; 
		String rows() default "5"; 
		boolean postEventOnChange() default false; 
		String controlId() default ""; 
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface ComboBox {
		String alias() default "ComboBox";
		boolean readOnly() default false;
		String labelClass() default "anthem-label";
		boolean postEventOnChange() default false;
		String postButtonUrl() default "";
		String controlId() default "";
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface StaticText {
		String alias() default "StaticText";
		String contentId() default "";
	}	
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface MultiSelect {
		String alias() default "MultiSelect";
		String labelClass() default "anthem-label";
		boolean postEventOnChange() default false;
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface InputDate {
		String alias() default "InputDate";
		boolean readOnly() default false;	
		String labelClass() default "anthem-label";
		String type() default "date";
		boolean postEventOnChange() default false;
		String controlId() default "";
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface GridContainer {
		String alias() default "GridContainer";
	}	
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface Grid {
		String alias() default "Grid";
		boolean onLoad() default false;
		boolean expandableRows() default false;
		boolean isTransient() default false;
		String url() default "";
		boolean rowSelection() default false;
		String pageSize() default "10";
		boolean pagination() default true;
		boolean postButton() default false;
		String postButtonUrl() default "";
		String postButtonTargetPath() default "";
		String postButtonAlias() default "";
		boolean postEventOnChange() default false;
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface Radio {
		String alias() default "Radio";
		String labelClass() default "anthem-label";
		String level() default "0";
		String cssClass() default "";
		boolean postEventOnChange() default false;
		String controlId() default "";
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface CheckBox {
		String alias() default "CheckBox";
		String cssClass() default "";
		String labelClass() default "anthem-label";
		boolean postEventOnChange() default false;
		String controlId() default "";
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface CheckBoxGroup {
		String alias() default "CheckBoxGroup";
		String level() default "0";
		String cssClass() default "";
		String labelClass() default "anthem-label";
		boolean postEventOnChange() default false;
		String controlId() default "";
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ ElementType.FIELD })
	@ViewStyle
	public @interface Accordion {
		String alias() default "Accordion";
		String cssClass() default "panel-default";
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ ElementType.FIELD })
	@ViewStyle
	public @interface AccordionGroup {
		String alias() default "AccordionGroup";
		String cssClass() default "panel-default";
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface MultiSelectCard {
		String alias() default "MultiSelectCard";
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface MultiGrid {
		String alias() default "MultiGrid";
		String level() default "0";
		String header() default "test";
		String cssClass() default "question-header";
		boolean postEventOnChange() default false;
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface GlobalSection {
		String alias() default "globalSection";
		String imgSrc() default "";
		String styleClass() default "";
	}
		
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface Summary {
		String alias() default "summary";
		String imgSrc() default "";
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface BreadCrumb {
		String label();
		int order();
		String alias() default "breadCrumb";
		boolean postEventOnChange() default false;
	}	

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface LinearGauge {
		String alias() default "LinearGauge";
		String labelClass() default "anthem-label";
		boolean postEventOnChange() default false;
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface ContentContainer {
		String alias() default "ContentContainer";
		String content() default "";
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface SubHeader {
		String alias() default "SubHeader";
		String cssClass() default "col-sm-6 align-top";
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface PickList {
		String alias() default "PickList";
		String labelClass() default "anthem-label";
		boolean readOnly() default false;
		String cssClass() default "";
		boolean postEventOnChange() default false;
		String sourceHeader() default "SourceList";
		String targetHeader() default "TargetList";
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface FileUpload {
		String alias() default "FileUpload";
		String type() default ".pdf,.png";
	}
	
	/**
	 * Following GridColumn attributes can be provided on individual gridcolumns within a grid.<br>
	 * <ul><li>hidden - Setting this to true will hide the column in the grid</li>
	 * <li>sortable - Enables sorting on the column</li>
	 * <li>filter - Setting this to true will enable a explicit filter component(Input TextBox) on the UI</li>
	 * <li>filterValue - Default filterValue for a particular column. 
	 * 	Can be used without setting filter attribute to restrict user from providing any other filter value.
	 * <li>filterMode - Mode to filter data within the column. It is defaulted to 'equals'
	 * 	Current filter modes supported by the Grid component are listed as enum values</li></ul>
	 *	
	 */
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@ViewStyle
	public @interface GridColumn {
		String alias() default "GridColumn";
		boolean hidden() default false;
		boolean sortable() default true;
		boolean filter() default false; 
		String filterValue() default "";
		boolean expandable() default true;		
		public enum FilterMode {
			equals,
			contains,
			endsWith,
			in
		}
		FilterMode filterMode() default FilterMode.equals;
	}
	
}