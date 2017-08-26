'FacetEditorTab' @ [44:5] ==> public constructor FacetEditorTab() defined in com.intellij.facet.ui.FacetEditorTab[JavaClassConstructorDescriptor]

'JPanel' @ [48:9] ==> public constructor JPanel(p0: (LayoutManager..LayoutManager?)) defined in javax.swing.JPanel[JavaClassConstructorDescriptor]

'BorderLayout' @ [48:16] ==> public constructor BorderLayout() defined in java.awt.BorderLayout[JavaClassConstructorDescriptor]

'configuration' @ [49:37] ==> value-parameter configuration: KotlinFacetConfiguration? defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent.<init>[ValueParameterDescriptorImpl]

'if (isMultiEditor) {
                editableCommonArguments = object : CommonCompilerArguments() {}
                editableJvmArguments = K2JVMCompilerArguments()
                editableJsArguments = K2JSCompilerArguments()
                editableCompilerSettings = CompilerSettings()


            }
            else {
                editableCommonArguments = configuration!!.settings.compilerArguments!!
                editableJvmArguments = editableCommonArguments as? K2JVMCompilerArguments
                                       ?: Kotlin2JvmCompilerArgumentsHolder.getInstance(project).settings.unfrozen() as K2JVMCompilerArguments
                editableJsArguments = editableCommonArguments as? K2JSCompilerArguments
                                      ?: Kotlin2JsCompilerArgumentsHolder.getInstance(project).settings.unfrozen() as K2JSCompilerArguments
                editableCompilerSettings = configuration.settings.compilerSettings!!
            }' @ [59:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isMultiEditor' @ [59:17] ==> private final val isMultiEditor: Boolean defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'editableCommonArguments' @ [60:17] ==> private final var editableCommonArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'CommonCompilerArguments' @ [60:52] ==> public constructor CommonCompilerArguments() defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedClassConstructorDescriptor]

'editableJvmArguments' @ [61:17] ==> private final var editableJvmArguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'K2JVMCompilerArguments' @ [61:40] ==> public constructor K2JVMCompilerArguments() defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedClassConstructorDescriptor]

'editableJsArguments' @ [62:17] ==> private final var editableJsArguments: K2JSCompilerArguments defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'K2JSCompilerArguments' @ [62:39] ==> public constructor K2JSCompilerArguments() defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedClassConstructorDescriptor]

'editableCompilerSettings' @ [63:17] ==> private final var editableCompilerSettings: CompilerSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'CompilerSettings' @ [63:44] ==> public constructor CompilerSettings() defined in org.jetbrains.kotlin.config.CompilerSettings[DeserializedClassConstructorDescriptor]

'editableCommonArguments' @ [68:17] ==> private final var editableCommonArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'configuration' @ [68:43] ==> value-parameter configuration: KotlinFacetConfiguration? defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent.<init>[ValueParameterDescriptorImpl]

'settings' @ [68:59] ==> public final var settings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[PropertyDescriptorImpl]

'compilerArguments' @ [68:68] ==> public final var compilerArguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'editableJvmArguments' @ [69:17] ==> private final var editableJvmArguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'editableCommonArguments' @ [69:40] ==> private final var editableCommonArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'Kotlin2JvmCompilerArgumentsHolder' @ [70:43] ==> public companion object defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JvmCompilerArgumentsHolder[FakeCallableDescriptorForObject]

'getInstance' @ [70:77] ==> public final fun getInstance(project: Project): Kotlin2JvmCompilerArgumentsHolder defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JvmCompilerArgumentsHolder.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [70:89] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'settings' @ [70:98] ==> public final var settings: K2JVMCompilerArguments defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JvmCompilerArgumentsHolder[DeserializedPropertyDescriptor]

'unfrozen' @ [70:107] ==> public final fun unfrozen(): Freezable defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedSimpleFunctionDescriptor]

'editableJsArguments' @ [71:17] ==> private final var editableJsArguments: K2JSCompilerArguments defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'editableCommonArguments' @ [71:39] ==> private final var editableCommonArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'Kotlin2JsCompilerArgumentsHolder' @ [72:42] ==> public companion object defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JsCompilerArgumentsHolder[FakeCallableDescriptorForObject]

'getInstance' @ [72:75] ==> public final fun getInstance(project: Project): Kotlin2JsCompilerArgumentsHolder defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JsCompilerArgumentsHolder.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [72:87] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'settings' @ [72:96] ==> public final var settings: K2JSCompilerArguments defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JsCompilerArgumentsHolder[DeserializedPropertyDescriptor]

'unfrozen' @ [72:105] ==> public final fun unfrozen(): Freezable defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedSimpleFunctionDescriptor]

'editableCompilerSettings' @ [73:17] ==> private final var editableCompilerSettings: CompilerSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'configuration' @ [73:44] ==> value-parameter configuration: KotlinFacetConfiguration? defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent.<init>[ValueParameterDescriptorImpl]

'settings' @ [73:58] ==> public final var settings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[PropertyDescriptorImpl]

'compilerSettings' @ [73:67] ==> public final var compilerSettings: CompilerSettings? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'compilerConfigurable' @ [76:13] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'KotlinCompilerConfigurableTab' @ [76:36] ==> public constructor KotlinCompilerConfigurableTab(project: (Project..Project?), @NotNull commonCompilerArguments: CommonCompilerArguments, @NotNull k2jsCompilerArguments: K2JSCompilerArguments, @NotNull k2jvmCompilerArguments: K2JVMCompilerArguments, compilerSettings: (CompilerSettings..CompilerSettings?), @Nullable compilerWorkspaceSettings: KotlinCompilerWorkspaceSettings?, isProjectSettings: Boolean, isMultiEditor: Boolean) defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerConfigurableTab[JavaClassConstructorDescriptor]

'project' @ [77:21] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'editableCommonArguments' @ [78:21] ==> private final var editableCommonArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'editableJsArguments' @ [79:21] ==> private final var editableJsArguments: K2JSCompilerArguments defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'editableJvmArguments' @ [80:21] ==> private final var editableJvmArguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'editableCompilerSettings' @ [81:21] ==> private final var editableCompilerSettings: CompilerSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'isMultiEditor' @ [84:21] ==> private final val isMultiEditor: Boolean defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'ThreeStateCheckBox' @ [88:42] ==> public constructor ThreeStateCheckBox(p0: (String..String?)) defined in com.intellij.util.ui.ThreeStateCheckBox[JavaClassConstructorDescriptor]

'apply' @ [88:85] ==> @InlineOnly public inline fun <T> ThreeStateCheckBox.apply(block: ThreeStateCheckBox.() -> Unit): ThreeStateCheckBox defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ThreeStateCheckBox

'isThirdStateEnabled' @ [88:93] ==> public final var ThreeStateCheckBox.isThirdStateEnabled: Boolean[MyPropertyDescriptor]

'isMultiEditor' @ [88:115] ==> private final val isMultiEditor: Boolean defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'JComboBox' @ [91:17] ==> public constructor JComboBox<E : (Any..Any?)>(p0: (Array<(TargetPlatformKind<*>..TargetPlatformKind<*>?)>..Array<out (TargetPlatformKind<*>..TargetPlatformKind<*>?)>?)) defined in javax.swing.JComboBox[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TargetPlatformKind<*>

'ALL_PLATFORMS' @ [91:69] ==> public final val ALL_PLATFORMS: List<TargetPlatformKind<*>> defined in org.jetbrains.kotlin.config.TargetPlatformKind.Companion[DeserializedPropertyDescriptor]

'toTypedArray' @ [91:83] ==> public inline fun <reified T> Collection<TargetPlatformKind<*>>.toTypedArray(): Array<TargetPlatformKind<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> TargetPlatformKind<*>

'apply' @ [91:99] ==> @InlineOnly public inline fun <T> JComboBox<TargetPlatformKind<*>>.apply(block: JComboBox<TargetPlatformKind<*>>.() -> Unit): JComboBox<TargetPlatformKind<*>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JComboBox<TargetPlatformKind<*>>

'setRenderer' @ [92:21] ==> public open fun setRenderer(p0: (ListCellRenderer<in (TargetPlatformKind<*>..TargetPlatformKind<*>?)>..ListCellRenderer<in (TargetPlatformKind<*>..TargetPlatformKind<*>?)>?)): Unit defined in javax.swing.JComboBox[JavaMethodDescriptor]

'DescriptionListCellRenderer' @ [92:33] ==> public constructor DescriptionListCellRenderer() defined in org.jetbrains.kotlin.idea.facet.DescriptionListCellRenderer[ClassConstructorDescriptorImpl]

'HoverHyperlinkLabel' @ [95:43] ==> public constructor HoverHyperlinkLabel(p0: (String..String?)) defined in com.intellij.ui.HoverHyperlinkLabel[JavaClassConstructorDescriptor]

'apply' @ [95:88] ==> @InlineOnly public inline fun <T> HoverHyperlinkLabel.apply(block: HoverHyperlinkLabel.() -> Unit): HoverHyperlinkLabel defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HoverHyperlinkLabel

'addHyperlinkListener' @ [96:13] ==> public final fun addHyperlinkListener(p0: (((HyperlinkEvent..HyperlinkEvent?)) -> Unit..(((HyperlinkEvent..HyperlinkEvent?)) -> Unit)?)): Unit defined in com.intellij.ui.HoverHyperlinkLabel[MyFunctionDescriptor]

'showSettingsDialog' @ [97:38] ==> public open fun showSettingsDialog(@Nullable p0: Project?, p1: (String..String?), p2: (String..String?)): Unit defined in com.intellij.ide.actions.ShowSettingsUtilImpl[JavaMethodDescriptor]

'project' @ [97:57] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'compilerConfigurable' @ [97:66] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'id' @ [97:87] ==> public final val KotlinCompilerConfigurableTab.id: String[MyPropertyDescriptor]

'useProjectSettingsCheckBox' @ [98:21] ==> public final val useProjectSettingsCheckBox: ThreeStateCheckBox defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'isSelected' @ [98:48] ==> public final var ThreeStateCheckBox.isSelected: Boolean[MyPropertyDescriptor]

'updateCompilerConfigurable' @ [99:21] ==> internal final fun updateCompilerConfigurable(): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[SimpleFunctionDescriptorImpl]

'createFormBuilder' @ [106:22] ==> public open fun createFormBuilder(): (FormBuilder..FormBuilder?) defined in com.intellij.util.ui.FormBuilder[JavaMethodDescriptor]

'addComponent' @ [107:22] ==> public open fun addComponent(@NotNull p0: JComponent): (FormBuilder..FormBuilder?) defined in com.intellij.util.ui.FormBuilder[JavaMethodDescriptor]

'JPanel' @ [107:35] ==> public constructor JPanel(p0: (LayoutManager..LayoutManager?)) defined in javax.swing.JPanel[JavaClassConstructorDescriptor]

'BorderLayout' @ [107:42] ==> public constructor BorderLayout() defined in java.awt.BorderLayout[JavaClassConstructorDescriptor]

'apply' @ [107:58] ==> @InlineOnly public inline fun <T> JPanel.apply(block: JPanel.() -> Unit): JPanel defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JPanel

'add' @ [108:25] ==> public open fun add(p0: (Component..Component?), p1: (Any..Any?)): Unit defined in javax.swing.JPanel[JavaMethodDescriptor]

'useProjectSettingsCheckBox' @ [108:29] ==> public final val useProjectSettingsCheckBox: ThreeStateCheckBox defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'WEST' @ [108:70] ==> public const final val WEST: String defined in java.awt.BorderLayout[JavaPropertyDescriptor]

'add' @ [109:25] ==> public open fun add(p0: (Component..Component?), p1: (Any..Any?)): Unit defined in javax.swing.JPanel[JavaMethodDescriptor]

'projectSettingsLink' @ [109:29] ==> private final val projectSettingsLink: HoverHyperlinkLabel defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'EAST' @ [109:63] ==> public const final val EAST: String defined in java.awt.BorderLayout[JavaPropertyDescriptor]

'addLabeledComponent' @ [111:22] ==> public open fun addLabeledComponent(@NotNull p0: String, @NotNull p1: JComponent): (FormBuilder..FormBuilder?) defined in com.intellij.util.ui.FormBuilder[JavaMethodDescriptor]

'targetPlatformComboBox' @ [111:64] ==> public final val targetPlatformComboBox: JComboBox<TargetPlatformKind<*>> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'addComponent' @ [112:22] ==> public open fun addComponent(@NotNull p0: JComponent): (FormBuilder..FormBuilder?) defined in com.intellij.util.ui.FormBuilder[JavaMethodDescriptor]

'compilerConfigurable' @ [112:35] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'createComponent' @ [112:56] ==> @Nullable @Override public open fun createComponent(): JComponent? defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerConfigurableTab[JavaMethodDescriptor]

'apply' @ [112:76] ==> @InlineOnly public inline fun <T> JComponent.apply(block: (JComponent).() -> Unit): JComponent defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JComponent

'border' @ [113:25] ==> public final var JComponent.border: (Border..Border?)[MyPropertyDescriptor]

'panel' @ [115:22] ==> public final val FormBuilder.panel: (JPanel..JPanel?)[MyPropertyDescriptor]

'apply' @ [116:22] ==> @InlineOnly public inline fun <T> (JPanel..JPanel?).apply(block: (JPanel..JPanel?).() -> Unit): (JPanel..JPanel?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.swing.JPanel..javax.swing.JPanel?)

'border' @ [117:25] ==> public final var JPanel.border: (Border..Border?)[MyPropertyDescriptor]

'EmptyBorder' @ [117:34] ==> public constructor EmptyBorder(p0: Int, p1: Int, p2: Int, p3: Int) defined in javax.swing.border.EmptyBorder[JavaClassConstructorDescriptor]

'add' @ [119:13] ==> public open fun add(p0: (Component..Component?), p1: (Any..Any?)): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[JavaMethodDescriptor]

'contentPanel' @ [119:17] ==> val contentPanel: (JPanel..JPanel?) defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent.<init>[LocalVariableDescriptor]

'NORTH' @ [119:44] ==> public const final val NORTH: String defined in java.awt.BorderLayout[JavaPropertyDescriptor]

'useProjectSettingsCheckBox' @ [121:13] ==> public final val useProjectSettingsCheckBox: ThreeStateCheckBox defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'addActionListener' @ [121:40] ==> public final fun addActionListener(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in com.intellij.util.ui.ThreeStateCheckBox[MyFunctionDescriptor]

'updateCompilerConfigurable' @ [122:17] ==> internal final fun updateCompilerConfigurable(): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[SimpleFunctionDescriptorImpl]

'targetPlatformComboBox' @ [125:13] ==> public final val targetPlatformComboBox: JComboBox<TargetPlatformKind<*>> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'addActionListener' @ [125:36] ==> public final fun addActionListener(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in javax.swing.JComboBox[MyFunctionDescriptor]

'updateCompilerConfigurable' @ [126:17] ==> internal final fun updateCompilerConfigurable(): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[SimpleFunctionDescriptorImpl]

'useProjectSettingsCheckBox' @ [131:38] ==> public final val useProjectSettingsCheckBox: ThreeStateCheckBox defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'isSelected' @ [131:65] ==> public final var ThreeStateCheckBox.isSelected: Boolean[MyPropertyDescriptor]

'compilerConfigurable' @ [132:13] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'setTargetPlatform' @ [132:34] ==> public open fun setTargetPlatform(@Nullable targetPlatform: TargetPlatformKind<*>?): Unit defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerConfigurableTab[JavaMethodDescriptor]

'chosenPlatform' @ [132:52] ==> private final val chosenPlatform: TargetPlatformKind<*>? defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'compilerConfigurable' @ [133:13] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'setEnabled' @ [133:34] ==> public open fun setEnabled(value: Boolean): Unit defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerConfigurableTab[JavaMethodDescriptor]

'!' @ [133:45] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'useProjectSettings' @ [133:46] ==> val useProjectSettings: Boolean defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent.updateCompilerConfigurable[LocalVariableDescriptor]

'if (useProjectSettings) {
                compilerConfigurable.commonCompilerArguments = KotlinCommonCompilerArgumentsHolder.getInstance(project).settings.unfrozen() as CommonCompilerArguments?
                compilerConfigurable.k2jvmCompilerArguments = Kotlin2JvmCompilerArgumentsHolder.getInstance(project).settings.unfrozen() as K2JVMCompilerArguments?
                compilerConfigurable.k2jsCompilerArguments = Kotlin2JsCompilerArgumentsHolder.getInstance(project).settings.unfrozen() as K2JSCompilerArguments?
                compilerConfigurable.compilerSettings = KotlinCompilerSettings.getInstance(project).settings.unfrozen() as CompilerSettings?
            }
            else {
                compilerConfigurable.commonCompilerArguments = editableCommonArguments
                compilerConfigurable.k2jvmCompilerArguments = editableJvmArguments
                compilerConfigurable.k2jsCompilerArguments = editableJsArguments
                compilerConfigurable.compilerSettings = editableCompilerSettings
            }' @ [134:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'useProjectSettings' @ [134:17] ==> val useProjectSettings: Boolean defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent.updateCompilerConfigurable[LocalVariableDescriptor]

'compilerConfigurable' @ [135:17] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'commonCompilerArguments' @ [135:38] ==> public final var KotlinCompilerConfigurableTab.commonCompilerArguments: (CommonCompilerArguments..CommonCompilerArguments?)[MyPropertyDescriptor]

'KotlinCommonCompilerArgumentsHolder' @ [135:64] ==> public companion object defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder[FakeCallableDescriptorForObject]

'getInstance' @ [135:100] ==> public final fun getInstance(project: Project): KotlinCommonCompilerArgumentsHolder defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [135:112] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'settings' @ [135:121] ==> public final var settings: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder[DeserializedPropertyDescriptor]

'unfrozen' @ [135:130] ==> public final fun unfrozen(): Freezable defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedSimpleFunctionDescriptor]

'compilerConfigurable' @ [136:17] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'k2jvmCompilerArguments' @ [136:38] ==> public final var KotlinCompilerConfigurableTab.k2jvmCompilerArguments: (K2JVMCompilerArguments..K2JVMCompilerArguments?)[MyPropertyDescriptor]

'Kotlin2JvmCompilerArgumentsHolder' @ [136:63] ==> public companion object defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JvmCompilerArgumentsHolder[FakeCallableDescriptorForObject]

'getInstance' @ [136:97] ==> public final fun getInstance(project: Project): Kotlin2JvmCompilerArgumentsHolder defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JvmCompilerArgumentsHolder.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [136:109] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'settings' @ [136:118] ==> public final var settings: K2JVMCompilerArguments defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JvmCompilerArgumentsHolder[DeserializedPropertyDescriptor]

'unfrozen' @ [136:127] ==> public final fun unfrozen(): Freezable defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedSimpleFunctionDescriptor]

'compilerConfigurable' @ [137:17] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'k2jsCompilerArguments' @ [137:38] ==> public final var KotlinCompilerConfigurableTab.k2jsCompilerArguments: (K2JSCompilerArguments..K2JSCompilerArguments?)[MyPropertyDescriptor]

'Kotlin2JsCompilerArgumentsHolder' @ [137:62] ==> public companion object defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JsCompilerArgumentsHolder[FakeCallableDescriptorForObject]

'getInstance' @ [137:95] ==> public final fun getInstance(project: Project): Kotlin2JsCompilerArgumentsHolder defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JsCompilerArgumentsHolder.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [137:107] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'settings' @ [137:116] ==> public final var settings: K2JSCompilerArguments defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JsCompilerArgumentsHolder[DeserializedPropertyDescriptor]

'unfrozen' @ [137:125] ==> public final fun unfrozen(): Freezable defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedSimpleFunctionDescriptor]

'compilerConfigurable' @ [138:17] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'compilerSettings' @ [138:38] ==> public final var KotlinCompilerConfigurableTab.compilerSettings: (CompilerSettings..CompilerSettings?)[MyPropertyDescriptor]

'KotlinCompilerSettings' @ [138:57] ==> public companion object defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerSettings[FakeCallableDescriptorForObject]

'getInstance' @ [138:80] ==> public final fun getInstance(project: Project): KotlinCompilerSettings defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerSettings.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [138:92] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'settings' @ [138:101] ==> public final var settings: CompilerSettings defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerSettings[DeserializedPropertyDescriptor]

'unfrozen' @ [138:110] ==> public final fun unfrozen(): Freezable defined in org.jetbrains.kotlin.config.CompilerSettings[DeserializedSimpleFunctionDescriptor]

'compilerConfigurable' @ [141:17] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'commonCompilerArguments' @ [141:38] ==> public final var KotlinCompilerConfigurableTab.commonCompilerArguments: (CommonCompilerArguments..CommonCompilerArguments?)[MyPropertyDescriptor]

'editableCommonArguments' @ [141:64] ==> private final var editableCommonArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'compilerConfigurable' @ [142:17] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'k2jvmCompilerArguments' @ [142:38] ==> public final var KotlinCompilerConfigurableTab.k2jvmCompilerArguments: (K2JVMCompilerArguments..K2JVMCompilerArguments?)[MyPropertyDescriptor]

'editableJvmArguments' @ [142:63] ==> private final var editableJvmArguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'compilerConfigurable' @ [143:17] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'k2jsCompilerArguments' @ [143:38] ==> public final var KotlinCompilerConfigurableTab.k2jsCompilerArguments: (K2JSCompilerArguments..K2JSCompilerArguments?)[MyPropertyDescriptor]

'editableJsArguments' @ [143:62] ==> private final var editableJsArguments: K2JSCompilerArguments defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'compilerConfigurable' @ [144:17] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'compilerSettings' @ [144:38] ==> public final var KotlinCompilerConfigurableTab.compilerSettings: (CompilerSettings..CompilerSettings?)[MyPropertyDescriptor]

'editableCompilerSettings' @ [144:57] ==> private final var editableCompilerSettings: CompilerSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'compilerConfigurable' @ [146:13] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'reset' @ [146:34] ==> @Override public open fun reset(): Unit defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerConfigurableTab[JavaMethodDescriptor]

'targetPlatformComboBox' @ [150:21] ==> public final val targetPlatformComboBox: JComboBox<TargetPlatformKind<*>> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'selectedItem' @ [150:44] ==> public final var <E : (Any..Any?)> JComboBox<TargetPlatformKind<*>>.selectedItem: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TargetPlatformKind<*>

'FacetEditorValidator' @ [153:48] ==> public constructor FacetEditorValidator() defined in com.intellij.facet.ui.FacetEditorValidator[JavaClassConstructorDescriptor]

'editor' @ [155:28] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'targetPlatformComboBox' @ [155:35] ==> public final val targetPlatformComboBox: JComboBox<TargetPlatformKind<*>> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'selectedItem' @ [155:58] ==> public final var <E : (Any..Any?)> JComboBox<TargetPlatformKind<*>>.selectedItem: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TargetPlatformKind<*>

'OK' @ [155:124] ==> public final val OK: (ValidationResult..ValidationResult?) defined in com.intellij.facet.ui.ValidationResult[JavaPropertyDescriptor]

'platform' @ [156:36] ==> val platform: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'createCompilerArguments' @ [156:45] ==> public fun TargetPlatformKind<*>.createCompilerArguments(init: CommonCompilerArguments.() -> Unit = ...): CommonCompilerArguments defined in org.jetbrains.kotlin.config[DeserializedSimpleFunctionDescriptor]

'apply' @ [156:71] ==> @InlineOnly public inline fun <T> CommonCompilerArguments.apply(block: CommonCompilerArguments.() -> Unit): CommonCompilerArguments defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CommonCompilerArguments

'editor' @ [157:17] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'compilerConfigurable' @ [157:24] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'applyTo' @ [157:45] ==> public open fun applyTo(commonCompilerArguments: (CommonCompilerArguments..CommonCompilerArguments?), k2jvmCompilerArguments: (K2JVMCompilerArguments..K2JVMCompilerArguments?), k2jsCompilerArguments: (K2JSCompilerArguments..K2JSCompilerArguments?), compilerSettings: (CompilerSettings..CompilerSettings?)): Unit defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerConfigurableTab[JavaMethodDescriptor]

'this' @ [158:25] ==> <this> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check.<anonymous>[ReceiverParameterDescriptorImpl]

'this' @ [159:25] ==> <this> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check.<anonymous>[ReceiverParameterDescriptorImpl]

'K2JVMCompilerArguments' @ [159:60] ==> public constructor K2JVMCompilerArguments() defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedClassConstructorDescriptor]

'this' @ [160:25] ==> <this> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check.<anonymous>[ReceiverParameterDescriptorImpl]

'K2JSCompilerArguments' @ [160:59] ==> public constructor K2JSCompilerArguments() defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedClassConstructorDescriptor]

'CompilerSettings' @ [161:25] ==> public constructor CompilerSettings() defined in org.jetbrains.kotlin.config.CompilerSettings[DeserializedClassConstructorDescriptor]

'primaryArguments' @ [164:33] ==> val primaryArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'javaClass' @ [164:50] ==> public val <T : Any> CommonCompilerArguments.javaClass: Class<CommonCompilerArguments> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> CommonCompilerArguments

'argumentClass' @ [165:39] ==> val argumentClass: Class<CommonCompilerArguments> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'newInstance' @ [165:53] ==> @CallerSensitive public open fun newInstance(): (CommonCompilerArguments..CommonCompilerArguments?) defined in java.lang.Class[JavaMethodDescriptor]

'apply' @ [165:67] ==> @InlineOnly public inline fun <T> (CommonCompilerArguments..CommonCompilerArguments?).apply(block: (CommonCompilerArguments..CommonCompilerArguments?).() -> Unit): (CommonCompilerArguments..CommonCompilerArguments?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments..org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments?)

'parseCommandLineArguments' @ [166:17] ==> public fun <A : CommonToolArguments> parseCommandLineArguments(args: List<String>, result: (CommonCompilerArguments..CommonCompilerArguments?)): Unit defined in org.jetbrains.kotlin.cli.common.arguments[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A : CommonToolArguments> -> (org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments..org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments?)

'splitArgumentString' @ [166:43] ==> public fun splitArgumentString(arguments: String): List<(String..String?)> defined in org.jetbrains.kotlin.config[DeserializedSimpleFunctionDescriptor]

'editor' @ [166:63] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'compilerConfigurable' @ [166:70] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'additionalArgsOptionsField' @ [166:91] ==> public final val KotlinCompilerConfigurableTab.additionalArgsOptionsField: (RawCommandLineEditor..RawCommandLineEditor?)[MyPropertyDescriptor]

'text' @ [166:118] ==> public final var RawCommandLineEditor.text: (String..String?)[MyPropertyDescriptor]

'this' @ [166:125] ==> <this> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check.<anonymous>[ReceiverParameterDescriptorImpl]

'validateArguments' @ [167:17] ==> public fun validateArguments(errors: ArgumentParseErrors): String? defined in org.jetbrains.kotlin.cli.common.arguments[DeserializedSimpleFunctionDescriptor]

'errors' @ [167:35] ==> public final var errors: ArgumentParseErrors defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'let' @ [167:44] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Nothing

'ValidationResult' @ [167:68] ==> public constructor ValidationResult(p0: (String..String?)) defined in com.intellij.facet.ui.ValidationResult[JavaClassConstructorDescriptor]

'message' @ [167:85] ==> value-parameter message: String defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'argumentClass' @ [169:34] ==> val argumentClass: Class<CommonCompilerArguments> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'newInstance' @ [169:48] ==> @CallerSensitive public open fun newInstance(): (CommonCompilerArguments..CommonCompilerArguments?) defined in java.lang.Class[JavaMethodDescriptor]

'when (platform) {
                is TargetPlatformKind.Jvm -> jvmUIExposedFields
                is TargetPlatformKind.JavaScript -> jsUIExposedFields
                else -> commonUIExposedFields
            }' @ [170:37] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<String>, entry1: List<String>, entry2: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<String>

'platform' @ [170:43] ==> val platform: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'jvmUIExposedFields' @ [171:46] ==> public val jvmUIExposedFields: List<String> defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[PropertyDescriptorImpl]

'jsUIExposedFields' @ [172:53] ==> public val jsUIExposedFields: List<String> defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[PropertyDescriptorImpl]

'commonUIExposedFields' @ [173:25] ==> public val commonUIExposedFields: List<String> defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[PropertyDescriptorImpl]

'collectProperties' @ [176:37] ==> public fun <T : Any> collectProperties(kClass: KClass<CommonCompilerArguments>, inheritedOnly: Boolean): List<KProperty1<CommonCompilerArguments, Any?>> defined in org.jetbrains.kotlin.cli.common.arguments[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> CommonCompilerArguments

'argumentClass' @ [176:55] ==> val argumentClass: Class<CommonCompilerArguments> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'kotlin' @ [176:69] ==> public val <T : Any> Class<CommonCompilerArguments>.kotlin: KClass<CommonCompilerArguments> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> CommonCompilerArguments

'filter' @ [176:84] ==> public inline fun <T> Iterable<KProperty1<CommonCompilerArguments, Any?>>.filter(predicate: (KProperty1<CommonCompilerArguments, Any?>) -> Boolean): List<KProperty1<CommonCompilerArguments, Any?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KProperty1<CommonCompilerArguments, Any?>

'it' @ [176:93] ==> value-parameter it: KProperty1<CommonCompilerArguments, Any?> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [176:96] ==> public abstract val name: String defined in kotlin.reflect.KProperty1[DeserializedPropertyDescriptor]

'fieldNamesToCheck' @ [176:104] ==> val fieldNamesToCheck: List<String> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'ArrayList' @ [177:39] ==> public final fun <E> <init>(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> String

'ArrayList' @ [178:38] ==> public final fun <E> <init>(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> String

'propertiesToCheck' @ [179:30] ==> val propertiesToCheck: List<KProperty1<CommonCompilerArguments, Any?>> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'property' @ [180:39] ==> val property: KProperty1<CommonCompilerArguments, Any?> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'get' @ [180:48] ==> public abstract fun get(receiver: CommonCompilerArguments): Any? defined in kotlin.reflect.KProperty1[DeserializedSimpleFunctionDescriptor]

'additionalArguments' @ [180:52] ==> val additionalArguments: (CommonCompilerArguments..CommonCompilerArguments?) defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'additionalValue' @ [181:21] ==> val additionalValue: Any? defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'property' @ [181:40] ==> val property: KProperty1<CommonCompilerArguments, Any?> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'get' @ [181:49] ==> public abstract fun get(receiver: CommonCompilerArguments): Any? defined in kotlin.reflect.KProperty1[DeserializedSimpleFunctionDescriptor]

'emptyArguments' @ [181:53] ==> val emptyArguments: (CommonCompilerArguments..CommonCompilerArguments?) defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'property' @ [182:40] ==> val property: KProperty1<CommonCompilerArguments, Any?> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'findAnnotation' @ [182:49] ==> @SinceKotlin public inline fun <reified T : Annotation> KAnnotatedElement.findAnnotation(): Argument? defined in kotlin.reflect.full[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Annotation> -> Argument

'if (additionalValue != property.get(primaryArguments)) overridingArguments else redundantArguments' @ [183:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ArrayList<String> /* = ArrayList<String> */, elseBranch: ArrayList<String> /* = ArrayList<String> */): ArrayList<String> /* = ArrayList<String> */[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ArrayList<String>

'additionalValue' @ [183:37] ==> val additionalValue: Any? defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'property' @ [183:56] ==> val property: KProperty1<CommonCompilerArguments, Any?> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'get' @ [183:65] ==> public abstract fun get(receiver: CommonCompilerArguments): Any? defined in kotlin.reflect.KProperty1[DeserializedSimpleFunctionDescriptor]

'primaryArguments' @ [183:69] ==> val primaryArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'overridingArguments' @ [183:88] ==> val overridingArguments: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'redundantArguments' @ [183:113] ==> val redundantArguments: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'addTo' @ [184:21] ==> val addTo: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'+' @ [184:30] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'argumentInfo' @ [184:43] ==> val argumentInfo: Argument defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'value' @ [184:56] ==> public final val value: String defined in org.jetbrains.kotlin.cli.common.arguments.Argument[DeserializedPropertyDescriptor]

'first' @ [184:62] ==> public fun CharSequence.first(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'overridingArguments' @ [187:17] ==> val overridingArguments: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'isNotEmpty' @ [187:37] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'redundantArguments' @ [187:53] ==> val redundantArguments: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'isNotEmpty' @ [187:72] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'buildString' @ [188:31] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'overridingArguments' @ [189:25] ==> val overridingArguments: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'isNotEmpty' @ [189:45] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'append' @ [190:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'overridingArguments' @ [190:80] ==> val overridingArguments: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'joinToString' @ [190:100] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'redundantArguments' @ [192:25] ==> val redundantArguments: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'isNotEmpty' @ [192:44] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'isNotEmpty' @ [193:29] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [194:29] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [196:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'redundantArguments' @ [196:70] ==> val redundantArguments: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'joinToString' @ [196:89] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ValidationResult' @ [199:24] ==> public constructor ValidationResult(p0: (String..String?)) defined in com.intellij.facet.ui.ValidationResult[JavaClassConstructorDescriptor]

'message' @ [199:41] ==> val message: String defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator.check[LocalVariableDescriptor]

'OK' @ [202:37] ==> public final val OK: (ValidationResult..ValidationResult?) defined in com.intellij.facet.ui.ValidationResult[JavaPropertyDescriptor]

'EditorComponent' @ [206:18] ==> public constructor EditorComponent(project: Project, configuration: KotlinFacetConfiguration?) defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[ClassConstructorDescriptorImpl]

'editorContext' @ [206:34] ==> private final val editorContext: FacetEditorContext defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'project' @ [206:48] ==> public final val FacetEditorContext.project: Project[MyPropertyDescriptor]

'configuration' @ [206:57] ==> private final val configuration: KotlinFacetConfiguration defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'ArgumentConsistencyValidator' @ [209:38] ==> public constructor ArgumentConsistencyValidator() defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator[ClassConstructorDescriptorImpl]

'libraryValidator' @ [214:9] ==> private final val libraryValidator: FrameworkLibraryValidator defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'FrameworkLibraryValidatorWithDynamicDescription' @ [214:28] ==> public constructor FrameworkLibraryValidatorWithDynamicDescription(context: LibrariesValidatorContext, validatorsManager: FacetValidatorsManager, libraryCategoryName: String, getTargetPlatform: () -> TargetPlatformKind<*>) defined in org.jetbrains.kotlin.idea.facet.FrameworkLibraryValidatorWithDynamicDescription[ClassConstructorDescriptorImpl]

'DelegatingLibrariesValidatorContext' @ [215:17] ==> public constructor DelegatingLibrariesValidatorContext(@NotNull p0: FacetEditorContext) defined in com.intellij.facet.impl.ui.libraries.DelegatingLibrariesValidatorContext[JavaClassConstructorDescriptor]

'editorContext' @ [215:53] ==> private final val editorContext: FacetEditorContext defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'validatorsManager' @ [216:17] ==> private final val validatorsManager: FacetValidatorsManager defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'editor' @ [218:13] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'targetPlatformComboBox' @ [218:20] ==> public final val targetPlatformComboBox: JComboBox<TargetPlatformKind<*>> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'selectedItem' @ [218:43] ==> public final var <E : (Any..Any?)> JComboBox<TargetPlatformKind<*>>.selectedItem: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TargetPlatformKind<*>

'validatorsManager' @ [220:9] ==> private final val validatorsManager: FacetValidatorsManager defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'registerValidator' @ [220:27] ==> public abstract fun registerValidator(p0: (FacetEditorValidator..FacetEditorValidator?), vararg p1: (JComponent..JComponent?)): Unit defined in com.intellij.facet.ui.FacetValidatorsManager[JavaMethodDescriptor]

'libraryValidator' @ [220:45] ==> private final val libraryValidator: FrameworkLibraryValidator defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'validatorsManager' @ [221:9] ==> private final val validatorsManager: FacetValidatorsManager defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'registerValidator' @ [221:27] ==> public abstract fun registerValidator(p0: (FacetEditorValidator..FacetEditorValidator?), vararg p1: (JComponent..JComponent?)): Unit defined in com.intellij.facet.ui.FacetValidatorsManager[JavaMethodDescriptor]

'coroutineValidator' @ [221:45] ==> private final val coroutineValidator: KotlinFacetEditorGeneralTab.ArgumentConsistencyValidator defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'with' @ [223:9] ==> @InlineOnly public inline fun <T, R> with(receiver: KotlinCompilerConfigurableTab, block: KotlinCompilerConfigurableTab.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCompilerConfigurableTab
    <R> -> Unit

'editor' @ [223:14] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'compilerConfigurable' @ [223:21] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'reportWarningsCheckBox' @ [224:13] ==> public final val KotlinCompilerConfigurableTab.reportWarningsCheckBox: (ThreeStateCheckBox..ThreeStateCheckBox?)[MyPropertyDescriptor]

'validateOnChange' @ [224:36] ==> private final fun AbstractButton.validateOnChange(): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[SimpleFunctionDescriptorImpl]

'additionalArgsOptionsField' @ [225:13] ==> public final val KotlinCompilerConfigurableTab.additionalArgsOptionsField: (RawCommandLineEditor..RawCommandLineEditor?)[MyPropertyDescriptor]

'textField' @ [225:40] ==> public final val RawCommandLineEditor.textField: (JTextField..JTextField?)[MyPropertyDescriptor]

'validateOnChange' @ [225:50] ==> private final fun JTextField.validateOnChange(): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[SimpleFunctionDescriptorImpl]

'generateSourceMapsCheckBox' @ [226:13] ==> public final val KotlinCompilerConfigurableTab.generateSourceMapsCheckBox: (ThreeStateCheckBox..ThreeStateCheckBox?)[MyPropertyDescriptor]

'validateOnChange' @ [226:40] ==> private final fun AbstractButton.validateOnChange(): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[SimpleFunctionDescriptorImpl]

'outputPrefixFile' @ [227:13] ==> public final val KotlinCompilerConfigurableTab.outputPrefixFile: (TextFieldWithBrowseButton..TextFieldWithBrowseButton?)[MyPropertyDescriptor]

'textField' @ [227:30] ==> public final val TextFieldWithBrowseButton.textField: (JTextField..JTextField?)[MyPropertyDescriptor]

'validateOnChange' @ [227:40] ==> private final fun JTextField.validateOnChange(): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[SimpleFunctionDescriptorImpl]

'outputPostfixFile' @ [228:13] ==> public final val KotlinCompilerConfigurableTab.outputPostfixFile: (TextFieldWithBrowseButton..TextFieldWithBrowseButton?)[MyPropertyDescriptor]

'textField' @ [228:31] ==> public final val TextFieldWithBrowseButton.textField: (JTextField..JTextField?)[MyPropertyDescriptor]

'validateOnChange' @ [228:41] ==> private final fun JTextField.validateOnChange(): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[SimpleFunctionDescriptorImpl]

'outputDirectory' @ [229:13] ==> public final val KotlinCompilerConfigurableTab.outputDirectory: (TextFieldWithBrowseButton..TextFieldWithBrowseButton?)[MyPropertyDescriptor]

'textField' @ [229:29] ==> public final val TextFieldWithBrowseButton.textField: (JTextField..JTextField?)[MyPropertyDescriptor]

'validateOnChange' @ [229:39] ==> private final fun JTextField.validateOnChange(): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[SimpleFunctionDescriptorImpl]

'copyRuntimeFilesCheckBox' @ [230:13] ==> public final val KotlinCompilerConfigurableTab.copyRuntimeFilesCheckBox: (ThreeStateCheckBox..ThreeStateCheckBox?)[MyPropertyDescriptor]

'validateOnChange' @ [230:38] ==> private final fun AbstractButton.validateOnChange(): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[SimpleFunctionDescriptorImpl]

'moduleKindComboBox' @ [231:13] ==> public final val KotlinCompilerConfigurableTab.moduleKindComboBox: raw (JComboBox<(Any..Any?)>..JComboBox<*>?)[MyPropertyDescriptor]

'validateOnChange' @ [231:32] ==> private final fun JComboBox<*>.validateOnChange(): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[SimpleFunctionDescriptorImpl]

'languageVersionComboBox' @ [232:13] ==> public final val KotlinCompilerConfigurableTab.languageVersionComboBox: raw (JComboBox<(Any..Any?)>..JComboBox<*>?)[MyPropertyDescriptor]

'addActionListener' @ [232:37] ==> public final fun addActionListener(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in javax.swing.JComboBox[MyFunctionDescriptor]

'restrictAPIVersions' @ [233:17] ==> private final fun restrictAPIVersions(): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[SimpleFunctionDescriptorImpl]

'doValidate' @ [234:17] ==> private final fun doValidate(): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[SimpleFunctionDescriptorImpl]

'apiVersionComboBox' @ [236:13] ==> public final val KotlinCompilerConfigurableTab.apiVersionComboBox: raw (JComboBox<(Any..Any?)>..JComboBox<*>?)[MyPropertyDescriptor]

'validateOnChange' @ [236:32] ==> private final fun JComboBox<*>.validateOnChange(): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[SimpleFunctionDescriptorImpl]

'coroutineSupportComboBox' @ [237:13] ==> public final val KotlinCompilerConfigurableTab.coroutineSupportComboBox: raw (JComboBox<(Any..Any?)>..JComboBox<*>?)[MyPropertyDescriptor]

'validateOnChange' @ [237:38] ==> private final fun JComboBox<*>.validateOnChange(): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[SimpleFunctionDescriptorImpl]

'editor' @ [239:9] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'targetPlatformComboBox' @ [239:16] ==> public final val targetPlatformComboBox: JComboBox<TargetPlatformKind<*>> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'validateOnChange' @ [239:39] ==> private final fun JComboBox<*>.validateOnChange(): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[SimpleFunctionDescriptorImpl]

'editor' @ [241:9] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'updateCompilerConfigurable' @ [241:16] ==> internal final fun updateCompilerConfigurable(): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[SimpleFunctionDescriptorImpl]

'with' @ [245:9] ==> @InlineOnly public inline fun <T, R> with(receiver: KotlinCompilerConfigurableTab, block: KotlinCompilerConfigurableTab.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCompilerConfigurableTab
    <R> -> Unit

'editor' @ [245:14] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'compilerConfigurable' @ [245:21] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'editor' @ [246:34] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'targetPlatformComboBox' @ [246:41] ==> public final val targetPlatformComboBox: JComboBox<TargetPlatformKind<*>> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'selectedItem' @ [246:64] ==> public final var <E : (Any..Any?)> JComboBox<TargetPlatformKind<*>>.selectedItem: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TargetPlatformKind<*>

'getLibraryLanguageLevel' @ [247:32] ==> public fun getLibraryLanguageLevel(module: Module, rootModel: ModuleRootModel?, targetPlatform: TargetPlatformKind<*>?): LanguageVersion defined in org.jetbrains.kotlin.idea.facet[DeserializedSimpleFunctionDescriptor]

'editorContext' @ [247:56] ==> private final val editorContext: FacetEditorContext defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'module' @ [247:70] ==> public final val FacetEditorContext.module: Module[MyPropertyDescriptor]

'editorContext' @ [247:78] ==> private final val editorContext: FacetEditorContext defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'rootModel' @ [247:92] ==> public final val FacetEditorContext.rootModel: ModuleRootModel[MyPropertyDescriptor]

'targetPlatform' @ [247:103] ==> val targetPlatform: TargetPlatformKind<*>? defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.restrictAPIVersions.<anonymous>[LocalVariableDescriptor]

'minOf' @ [248:37] ==> @SinceKotlin public fun <T : Comparable<LanguageVersion>> minOf(a: LanguageVersion, b: LanguageVersion): LanguageVersion defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> LanguageVersion

'selectedLanguageVersion' @ [248:43] ==> public final val KotlinCompilerConfigurableTab.selectedLanguageVersion: LanguageVersion[MyPropertyDescriptor]

'libraryLevel' @ [248:68] ==> val libraryLevel: LanguageVersion defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.restrictAPIVersions.<anonymous>[LocalVariableDescriptor]

'restrictAPIVersions' @ [249:13] ==> @SuppressWarnings public open fun restrictAPIVersions(upperBound: (LanguageVersion..LanguageVersion?)): Unit defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerConfigurableTab[JavaMethodDescriptor]

'versionUpperBound' @ [249:33] ==> val versionUpperBound: LanguageVersion defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.restrictAPIVersions.<anonymous>[LocalVariableDescriptor]

'document' @ [254:9] ==> public final var JTextField.document: (Document..Document?)[MyPropertyDescriptor]

'addDocumentListener' @ [254:18] ==> public abstract fun addDocumentListener(p0: (DocumentListener..DocumentListener?)): Unit defined in javax.swing.text.Document[JavaMethodDescriptor]

'DocumentAdapter' @ [255:26] ==> public constructor DocumentAdapter() defined in com.intellij.ui.DocumentAdapter[JavaClassConstructorDescriptor]

'doValidate' @ [257:25] ==> private final fun doValidate(): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[SimpleFunctionDescriptorImpl]

'addChangeListener' @ [264:9] ==> public final fun addChangeListener(p0: (((ChangeEvent..ChangeEvent?)) -> Unit..(((ChangeEvent..ChangeEvent?)) -> Unit)?)): Unit defined in javax.swing.AbstractButton[MyFunctionDescriptor]

'doValidate' @ [264:29] ==> private final fun doValidate(): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[SimpleFunctionDescriptorImpl]

'addActionListener' @ [268:9] ==> public final fun addActionListener(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in javax.swing.JComboBox[MyFunctionDescriptor]

'doValidate' @ [268:29] ==> private final fun doValidate(): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[SimpleFunctionDescriptorImpl]

'enableValidation' @ [272:9] ==> private final var enableValidation: Boolean defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'invoke' @ [273:9] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'enableValidation' @ [274:9] ==> private final var enableValidation: Boolean defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'doValidate' @ [275:9] ==> private final fun doValidate(): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[SimpleFunctionDescriptorImpl]

'enableValidation' @ [279:13] ==> private final var enableValidation: Boolean defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'validatorsManager' @ [280:13] ==> private final val validatorsManager: FacetValidatorsManager defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'validate' @ [280:31] ==> public abstract fun validate(): Unit defined in com.intellij.facet.ui.FacetValidatorsManager[JavaMethodDescriptor]

'editor' @ [285:13] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'useProjectSettingsCheckBox' @ [285:20] ==> public final val useProjectSettingsCheckBox: ThreeStateCheckBox defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'isSelected' @ [285:47] ==> public final var ThreeStateCheckBox.isSelected: Boolean[MyPropertyDescriptor]

'configuration' @ [285:61] ==> private final val configuration: KotlinFacetConfiguration defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'settings' @ [285:75] ==> public final var settings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[PropertyDescriptorImpl]

'useProjectSettings' @ [285:84] ==> public final var useProjectSettings: Boolean defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'editor' @ [286:13] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'targetPlatformComboBox' @ [286:20] ==> public final val targetPlatformComboBox: JComboBox<TargetPlatformKind<*>> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'selectedItem' @ [286:43] ==> public final var <E : (Any..Any?)> JComboBox<TargetPlatformKind<*>>.selectedItem: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TargetPlatformKind<*>

'configuration' @ [286:59] ==> private final val configuration: KotlinFacetConfiguration defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'settings' @ [286:73] ==> public final var settings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[PropertyDescriptorImpl]

'targetPlatformKind' @ [286:82] ==> public final val targetPlatformKind: TargetPlatformKind<*>? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'!' @ [287:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'editor' @ [287:17] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'useProjectSettingsCheckBox' @ [287:24] ==> public final val useProjectSettingsCheckBox: ThreeStateCheckBox defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'isSelected' @ [287:51] ==> public final var ThreeStateCheckBox.isSelected: Boolean[MyPropertyDescriptor]

'editor' @ [287:65] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'compilerConfigurable' @ [287:72] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'isModified' @ [287:93] ==> public final val KotlinCompilerConfigurableTab.isModified: Boolean[MyPropertyDescriptor]

'validateOnce' @ [291:9] ==> private final fun validateOnce(body: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[SimpleFunctionDescriptorImpl]

'editor' @ [292:13] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'useProjectSettingsCheckBox' @ [292:20] ==> public final val useProjectSettingsCheckBox: ThreeStateCheckBox defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'isSelected' @ [292:47] ==> public final var ThreeStateCheckBox.isSelected: Boolean[MyPropertyDescriptor]

'configuration' @ [292:60] ==> private final val configuration: KotlinFacetConfiguration defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'settings' @ [292:74] ==> public final var settings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[PropertyDescriptorImpl]

'useProjectSettings' @ [292:83] ==> public final var useProjectSettings: Boolean defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'editor' @ [293:13] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'targetPlatformComboBox' @ [293:20] ==> public final val targetPlatformComboBox: JComboBox<TargetPlatformKind<*>> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'selectedItem' @ [293:43] ==> public final var <E : (Any..Any?)> JComboBox<TargetPlatformKind<*>>.selectedItem: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TargetPlatformKind<*>

'configuration' @ [293:58] ==> private final val configuration: KotlinFacetConfiguration defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'settings' @ [293:72] ==> public final var settings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[PropertyDescriptorImpl]

'targetPlatformKind' @ [293:81] ==> public final val targetPlatformKind: TargetPlatformKind<*>? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'editor' @ [294:13] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'compilerConfigurable' @ [294:20] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'reset' @ [294:41] ==> @Override public open fun reset(): Unit defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerConfigurableTab[JavaMethodDescriptor]

'editor' @ [295:13] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'updateCompilerConfigurable' @ [295:20] ==> internal final fun updateCompilerConfigurable(): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[SimpleFunctionDescriptorImpl]

'validateOnce' @ [300:9] ==> private final fun validateOnce(body: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[SimpleFunctionDescriptorImpl]

'editor' @ [301:13] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'compilerConfigurable' @ [301:20] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'apply' @ [301:41] ==> @Override public open fun apply(): Unit defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerConfigurableTab[JavaMethodDescriptor]

'with' @ [302:13] ==> @InlineOnly public inline fun <T, R> with(receiver: KotlinFacetSettings, block: KotlinFacetSettings.() -> Unit?): Unit? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinFacetSettings
    <R> -> Unit?

'configuration' @ [302:18] ==> private final val configuration: KotlinFacetConfiguration defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'settings' @ [302:32] ==> public final var settings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[PropertyDescriptorImpl]

'useProjectSettings' @ [303:17] ==> public final var useProjectSettings: Boolean defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'editor' @ [303:38] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'useProjectSettingsCheckBox' @ [303:45] ==> public final val useProjectSettingsCheckBox: ThreeStateCheckBox defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'isSelected' @ [303:72] ==> public final var ThreeStateCheckBox.isSelected: Boolean[MyPropertyDescriptor]

'editor' @ [304:18] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'targetPlatformComboBox' @ [304:25] ==> public final val targetPlatformComboBox: JComboBox<TargetPlatformKind<*>> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'selectedItem' @ [304:48] ==> public final var <E : (Any..Any?)> JComboBox<TargetPlatformKind<*>>.selectedItem: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TargetPlatformKind<*>

'let' @ [304:89] ==> @InlineOnly public inline fun <T, R> TargetPlatformKind<*>.let(block: (TargetPlatformKind<*>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TargetPlatformKind<*>
    <R> -> Unit

'it' @ [305:25] ==> value-parameter it: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.apply.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'targetPlatformKind' @ [305:31] ==> public final val targetPlatformKind: TargetPlatformKind<*>? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'when (it) {
                            is TargetPlatformKind.Jvm -> editor.compilerConfigurable.k2jvmCompilerArguments
                            is TargetPlatformKind.JavaScript -> editor.compilerConfigurable.k2jsCompilerArguments
                            else -> null
                        }' @ [306:49] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CommonCompilerArguments?, entry1: CommonCompilerArguments?, entry2: CommonCompilerArguments?): CommonCompilerArguments?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CommonCompilerArguments?

'it' @ [306:55] ==> value-parameter it: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.apply.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'editor' @ [307:58] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'compilerConfigurable' @ [307:65] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'k2jvmCompilerArguments' @ [307:86] ==> public final var KotlinCompilerConfigurableTab.k2jvmCompilerArguments: (K2JVMCompilerArguments..K2JVMCompilerArguments?)[MyPropertyDescriptor]

'editor' @ [308:65] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'compilerConfigurable' @ [308:72] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'k2jsCompilerArguments' @ [308:93] ==> public final var KotlinCompilerConfigurableTab.k2jsCompilerArguments: (K2JSCompilerArguments..K2JSCompilerArguments?)[MyPropertyDescriptor]

'compilerArguments' @ [311:25] ==> public final var compilerArguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'it' @ [311:45] ==> value-parameter it: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.apply.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'createCompilerArguments' @ [311:48] ==> public fun TargetPlatformKind<*>.createCompilerArguments(init: CommonCompilerArguments.() -> Unit = ...): CommonCompilerArguments defined in org.jetbrains.kotlin.config[DeserializedSimpleFunctionDescriptor]

'platformArguments' @ [312:33] ==> val platformArguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.apply.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'mergeBeans' @ [313:33] ==> public fun <From : Any, To : CommonCompilerArguments> mergeBeans(from: CommonCompilerArguments, to: CommonCompilerArguments): CommonCompilerArguments defined in org.jetbrains.kotlin.cli.common.arguments[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <From : Any> -> CommonCompilerArguments
    <To : From> -> CommonCompilerArguments

'platformArguments' @ [313:44] ==> val platformArguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.apply.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'this' @ [313:63] ==> <this> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.apply.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'copyInheritedFields' @ [315:29] ==> public fun <From : Any, To : Any> copyInheritedFields(from: CommonCompilerArguments, to: CommonCompilerArguments): CommonCompilerArguments defined in org.jetbrains.kotlin.cli.common.arguments[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <From : Any> -> CommonCompilerArguments
    <To : Any> -> CommonCompilerArguments

'compilerArguments' @ [315:49] ==> public final var compilerArguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'this' @ [315:70] ==> <this> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.apply.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'editor' @ [326:16] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'editor' @ [330:9] ==> public final val editor: KotlinFacetEditorGeneralTab.EditorComponent defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[PropertyDescriptorImpl]

'compilerConfigurable' @ [330:16] ==> public final val compilerConfigurable: KotlinCompilerConfigurableTab defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab.EditorComponent[PropertyDescriptorImpl]

'disposeUIResources' @ [330:37] ==> @Override public open fun disposeUIResources(): Unit defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerConfigurableTab[JavaMethodDescriptor]

