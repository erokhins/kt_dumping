'AbstractParameterTablePanel<Parameter, ExtractFunctionParameterTablePanel.ParameterInfo>' @ [30:49] ==> public constructor AbstractParameterTablePanel<Param, UIParam : AbstractParameterTablePanel.AbstractParameterInfo<Parameter>>() defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[ClassConstructorDescriptorImpl]
Inferred types:
    <Param> -> Parameter
    <UIParam : AbstractParameterTablePanel.AbstractParameterInfo<Param>> -> ParameterInfo

'AbstractParameterTablePanel.AbstractParameterInfo<Parameter>' @ [38:9] ==> public constructor AbstractParameterInfo<out Param>(originalParameter: Parameter) defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.AbstractParameterInfo[ClassConstructorDescriptorImpl]
Inferred types:
    <out Param> -> Parameter

'originalParameter' @ [38:70] ==> value-parameter originalParameter: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.ParameterInfo.<init>[ValueParameterDescriptorImpl]

'originalParameter' @ [39:20] ==> value-parameter originalParameter: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.ParameterInfo.<init>[ValueParameterDescriptorImpl]

'getParameterType' @ [39:38] ==> public abstract fun getParameterType(allowSpecialClassNames: Boolean): KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Parameter[SimpleFunctionDescriptorImpl]

'name' @ [42:13] ==> public final lateinit var name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.ParameterInfo[PropertyDescriptorImpl]

'if (isReceiver) "<receiver>" else originalParameter.name' @ [42:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isReceiver' @ [42:24] ==> public final val isReceiver: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.ParameterInfo[PropertyDescriptorImpl]

'originalParameter' @ [42:54] ==> value-parameter originalParameter: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.ParameterInfo.<init>[ValueParameterDescriptorImpl]

'name' @ [42:72] ==> public abstract val name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Parameter[PropertyDescriptorImpl]

'originalParameter' @ [45:38] ==> public final val originalParameter: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.ParameterInfo[PropertyDescriptorImpl]

'copy' @ [45:56] ==> public abstract fun copy(name: String, parameterType: KotlinType): Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Parameter[SimpleFunctionDescriptorImpl]

'name' @ [45:61] ==> public final lateinit var name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.ParameterInfo[PropertyDescriptorImpl]

'type' @ [45:67] ==> public final var type: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.ParameterInfo[PropertyDescriptorImpl]

'MyTableModel' @ [48:109] ==> public constructor MyTableModel() defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel[ClassConstructorDescriptorImpl]

'with' @ [51:9] ==> @InlineOnly public inline fun <T, R> with(receiver: (TableColumn..TableColumn?), block: (TableColumn..TableColumn?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.swing.table.TableColumn..javax.swing.table.TableColumn?)
    <R> -> Unit

'table' @ [51:14] ==> public final lateinit var table: JBTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel[PropertyDescriptorImpl]

'columnModel' @ [51:20] ==> public final var JBTable.columnModel: (TableColumnModel..TableColumnModel?)[MyPropertyDescriptor]

'getColumn' @ [51:32] ==> public abstract fun getColumn(p0: Int): (TableColumn..TableColumn?) defined in javax.swing.table.TableColumnModel[JavaMethodDescriptor]

'PARAMETER_TYPE_COLUMN' @ [51:42] ==> public final val PARAMETER_TYPE_COLUMN: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.Companion[PropertyDescriptorImpl]

'headerValue' @ [52:13] ==> public final var TableColumn.headerValue: (Any..Any?)[MyPropertyDescriptor]

'cellRenderer' @ [53:13] ==> public final var TableColumn.cellRenderer: (TableCellRenderer..TableCellRenderer?)[MyPropertyDescriptor]

'DefaultTableCellRenderer' @ [53:37] ==> public constructor DefaultTableCellRenderer() defined in javax.swing.table.DefaultTableCellRenderer[JavaClassConstructorDescriptor]

'JBComboBoxLabel' @ [54:39] ==> public constructor JBComboBoxLabel() defined in com.intellij.ui.components.JBComboBoxLabel[JavaClassConstructorDescriptor]

'myLabel' @ [59:21] ==> private final val myLabel: JBComboBoxLabel defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'text' @ [59:29] ==> public final var JBComboBoxLabel.text: (String..String?)[MyPropertyDescriptor]

'IdeDescriptorRenderers' @ [59:36] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [59:59] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [59:92] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'value' @ [59:103] ==> value-parameter value: Any defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>.getTableCellRendererComponent[ValueParameterDescriptorImpl]

'myLabel' @ [60:21] ==> private final val myLabel: JBComboBoxLabel defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'background' @ [60:29] ==> public final var JBComboBoxLabel.background: (Color..Color?)[MyPropertyDescriptor]

'if (isSelected) table.selectionBackground else table.background' @ [60:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Color..Color?), elseBranch: (Color..Color?)): (Color..Color?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.awt.Color..java.awt.Color?)

'isSelected' @ [60:46] ==> value-parameter isSelected: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>.getTableCellRendererComponent[ValueParameterDescriptorImpl]

'table' @ [60:58] ==> value-parameter table: JTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>.getTableCellRendererComponent[ValueParameterDescriptorImpl]

'selectionBackground' @ [60:64] ==> public final var JTable.selectionBackground: (Color..Color?)[MyPropertyDescriptor]

'table' @ [60:89] ==> value-parameter table: JTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>.getTableCellRendererComponent[ValueParameterDescriptorImpl]

'background' @ [60:95] ==> public final var JTable.background: (Color..Color?)[MyPropertyDescriptor]

'myLabel' @ [61:21] ==> private final val myLabel: JBComboBoxLabel defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'foreground' @ [61:29] ==> public final var JBComboBoxLabel.foreground: (Color..Color?)[MyPropertyDescriptor]

'if (isSelected) table.selectionForeground else table.foreground' @ [61:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Color..Color?), elseBranch: (Color..Color?)): (Color..Color?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.awt.Color..java.awt.Color?)

'isSelected' @ [61:46] ==> value-parameter isSelected: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>.getTableCellRendererComponent[ValueParameterDescriptorImpl]

'table' @ [61:58] ==> value-parameter table: JTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>.getTableCellRendererComponent[ValueParameterDescriptorImpl]

'selectionForeground' @ [61:64] ==> public final var JTable.selectionForeground: (Color..Color?)[MyPropertyDescriptor]

'table' @ [61:89] ==> value-parameter table: JTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>.getTableCellRendererComponent[ValueParameterDescriptorImpl]

'foreground' @ [61:95] ==> public final var JTable.foreground: (Color..Color?)[MyPropertyDescriptor]

'if (isSelected) {
                        myLabel.setSelectionIcon()
                    }
                    else {
                        myLabel.setRegularIcon()
                    }' @ [62:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isSelected' @ [62:25] ==> value-parameter isSelected: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>.getTableCellRendererComponent[ValueParameterDescriptorImpl]

'myLabel' @ [63:25] ==> private final val myLabel: JBComboBoxLabel defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'setSelectionIcon' @ [63:33] ==> public open fun setSelectionIcon(): Unit defined in com.intellij.ui.components.JBComboBoxLabel[JavaMethodDescriptor]

'myLabel' @ [66:25] ==> private final val myLabel: JBComboBoxLabel defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'setRegularIcon' @ [66:33] ==> public open fun setRegularIcon(): Unit defined in com.intellij.ui.components.JBComboBoxLabel[JavaMethodDescriptor]

'myLabel' @ [68:28] ==> private final val myLabel: JBComboBoxLabel defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'cellEditor' @ [71:13] ==> public final var TableColumn.cellEditor: (TableCellEditor..TableCellEditor?)[MyPropertyDescriptor]

'AbstractTableCellEditor' @ [71:35] ==> public constructor AbstractTableCellEditor() defined in com.intellij.util.ui.AbstractTableCellEditor[JavaClassConstructorDescriptor]

'JBComboBoxTableCellEditorComponent' @ [72:50] ==> public constructor JBComboBoxTableCellEditorComponent() defined in com.intellij.ui.components.editors.JBComboBoxTableCellEditorComponent[JavaClassConstructorDescriptor]

'myEditorComponent' @ [74:53] ==> internal final val myEditorComponent: JBComboBoxTableCellEditorComponent defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'editorValue' @ [74:71] ==> public final val JBComboBoxTableCellEditorComponent.editorValue: (Any..Any?)[MyPropertyDescriptor]

'parameterInfos' @ [78:32] ==> protected final lateinit var parameterInfos: MutableList<ExtractFunctionParameterTablePanel.ParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel[PropertyDescriptorImpl]

'row' @ [78:47] ==> value-parameter row: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>.getTableCellEditorComponent[ValueParameterDescriptorImpl]

'myEditorComponent' @ [80:21] ==> internal final val myEditorComponent: JBComboBoxTableCellEditorComponent defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'setCell' @ [80:39] ==> public open fun setCell(p0: (JTable..JTable?), p1: Int, p2: Int): Unit defined in com.intellij.ui.components.editors.JBComboBoxTableCellEditorComponent[JavaMethodDescriptor]

'table' @ [80:47] ==> value-parameter table: JTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>.getTableCellEditorComponent[ValueParameterDescriptorImpl]

'row' @ [80:54] ==> value-parameter row: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>.getTableCellEditorComponent[ValueParameterDescriptorImpl]

'column' @ [80:59] ==> value-parameter column: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>.getTableCellEditorComponent[ValueParameterDescriptorImpl]

'myEditorComponent' @ [81:21] ==> internal final val myEditorComponent: JBComboBoxTableCellEditorComponent defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'setOptions' @ [81:39] ==> public open fun setOptions(vararg p0: (Any..Any?)): Unit defined in com.intellij.ui.components.editors.JBComboBoxTableCellEditorComponent[JavaMethodDescriptor]

'info' @ [81:51] ==> val info: ExtractFunctionParameterTablePanel.ParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>.getTableCellEditorComponent[LocalVariableDescriptor]

'originalParameter' @ [81:56] ==> public final val originalParameter: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.ParameterInfo[PropertyDescriptorImpl]

'getParameterTypeCandidates' @ [81:74] ==> public abstract fun getParameterTypeCandidates(allowSpecialClassNames: Boolean): List<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Parameter[SimpleFunctionDescriptorImpl]

'toTypedArray' @ [81:108] ==> public inline fun <reified T> Collection<KotlinType>.toTypedArray(): Array<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KotlinType

'myEditorComponent' @ [82:21] ==> internal final val myEditorComponent: JBComboBoxTableCellEditorComponent defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'setDefaultValue' @ [82:39] ==> public open fun setDefaultValue(p0: (Any..Any?)): Unit defined in com.intellij.ui.components.editors.JBComboBoxTableCellEditorComponent[JavaMethodDescriptor]

'info' @ [82:55] ==> val info: ExtractFunctionParameterTablePanel.ParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>.getTableCellEditorComponent[LocalVariableDescriptor]

'type' @ [82:60] ==> public final var type: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.ParameterInfo[PropertyDescriptorImpl]

'myEditorComponent' @ [83:21] ==> internal final val myEditorComponent: JBComboBoxTableCellEditorComponent defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'setToString' @ [83:39] ==> public final fun setToString(p0: (((Any..Any?)) -> (String..String?)..(((Any..Any?)) -> (String..String?))?)): Unit defined in com.intellij.ui.components.editors.JBComboBoxTableCellEditorComponent[MyFunctionDescriptor]

'IdeDescriptorRenderers' @ [83:53] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [83:76] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [83:109] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [83:120] ==> value-parameter it: (Any..Any?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>.getTableCellEditorComponent.<anonymous>[ValueParameterDescriptorImpl]

'myEditorComponent' @ [85:28] ==> internal final val myEditorComponent: JBComboBoxTableCellEditorComponent defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.createAdditionalColumns.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'parameterInfos' @ [92:9] ==> protected final lateinit var parameterInfos: MutableList<ExtractFunctionParameterTablePanel.ParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel[PropertyDescriptorImpl]

'parameters' @ [92:26] ==> value-parameter parameters: List<Parameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.init[ValueParameterDescriptorImpl]

'mapTo' @ [92:37] ==> public inline fun <T, R, C : MutableCollection<in ExtractFunctionParameterTablePanel.ParameterInfo>> Iterable<Parameter>.mapTo(destination: ArrayList<ExtractFunctionParameterTablePanel.ParameterInfo> /* = ArrayList<ExtractFunctionParameterTablePanel.ParameterInfo> */, transform: (Parameter) -> ExtractFunctionParameterTablePanel.ParameterInfo): ArrayList<ExtractFunctionParameterTablePanel.ParameterInfo> /* = ArrayList<ExtractFunctionParameterTablePanel.ParameterInfo> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Parameter
    <R> -> ParameterInfo
    <C : MutableCollection<in R>> -> ArrayList<ParameterInfo>

'if (receiver != null) arrayListOf(ParameterInfo(receiver, true)) else arrayListOf()' @ [93:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ArrayList<ExtractFunctionParameterTablePanel.ParameterInfo> /* = ArrayList<ExtractFunctionParameterTablePanel.ParameterInfo> */, elseBranch: ArrayList<ExtractFunctionParameterTablePanel.ParameterInfo> /* = ArrayList<ExtractFunctionParameterTablePanel.ParameterInfo> */): ArrayList<ExtractFunctionParameterTablePanel.ParameterInfo> /* = ArrayList<ExtractFunctionParameterTablePanel.ParameterInfo> */[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ArrayList<ParameterInfo>

'receiver' @ [93:21] ==> value-parameter receiver: Parameter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.init[ValueParameterDescriptorImpl]

'arrayListOf' @ [93:39] ==> public fun <T> arrayListOf(vararg elements: ExtractFunctionParameterTablePanel.ParameterInfo): ArrayList<ExtractFunctionParameterTablePanel.ParameterInfo> /* = ArrayList<ExtractFunctionParameterTablePanel.ParameterInfo> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParameterInfo

'ParameterInfo' @ [93:51] ==> public constructor ParameterInfo(originalParameter: Parameter, isReceiver: Boolean) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.ParameterInfo[ClassConstructorDescriptorImpl]

'receiver' @ [93:65] ==> value-parameter receiver: Parameter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.init[ValueParameterDescriptorImpl]

'arrayListOf' @ [93:87] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<ExtractFunctionParameterTablePanel.ParameterInfo> /* = ArrayList<ExtractFunctionParameterTablePanel.ParameterInfo> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParameterInfo

'ParameterInfo' @ [94:13] ==> public constructor ParameterInfo(originalParameter: Parameter, isReceiver: Boolean) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.ParameterInfo[ClassConstructorDescriptorImpl]

'it' @ [94:27] ==> value-parameter it: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.init.<anonymous>[ValueParameterDescriptorImpl]

'super' @ [96:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel[LazyClassReceiverParameterDescriptor]

'init' @ [96:15] ==> public final fun init(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[SimpleFunctionDescriptorImpl]

'AbstractParameterTablePanel.TableModelBase<Parameter, ParameterInfo>' @ [99:40] ==> public constructor TableModelBase<Param, UIParam : AbstractParameterTablePanel.AbstractParameterInfo<Parameter>>(outer: AbstractParameterTablePanel<Parameter, ExtractFunctionParameterTablePanel.ParameterInfo>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[ClassConstructorDescriptorImpl]
Inferred types:
    <Param> -> Parameter
    <UIParam : AbstractParameterTablePanel.AbstractParameterInfo<Param>> -> ParameterInfo

'this' @ [99:109] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel[LazyClassReceiverParameterDescriptor]

'columnIndex' @ [103:17] ==> value-parameter columnIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel.getValueAt[ValueParameterDescriptorImpl]

'PARAMETER_TYPE_COLUMN' @ [103:32] ==> public final val PARAMETER_TYPE_COLUMN: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.Companion[PropertyDescriptorImpl]

'parameterInfos' @ [103:62] ==> public final val parameterInfos: MutableList<ExtractFunctionParameterTablePanel.ParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel[PropertyDescriptorImpl]

'rowIndex' @ [103:77] ==> value-parameter rowIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel.getValueAt[ValueParameterDescriptorImpl]

'type' @ [103:87] ==> public final var type: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.ParameterInfo[PropertyDescriptorImpl]

'super' @ [104:20] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel[LazyClassReceiverParameterDescriptor]

'getValueAt' @ [104:26] ==> public open fun getValueAt(rowIndex: Int, columnIndex: Int): Any? defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[SimpleFunctionDescriptorImpl]

'rowIndex' @ [104:37] ==> value-parameter rowIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel.getValueAt[ValueParameterDescriptorImpl]

'columnIndex' @ [104:47] ==> value-parameter columnIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel.getValueAt[ValueParameterDescriptorImpl]

'columnIndex' @ [108:17] ==> value-parameter columnIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel.setValueAt[ValueParameterDescriptorImpl]

'PARAMETER_TYPE_COLUMN' @ [108:32] ==> public final val PARAMETER_TYPE_COLUMN: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.Companion[PropertyDescriptorImpl]

'parameterInfos' @ [109:17] ==> public final val parameterInfos: MutableList<ExtractFunctionParameterTablePanel.ParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel[PropertyDescriptorImpl]

'rowIndex' @ [109:32] ==> value-parameter rowIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel.setValueAt[ValueParameterDescriptorImpl]

'type' @ [109:42] ==> public final var type: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.ParameterInfo[PropertyDescriptorImpl]

'aValue' @ [109:49] ==> value-parameter aValue: Any? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel.setValueAt[ValueParameterDescriptorImpl]

'updateSignature' @ [110:17] ==> protected open fun updateSignature(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel[SimpleFunctionDescriptorImpl]

'super' @ [114:13] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel[LazyClassReceiverParameterDescriptor]

'setValueAt' @ [114:19] ==> public open fun setValueAt(aValue: Any?, rowIndex: Int, columnIndex: Int): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[SimpleFunctionDescriptorImpl]

'aValue' @ [114:30] ==> value-parameter aValue: Any? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel.setValueAt[ValueParameterDescriptorImpl]

'rowIndex' @ [114:38] ==> value-parameter rowIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel.setValueAt[ValueParameterDescriptorImpl]

'columnIndex' @ [114:48] ==> value-parameter columnIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel.setValueAt[ValueParameterDescriptorImpl]

'parameterInfos' @ [118:24] ==> public final val parameterInfos: MutableList<ExtractFunctionParameterTablePanel.ParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel[PropertyDescriptorImpl]

'rowIndex' @ [118:39] ==> value-parameter rowIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel.isCellEditable[ValueParameterDescriptorImpl]

'when (columnIndex) {
                AbstractParameterTablePanel.PARAMETER_NAME_COLUMN -> super.isCellEditable(rowIndex, columnIndex) && !info.isReceiver
                PARAMETER_TYPE_COLUMN -> isEnabled && info.isEnabled && info.originalParameter.getParameterTypeCandidates(false).size > 1
                else -> super.isCellEditable(rowIndex, columnIndex)
            }' @ [119:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'columnIndex' @ [119:26] ==> value-parameter columnIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel.isCellEditable[ValueParameterDescriptorImpl]

'AbstractParameterTablePanel' @ [120:17] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[FakeCallableDescriptorForObject]

'PARAMETER_NAME_COLUMN' @ [120:45] ==> public final val PARAMETER_NAME_COLUMN: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.Companion[PropertyDescriptorImpl]

'super' @ [120:70] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel[LazyClassReceiverParameterDescriptor]

'isCellEditable' @ [120:76] ==> public open fun isCellEditable(rowIndex: Int, columnIndex: Int): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[SimpleFunctionDescriptorImpl]

'rowIndex' @ [120:91] ==> value-parameter rowIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel.isCellEditable[ValueParameterDescriptorImpl]

'columnIndex' @ [120:101] ==> value-parameter columnIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel.isCellEditable[ValueParameterDescriptorImpl]

'!' @ [120:117] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'info' @ [120:118] ==> val info: ExtractFunctionParameterTablePanel.ParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel.isCellEditable[LocalVariableDescriptor]

'isReceiver' @ [120:123] ==> public final val isReceiver: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.ParameterInfo[PropertyDescriptorImpl]

'PARAMETER_TYPE_COLUMN' @ [121:17] ==> public final val PARAMETER_TYPE_COLUMN: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.Companion[PropertyDescriptorImpl]

'isEnabled' @ [121:42] ==> public final var ExtractFunctionParameterTablePanel.isEnabled: Boolean[MyPropertyDescriptor]

'info' @ [121:55] ==> val info: ExtractFunctionParameterTablePanel.ParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel.isCellEditable[LocalVariableDescriptor]

'isEnabled' @ [121:60] ==> public final var isEnabled: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.ParameterInfo[PropertyDescriptorImpl]

'info' @ [121:73] ==> val info: ExtractFunctionParameterTablePanel.ParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel.isCellEditable[LocalVariableDescriptor]

'originalParameter' @ [121:78] ==> public final val originalParameter: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.ParameterInfo[PropertyDescriptorImpl]

'getParameterTypeCandidates' @ [121:96] ==> public abstract fun getParameterTypeCandidates(allowSpecialClassNames: Boolean): List<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Parameter[SimpleFunctionDescriptorImpl]

'size' @ [121:130] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'super' @ [122:25] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel[LazyClassReceiverParameterDescriptor]

'isCellEditable' @ [122:31] ==> public open fun isCellEditable(rowIndex: Int, columnIndex: Int): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[SimpleFunctionDescriptorImpl]

'rowIndex' @ [122:46] ==> value-parameter rowIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel.isCellEditable[ValueParameterDescriptorImpl]

'columnIndex' @ [122:56] ==> value-parameter columnIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.MyTableModel.isCellEditable[ValueParameterDescriptorImpl]

'parameterInfos' @ [128:17] ==> protected final lateinit var parameterInfos: MutableList<ExtractFunctionParameterTablePanel.ParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel[PropertyDescriptorImpl]

'singleOrNull' @ [128:32] ==> public inline fun <T> Iterable<ExtractFunctionParameterTablePanel.ParameterInfo>.singleOrNull(predicate: (ExtractFunctionParameterTablePanel.ParameterInfo) -> Boolean): ExtractFunctionParameterTablePanel.ParameterInfo? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParameterInfo

'it' @ [128:47] ==> value-parameter it: ExtractFunctionParameterTablePanel.ParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.<get-selectedReceiverInfo>.<anonymous>[ValueParameterDescriptorImpl]

'isEnabled' @ [128:50] ==> public final var isEnabled: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.ParameterInfo[PropertyDescriptorImpl]

'it' @ [128:63] ==> value-parameter it: ExtractFunctionParameterTablePanel.ParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.<get-selectedReceiverInfo>.<anonymous>[ValueParameterDescriptorImpl]

'isReceiver' @ [128:66] ==> public final val isReceiver: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.ParameterInfo[PropertyDescriptorImpl]

'parameterInfos' @ [131:17] ==> protected final lateinit var parameterInfos: MutableList<ExtractFunctionParameterTablePanel.ParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel[PropertyDescriptorImpl]

'filter' @ [131:32] ==> public inline fun <T> Iterable<ExtractFunctionParameterTablePanel.ParameterInfo>.filter(predicate: (ExtractFunctionParameterTablePanel.ParameterInfo) -> Boolean): List<ExtractFunctionParameterTablePanel.ParameterInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParameterInfo

'it' @ [131:41] ==> value-parameter it: ExtractFunctionParameterTablePanel.ParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.<get-selectedParameterInfos>.<anonymous>[ValueParameterDescriptorImpl]

'isEnabled' @ [131:44] ==> public final var isEnabled: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.ParameterInfo[PropertyDescriptorImpl]

'!' @ [131:57] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [131:58] ==> value-parameter it: ExtractFunctionParameterTablePanel.ParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.<get-selectedParameterInfos>.<anonymous>[ValueParameterDescriptorImpl]

'isReceiver' @ [131:61] ==> public final val isReceiver: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.ExtractFunctionParameterTablePanel.ParameterInfo[PropertyDescriptorImpl]

