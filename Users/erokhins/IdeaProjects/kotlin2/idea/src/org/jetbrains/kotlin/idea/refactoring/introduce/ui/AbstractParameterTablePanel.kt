'JPanel' @ [34:121] ==> public constructor JPanel(p0: (LayoutManager..LayoutManager?)) defined in javax.swing.JPanel[JavaClassConstructorDescriptor]

'BorderLayout' @ [34:128] ==> public constructor BorderLayout() defined in java.awt.BorderLayout[JavaClassConstructorDescriptor]

'TableModelBase' @ [55:45] ==> public constructor TableModelBase<Param, UIParam : AbstractParameterTablePanel.AbstractParameterInfo<Param>>(outer: AbstractParameterTablePanel<Param, UIParam>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[ClassConstructorDescriptorImpl]
Inferred types:
    <Param> -> Param
    <UIParam : AbstractParameterTablePanel.AbstractParameterInfo<Param>> -> UIParam

'this' @ [55:60] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[LazyClassReceiverParameterDescriptor]

'tableModel' @ [62:9] ==> protected final lateinit var tableModel: AbstractParameterTablePanel.TableModelBase<Param, UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'createTableModel' @ [62:22] ==> protected open fun createTableModel(): AbstractParameterTablePanel.TableModelBase<Param, UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[SimpleFunctionDescriptorImpl]

'table' @ [63:9] ==> public final lateinit var table: JBTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'JBTable' @ [63:17] ==> public constructor JBTable(p0: (TableModel..TableModel?)) defined in com.intellij.ui.table.JBTable[JavaClassConstructorDescriptor]

'tableModel' @ [63:25] ==> protected final lateinit var tableModel: AbstractParameterTablePanel.TableModelBase<Param, UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'table' @ [65:29] ==> public final lateinit var table: JBTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'getDefaultEditor' @ [65:35] ==> public open fun getDefaultEditor(p0: (Class<*>..Class<*>?)): (TableCellEditor..TableCellEditor?) defined in com.intellij.ui.table.JBTable[JavaMethodDescriptor]

'Any' @ [65:52] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'java' @ [65:63] ==> public val <T> KClass<Any>.java: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'defaultEditor' @ [66:9] ==> val defaultEditor: DefaultCellEditor defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init[LocalVariableDescriptor]

'clickCountToStart' @ [66:23] ==> public final var DefaultCellEditor.clickCountToStart: Int[MyPropertyDescriptor]

'table' @ [68:9] ==> public final lateinit var table: JBTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'selectionModel' @ [68:15] ==> public final var JBTable.selectionModel: (ListSelectionModel..ListSelectionModel?)[MyPropertyDescriptor]

'selectionMode' @ [68:30] ==> public final var ListSelectionModel.selectionMode: Int[MyPropertyDescriptor]

'SINGLE_SELECTION' @ [68:65] ==> public const final val SINGLE_SELECTION: Int defined in javax.swing.ListSelectionModel[JavaPropertyDescriptor]

'table' @ [69:9] ==> public final lateinit var table: JBTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'cellSelectionEnabled' @ [69:15] ==> public final var JBTable.cellSelectionEnabled: Boolean[MyPropertyDescriptor]

'with' @ [71:9] ==> @InlineOnly public inline fun <T, R> with(receiver: (TableColumn..TableColumn?), block: (TableColumn..TableColumn?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.swing.table.TableColumn..javax.swing.table.TableColumn?)
    <R> -> Unit

'table' @ [71:14] ==> public final lateinit var table: JBTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'columnModel' @ [71:20] ==> public final var JBTable.columnModel: (TableColumnModel..TableColumnModel?)[MyPropertyDescriptor]

'getColumn' @ [71:32] ==> public abstract fun getColumn(p0: Int): (TableColumn..TableColumn?) defined in javax.swing.table.TableColumnModel[JavaMethodDescriptor]

'CHECKMARK_COLUMN' @ [71:42] ==> public final val CHECKMARK_COLUMN: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.Companion[PropertyDescriptorImpl]

'setupCheckboxColumn' @ [72:23] ==> public open fun setupCheckboxColumn(@NotNull p0: TableColumn): Unit defined in com.intellij.ui.TableUtil[JavaMethodDescriptor]

'this' @ [72:43] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init.<anonymous>[ReceiverParameterDescriptorImpl]

'headerValue' @ [73:13] ==> public final var TableColumn.headerValue: (Any..Any?)[MyPropertyDescriptor]

'cellRenderer' @ [74:13] ==> public final var TableColumn.cellRenderer: (TableCellRenderer..TableCellRenderer?)[MyPropertyDescriptor]

'BooleanTableCellRenderer' @ [74:37] ==> public constructor BooleanTableCellRenderer() defined in com.intellij.ui.BooleanTableCellRenderer[JavaClassConstructorDescriptor]

'super' @ [78:45] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'getTableCellRendererComponent' @ [78:51] ==> public open fun getTableCellRendererComponent(p0: (JTable..JTable?), p1: (Any..Any?), p2: Boolean, p3: Boolean, p4: Int, p5: Int): (Component..Component?) defined in com.intellij.ui.BooleanTableCellRenderer[JavaMethodDescriptor]

'table' @ [78:81] ==> value-parameter table: JTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init.<anonymous>.<no name provided>.getTableCellRendererComponent[ValueParameterDescriptorImpl]

'value' @ [78:88] ==> value-parameter value: Any? defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init.<anonymous>.<no name provided>.getTableCellRendererComponent[ValueParameterDescriptorImpl]

'isSelected' @ [78:95] ==> value-parameter isSelected: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init.<anonymous>.<no name provided>.getTableCellRendererComponent[ValueParameterDescriptorImpl]

'hasFocus' @ [78:107] ==> value-parameter hasFocus: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init.<anonymous>.<no name provided>.getTableCellRendererComponent[ValueParameterDescriptorImpl]

'row' @ [78:117] ==> value-parameter row: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init.<anonymous>.<no name provided>.getTableCellRendererComponent[ValueParameterDescriptorImpl]

'column' @ [78:122] ==> value-parameter column: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init.<anonymous>.<no name provided>.getTableCellRendererComponent[ValueParameterDescriptorImpl]

'rendererComponent' @ [79:21] ==> val rendererComponent: (Component..Component?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init.<anonymous>.<no name provided>.getTableCellRendererComponent[LocalVariableDescriptor]

'isEnabled' @ [79:39] ==> public final var Component.isEnabled: Boolean[MyPropertyDescriptor]

'this@AbstractParameterTablePanel' @ [79:51] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[LazyClassReceiverParameterDescriptor]

'isEnabled' @ [79:84] ==> public final var <Param, UIParam : AbstractParameterTablePanel.AbstractParameterInfo<Param>> AbstractParameterTablePanel<Param, UIParam>.isEnabled: Boolean[MyPropertyDescriptor]
Inferred types:
    <Param> -> Param
    <UIParam : AbstractParameterTablePanel.AbstractParameterInfo<Param>> -> UIParam

'rendererComponent' @ [80:22] ==> val rendererComponent: (Component..Component?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init.<anonymous>.<no name provided>.getTableCellRendererComponent[LocalVariableDescriptor]

'addActionListener' @ [80:54] ==> public final fun addActionListener(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in javax.swing.JCheckBox[MyFunctionDescriptor]

'updateSignature' @ [80:74] ==> protected open fun updateSignature(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[SimpleFunctionDescriptorImpl]

'rendererComponent' @ [81:28] ==> val rendererComponent: (Component..Component?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init.<anonymous>.<no name provided>.getTableCellRendererComponent[LocalVariableDescriptor]

'table' @ [86:9] ==> public final lateinit var table: JBTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'columnModel' @ [86:15] ==> public final var JBTable.columnModel: (TableColumnModel..TableColumnModel?)[MyPropertyDescriptor]

'getColumn' @ [86:27] ==> public abstract fun getColumn(p0: Int): (TableColumn..TableColumn?) defined in javax.swing.table.TableColumnModel[JavaMethodDescriptor]

'PARAMETER_NAME_COLUMN' @ [86:37] ==> public final val PARAMETER_NAME_COLUMN: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.Companion[PropertyDescriptorImpl]

'headerValue' @ [86:60] ==> public final var TableColumn.headerValue: (Any..Any?)[MyPropertyDescriptor]

'createAdditionalColumns' @ [88:9] ==> protected open fun createAdditionalColumns(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[SimpleFunctionDescriptorImpl]

'table' @ [90:9] ==> public final lateinit var table: JBTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'preferredScrollableViewportSize' @ [90:15] ==> public final var JBTable.preferredScrollableViewportSize: (Dimension..Dimension?)[MyPropertyDescriptor]

'Dimension' @ [90:49] ==> public constructor Dimension(p0: Int, p1: Int) defined in java.awt.Dimension[JavaClassConstructorDescriptor]

'table' @ [90:64] ==> public final lateinit var table: JBTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'rowHeight' @ [90:70] ==> public final var JBTable.rowHeight: Int[MyPropertyDescriptor]

'table' @ [91:9] ==> public final lateinit var table: JBTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'setShowGrid' @ [91:15] ==> public open fun setShowGrid(p0: Boolean): Unit defined in com.intellij.ui.table.JBTable[JavaMethodDescriptor]

'table' @ [92:9] ==> public final lateinit var table: JBTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'intercellSpacing' @ [92:15] ==> public final var JBTable.intercellSpacing: (Dimension..Dimension?)[MyPropertyDescriptor]

'Dimension' @ [92:34] ==> public constructor Dimension(p0: Int, p1: Int) defined in java.awt.Dimension[JavaClassConstructorDescriptor]

'NonNls' @ [94:9] ==> public constructor NonNls() defined in org.jetbrains.annotations.NonNls[JavaClassConstructorDescriptor]

'table' @ [94:32] ==> public final lateinit var table: JBTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'inputMap' @ [94:38] ==> public final val JBTable.inputMap: (InputMap..InputMap?)[MyPropertyDescriptor]

'NonNls' @ [95:9] ==> public constructor NonNls() defined in org.jetbrains.annotations.NonNls[JavaClassConstructorDescriptor]

'table' @ [95:33] ==> public final lateinit var table: JBTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'actionMap' @ [95:39] ==> public final var JBTable.actionMap: (ActionMap..ActionMap?)[MyPropertyDescriptor]

'inputMap' @ [98:9] ==> val inputMap: (InputMap..InputMap?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init[LocalVariableDescriptor]

'put' @ [98:18] ==> public open fun put(p0: (KeyStroke..KeyStroke?), p1: (Any..Any?)): Unit defined in javax.swing.InputMap[JavaMethodDescriptor]

'getKeyStroke' @ [98:32] ==> public open fun getKeyStroke(p0: Int, p1: Int): (KeyStroke..KeyStroke?) defined in javax.swing.KeyStroke[JavaMethodDescriptor]

'VK_SPACE' @ [98:54] ==> public const final val VK_SPACE: Int defined in java.awt.event.KeyEvent[JavaPropertyDescriptor]

'actionMap' @ [99:9] ==> val actionMap: (ActionMap..ActionMap?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init[LocalVariableDescriptor]

'put' @ [99:19] ==> public open fun put(p0: (Any..Any?), p1: (Action..Action?)): Unit defined in javax.swing.ActionMap[JavaMethodDescriptor]

'AbstractAction' @ [99:50] ==> public constructor AbstractAction() defined in javax.swing.AbstractAction[JavaClassConstructorDescriptor]

'table' @ [101:21] ==> public final lateinit var table: JBTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'isEditing' @ [101:27] ==> public final val JBTable.isEditing: Boolean[MyPropertyDescriptor]

'table' @ [102:28] ==> public final lateinit var table: JBTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'selectedRows' @ [102:34] ==> public final val JBTable.selectedRows: (IntArray..IntArray?)[MyPropertyDescriptor]

'rows' @ [103:21] ==> val rows: (IntArray..IntArray?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init.<no name provided>.actionPerformed[LocalVariableDescriptor]

'size' @ [103:26] ==> public final val size: Int defined in kotlin.IntArray[DeserializedPropertyDescriptor]

'rows' @ [105:33] ==> val rows: (IntArray..IntArray?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init.<no name provided>.actionPerformed[LocalVariableDescriptor]

'!' @ [106:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parameterInfos' @ [106:30] ==> protected final lateinit var parameterInfos: MutableList<UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'row' @ [106:45] ==> val row: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init.<no name provided>.actionPerformed[LocalVariableDescriptor]

'isEnabled' @ [106:50] ==> public final var isEnabled: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.AbstractParameterInfo[PropertyDescriptorImpl]

'valueToBeSet' @ [107:29] ==> var valueToBeSet: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init.<no name provided>.actionPerformed[LocalVariableDescriptor]

'rows' @ [111:33] ==> val rows: (IntArray..IntArray?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init.<no name provided>.actionPerformed[LocalVariableDescriptor]

'parameterInfos' @ [112:25] ==> protected final lateinit var parameterInfos: MutableList<UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'row' @ [112:40] ==> val row: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init.<no name provided>.actionPerformed[LocalVariableDescriptor]

'isEnabled' @ [112:45] ==> public final var isEnabled: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.AbstractParameterInfo[PropertyDescriptorImpl]

'valueToBeSet' @ [112:57] ==> var valueToBeSet: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init.<no name provided>.actionPerformed[LocalVariableDescriptor]

'tableModel' @ [114:21] ==> protected final lateinit var tableModel: AbstractParameterTablePanel.TableModelBase<Param, UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'fireTableRowsUpdated' @ [114:32] ==> public open fun fireTableRowsUpdated(p0: Int, p1: Int): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[JavaMethodDescriptor]

'rows' @ [114:53] ==> val rows: (IntArray..IntArray?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init.<no name provided>.actionPerformed[LocalVariableDescriptor]

'rows' @ [114:62] ==> val rows: (IntArray..IntArray?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init.<no name provided>.actionPerformed[LocalVariableDescriptor]

'rows' @ [114:67] ==> val rows: (IntArray..IntArray?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init.<no name provided>.actionPerformed[LocalVariableDescriptor]

'size' @ [114:72] ==> public final val size: Int defined in kotlin.IntArray[DeserializedPropertyDescriptor]

'selectRows' @ [115:31] ==> public open fun selectRows(@NotNull p0: JTable, @NotNull p1: IntArray): Unit defined in com.intellij.ui.TableUtil[JavaMethodDescriptor]

'table' @ [115:42] ==> public final lateinit var table: JBTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'rows' @ [115:49] ==> val rows: (IntArray..IntArray?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init.<no name provided>.actionPerformed[LocalVariableDescriptor]

'updateSignature' @ [117:21] ==> protected open fun updateSignature(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[SimpleFunctionDescriptorImpl]

'inputMap' @ [123:9] ==> val inputMap: (InputMap..InputMap?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init[LocalVariableDescriptor]

'put' @ [123:18] ==> public open fun put(p0: (KeyStroke..KeyStroke?), p1: (Any..Any?)): Unit defined in javax.swing.InputMap[JavaMethodDescriptor]

'getKeyStroke' @ [123:32] ==> public open fun getKeyStroke(p0: Int, p1: Int): (KeyStroke..KeyStroke?) defined in javax.swing.KeyStroke[JavaMethodDescriptor]

'VK_ENTER' @ [123:54] ==> public const final val VK_ENTER: Int defined in java.awt.event.KeyEvent[JavaPropertyDescriptor]

'actionMap' @ [124:9] ==> val actionMap: (ActionMap..ActionMap?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init[LocalVariableDescriptor]

'put' @ [124:19] ==> public open fun put(p0: (Any..Any?), p1: (Action..Action?)): Unit defined in javax.swing.ActionMap[JavaMethodDescriptor]

'AbstractAction' @ [124:47] ==> public constructor AbstractAction() defined in javax.swing.AbstractAction[JavaClassConstructorDescriptor]

'table' @ [126:17] ==> public final lateinit var table: JBTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'cellEditor' @ [126:23] ==> public final var JBTable.cellEditor: (TableCellEditor..TableCellEditor?)[MyPropertyDescriptor]

'stopCellEditing' @ [126:35] ==> public abstract fun stopCellEditing(): Boolean defined in javax.swing.table.TableCellEditor[JavaMethodDescriptor]

'onEnterAction' @ [126:56] ==> protected open fun onEnterAction(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[SimpleFunctionDescriptorImpl]

'actionMap' @ [131:9] ==> val actionMap: (ActionMap..ActionMap?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init[LocalVariableDescriptor]

'put' @ [131:19] ==> public open fun put(p0: (Any..Any?), p1: (Action..Action?)): Unit defined in javax.swing.ActionMap[JavaMethodDescriptor]

'AbstractAction' @ [131:44] ==> public constructor AbstractAction() defined in javax.swing.AbstractAction[JavaClassConstructorDescriptor]

'table' @ [133:17] ==> public final lateinit var table: JBTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'cellEditor' @ [133:23] ==> public final var JBTable.cellEditor: (TableCellEditor..TableCellEditor?)[MyPropertyDescriptor]

'stopCellEditing' @ [133:35] ==> public abstract fun stopCellEditing(): Boolean defined in javax.swing.table.TableCellEditor[JavaMethodDescriptor]

'onCancelAction' @ [133:56] ==> protected open fun onCancelAction(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[SimpleFunctionDescriptorImpl]

'createDecorator' @ [137:42] ==> public open fun createDecorator(@NotNull p0: JTable): (ToolbarDecorator..ToolbarDecorator?) defined in com.intellij.ui.ToolbarDecorator[JavaMethodDescriptor]

'table' @ [137:58] ==> public final lateinit var table: JBTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'disableAddAction' @ [137:65] ==> public open fun disableAddAction(): (ToolbarDecorator..ToolbarDecorator?) defined in com.intellij.ui.ToolbarDecorator[JavaMethodDescriptor]

'disableRemoveAction' @ [137:84] ==> public open fun disableRemoveAction(): (ToolbarDecorator..ToolbarDecorator?) defined in com.intellij.ui.ToolbarDecorator[JavaMethodDescriptor]

'createPanel' @ [137:106] ==> public open fun createPanel(): (JPanel..JPanel?) defined in com.intellij.ui.ToolbarDecorator[JavaMethodDescriptor]

'add' @ [138:9] ==> public open fun add(p0: (Component..Component?), p1: (Any..Any?)): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[JavaMethodDescriptor]

'listPanel' @ [138:13] ==> val listPanel: (JPanel..JPanel?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.init[LocalVariableDescriptor]

'CENTER' @ [138:37] ==> public const final val CENTER: String defined in java.awt.BorderLayout[JavaPropertyDescriptor]

'AbstractTableModel' @ [157:9] ==> public constructor AbstractTableModel() defined in javax.swing.table.AbstractTableModel[JavaClassConstructorDescriptor]

'outer' @ [159:36] ==> public final val outer: AbstractParameterTablePanel<Param, UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[PropertyDescriptorImpl]

'parameterInfos' @ [159:42] ==> protected final lateinit var parameterInfos: MutableList<UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'IllegalAccessError' @ [161:39] ==> public constructor IllegalAccessError(p0: (String..String?)) defined in java.lang.IllegalAccessError[JavaClassConstructorDescriptor]

'IllegalAccessError' @ [163:52] ==> public constructor IllegalAccessError(p0: (String..String?)) defined in java.lang.IllegalAccessError[JavaClassConstructorDescriptor]

'oldIndex' @ [166:17] ==> value-parameter oldIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.exchangeRows[ValueParameterDescriptorImpl]

'newIndex' @ [166:33] ==> value-parameter newIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.exchangeRows[ValueParameterDescriptorImpl]

'oldIndex' @ [167:17] ==> value-parameter oldIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.exchangeRows[ValueParameterDescriptorImpl]

'parameterInfos' @ [167:29] ==> public final val parameterInfos: MutableList<UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[PropertyDescriptorImpl]

'size' @ [167:44] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'newIndex' @ [167:52] ==> value-parameter newIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.exchangeRows[ValueParameterDescriptorImpl]

'parameterInfos' @ [167:64] ==> public final val parameterInfos: MutableList<UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[PropertyDescriptorImpl]

'size' @ [167:79] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'parameterInfos' @ [169:23] ==> public final val parameterInfos: MutableList<UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[PropertyDescriptorImpl]

'oldIndex' @ [169:38] ==> value-parameter oldIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.exchangeRows[ValueParameterDescriptorImpl]

'parameterInfos' @ [170:13] ==> public final val parameterInfos: MutableList<UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[PropertyDescriptorImpl]

'oldIndex' @ [170:28] ==> value-parameter oldIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.exchangeRows[ValueParameterDescriptorImpl]

'parameterInfos' @ [170:40] ==> public final val parameterInfos: MutableList<UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[PropertyDescriptorImpl]

'newIndex' @ [170:55] ==> value-parameter newIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.exchangeRows[ValueParameterDescriptorImpl]

'parameterInfos' @ [171:13] ==> public final val parameterInfos: MutableList<UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[PropertyDescriptorImpl]

'newIndex' @ [171:28] ==> value-parameter newIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.exchangeRows[ValueParameterDescriptorImpl]

'old' @ [171:40] ==> val old: UIParam defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.exchangeRows[LocalVariableDescriptor]

'fireTableRowsUpdated' @ [173:13] ==> public open fun fireTableRowsUpdated(p0: Int, p1: Int): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[JavaMethodDescriptor]

'min' @ [173:39] ==> public open fun min(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'oldIndex' @ [173:43] ==> value-parameter oldIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.exchangeRows[ValueParameterDescriptorImpl]

'newIndex' @ [173:53] ==> value-parameter newIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.exchangeRows[ValueParameterDescriptorImpl]

'max' @ [173:69] ==> public open fun max(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'oldIndex' @ [173:73] ==> value-parameter oldIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.exchangeRows[ValueParameterDescriptorImpl]

'newIndex' @ [173:83] ==> value-parameter newIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.exchangeRows[ValueParameterDescriptorImpl]

'outer' @ [174:13] ==> public final val outer: AbstractParameterTablePanel<Param, UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[PropertyDescriptorImpl]

'updateSignature' @ [174:19] ==> protected open fun updateSignature(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[SimpleFunctionDescriptorImpl]

'when {
                oldIndex < 0 || newIndex < 0 -> false
                oldIndex >= parameterInfos.size || newIndex >= parameterInfos.size -> false
                else -> true
            }' @ [178:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'oldIndex' @ [179:17] ==> value-parameter oldIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.canExchangeRows[ValueParameterDescriptorImpl]

'newIndex' @ [179:33] ==> value-parameter newIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.canExchangeRows[ValueParameterDescriptorImpl]

'oldIndex' @ [180:17] ==> value-parameter oldIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.canExchangeRows[ValueParameterDescriptorImpl]

'parameterInfos' @ [180:29] ==> public final val parameterInfos: MutableList<UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[PropertyDescriptorImpl]

'size' @ [180:44] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'newIndex' @ [180:52] ==> value-parameter newIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.canExchangeRows[ValueParameterDescriptorImpl]

'parameterInfos' @ [180:64] ==> public final val parameterInfos: MutableList<UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[PropertyDescriptorImpl]

'size' @ [180:79] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'parameterInfos' @ [187:38] ==> public final val parameterInfos: MutableList<UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[PropertyDescriptorImpl]

'size' @ [187:53] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'when (columnIndex) {
                CHECKMARK_COLUMN -> parameterInfos[rowIndex].isEnabled
                PARAMETER_NAME_COLUMN -> parameterInfos[rowIndex].name
                else -> null
            }' @ [190:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any?, entry1: Any?, entry2: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any?

'columnIndex' @ [190:26] ==> value-parameter columnIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.getValueAt[ValueParameterDescriptorImpl]

'CHECKMARK_COLUMN' @ [191:17] ==> public final val CHECKMARK_COLUMN: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.Companion[PropertyDescriptorImpl]

'parameterInfos' @ [191:37] ==> public final val parameterInfos: MutableList<UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[PropertyDescriptorImpl]

'rowIndex' @ [191:52] ==> value-parameter rowIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.getValueAt[ValueParameterDescriptorImpl]

'isEnabled' @ [191:62] ==> public final var isEnabled: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.AbstractParameterInfo[PropertyDescriptorImpl]

'PARAMETER_NAME_COLUMN' @ [192:17] ==> public final val PARAMETER_NAME_COLUMN: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.Companion[PropertyDescriptorImpl]

'parameterInfos' @ [192:42] ==> public final val parameterInfos: MutableList<UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[PropertyDescriptorImpl]

'rowIndex' @ [192:57] ==> value-parameter rowIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.getValueAt[ValueParameterDescriptorImpl]

'name' @ [192:67] ==> public final lateinit var name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.AbstractParameterInfo[PropertyDescriptorImpl]

'parameterInfos' @ [198:24] ==> public final val parameterInfos: MutableList<UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[PropertyDescriptorImpl]

'rowIndex' @ [198:39] ==> value-parameter rowIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.setValueAt[ValueParameterDescriptorImpl]

'when (columnIndex) {
                CHECKMARK_COLUMN -> {
                    info.isEnabled = aValue as Boolean
                    fireTableRowsUpdated(rowIndex, rowIndex)
                    outer.table.selectionModel.setSelectionInterval(rowIndex, rowIndex)
                    outer.updateSignature()
                }
                PARAMETER_NAME_COLUMN -> {
                    val name = aValue as String
                    if (KotlinNameSuggester.isIdentifier(name)) {
                        info.name = name
                    }
                    outer.updateSignature()
                }
            }' @ [199:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'columnIndex' @ [199:19] ==> value-parameter columnIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.setValueAt[ValueParameterDescriptorImpl]

'CHECKMARK_COLUMN' @ [200:17] ==> public final val CHECKMARK_COLUMN: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.Companion[PropertyDescriptorImpl]

'info' @ [201:21] ==> val info: UIParam defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.setValueAt[LocalVariableDescriptor]

'isEnabled' @ [201:26] ==> public final var isEnabled: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.AbstractParameterInfo[PropertyDescriptorImpl]

'aValue' @ [201:38] ==> value-parameter aValue: Any? defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.setValueAt[ValueParameterDescriptorImpl]

'fireTableRowsUpdated' @ [202:21] ==> public open fun fireTableRowsUpdated(p0: Int, p1: Int): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[JavaMethodDescriptor]

'rowIndex' @ [202:42] ==> value-parameter rowIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.setValueAt[ValueParameterDescriptorImpl]

'rowIndex' @ [202:52] ==> value-parameter rowIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.setValueAt[ValueParameterDescriptorImpl]

'outer' @ [203:21] ==> public final val outer: AbstractParameterTablePanel<Param, UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[PropertyDescriptorImpl]

'table' @ [203:27] ==> public final lateinit var table: JBTable defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[PropertyDescriptorImpl]

'selectionModel' @ [203:33] ==> public final var JBTable.selectionModel: (ListSelectionModel..ListSelectionModel?)[MyPropertyDescriptor]

'setSelectionInterval' @ [203:48] ==> public abstract fun setSelectionInterval(p0: Int, p1: Int): Unit defined in javax.swing.ListSelectionModel[JavaMethodDescriptor]

'rowIndex' @ [203:69] ==> value-parameter rowIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.setValueAt[ValueParameterDescriptorImpl]

'rowIndex' @ [203:79] ==> value-parameter rowIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.setValueAt[ValueParameterDescriptorImpl]

'outer' @ [204:21] ==> public final val outer: AbstractParameterTablePanel<Param, UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[PropertyDescriptorImpl]

'updateSignature' @ [204:27] ==> protected open fun updateSignature(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[SimpleFunctionDescriptorImpl]

'PARAMETER_NAME_COLUMN' @ [206:17] ==> public final val PARAMETER_NAME_COLUMN: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.Companion[PropertyDescriptorImpl]

'aValue' @ [207:32] ==> value-parameter aValue: Any? defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.setValueAt[ValueParameterDescriptorImpl]

'KotlinNameSuggester' @ [208:25] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'isIdentifier' @ [208:45] ==> public final fun isIdentifier(name: String?): Boolean defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'name' @ [208:58] ==> val name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.setValueAt[LocalVariableDescriptor]

'info' @ [209:25] ==> val info: UIParam defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.setValueAt[LocalVariableDescriptor]

'name' @ [209:30] ==> public final lateinit var name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.AbstractParameterInfo[PropertyDescriptorImpl]

'name' @ [209:37] ==> val name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.setValueAt[LocalVariableDescriptor]

'outer' @ [211:21] ==> public final val outer: AbstractParameterTablePanel<Param, UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[PropertyDescriptorImpl]

'updateSignature' @ [211:27] ==> protected open fun updateSignature(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[SimpleFunctionDescriptorImpl]

'parameterInfos' @ [217:24] ==> public final val parameterInfos: MutableList<UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[PropertyDescriptorImpl]

'rowIndex' @ [217:39] ==> value-parameter rowIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.isCellEditable[ValueParameterDescriptorImpl]

'when (columnIndex) {
                CHECKMARK_COLUMN -> outer.isEnabled && outer.isCheckMarkColumnEditable()
                PARAMETER_NAME_COLUMN -> outer.isEnabled && info.isEnabled
                else -> false
            }' @ [218:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'columnIndex' @ [218:26] ==> value-parameter columnIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.isCellEditable[ValueParameterDescriptorImpl]

'CHECKMARK_COLUMN' @ [219:17] ==> public final val CHECKMARK_COLUMN: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.Companion[PropertyDescriptorImpl]

'outer' @ [219:37] ==> public final val outer: AbstractParameterTablePanel<Param, UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[PropertyDescriptorImpl]

'isEnabled' @ [219:43] ==> public final var <Param, UIParam : AbstractParameterTablePanel.AbstractParameterInfo<Param>> AbstractParameterTablePanel<Param, UIParam>.isEnabled: Boolean[MyPropertyDescriptor]
Inferred types:
    <Param> -> Param
    <UIParam : AbstractParameterTablePanel.AbstractParameterInfo<Param>> -> UIParam

'outer' @ [219:56] ==> public final val outer: AbstractParameterTablePanel<Param, UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[PropertyDescriptorImpl]

'isCheckMarkColumnEditable' @ [219:62] ==> protected open fun isCheckMarkColumnEditable(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[SimpleFunctionDescriptorImpl]

'PARAMETER_NAME_COLUMN' @ [220:17] ==> public final val PARAMETER_NAME_COLUMN: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.Companion[PropertyDescriptorImpl]

'outer' @ [220:42] ==> public final val outer: AbstractParameterTablePanel<Param, UIParam> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[PropertyDescriptorImpl]

'isEnabled' @ [220:48] ==> public final var <Param, UIParam : AbstractParameterTablePanel.AbstractParameterInfo<Param>> AbstractParameterTablePanel<Param, UIParam>.isEnabled: Boolean[MyPropertyDescriptor]
Inferred types:
    <Param> -> Param
    <UIParam : AbstractParameterTablePanel.AbstractParameterInfo<Param>> -> UIParam

'info' @ [220:61] ==> val info: UIParam defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.isCellEditable[LocalVariableDescriptor]

'isEnabled' @ [220:66] ==> public final var isEnabled: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.AbstractParameterInfo[PropertyDescriptorImpl]

'columnIndex' @ [226:17] ==> value-parameter columnIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.getColumnClass[ValueParameterDescriptorImpl]

'CHECKMARK_COLUMN' @ [226:32] ==> public final val CHECKMARK_COLUMN: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.Companion[PropertyDescriptorImpl]

'Boolean' @ [226:57] ==> private constructor Boolean() defined in kotlin.Boolean[DeserializedClassConstructorDescriptor]

'java' @ [226:72] ==> public val <T> KClass<Boolean>.java: Class<Boolean> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Boolean

'super' @ [227:20] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase[LazyClassReceiverParameterDescriptor]

'getColumnClass' @ [227:26] ==> public open fun getColumnClass(p0: Int): (Class<*>..Class<*>?) defined in javax.swing.table.AbstractTableModel[JavaMethodDescriptor]

'columnIndex' @ [227:41] ==> value-parameter columnIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.TableModelBase.getColumnClass[ValueParameterDescriptorImpl]

