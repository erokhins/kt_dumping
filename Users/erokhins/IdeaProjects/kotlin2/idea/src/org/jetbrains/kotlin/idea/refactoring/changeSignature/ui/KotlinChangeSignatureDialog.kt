'ChangeSignatureDialogBase<
        KotlinParameterInfo,
        PsiElement,
        Visibility,
        KotlinMethodDescriptor,
        ParameterTableModelItemBase<KotlinParameterInfo>,
        KotlinCallableParameterTableModel>' @ [72:5] ==> public constructor ChangeSignatureDialogBase<ParamInfo : (ParameterInfo..ParameterInfo?), Method : (PsiElement..PsiElement?), Visibility : (Any..Any?), Descriptor : (MethodDescriptor<(KotlinParameterInfo..KotlinParameterInfo?), (Visibility..Visibility?)>..MethodDescriptor<(KotlinParameterInfo..KotlinParameterInfo?), (Visibility..Visibility?)>?), ParameterTableModelItem : (ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?), ParameterTableModel : (ParameterTableModelBase<(KotlinParameterInfo..KotlinParameterInfo?), (ParameterTableModelItemBase<KotlinParameterInfo>..ParameterTableModelItemBase<KotlinParameterInfo>?)>..ParameterTableModelBase<(KotlinParameterInfo..KotlinParameterInfo?), (ParameterTableModelItemBase<KotlinParameterInfo>..ParameterTableModelItemBase<KotlinParameterInfo>?)>?)>(p0: (Project..Project?), p1: (KotlinMethodDescriptor..KotlinMethodDescriptor?), p2: Boolean, p3: (PsiElement..PsiElement?)) defined in com.intellij.refactoring.changeSignature.ChangeSignatureDialogBase[JavaClassConstructorDescriptor]
Inferred types:
    <ParamInfo : (ParameterInfo..ParameterInfo?)> -> KotlinParameterInfo
    <Method : (PsiElement..PsiElement?)> -> PsiElement
    <Visibility : (Any..Any?)> -> Visibility
    <Descriptor : (MethodDescriptor<(ParamInfo..ParamInfo?), (Visibility..Visibility?)>..MethodDescriptor<(ParamInfo..ParamInfo?), (Visibility..Visibility?)>?)> -> KotlinMethodDescriptor
    <ParameterTableModelItem : (ParameterTableModelItemBase<(ParamInfo..ParamInfo?)>..ParameterTableModelItemBase<(ParamInfo..ParamInfo?)>?)> -> ParameterTableModelItemBase<KotlinParameterInfo>
    <ParameterTableModel : (ParameterTableModelBase<(ParamInfo..ParamInfo?), (ParameterTableModelItem..ParameterTableModelItem?)>..ParameterTableModelBase<(ParamInfo..ParamInfo?), (ParameterTableModelItem..ParameterTableModelItem?)>?)> -> KotlinCallableParameterTableModel

'project' @ [78:44] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.<init>[ValueParameterDescriptorImpl]

'methodDescriptor' @ [78:53] ==> value-parameter methodDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.<init>[ValueParameterDescriptorImpl]

'context' @ [78:78] ==> value-parameter context: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.<init>[ValueParameterDescriptorImpl]

'INSTANCE' @ [79:49] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'createParametersInfoModel' @ [81:82] ==> private final fun createParametersInfoModel(descriptor: KotlinMethodDescriptor, defaultValueContext: PsiElement): KotlinCallableParameterTableModel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [81:108] ==> value-parameter descriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.createParametersInfoModel[ValueParameterDescriptorImpl]

'myDefaultValueContext' @ [81:120] ==> protected/*protected and package*/ final val myDefaultValueContext: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'createReturnTypeCodeFragment' @ [83:51] ==> private final fun createReturnTypeCodeFragment(project: Project, method: KotlinMethodDescriptor): KtTypeCodeFragment defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion[SimpleFunctionDescriptorImpl]

'myProject' @ [83:80] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'myMethod' @ [83:91] ==> protected/*protected and package*/ final val myMethod: (KotlinMethodDescriptor..KotlinMethodDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'super' @ [85:81] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[LazyClassReceiverParameterDescriptor]

'myParametersTableModel' @ [85:87] ==> protected/*protected and package*/ final val myParametersTableModel: (KotlinCallableParameterTableModel..KotlinCallableParameterTableModel?) defined in com.intellij.refactoring.changeSignature.ChangeSignatureDialogBase[JavaPropertyDescriptor]

'JPanel' @ [88:21] ==> public constructor JPanel(p0: (LayoutManager..LayoutManager?)) defined in javax.swing.JPanel[JavaClassConstructorDescriptor]

'BorderLayout' @ [88:28] ==> public constructor BorderLayout() defined in java.awt.BorderLayout[JavaClassConstructorDescriptor]

'if (myMethod.kind === Kind.PRIMARY_CONSTRUCTOR) {
            when (item.parameter.valOrVar) {
                KotlinValVar.None -> "    "
                KotlinValVar.Val -> "val "
                KotlinValVar.Var -> "var "
            }
        }
        else {
            ""
        }' @ [90:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'myMethod' @ [90:28] ==> protected/*protected and package*/ final val myMethod: (KotlinMethodDescriptor..KotlinMethodDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'kind' @ [90:37] ==> public open val kind: KotlinMethodDescriptor.Kind defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'PRIMARY_CONSTRUCTOR' @ [90:51] ==> enum entry PRIMARY_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor.Kind[FakeCallableDescriptorForObject]

'when (item.parameter.valOrVar) {
                KotlinValVar.None -> "    "
                KotlinValVar.Val -> "val "
                KotlinValVar.Var -> "var "
            }' @ [91:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'item' @ [91:19] ==> value-parameter item: ParameterTableModelItemBase<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[ValueParameterDescriptorImpl]

'parameter' @ [91:24] ==> public final val parameter: (KotlinParameterInfo..KotlinParameterInfo?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'valOrVar' @ [91:34] ==> public final var valOrVar: KotlinValVar defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'None' @ [92:30] ==> enum entry None defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[FakeCallableDescriptorForObject]

'Val' @ [93:30] ==> enum entry Val defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[FakeCallableDescriptorForObject]

'Var' @ [94:30] ==> enum entry Var defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[FakeCallableDescriptorForObject]

'getPresentationName' @ [101:29] ==> private final fun getPresentationName(item: ParameterTableModelItemBase<KotlinParameterInfo>): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[SimpleFunctionDescriptorImpl]

'item' @ [101:49] ==> value-parameter item: ParameterTableModelItemBase<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[ValueParameterDescriptorImpl]

'item' @ [102:24] ==> value-parameter item: ParameterTableModelItemBase<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[ValueParameterDescriptorImpl]

'typeCodeFragment' @ [102:29] ==> public final val typeCodeFragment: (PsiCodeFragment..PsiCodeFragment?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'text' @ [102:46] ==> public final val PsiCodeFragment.text: (String..String?)[MyPropertyDescriptor]

'item' @ [103:28] ==> value-parameter item: ParameterTableModelItemBase<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[ValueParameterDescriptorImpl]

'defaultValueCodeFragment' @ [103:33] ==> public final val defaultValueCodeFragment: (PsiCodeFragment..PsiCodeFragment?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'text' @ [103:58] ==> public final val PsiCodeFragment.text: (String..String?)[MyPropertyDescriptor]

'repeatSymbol' @ [104:36] ==> @NotNull @Contract public open fun repeatSymbol(p0: Char, p1: Int): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'getParamNamesMaxLength' @ [104:54] ==> private final fun getParamNamesMaxLength(): Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[SimpleFunctionDescriptorImpl]

'parameterName' @ [104:81] ==> val parameterName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[LocalVariableDescriptor]

'length' @ [104:95] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'valOrVar' @ [105:22] ==> val valOrVar: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[LocalVariableDescriptor]

'parameterName' @ [105:31] ==> val parameterName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[LocalVariableDescriptor]

'separator' @ [105:46] ==> val separator: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[LocalVariableDescriptor]

'typeText' @ [105:56] ==> val typeText: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[LocalVariableDescriptor]

'isNotEmpty' @ [107:24] ==> @Contract public open fun isNotEmpty(@Nullable p0: String?): Boolean defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'defaultValue' @ [107:35] ==> val defaultValue: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[LocalVariableDescriptor]

'text' @ [108:13] ==> var text: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[LocalVariableDescriptor]

'defaultValue' @ [108:43] ==> val defaultValue: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[LocalVariableDescriptor]

'EditorTextField' @ [111:30] ==> public constructor EditorTextField(@NotNull p0: String, p1: (Project..Project?), p2: (FileType..FileType?)) defined in com.intellij.ui.EditorTextField[JavaClassConstructorDescriptor]

'text' @ [111:49] ==> var text: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[LocalVariableDescriptor]

'project' @ [111:56] ==> protected/*protected and package*/ for synthetic extension final val KotlinChangeSignatureDialog.project: (Project..Project?)[MyPropertyDescriptor]

'fileType' @ [111:65] ==> protected for synthetic extension final val KotlinChangeSignatureDialog.fileType: (KotlinFileType..KotlinFileType?)[MyPropertyDescriptor]

'getInstance' @ [115:46] ==> public open fun getInstance(): (EditorColorsManager..EditorColorsManager?) defined in com.intellij.openapi.editor.colors.EditorColorsManager[JavaMethodDescriptor]

'globalScheme' @ [115:60] ==> public final var EditorColorsManager.globalScheme: EditorColorsScheme[MyPropertyDescriptor]

'getFont' @ [115:73] ==> @NotNull public abstract fun getFont(p0: (EditorFontType..EditorFontType?)): Font defined in com.intellij.openapi.editor.colors.EditorColorsScheme[JavaMethodDescriptor]

'PLAIN' @ [115:96] ==> enum entry PLAIN defined in com.intellij.openapi.editor.colors.EditorFontType[FakeCallableDescriptorForObject]

'field' @ [116:9] ==> val field: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[LocalVariableDescriptor]

'font' @ [116:15] ==> public final var <no name provided>.font: (Font..Font?)[MyPropertyDescriptor]

'Font' @ [116:22] ==> public constructor Font(p0: (String..String?), p1: Int, p2: Int) defined in java.awt.Font[JavaClassConstructorDescriptor]

'plainFont' @ [116:27] ==> val plainFont: Font defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[LocalVariableDescriptor]

'fontName' @ [116:37] ==> public final val Font.fontName: (String..String?)[MyPropertyDescriptor]

'plainFont' @ [116:47] ==> val plainFont: Font defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[LocalVariableDescriptor]

'style' @ [116:57] ==> public final val Font.style: Int[MyPropertyDescriptor]

'if (selected && focused) {
            panel.background = UIUtil.getTableSelectionBackground()
            field.setAsRendererWithSelection(UIUtil.getTableSelectionBackground(), UIUtil.getTableSelectionForeground())
        }
        else {
            panel.background = UIUtil.getTableBackground()
            if (selected && !focused) {
                panel.border = DottedBorder(UIUtil.getTableForeground())
            }
        }' @ [118:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'selected' @ [118:13] ==> value-parameter selected: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[ValueParameterDescriptorImpl]

'focused' @ [118:25] ==> value-parameter focused: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[ValueParameterDescriptorImpl]

'panel' @ [119:13] ==> val panel: JPanel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[LocalVariableDescriptor]

'background' @ [119:19] ==> public final var JPanel.background: (Color..Color?)[MyPropertyDescriptor]

'getTableSelectionBackground' @ [119:39] ==> public open fun getTableSelectionBackground(): (Color..Color?) defined in com.intellij.util.ui.UIUtil[JavaMethodDescriptor]

'field' @ [120:13] ==> val field: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[LocalVariableDescriptor]

'setAsRendererWithSelection' @ [120:19] ==> public open fun setAsRendererWithSelection(p0: (Color..Color?), p1: (Color..Color?)): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation.<no name provided>[JavaMethodDescriptor]

'getTableSelectionBackground' @ [120:53] ==> public open fun getTableSelectionBackground(): (Color..Color?) defined in com.intellij.util.ui.UIUtil[JavaMethodDescriptor]

'getTableSelectionForeground' @ [120:91] ==> public open fun getTableSelectionForeground(): (Color..Color?) defined in com.intellij.util.ui.UIUtil[JavaMethodDescriptor]

'panel' @ [123:13] ==> val panel: JPanel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[LocalVariableDescriptor]

'background' @ [123:19] ==> public final var JPanel.background: (Color..Color?)[MyPropertyDescriptor]

'getTableBackground' @ [123:39] ==> public open fun getTableBackground(): (Color..Color?) defined in com.intellij.util.ui.UIUtil[JavaMethodDescriptor]

'selected' @ [124:17] ==> value-parameter selected: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[ValueParameterDescriptorImpl]

'!' @ [124:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'focused' @ [124:30] ==> value-parameter focused: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[ValueParameterDescriptorImpl]

'panel' @ [125:17] ==> val panel: JPanel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[LocalVariableDescriptor]

'border' @ [125:23] ==> public final var JPanel.border: (Border..Border?)[MyPropertyDescriptor]

'DottedBorder' @ [125:32] ==> public constructor DottedBorder(p0: (Color..Color?)) defined in com.intellij.ui.DottedBorder[JavaClassConstructorDescriptor]

'getTableForeground' @ [125:52] ==> public open fun getTableForeground(): (Color..Color?) defined in com.intellij.util.ui.UIUtil[JavaMethodDescriptor]

'panel' @ [128:9] ==> val panel: JPanel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[LocalVariableDescriptor]

'add' @ [128:15] ==> public open fun add(p0: (Component..Component?), p1: (Any..Any?)): Unit defined in javax.swing.JPanel[JavaMethodDescriptor]

'field' @ [128:19] ==> val field: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[LocalVariableDescriptor]

'WEST' @ [128:39] ==> public const final val WEST: String defined in java.awt.BorderLayout[JavaPropertyDescriptor]

'panel' @ [130:16] ==> val panel: JPanel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getRowPresentation[LocalVariableDescriptor]

'item' @ [134:25] ==> value-parameter item: ParameterTableModelItemBase<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getPresentationName[ValueParameterDescriptorImpl]

'parameter' @ [134:30] ==> public final val parameter: (KotlinParameterInfo..KotlinParameterInfo?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'if (parameter == parametersTableModel.receiver) "<receiver>" else parameter.name' @ [135:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'parameter' @ [135:20] ==> val parameter: (KotlinParameterInfo..KotlinParameterInfo?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getPresentationName[LocalVariableDescriptor]

'parametersTableModel' @ [135:33] ==> private final val parametersTableModel: KotlinCallableParameterTableModel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[PropertyDescriptorImpl]

'receiver' @ [135:54] ==> public final val KotlinCallableParameterTableModel.receiver: KotlinParameterInfo?[MyPropertyDescriptor]

'parameter' @ [135:82] ==> val parameter: (KotlinParameterInfo..KotlinParameterInfo?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getPresentationName[LocalVariableDescriptor]

'name' @ [135:92] ==> public final var KotlinParameterInfo.name: String[MyPropertyDescriptor]

'parametersTableModel' @ [139:13] ==> private final val parametersTableModel: KotlinCallableParameterTableModel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[PropertyDescriptorImpl]

'items' @ [139:34] ==> public final var KotlinCallableParameterTableModel.items: (MutableList<(ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?)>..List<(ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?)>)[MyPropertyDescriptor]

'map' @ [139:40] ==> public inline fun <T, R> Iterable<(ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?)>.map(transform: ((ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?)) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.refactoring.changeSignature.ParameterTableModelItemBase<(org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo..org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo?)>..com.intellij.refactoring.changeSignature.ParameterTableModelItemBase<(org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo..org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo?)>?)
    <R> -> Int

'invoke' @ [139:46] ==> public abstract operator fun invoke(p1: ParameterTableModelItemBase<KotlinParameterInfo>): String? defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [139:59] ==> value-parameter it: (ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getColumnTextMaxLength.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [139:64] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'max' @ [139:78] ==> public fun <T : Comparable<Int>> Iterable<Int>.max(): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'getColumnTextMaxLength' @ [141:44] ==> private final fun getColumnTextMaxLength(nameFunction: (ParameterTableModelItemBase<KotlinParameterInfo>) -> String?): Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[SimpleFunctionDescriptorImpl]

'getPresentationName' @ [141:69] ==> private final fun getPresentationName(item: ParameterTableModelItemBase<KotlinParameterInfo>): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[SimpleFunctionDescriptorImpl]

'it' @ [141:89] ==> value-parameter it: ParameterTableModelItemBase<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getParamNamesMaxLength.<anonymous>[ValueParameterDescriptorImpl]

'getColumnTextMaxLength' @ [143:39] ==> private final fun getColumnTextMaxLength(nameFunction: (ParameterTableModelItemBase<KotlinParameterInfo>) -> String?): Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[SimpleFunctionDescriptorImpl]

'it' @ [143:64] ==> value-parameter it: ParameterTableModelItemBase<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTypesMaxLength.<anonymous>[ValueParameterDescriptorImpl]

'typeCodeFragment' @ [143:67] ==> public final val typeCodeFragment: (PsiCodeFragment..PsiCodeFragment?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'text' @ [143:85] ==> public final val PsiCodeFragment.text: (String..String?)[MyPropertyDescriptor]

'getColumnTextMaxLength' @ [145:47] ==> private final fun getColumnTextMaxLength(nameFunction: (ParameterTableModelItemBase<KotlinParameterInfo>) -> String?): Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[SimpleFunctionDescriptorImpl]

'it' @ [145:72] ==> value-parameter it: ParameterTableModelItemBase<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getDefaultValuesMaxLength.<anonymous>[ValueParameterDescriptorImpl]

'defaultValueCodeFragment' @ [145:75] ==> public final val defaultValueCodeFragment: (PsiCodeFragment..PsiCodeFragment?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'text' @ [145:101] ==> public final val PsiCodeFragment.text: (String..String?)[MyPropertyDescriptor]

'!' @ [150:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'row' @ [150:14] ==> value-parameter row: ParameterTableModelItemBase<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.isEmptyRow[ValueParameterDescriptorImpl]

'parameter' @ [150:18] ==> public final val parameter: (KotlinParameterInfo..KotlinParameterInfo?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'name' @ [150:28] ==> public final var KotlinParameterInfo.name: String[MyPropertyDescriptor]

'isEmpty' @ [150:33] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!' @ [151:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'row' @ [151:14] ==> value-parameter row: ParameterTableModelItemBase<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.isEmptyRow[ValueParameterDescriptorImpl]

'parameter' @ [151:18] ==> public final val parameter: (KotlinParameterInfo..KotlinParameterInfo?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'typeText' @ [151:28] ==> public final val KotlinParameterInfo.typeText: String[MyPropertyDescriptor]

'isEmpty' @ [151:37] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'KotlinCallerChooser' @ [156:13] ==> public constructor KotlinCallerChooser(declaration: PsiElement, project: Project, title: String, previousTree: Tree?, callback: Consumer<Set<PsiElement>>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinCallerChooser[ClassConstructorDescriptorImpl]

'myMethod' @ [156:33] ==> protected/*protected and package*/ final val myMethod: (KotlinMethodDescriptor..KotlinMethodDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'method' @ [156:42] ==> public final val KotlinMethodDescriptor.method: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'myProject' @ [156:50] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'title' @ [156:61] ==> value-parameter title: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.createCallerChooser[ValueParameterDescriptorImpl]

'treeToReuse' @ [156:68] ==> value-parameter treeToReuse: Tree? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.createCallerChooser[ValueParameterDescriptorImpl]

'callback' @ [156:81] ==> value-parameter callback: Consumer<Set<PsiElement>> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.createCallerChooser[ValueParameterDescriptorImpl]

'parameters' @ [160:13] ==> public final val KotlinChangeSignatureDialog.parameters: (MutableList<(KotlinParameterInfo..KotlinParameterInfo?)>..List<(KotlinParameterInfo..KotlinParameterInfo?)>?)[MyPropertyDescriptor]

'any' @ [160:24] ==> public inline fun <T> Iterable<(KotlinParameterInfo..KotlinParameterInfo?)>.any(predicate: ((KotlinParameterInfo..KotlinParameterInfo?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo..org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo?)

'it' @ [160:30] ==> value-parameter it: (KotlinParameterInfo..KotlinParameterInfo?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.mayPropagateParameters.<anonymous>[ValueParameterDescriptorImpl]

'isNewParameter' @ [160:33] ==> public final val isNewParameter: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'it' @ [160:51] ==> value-parameter it: (KotlinParameterInfo..KotlinParameterInfo?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.mayPropagateParameters.<anonymous>[ValueParameterDescriptorImpl]

'parametersTableModel' @ [160:57] ==> private final val parametersTableModel: KotlinCallableParameterTableModel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[PropertyDescriptorImpl]

'receiver' @ [160:78] ==> public final val KotlinCallableParameterTableModel.receiver: KotlinParameterInfo?[MyPropertyDescriptor]

'JBTableRowEditor' @ [163:25] ==> public constructor JBTableRowEditor() defined in com.intellij.util.ui.table.JBTableRowEditor[JavaClassConstructorDescriptor]

'ArrayList' @ [164:38] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> JComponent

'EditorTextField' @ [165:38] ==> public constructor EditorTextField(@NotNull p0: String, p1: (Project..Project?), p2: (FileType..FileType?)) defined in com.intellij.ui.EditorTextField[JavaClassConstructorDescriptor]

'item' @ [165:54] ==> value-parameter item: ParameterTableModelItemBase<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor[ValueParameterDescriptorImpl]

'parameter' @ [165:59] ==> public final val parameter: (KotlinParameterInfo..KotlinParameterInfo?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'name' @ [165:69] ==> public final var KotlinParameterInfo.name: String[MyPropertyDescriptor]

'project' @ [165:75] ==> protected/*protected and package*/ for synthetic extension final val KotlinChangeSignatureDialog.project: (Project..Project?)[MyPropertyDescriptor]

'fileType' @ [165:84] ==> protected for synthetic extension final val KotlinChangeSignatureDialog.fileType: (KotlinFileType..KotlinFileType?)[MyPropertyDescriptor]

'nameEditor' @ [168:17] ==> private final val nameEditor: EditorTextField defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>[PropertyDescriptorImpl]

'isEnabled' @ [168:28] ==> public final var EditorTextField.isEnabled: Boolean[MyPropertyDescriptor]

'item' @ [168:40] ==> value-parameter item: ParameterTableModelItemBase<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor[ValueParameterDescriptorImpl]

'parameter' @ [168:45] ==> public final val parameter: (KotlinParameterInfo..KotlinParameterInfo?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'parametersTableModel' @ [168:58] ==> private final val parametersTableModel: KotlinCallableParameterTableModel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[PropertyDescriptorImpl]

'receiver' @ [168:79] ==> public final val KotlinCallableParameterTableModel.receiver: KotlinParameterInfo?[MyPropertyDescriptor]

'item' @ [172:21] ==> value-parameter item: ParameterTableModelItemBase<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor[ValueParameterDescriptorImpl]

'parameter' @ [172:26] ==> public final val parameter: (KotlinParameterInfo..KotlinParameterInfo?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'isNewParameter' @ [172:36] ==> public final val isNewParameter: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'item' @ [172:54] ==> value-parameter item: ParameterTableModelItemBase<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor[ValueParameterDescriptorImpl]

'parameter' @ [172:59] ==> public final val parameter: (KotlinParameterInfo..KotlinParameterInfo?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'myMethod' @ [172:72] ==> protected/*protected and package*/ final val myMethod: (KotlinMethodDescriptor..KotlinMethodDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'receiver' @ [172:81] ==> public abstract val receiver: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'layout' @ [175:17] ==> public final var <no name provided>.layout: (LayoutManager..LayoutManager?)[MyPropertyDescriptor]

'BoxLayout' @ [175:26] ==> @ConstructorProperties public constructor BoxLayout(p0: (Container..Container?), p1: Int) defined in javax.swing.BoxLayout[JavaClassConstructorDescriptor]

'this' @ [175:36] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>[LazyClassReceiverParameterDescriptor]

'X_AXIS' @ [175:52] ==> public const final val X_AXIS: Int defined in javax.swing.BoxLayout[JavaPropertyDescriptor]

'parametersTableModel' @ [178:36] ==> private final val parametersTableModel: KotlinCallableParameterTableModel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[PropertyDescriptorImpl]

'columnInfos' @ [178:57] ==> public final var KotlinCallableParameterTableModel.columnInfos: (Array<raw (ColumnInfo<(Any..Any?), (Any..Any?)>..ColumnInfo<*, *>?)>..Array<out raw (ColumnInfo<(Any..Any?), (Any..Any?)>..ColumnInfo<*, *>?)>?)[MyPropertyDescriptor]

'JPanel' @ [179:33] ==> public constructor JPanel(p0: (LayoutManager..LayoutManager?)) defined in javax.swing.JPanel[JavaClassConstructorDescriptor]

'VerticalFlowLayout' @ [179:40] ==> public constructor VerticalFlowLayout(@VerticalFlowLayout.VerticalFlowAlignment p0: Int, p1: Int, p2: Int, p3: Boolean, p4: Boolean) defined in com.intellij.openapi.ui.VerticalFlowLayout[JavaClassConstructorDescriptor]

'TOP' @ [179:78] ==> public const final val TOP: Int defined in com.intellij.openapi.ui.VerticalFlowLayout[JavaPropertyDescriptor]

'column' @ [182:39] ==> var column: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'if (KotlinCallableParameterTableModel.isTypeColumn(columnInfo)) {
                        val document = PsiDocumentManager.getInstance(project).getDocument(item.typeCodeFragment)
                        editor = EditorTextField(document, project, fileType)
                        component = editor
                    }
                    else if (KotlinCallableParameterTableModel.isNameColumn(columnInfo)) {
                        editor = nameEditor
                        component = editor
                        updateNameEditor()
                    }
                    else if (KotlinCallableParameterTableModel.isDefaultValueColumn(columnInfo) && isDefaultColumnEnabled()) {
                        val document = PsiDocumentManager.getInstance(project).getDocument(item.defaultValueCodeFragment)
                        editor = EditorTextField(document, project, fileType)
                        component = editor
                    }
                    else if (KotlinPrimaryConstructorParameterTableModel.isValVarColumn(columnInfo)) {
                        val comboBox = JComboBox(KotlinValVar.values())
                        comboBox.selectedItem = item.parameter.valOrVar
                        comboBox.addItemListener {
                            parametersTableModel.setValueAtWithoutUpdate(it.item, row, columnFinal)
                            updateSignature()
                        }
                        component = comboBox
                        editor = null
                    }
                    else if (KotlinFunctionParameterTableModel.isReceiverColumn(columnInfo)) {
                        val checkBox = JCheckBox()
                        checkBox.isSelected = parametersTableModel.receiver == item.parameter
                        checkBox.addItemListener {
                            val newReceiver = if (it.stateChange == ItemEvent.SELECTED) item.parameter else null
                            (parametersTableModel as KotlinFunctionParameterTableModel).receiver = newReceiver
                            updateSignature()
                            updateNameEditor()
                        }
                        component = checkBox
                        editor = null
                    }
                    else
                        continue' @ [184:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isTypeColumn' @ [184:59] ==> public open fun isTypeColumn(column: raw (ColumnInfo<(Any..Any?), (Any..Any?)>..ColumnInfo<*, *>?)): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinCallableParameterTableModel[JavaMethodDescriptor]

'columnInfo' @ [184:72] ==> val columnInfo: raw (ColumnInfo<(Any..Any?), (Any..Any?)>..ColumnInfo<*, *>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'getInstance' @ [185:59] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [185:71] ==> protected/*protected and package*/ for synthetic extension final val KotlinChangeSignatureDialog.project: (Project..Project?)[MyPropertyDescriptor]

'getDocument' @ [185:80] ==> @Nullable public abstract fun getDocument(@NotNull p0: PsiFile): Document? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'item' @ [185:92] ==> value-parameter item: ParameterTableModelItemBase<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor[ValueParameterDescriptorImpl]

'typeCodeFragment' @ [185:97] ==> public final val typeCodeFragment: (PsiCodeFragment..PsiCodeFragment?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'editor' @ [186:25] ==> val editor: EditorTextField? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'EditorTextField' @ [186:34] ==> public constructor EditorTextField(p0: (Document..Document?), p1: (Project..Project?), p2: (FileType..FileType?)) defined in com.intellij.ui.EditorTextField[JavaClassConstructorDescriptor]

'document' @ [186:50] ==> val document: Document? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'project' @ [186:60] ==> protected/*protected and package*/ for synthetic extension final val KotlinChangeSignatureDialog.project: (Project..Project?)[MyPropertyDescriptor]

'fileType' @ [186:69] ==> protected for synthetic extension final val KotlinChangeSignatureDialog.fileType: (KotlinFileType..KotlinFileType?)[MyPropertyDescriptor]

'component' @ [187:25] ==> val component: JComponent defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'editor' @ [187:37] ==> val editor: EditorTextField? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'if (KotlinCallableParameterTableModel.isNameColumn(columnInfo)) {
                        editor = nameEditor
                        component = editor
                        updateNameEditor()
                    }
                    else if (KotlinCallableParameterTableModel.isDefaultValueColumn(columnInfo) && isDefaultColumnEnabled()) {
                        val document = PsiDocumentManager.getInstance(project).getDocument(item.defaultValueCodeFragment)
                        editor = EditorTextField(document, project, fileType)
                        component = editor
                    }
                    else if (KotlinPrimaryConstructorParameterTableModel.isValVarColumn(columnInfo)) {
                        val comboBox = JComboBox(KotlinValVar.values())
                        comboBox.selectedItem = item.parameter.valOrVar
                        comboBox.addItemListener {
                            parametersTableModel.setValueAtWithoutUpdate(it.item, row, columnFinal)
                            updateSignature()
                        }
                        component = comboBox
                        editor = null
                    }
                    else if (KotlinFunctionParameterTableModel.isReceiverColumn(columnInfo)) {
                        val checkBox = JCheckBox()
                        checkBox.isSelected = parametersTableModel.receiver == item.parameter
                        checkBox.addItemListener {
                            val newReceiver = if (it.stateChange == ItemEvent.SELECTED) item.parameter else null
                            (parametersTableModel as KotlinFunctionParameterTableModel).receiver = newReceiver
                            updateSignature()
                            updateNameEditor()
                        }
                        component = checkBox
                        editor = null
                    }
                    else
                        continue' @ [189:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isNameColumn' @ [189:64] ==> public open fun isNameColumn(column: raw (ColumnInfo<(Any..Any?), (Any..Any?)>..ColumnInfo<*, *>?)): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinCallableParameterTableModel[JavaMethodDescriptor]

'columnInfo' @ [189:77] ==> val columnInfo: raw (ColumnInfo<(Any..Any?), (Any..Any?)>..ColumnInfo<*, *>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'editor' @ [190:25] ==> val editor: EditorTextField? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'nameEditor' @ [190:34] ==> private final val nameEditor: EditorTextField defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>[PropertyDescriptorImpl]

'component' @ [191:25] ==> val component: JComponent defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'editor' @ [191:37] ==> val editor: EditorTextField? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'updateNameEditor' @ [192:25] ==> private final fun updateNameEditor(): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>[SimpleFunctionDescriptorImpl]

'if (KotlinCallableParameterTableModel.isDefaultValueColumn(columnInfo) && isDefaultColumnEnabled()) {
                        val document = PsiDocumentManager.getInstance(project).getDocument(item.defaultValueCodeFragment)
                        editor = EditorTextField(document, project, fileType)
                        component = editor
                    }
                    else if (KotlinPrimaryConstructorParameterTableModel.isValVarColumn(columnInfo)) {
                        val comboBox = JComboBox(KotlinValVar.values())
                        comboBox.selectedItem = item.parameter.valOrVar
                        comboBox.addItemListener {
                            parametersTableModel.setValueAtWithoutUpdate(it.item, row, columnFinal)
                            updateSignature()
                        }
                        component = comboBox
                        editor = null
                    }
                    else if (KotlinFunctionParameterTableModel.isReceiverColumn(columnInfo)) {
                        val checkBox = JCheckBox()
                        checkBox.isSelected = parametersTableModel.receiver == item.parameter
                        checkBox.addItemListener {
                            val newReceiver = if (it.stateChange == ItemEvent.SELECTED) item.parameter else null
                            (parametersTableModel as KotlinFunctionParameterTableModel).receiver = newReceiver
                            updateSignature()
                            updateNameEditor()
                        }
                        component = checkBox
                        editor = null
                    }
                    else
                        continue' @ [194:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isDefaultValueColumn' @ [194:64] ==> public open fun isDefaultValueColumn(column: raw (ColumnInfo<(Any..Any?), (Any..Any?)>..ColumnInfo<*, *>?)): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinCallableParameterTableModel[JavaMethodDescriptor]

'columnInfo' @ [194:85] ==> val columnInfo: raw (ColumnInfo<(Any..Any?), (Any..Any?)>..ColumnInfo<*, *>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'isDefaultColumnEnabled' @ [194:100] ==> private final fun isDefaultColumnEnabled(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>[SimpleFunctionDescriptorImpl]

'getInstance' @ [195:59] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [195:71] ==> protected/*protected and package*/ for synthetic extension final val KotlinChangeSignatureDialog.project: (Project..Project?)[MyPropertyDescriptor]

'getDocument' @ [195:80] ==> @Nullable public abstract fun getDocument(@NotNull p0: PsiFile): Document? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'item' @ [195:92] ==> value-parameter item: ParameterTableModelItemBase<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor[ValueParameterDescriptorImpl]

'defaultValueCodeFragment' @ [195:97] ==> public final val defaultValueCodeFragment: (PsiCodeFragment..PsiCodeFragment?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'editor' @ [196:25] ==> val editor: EditorTextField? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'EditorTextField' @ [196:34] ==> public constructor EditorTextField(p0: (Document..Document?), p1: (Project..Project?), p2: (FileType..FileType?)) defined in com.intellij.ui.EditorTextField[JavaClassConstructorDescriptor]

'document' @ [196:50] ==> val document: Document? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'project' @ [196:60] ==> protected/*protected and package*/ for synthetic extension final val KotlinChangeSignatureDialog.project: (Project..Project?)[MyPropertyDescriptor]

'fileType' @ [196:69] ==> protected for synthetic extension final val KotlinChangeSignatureDialog.fileType: (KotlinFileType..KotlinFileType?)[MyPropertyDescriptor]

'component' @ [197:25] ==> val component: JComponent defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'editor' @ [197:37] ==> val editor: EditorTextField? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'if (KotlinPrimaryConstructorParameterTableModel.isValVarColumn(columnInfo)) {
                        val comboBox = JComboBox(KotlinValVar.values())
                        comboBox.selectedItem = item.parameter.valOrVar
                        comboBox.addItemListener {
                            parametersTableModel.setValueAtWithoutUpdate(it.item, row, columnFinal)
                            updateSignature()
                        }
                        component = comboBox
                        editor = null
                    }
                    else if (KotlinFunctionParameterTableModel.isReceiverColumn(columnInfo)) {
                        val checkBox = JCheckBox()
                        checkBox.isSelected = parametersTableModel.receiver == item.parameter
                        checkBox.addItemListener {
                            val newReceiver = if (it.stateChange == ItemEvent.SELECTED) item.parameter else null
                            (parametersTableModel as KotlinFunctionParameterTableModel).receiver = newReceiver
                            updateSignature()
                            updateNameEditor()
                        }
                        component = checkBox
                        editor = null
                    }
                    else
                        continue' @ [199:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isValVarColumn' @ [199:74] ==> public open fun isValVarColumn(column: raw (ColumnInfo<(Any..Any?), (Any..Any?)>..ColumnInfo<*, *>?)): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinPrimaryConstructorParameterTableModel[JavaMethodDescriptor]

'columnInfo' @ [199:89] ==> val columnInfo: raw (ColumnInfo<(Any..Any?), (Any..Any?)>..ColumnInfo<*, *>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'JComboBox' @ [200:40] ==> public constructor JComboBox<E : (Any..Any?)>(p0: (Array<(KotlinValVar..KotlinValVar?)>..Array<out (KotlinValVar..KotlinValVar?)>?)) defined in javax.swing.JComboBox[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar..org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar?)

'values' @ [200:63] ==> public final fun values(): Array<KotlinValVar> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[SimpleFunctionDescriptorImpl]

'comboBox' @ [201:25] ==> val comboBox: JComboBox<(KotlinValVar..KotlinValVar?)> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'selectedItem' @ [201:34] ==> public final var <E : (Any..Any?)> JComboBox<(KotlinValVar..KotlinValVar?)>.selectedItem: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar..org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar?)

'item' @ [201:49] ==> value-parameter item: ParameterTableModelItemBase<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor[ValueParameterDescriptorImpl]

'parameter' @ [201:54] ==> public final val parameter: (KotlinParameterInfo..KotlinParameterInfo?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'valOrVar' @ [201:64] ==> public final var valOrVar: KotlinValVar defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'comboBox' @ [202:25] ==> val comboBox: JComboBox<(KotlinValVar..KotlinValVar?)> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'addItemListener' @ [202:34] ==> public final fun addItemListener(p0: (((ItemEvent..ItemEvent?)) -> Unit..(((ItemEvent..ItemEvent?)) -> Unit)?)): Unit defined in javax.swing.JComboBox[MyFunctionDescriptor]

'parametersTableModel' @ [203:29] ==> private final val parametersTableModel: KotlinCallableParameterTableModel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[PropertyDescriptorImpl]

'setValueAtWithoutUpdate' @ [203:50] ==> public open fun setValueAtWithoutUpdate(p0: (Any..Any?), p1: Int, p2: Int): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinCallableParameterTableModel[JavaMethodDescriptor]

'it' @ [203:74] ==> value-parameter it: (ItemEvent..ItemEvent?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor.<anonymous>[ValueParameterDescriptorImpl]

'item' @ [203:77] ==> public final val ItemEvent.item: (Any..Any?)[MyPropertyDescriptor]

'row' @ [203:83] ==> value-parameter row: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[ValueParameterDescriptorImpl]

'columnFinal' @ [203:88] ==> val columnFinal: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'updateSignature' @ [204:29] ==> protected/*protected and package*/ open fun updateSignature(): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaMethodDescriptor]

'component' @ [206:25] ==> val component: JComponent defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'comboBox' @ [206:37] ==> val comboBox: JComboBox<(KotlinValVar..KotlinValVar?)> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'editor' @ [207:25] ==> val editor: EditorTextField? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'if (KotlinFunctionParameterTableModel.isReceiverColumn(columnInfo)) {
                        val checkBox = JCheckBox()
                        checkBox.isSelected = parametersTableModel.receiver == item.parameter
                        checkBox.addItemListener {
                            val newReceiver = if (it.stateChange == ItemEvent.SELECTED) item.parameter else null
                            (parametersTableModel as KotlinFunctionParameterTableModel).receiver = newReceiver
                            updateSignature()
                            updateNameEditor()
                        }
                        component = checkBox
                        editor = null
                    }
                    else
                        continue' @ [209:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isReceiverColumn' @ [209:64] ==> public open fun isReceiverColumn(column: raw (ColumnInfo<(Any..Any?), (Any..Any?)>..ColumnInfo<*, *>?)): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinFunctionParameterTableModel[JavaMethodDescriptor]

'columnInfo' @ [209:81] ==> val columnInfo: raw (ColumnInfo<(Any..Any?), (Any..Any?)>..ColumnInfo<*, *>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'JCheckBox' @ [210:40] ==> public constructor JCheckBox() defined in javax.swing.JCheckBox[JavaClassConstructorDescriptor]

'checkBox' @ [211:25] ==> val checkBox: JCheckBox defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'isSelected' @ [211:34] ==> public final var JCheckBox.isSelected: Boolean[MyPropertyDescriptor]

'parametersTableModel' @ [211:47] ==> private final val parametersTableModel: KotlinCallableParameterTableModel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[PropertyDescriptorImpl]

'receiver' @ [211:68] ==> public final val KotlinCallableParameterTableModel.receiver: KotlinParameterInfo?[MyPropertyDescriptor]

'item' @ [211:80] ==> value-parameter item: ParameterTableModelItemBase<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor[ValueParameterDescriptorImpl]

'parameter' @ [211:85] ==> public final val parameter: (KotlinParameterInfo..KotlinParameterInfo?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'checkBox' @ [212:25] ==> val checkBox: JCheckBox defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'addItemListener' @ [212:34] ==> public final fun addItemListener(p0: (((ItemEvent..ItemEvent?)) -> Unit..(((ItemEvent..ItemEvent?)) -> Unit)?)): Unit defined in javax.swing.JCheckBox[MyFunctionDescriptor]

'if (it.stateChange == ItemEvent.SELECTED) item.parameter else null' @ [213:47] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinParameterInfo?, elseBranch: KotlinParameterInfo?): KotlinParameterInfo?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinParameterInfo?

'it' @ [213:51] ==> value-parameter it: (ItemEvent..ItemEvent?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor.<anonymous>[ValueParameterDescriptorImpl]

'stateChange' @ [213:54] ==> public final val ItemEvent.stateChange: Int[MyPropertyDescriptor]

'SELECTED' @ [213:79] ==> public const final val SELECTED: Int defined in java.awt.event.ItemEvent[JavaPropertyDescriptor]

'item' @ [213:89] ==> value-parameter item: ParameterTableModelItemBase<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor[ValueParameterDescriptorImpl]

'parameter' @ [213:94] ==> public final val parameter: (KotlinParameterInfo..KotlinParameterInfo?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'parametersTableModel' @ [214:30] ==> private final val parametersTableModel: KotlinCallableParameterTableModel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[PropertyDescriptorImpl]

'receiver' @ [214:89] ==> public final var KotlinFunctionParameterTableModel.receiver: KotlinParameterInfo?[MyPropertyDescriptor]

'newReceiver' @ [214:100] ==> val newReceiver: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor.<anonymous>[LocalVariableDescriptor]

'updateSignature' @ [215:29] ==> protected/*protected and package*/ open fun updateSignature(): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaMethodDescriptor]

'updateNameEditor' @ [216:29] ==> private final fun updateNameEditor(): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>[SimpleFunctionDescriptorImpl]

'component' @ [218:25] ==> val component: JComponent defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'checkBox' @ [218:37] ==> val checkBox: JCheckBox defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'editor' @ [219:25] ==> val editor: EditorTextField? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'JBLabel' @ [224:33] ==> public constructor JBLabel(@NotNull p0: String, @NotNull p1: UIUtil.ComponentStyle) defined in com.intellij.ui.components.JBLabel[JavaClassConstructorDescriptor]

'columnInfo' @ [224:41] ==> val columnInfo: raw (ColumnInfo<(Any..Any?), (Any..Any?)>..ColumnInfo<*, *>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'name' @ [224:52] ==> public final var <Item : (Any..Any?), Aspect : (Any..Any?)> ColumnInfo<(Any..Any?), (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <Item : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)
    <Aspect : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'SMALL' @ [224:80] ==> enum entry SMALL defined in com.intellij.util.ui.UIUtil.ComponentStyle[FakeCallableDescriptorForObject]

'panel' @ [225:21] ==> val panel: JPanel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'add' @ [225:27] ==> public open fun add(p0: (Component..Component?)): (Component..Component?) defined in javax.swing.JPanel[JavaMethodDescriptor]

'label' @ [225:31] ==> val label: JBLabel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'editor' @ [227:25] ==> val editor: EditorTextField? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'editor' @ [228:25] ==> val editor: EditorTextField? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'addDocumentListener' @ [228:32] ==> public open fun addDocumentListener(@NotNull p0: DocumentListener): Unit defined in com.intellij.ui.EditorTextField[JavaMethodDescriptor]

'DocumentAdapter' @ [229:42] ==> public constructor DocumentAdapter() defined in com.intellij.openapi.editor.event.DocumentAdapter[JavaClassConstructorDescriptor]

'fireDocumentChanged' @ [231:41] ==> public open fun fireDocumentChanged(p0: (DocumentEvent..DocumentEvent?), p1: Int): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>[JavaMethodDescriptor]

'e' @ [231:61] ==> value-parameter e: DocumentEvent? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor.<no name provided>.documentChanged[ValueParameterDescriptorImpl]

'columnFinal' @ [231:64] ==> val columnFinal: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'editor' @ [235:25] ==> val editor: EditorTextField? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'setPreferredWidth' @ [235:32] ==> public open fun setPreferredWidth(p0: Int): Unit defined in com.intellij.ui.EditorTextField[JavaMethodDescriptor]

'table' @ [235:50] ==> value-parameter table: JTable defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[ValueParameterDescriptorImpl]

'width' @ [235:56] ==> public final val JTable.width: Int[MyPropertyDescriptor]

'parametersTableModel' @ [235:64] ==> private final val parametersTableModel: KotlinCallableParameterTableModel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[PropertyDescriptorImpl]

'columnCount' @ [235:85] ==> public final val KotlinCallableParameterTableModel.columnCount: Int[MyPropertyDescriptor]

'components' @ [238:21] ==> private final val components: ArrayList<JComponent> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>[PropertyDescriptorImpl]

'add' @ [238:32] ==> public open fun add(element: JComponent): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'component' @ [238:36] ==> val component: JComponent defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'panel' @ [239:21] ==> val panel: JPanel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'add' @ [239:27] ==> public open fun add(p0: (Component..Component?)): (Component..Component?) defined in javax.swing.JPanel[JavaMethodDescriptor]

'component' @ [239:31] ==> val component: JComponent defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'add' @ [240:21] ==> public open fun add(p0: (Component..Component?)): (Component..Component?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>[JavaMethodDescriptor]

'panel' @ [240:25] ==> val panel: JPanel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'adjustComponentsOnMac' @ [241:38] ==> public open fun adjustComponentsOnMac(@Nullable p0: JLabel?, @Nullable p1: JComponent?): Unit defined in com.intellij.util.IJSwingUtilities[JavaMethodDescriptor]

'label' @ [241:60] ==> val label: JBLabel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'component' @ [241:67] ==> val component: JComponent defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'column' @ [242:21] ==> var column: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.prepareEditor[LocalVariableDescriptor]

'JBTableRow' @ [247:24] ==> public fun JBTableRow(function: (Int) -> (Any..Any?)): JBTableRow defined in com.intellij.util.ui.table[SamConstructorDescriptorImpl]

'parametersTableModel' @ [248:38] ==> private final val parametersTableModel: KotlinCallableParameterTableModel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[PropertyDescriptorImpl]

'columnInfos' @ [248:59] ==> public final var KotlinCallableParameterTableModel.columnInfos: (Array<raw (ColumnInfo<(Any..Any?), (Any..Any?)>..ColumnInfo<*, *>?)>..Array<out raw (ColumnInfo<(Any..Any?), (Any..Any?)>..ColumnInfo<*, *>?)>?)[MyPropertyDescriptor]

'column' @ [248:71] ==> value-parameter column: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getValue.<anonymous>[ValueParameterDescriptorImpl]

'when {
                        KotlinPrimaryConstructorParameterTableModel.isValVarColumn(columnInfo) ->
                            (components[column] as @Suppress("NO_TYPE_ARGUMENTS_ON_RHS") JComboBox).selectedItem
                        KotlinCallableParameterTableModel.isTypeColumn(columnInfo) ->
                            item.typeCodeFragment
                        KotlinCallableParameterTableModel.isNameColumn(columnInfo) ->
                            (components[column] as EditorTextField).text
                        KotlinCallableParameterTableModel.isDefaultValueColumn(columnInfo) ->
                            item.defaultValueCodeFragment
                        else ->
                            null
                    }' @ [250:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any?, entry1: Any?, entry2: Any?, entry3: Any?, entry4: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any?

'isValVarColumn' @ [251:69] ==> public open fun isValVarColumn(column: raw (ColumnInfo<(Any..Any?), (Any..Any?)>..ColumnInfo<*, *>?)): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinPrimaryConstructorParameterTableModel[JavaMethodDescriptor]

'columnInfo' @ [251:84] ==> val columnInfo: raw (ColumnInfo<(Any..Any?), (Any..Any?)>..ColumnInfo<*, *>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getValue.<anonymous>[LocalVariableDescriptor]

'components' @ [252:30] ==> private final val components: ArrayList<JComponent> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>[PropertyDescriptorImpl]

'column' @ [252:41] ==> value-parameter column: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getValue.<anonymous>[ValueParameterDescriptorImpl]

'Suppress' @ [252:52] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'selectedItem' @ [252:101] ==> public final var <E : (Any..Any?)> JComboBox<out (Any..Any?)>.selectedItem: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(*)

'isTypeColumn' @ [253:59] ==> public open fun isTypeColumn(column: raw (ColumnInfo<(Any..Any?), (Any..Any?)>..ColumnInfo<*, *>?)): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinCallableParameterTableModel[JavaMethodDescriptor]

'columnInfo' @ [253:72] ==> val columnInfo: raw (ColumnInfo<(Any..Any?), (Any..Any?)>..ColumnInfo<*, *>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getValue.<anonymous>[LocalVariableDescriptor]

'item' @ [254:29] ==> value-parameter item: ParameterTableModelItemBase<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor[ValueParameterDescriptorImpl]

'typeCodeFragment' @ [254:34] ==> public final val typeCodeFragment: (PsiCodeFragment..PsiCodeFragment?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'isNameColumn' @ [255:59] ==> public open fun isNameColumn(column: raw (ColumnInfo<(Any..Any?), (Any..Any?)>..ColumnInfo<*, *>?)): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinCallableParameterTableModel[JavaMethodDescriptor]

'columnInfo' @ [255:72] ==> val columnInfo: raw (ColumnInfo<(Any..Any?), (Any..Any?)>..ColumnInfo<*, *>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getValue.<anonymous>[LocalVariableDescriptor]

'components' @ [256:30] ==> private final val components: ArrayList<JComponent> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>[PropertyDescriptorImpl]

'column' @ [256:41] ==> value-parameter column: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getValue.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [256:69] ==> public final var EditorTextField.text: (String..String?)[MyPropertyDescriptor]

'isDefaultValueColumn' @ [257:59] ==> public open fun isDefaultValueColumn(column: raw (ColumnInfo<(Any..Any?), (Any..Any?)>..ColumnInfo<*, *>?)): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinCallableParameterTableModel[JavaMethodDescriptor]

'columnInfo' @ [257:80] ==> val columnInfo: raw (ColumnInfo<(Any..Any?), (Any..Any?)>..ColumnInfo<*, *>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getValue.<anonymous>[LocalVariableDescriptor]

'item' @ [258:29] ==> value-parameter item: ParameterTableModelItemBase<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor[ValueParameterDescriptorImpl]

'defaultValueCodeFragment' @ [258:34] ==> public final val defaultValueCodeFragment: (PsiCodeFragment..PsiCodeFragment?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'getInstance' @ [266:48] ==> public open fun getInstance(): (EditorColorsManager..EditorColorsManager?) defined in com.intellij.openapi.editor.colors.EditorColorsManager[JavaMethodDescriptor]

'globalScheme' @ [266:62] ==> public final var EditorColorsManager.globalScheme: EditorColorsScheme[MyPropertyDescriptor]

'getFont' @ [266:75] ==> @NotNull public abstract fun getFont(p0: (EditorFontType..EditorFontType?)): Font defined in com.intellij.openapi.editor.colors.EditorColorsScheme[JavaMethodDescriptor]

'PLAIN' @ [266:98] ==> enum entry PLAIN defined in com.intellij.openapi.editor.colors.EditorFontType[FakeCallableDescriptorForObject]

'font' @ [267:17] ==> var font: Font defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getColumnWidth[LocalVariableDescriptor]

'Font' @ [267:24] ==> public constructor Font(p0: (String..String?), p1: Int, p2: Int) defined in java.awt.Font[JavaClassConstructorDescriptor]

'font' @ [267:29] ==> var font: Font defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getColumnWidth[LocalVariableDescriptor]

'fontName' @ [267:34] ==> public final val Font.fontName: (String..String?)[MyPropertyDescriptor]

'font' @ [267:44] ==> var font: Font defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getColumnWidth[LocalVariableDescriptor]

'style' @ [267:49] ==> public final val Font.style: Int[MyPropertyDescriptor]

'letters' @ [268:24] ==> value-parameter letters: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getColumnWidth[ValueParameterDescriptorImpl]

'getDefaultToolkit' @ [268:42] ==> public open fun getDefaultToolkit(): (Toolkit..Toolkit?) defined in java.awt.Toolkit[JavaMethodDescriptor]

'getFontMetrics' @ [268:62] ==> @Deprecated public abstract fun getFontMetrics(p0: (Font..Font?)): (FontMetrics..FontMetrics?) defined in java.awt.Toolkit[JavaMethodDescriptor]

'font' @ [268:77] ==> var font: Font defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getColumnWidth[LocalVariableDescriptor]

'stringWidth' @ [268:83] ==> public open fun stringWidth(p0: (String..String?)): Int defined in java.awt.FontMetrics[JavaMethodDescriptor]

'Suppress' @ [272:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'x' @ [272:53] ==> value-parameter x: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getEditorIndex[ValueParameterDescriptorImpl]

'if (isDefaultColumnEnabled())
                    intArrayOf(4, getParamNamesMaxLength(), getTypesMaxLength(), getDefaultValuesMaxLength())
                else
                    intArrayOf(4, getParamNamesMaxLength(), getTypesMaxLength())' @ [274:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IntArray, elseBranch: IntArray): IntArray[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IntArray

'isDefaultColumnEnabled' @ [274:41] ==> private final fun isDefaultColumnEnabled(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>[SimpleFunctionDescriptorImpl]

'intArrayOf' @ [275:21] ==> public fun intArrayOf(vararg elements: Int): IntArray defined in kotlin[DeserializedSimpleFunctionDescriptor]

'getParamNamesMaxLength' @ [275:35] ==> private final fun getParamNamesMaxLength(): Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[SimpleFunctionDescriptorImpl]

'getTypesMaxLength' @ [275:61] ==> private final fun getTypesMaxLength(): Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[SimpleFunctionDescriptorImpl]

'getDefaultValuesMaxLength' @ [275:82] ==> private final fun getDefaultValuesMaxLength(): Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[SimpleFunctionDescriptorImpl]

'intArrayOf' @ [277:21] ==> public fun intArrayOf(vararg elements: Int): IntArray defined in kotlin[DeserializedSimpleFunctionDescriptor]

'getParamNamesMaxLength' @ [277:35] ==> private final fun getParamNamesMaxLength(): Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[SimpleFunctionDescriptorImpl]

'getTypesMaxLength' @ [277:61] ==> private final fun getTypesMaxLength(): Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[SimpleFunctionDescriptorImpl]

'..' @ [280:27] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'if (myMethod.kind === Kind.PRIMARY_CONSTRUCTOR) 0 else 1' @ [280:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'myMethod' @ [280:32] ==> protected/*protected and package*/ final val myMethod: (KotlinMethodDescriptor..KotlinMethodDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'kind' @ [280:41] ==> public open val kind: KotlinMethodDescriptor.Kind defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'PRIMARY_CONSTRUCTOR' @ [280:55] ==> enum entry PRIMARY_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor.Kind[FakeCallableDescriptorForObject]

'columnLetters' @ [280:87] ==> val columnLetters: IntArray defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getEditorIndex[LocalVariableDescriptor]

'size' @ [280:101] ==> public final val size: Int defined in kotlin.IntArray[DeserializedPropertyDescriptor]

'getColumnWidth' @ [281:33] ==> private final fun getColumnWidth(letters: Int): Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>[SimpleFunctionDescriptorImpl]

'columnLetters' @ [281:48] ==> val columnLetters: IntArray defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getEditorIndex[LocalVariableDescriptor]

'i' @ [281:62] ==> val i: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getEditorIndex[LocalVariableDescriptor]

'x' @ [283:25] ==> var x: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getEditorIndex[LocalVariableDescriptor]

'width' @ [283:30] ==> val width: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getEditorIndex[LocalVariableDescriptor]

'columnIndex' @ [284:32] ==> var columnIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getEditorIndex[LocalVariableDescriptor]

'columnIndex' @ [286:21] ==> var columnIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getEditorIndex[LocalVariableDescriptor]

'x' @ [287:21] ==> var x: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getEditorIndex[LocalVariableDescriptor]

'width' @ [287:26] ==> val width: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getEditorIndex[LocalVariableDescriptor]

'columnIndex' @ [290:24] ==> var columnIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getEditorIndex[LocalVariableDescriptor]

'mouseEvent' @ [294:26] ==> public final var <no name provided>.mouseEvent: MouseEvent?[MyPropertyDescriptor]

'when {
                    me != null -> getEditorIndex(me.point.getX().toInt())
                    myMethod.kind === Kind.PRIMARY_CONSTRUCTOR -> 1
                    else -> 0
                }' @ [295:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'me' @ [296:21] ==> val me: MouseEvent? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getPreferredFocusedComponent[LocalVariableDescriptor]

'getEditorIndex' @ [296:35] ==> private final fun getEditorIndex(x: Int): Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>[SimpleFunctionDescriptorImpl]

'me' @ [296:50] ==> val me: MouseEvent? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getPreferredFocusedComponent[LocalVariableDescriptor]

'point' @ [296:53] ==> public final val MouseEvent.point: (Point..Point?)[MyPropertyDescriptor]

'getX' @ [296:59] ==> public open fun getX(): Double defined in java.awt.Point[JavaMethodDescriptor]

'toInt' @ [296:66] ==> public open fun toInt(): Int defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'myMethod' @ [297:21] ==> protected/*protected and package*/ final val myMethod: (KotlinMethodDescriptor..KotlinMethodDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'kind' @ [297:30] ==> public open val kind: KotlinMethodDescriptor.Kind defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'PRIMARY_CONSTRUCTOR' @ [297:44] ==> enum entry PRIMARY_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor.Kind[FakeCallableDescriptorForObject]

'components' @ [300:33] ==> private final val components: ArrayList<JComponent> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>[PropertyDescriptorImpl]

'index' @ [300:44] ==> val index: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getPreferredFocusedComponent[LocalVariableDescriptor]

'if (component is EditorTextField) component.focusTarget else component' @ [301:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JComponent, elseBranch: JComponent): JComponent[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JComponent

'component' @ [301:28] ==> val component: JComponent defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getPreferredFocusedComponent[LocalVariableDescriptor]

'component' @ [301:58] ==> val component: JComponent defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getPreferredFocusedComponent[LocalVariableDescriptor]

'focusTarget' @ [301:68] ==> public final val EditorTextField.focusTarget: (JComponent..JComponent?)[MyPropertyDescriptor]

'component' @ [301:85] ==> val component: JComponent defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getPreferredFocusedComponent[LocalVariableDescriptor]

'Array' @ [305:24] ==> public constructor Array<T>(size: Int, init: (Int) -> JComponent) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> JComponent

'components' @ [305:30] ==> private final val components: ArrayList<JComponent> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>[PropertyDescriptorImpl]

'size' @ [305:41] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'components' @ [306:37] ==> private final val components: ArrayList<JComponent> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>[PropertyDescriptorImpl]

'it' @ [306:48] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getFocusableComponents.<anonymous>[ValueParameterDescriptorImpl]

'?:' @ [307:21] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: JComponent?, right: JComponent): JComponent[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> JComponent

'component' @ [307:22] ==> val component: JComponent defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getFocusableComponents.<anonymous>[LocalVariableDescriptor]

'focusTarget' @ [307:54] ==> public final val EditorTextField.focusTarget: (JComponent..JComponent?)[MyPropertyDescriptor]

'component' @ [307:69] ==> val component: JComponent defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getTableEditor.<no name provided>.getFocusableComponents.<anonymous>[LocalVariableDescriptor]

'evaluateChangeInfo' @ [314:26] ==> private final fun evaluateChangeInfo(parametersModel: KotlinCallableParameterTableModel, returnTypeCodeFragment: PsiCodeFragment?, methodDescriptor: KotlinMethodDescriptor, visibility: Visibility?, methodName: String, defaultValueContext: PsiElement, forPreview: Boolean): KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion[SimpleFunctionDescriptorImpl]

'parametersTableModel' @ [314:45] ==> private final val parametersTableModel: KotlinCallableParameterTableModel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[PropertyDescriptorImpl]

'myReturnTypeCodeFragment' @ [315:45] ==> @Nullable protected/*protected and package*/ final var myReturnTypeCodeFragment: PsiCodeFragment? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'getMethodDescriptor' @ [316:45] ==> private final fun getMethodDescriptor(): KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[SimpleFunctionDescriptorImpl]

'visibility' @ [317:45] ==> protected/*protected and package*/ for synthetic extension final val KotlinChangeSignatureDialog.visibility: Visibility?[MyPropertyDescriptor]

'methodName' @ [318:45] ==> protected/*protected and package*/ for synthetic extension final val KotlinChangeSignatureDialog.methodName: (String..String?)[MyPropertyDescriptor]

'myDefaultValueContext' @ [319:45] ==> protected/*protected and package*/ final val myDefaultValueContext: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'changeInfo' @ [321:16] ==> val changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.calculateSignature[LocalVariableDescriptor]

'getNewSignature' @ [321:27] ==> public final fun getNewSignature(inheritedCallable: KotlinCallableDefinitionUsage<PsiElement>): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'getMethodDescriptor' @ [321:43] ==> private final fun getMethodDescriptor(): KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[SimpleFunctionDescriptorImpl]

'originalPrimaryCallable' @ [321:65] ==> public abstract val originalPrimaryCallable: KotlinCallableDefinitionUsage<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'ComboBoxVisibilityPanel' @ [324:46] ==> public constructor ComboBoxVisibilityPanel<V : (Any..Any?)>(p0: (Array<(Visibility..Visibility?)>..Array<out (Visibility..Visibility?)>?)) defined in com.intellij.refactoring.ui.ComboBoxVisibilityPanel[JavaClassConstructorDescriptor]
Inferred types:
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.Visibility..org.jetbrains.kotlin.descriptors.Visibility?)

'arrayOf' @ [325:13] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Visibility): Array<Visibility> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Visibility

'INTERNAL' @ [325:34] ==> @NotNull public final val INTERNAL: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'PRIVATE' @ [325:57] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'PROTECTED' @ [325:79] ==> @NotNull public final val PROTECTED: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'PUBLIC' @ [325:103] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'super' @ [329:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[LazyClassReceiverParameterDescriptor]

'updateSignatureAlarmFired' @ [329:15] ==> protected/*protected and package*/ open fun updateSignatureAlarmFired(): Unit defined in com.intellij.refactoring.changeSignature.ChangeSignatureDialogBase[JavaMethodDescriptor]

'validateButtons' @ [330:9] ==> protected/*protected and package*/ open fun validateButtons(): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaMethodDescriptor]

'myMethod' @ [334:13] ==> protected/*protected and package*/ final val myMethod: (KotlinMethodDescriptor..KotlinMethodDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'canChangeReturnType' @ [334:22] ==> public abstract fun canChangeReturnType(): (MethodDescriptor.ReadWriteOption..MethodDescriptor.ReadWriteOption?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[JavaMethodDescriptor]

'ReadWrite' @ [334:80] ==> enum entry ReadWrite defined in com.intellij.refactoring.changeSignature.MethodDescriptor.ReadWriteOption[FakeCallableDescriptorForObject]

'myReturnTypeCodeFragment' @ [335:13] ==> @Nullable protected/*protected and package*/ final var myReturnTypeCodeFragment: PsiCodeFragment? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'getTypeInfo' @ [335:38] ==> public final fun PsiCodeFragment?.getTypeInfo(isCovariant: Boolean, forPreview: Boolean): KotlinTypeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion[SimpleFunctionDescriptorImpl]

'type' @ [335:63] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[PropertyDescriptorImpl]

'!=' @ [336:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'showOkCancelDialog' @ [336:26] ==> @Messages.OkCancelResult public open fun showOkCancelDialog(p0: (Project..Project?), p1: (String..String?), @Nls p2: (String..String?), p3: (Icon..Icon?)): Int defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'myProject' @ [337:21] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'myReturnTypeCodeFragment' @ [338:37] ==> @Nullable protected/*protected and package*/ final var myReturnTypeCodeFragment: PsiCodeFragment? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'text' @ [338:64] ==> public final val PsiCodeFragment.text: (String..String?)[MyPropertyDescriptor]

'message' @ [339:39] ==> public open fun message(@PropertyKey p0: (String..String?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'getWarningIcon' @ [340:30] ==> @NotNull public open fun getWarningIcon(): Icon defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'OK' @ [341:27] ==> public const final val OK: Int defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'EXIT_SILENTLY' @ [342:50] ==> protected/*protected static*/ const final val EXIT_SILENTLY: String defined in com.intellij.refactoring.changeSignature.ChangeSignatureDialogBase[JavaPropertyDescriptor]

'parametersTableModel' @ [346:22] ==> private final val parametersTableModel: KotlinCallableParameterTableModel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[PropertyDescriptorImpl]

'items' @ [346:43] ==> public final var KotlinCallableParameterTableModel.items: (MutableList<(ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?)>..List<(ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?)>)[MyPropertyDescriptor]

'item' @ [347:17] ==> val item: (ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.validateAndCommitData[LocalVariableDescriptor]

'typeCodeFragment' @ [347:22] ==> public final val typeCodeFragment: (PsiCodeFragment..PsiCodeFragment?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'getTypeInfo' @ [347:39] ==> public final fun PsiCodeFragment?.getTypeInfo(isCovariant: Boolean, forPreview: Boolean): KotlinTypeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion[SimpleFunctionDescriptorImpl]

'type' @ [347:64] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[PropertyDescriptorImpl]

'if (item.parameter != parametersTableModel.receiver) "parameter '${item.parameter.name}'" else "receiver"' @ [348:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'item' @ [348:37] ==> val item: (ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.validateAndCommitData[LocalVariableDescriptor]

'parameter' @ [348:42] ==> public final val parameter: (KotlinParameterInfo..KotlinParameterInfo?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'parametersTableModel' @ [348:55] ==> private final val parametersTableModel: KotlinCallableParameterTableModel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[PropertyDescriptorImpl]

'receiver' @ [348:76] ==> public final val KotlinCallableParameterTableModel.receiver: KotlinParameterInfo?[MyPropertyDescriptor]

'item' @ [348:100] ==> val item: (ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.validateAndCommitData[LocalVariableDescriptor]

'parameter' @ [348:105] ==> public final val parameter: (KotlinParameterInfo..KotlinParameterInfo?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'name' @ [348:115] ==> public final var KotlinParameterInfo.name: String[MyPropertyDescriptor]

'!=' @ [349:21] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'showOkCancelDialog' @ [349:30] ==> @Messages.OkCancelResult public open fun showOkCancelDialog(p0: (Project..Project?), p1: (String..String?), @Nls p2: (String..String?), p3: (Icon..Icon?)): Int defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'myProject' @ [350:25] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'item' @ [351:34] ==> val item: (ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.validateAndCommitData[LocalVariableDescriptor]

'typeCodeFragment' @ [351:39] ==> public final val typeCodeFragment: (PsiCodeFragment..PsiCodeFragment?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'text' @ [351:56] ==> public final val PsiCodeFragment.text: (String..String?)[MyPropertyDescriptor]

'paramText' @ [351:68] ==> val paramText: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.validateAndCommitData[LocalVariableDescriptor]

'message' @ [352:43] ==> public open fun message(@PropertyKey p0: (String..String?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'getWarningIcon' @ [353:34] ==> @NotNull public open fun getWarningIcon(): Icon defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'OK' @ [354:31] ==> public const final val OK: Int defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'EXIT_SILENTLY' @ [355:54] ==> protected/*protected static*/ const final val EXIT_SILENTLY: String defined in com.intellij.refactoring.changeSignature.ChangeSignatureDialogBase[JavaPropertyDescriptor]

'myNamePanel' @ [363:13] ==> protected/*protected and package*/ final var myNamePanel: (JPanel..JPanel?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'isVisible' @ [363:25] ==> public final var JPanel.isVisible: Boolean[MyPropertyDescriptor]

'myMethod' @ [363:38] ==> protected/*protected and package*/ final val myMethod: (KotlinMethodDescriptor..KotlinMethodDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'canChangeName' @ [363:47] ==> public abstract fun canChangeName(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[JavaMethodDescriptor]

'!' @ [363:66] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'KotlinNameSuggester' @ [363:67] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'isIdentifier' @ [363:87] ==> public final fun isIdentifier(name: String?): Boolean defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'methodName' @ [363:100] ==> protected/*protected and package*/ for synthetic extension final val KotlinChangeSignatureDialog.methodName: (String..String?)[MyPropertyDescriptor]

'ConfigurationException' @ [364:19] ==> public constructor ConfigurationException(p0: (String..String?)) defined in com.intellij.openapi.options.ConfigurationException[JavaClassConstructorDescriptor]

'message' @ [364:66] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringBundle[JavaMethodDescriptor]

'myMethod' @ [367:13] ==> protected/*protected and package*/ final val myMethod: (KotlinMethodDescriptor..KotlinMethodDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'canChangeReturnType' @ [367:22] ==> public abstract fun canChangeReturnType(): (MethodDescriptor.ReadWriteOption..MethodDescriptor.ReadWriteOption?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[JavaMethodDescriptor]

'ReadWrite' @ [367:81] ==> enum entry ReadWrite defined in com.intellij.refactoring.changeSignature.MethodDescriptor.ReadWriteOption[FakeCallableDescriptorForObject]

'myReturnTypeCodeFragment' @ [368:14] ==> @Nullable protected/*protected and package*/ final var myReturnTypeCodeFragment: PsiCodeFragment? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'validateElement' @ [369:23] ==> @Throws public fun KtElement?.validateElement(errorMessage: String): Unit defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'message' @ [369:63] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringBundle[JavaMethodDescriptor]

'parametersTableModel' @ [372:22] ==> private final val parametersTableModel: KotlinCallableParameterTableModel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[PropertyDescriptorImpl]

'items' @ [372:43] ==> public final var KotlinCallableParameterTableModel.items: (MutableList<(ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?)>..List<(ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?)>)[MyPropertyDescriptor]

'item' @ [373:33] ==> val item: (ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.canRun[LocalVariableDescriptor]

'parameter' @ [373:38] ==> public final val parameter: (KotlinParameterInfo..KotlinParameterInfo?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'name' @ [373:48] ==> public final var KotlinParameterInfo.name: String[MyPropertyDescriptor]

'item' @ [375:17] ==> val item: (ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.canRun[LocalVariableDescriptor]

'parameter' @ [375:22] ==> public final val parameter: (KotlinParameterInfo..KotlinParameterInfo?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'parametersTableModel' @ [375:35] ==> private final val parametersTableModel: KotlinCallableParameterTableModel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[PropertyDescriptorImpl]

'receiver' @ [375:56] ==> public final val KotlinCallableParameterTableModel.receiver: KotlinParameterInfo?[MyPropertyDescriptor]

'!' @ [375:68] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'KotlinNameSuggester' @ [375:69] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'isIdentifier' @ [375:89] ==> public final fun isIdentifier(name: String?): Boolean defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'parameterName' @ [375:102] ==> val parameterName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.canRun[LocalVariableDescriptor]

'ConfigurationException' @ [376:23] ==> public constructor ConfigurationException(p0: (String..String?)) defined in com.intellij.openapi.options.ConfigurationException[JavaClassConstructorDescriptor]

'message' @ [376:70] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringBundle[JavaMethodDescriptor]

'parameterName' @ [376:107] ==> val parameterName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.canRun[LocalVariableDescriptor]

'item' @ [379:14] ==> val item: (ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.canRun[LocalVariableDescriptor]

'typeCodeFragment' @ [379:19] ==> public final val typeCodeFragment: (PsiCodeFragment..PsiCodeFragment?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'validateElement' @ [380:23] ==> @Throws public fun KtElement?.validateElement(errorMessage: String): Unit defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'message' @ [380:63] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringBundle[JavaMethodDescriptor]

'item' @ [380:100] ==> val item: (ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.canRun[LocalVariableDescriptor]

'typeCodeFragment' @ [380:105] ==> public final val typeCodeFragment: (PsiCodeFragment..PsiCodeFragment?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'text' @ [380:122] ==> public final val PsiCodeFragment.text: (String..String?)[MyPropertyDescriptor]

'evaluateChangeInfo' @ [385:26] ==> private final fun evaluateChangeInfo(parametersModel: KotlinCallableParameterTableModel, returnTypeCodeFragment: PsiCodeFragment?, methodDescriptor: KotlinMethodDescriptor, visibility: Visibility?, methodName: String, defaultValueContext: PsiElement, forPreview: Boolean): KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion[SimpleFunctionDescriptorImpl]

'parametersTableModel' @ [385:45] ==> private final val parametersTableModel: KotlinCallableParameterTableModel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[PropertyDescriptorImpl]

'myReturnTypeCodeFragment' @ [386:45] ==> @Nullable protected/*protected and package*/ final var myReturnTypeCodeFragment: PsiCodeFragment? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'getMethodDescriptor' @ [387:45] ==> private final fun getMethodDescriptor(): KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[SimpleFunctionDescriptorImpl]

'visibility' @ [388:45] ==> protected/*protected and package*/ for synthetic extension final val KotlinChangeSignatureDialog.visibility: Visibility?[MyPropertyDescriptor]

'methodName' @ [389:45] ==> protected/*protected and package*/ for synthetic extension final val KotlinChangeSignatureDialog.methodName: (String..String?)[MyPropertyDescriptor]

'myDefaultValueContext' @ [390:45] ==> protected/*protected and package*/ final val myDefaultValueContext: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'changeInfo' @ [392:9] ==> val changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.createRefactoringProcessor[LocalVariableDescriptor]

'primaryPropagationTargets' @ [392:20] ==> public final var primaryPropagationTargets: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'myMethodsToPropagateParameters' @ [392:48] ==> protected/*protected and package*/ final var myMethodsToPropagateParameters: (MutableSet<(PsiElement..PsiElement?)>..Set<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'emptyList' @ [392:82] ==> public fun <T> emptyList(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'KotlinChangeSignatureProcessor' @ [393:16] ==> public constructor KotlinChangeSignatureProcessor(project: Project, changeInfo: KotlinChangeInfo, commandName: String) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor[ClassConstructorDescriptorImpl]

'myProject' @ [393:47] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'changeInfo' @ [393:58] ==> val changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.createRefactoringProcessor[LocalVariableDescriptor]

'commandName' @ [393:70] ==> private final val commandName: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[PropertyDescriptorImpl]

'title' @ [393:85] ==> public final var KotlinChangeSignatureDialog.title: (String..String?)[MyPropertyDescriptor]

'myMethod' @ [396:65] ==> protected/*protected and package*/ final val myMethod: (KotlinMethodDescriptor..KotlinMethodDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'myMethod' @ [399:16] ==> protected/*protected and package*/ final val myMethod: (KotlinMethodDescriptor..KotlinMethodDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[JavaPropertyDescriptor]

'parameters' @ [399:25] ==> public final val KotlinMethodDescriptor.parameters: (MutableList<(KotlinParameterInfo..KotlinParameterInfo?)>..List<(KotlinParameterInfo..KotlinParameterInfo?)>?)[MyPropertyDescriptor]

'withIndex' @ [399:36] ==> public fun <T> Iterable<(KotlinParameterInfo..KotlinParameterInfo?)>.withIndex(): Iterable<IndexedValue<(KotlinParameterInfo..KotlinParameterInfo?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo..org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo?)

'firstOrNull' @ [399:48] ==> public inline fun <T> Iterable<IndexedValue<(KotlinParameterInfo..KotlinParameterInfo?)>>.firstOrNull(predicate: (IndexedValue<(KotlinParameterInfo..KotlinParameterInfo?)>) -> Boolean): IndexedValue<(KotlinParameterInfo..KotlinParameterInfo?)>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<(org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo..org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo?)>

'it' @ [399:62] ==> value-parameter it: IndexedValue<(KotlinParameterInfo..KotlinParameterInfo?)> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.getSelectedIdx.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [399:65] ==> public final val value: (KotlinParameterInfo..KotlinParameterInfo?) defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'isNewParameter' @ [399:71] ==> public final val isNewParameter: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'index' @ [399:89] ==> public final val index: Int defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'super' @ [400:19] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[LazyClassReceiverParameterDescriptor]

'getSelectedIdx' @ [400:25] ==> protected/*protected and package*/ open fun getSelectedIdx(): Int defined in com.intellij.refactoring.changeSignature.ChangeSignatureDialogBase[JavaMethodDescriptor]

'getTypeCodeFragmentContext' @ [405:31] ==> public final fun getTypeCodeFragmentContext(startFrom: PsiElement): KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion[SimpleFunctionDescriptorImpl]

'defaultValueContext' @ [405:58] ==> value-parameter defaultValueContext: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createParametersInfoModel[ValueParameterDescriptorImpl]

'when (descriptor.kind) {
                KotlinMethodDescriptor.Kind.FUNCTION -> KotlinFunctionParameterTableModel(descriptor, typeContext, defaultValueContext)
                KotlinMethodDescriptor.Kind.PRIMARY_CONSTRUCTOR -> KotlinPrimaryConstructorParameterTableModel(descriptor, typeContext, defaultValueContext)
                KotlinMethodDescriptor.Kind.SECONDARY_CONSTRUCTOR -> KotlinSecondaryConstructorParameterTableModel(descriptor, typeContext, defaultValueContext)
            }' @ [406:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinCallableParameterTableModel, entry1: KotlinCallableParameterTableModel, entry2: KotlinCallableParameterTableModel): KotlinCallableParameterTableModel[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinCallableParameterTableModel

'descriptor' @ [406:26] ==> value-parameter descriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createParametersInfoModel[ValueParameterDescriptorImpl]

'kind' @ [406:37] ==> public open val kind: KotlinMethodDescriptor.Kind defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'FUNCTION' @ [407:45] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor.Kind[FakeCallableDescriptorForObject]

'KotlinFunctionParameterTableModel' @ [407:57] ==> public constructor KotlinFunctionParameterTableModel(methodDescriptor: (KotlinMethodDescriptor..KotlinMethodDescriptor?), typeContext: (PsiElement..PsiElement?), defaultValueContext: (PsiElement..PsiElement?)) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinFunctionParameterTableModel[JavaClassConstructorDescriptor]

'descriptor' @ [407:91] ==> value-parameter descriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createParametersInfoModel[ValueParameterDescriptorImpl]

'typeContext' @ [407:103] ==> val typeContext: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createParametersInfoModel[LocalVariableDescriptor]

'defaultValueContext' @ [407:116] ==> value-parameter defaultValueContext: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createParametersInfoModel[ValueParameterDescriptorImpl]

'PRIMARY_CONSTRUCTOR' @ [408:45] ==> enum entry PRIMARY_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor.Kind[FakeCallableDescriptorForObject]

'KotlinPrimaryConstructorParameterTableModel' @ [408:68] ==> public constructor KotlinPrimaryConstructorParameterTableModel(methodDescriptor: (KotlinMethodDescriptor..KotlinMethodDescriptor?), typeContext: (PsiElement..PsiElement?), defaultValueContext: (PsiElement..PsiElement?)) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinPrimaryConstructorParameterTableModel[JavaClassConstructorDescriptor]

'descriptor' @ [408:112] ==> value-parameter descriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createParametersInfoModel[ValueParameterDescriptorImpl]

'typeContext' @ [408:124] ==> val typeContext: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createParametersInfoModel[LocalVariableDescriptor]

'defaultValueContext' @ [408:137] ==> value-parameter defaultValueContext: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createParametersInfoModel[ValueParameterDescriptorImpl]

'SECONDARY_CONSTRUCTOR' @ [409:45] ==> enum entry SECONDARY_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor.Kind[FakeCallableDescriptorForObject]

'KotlinSecondaryConstructorParameterTableModel' @ [409:70] ==> public constructor KotlinSecondaryConstructorParameterTableModel(methodDescriptor: (KotlinMethodDescriptor..KotlinMethodDescriptor?), typeContext: (PsiElement..PsiElement?), defaultValueContext: (PsiElement..PsiElement?)) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinSecondaryConstructorParameterTableModel[JavaClassConstructorDescriptor]

'descriptor' @ [409:116] ==> value-parameter descriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createParametersInfoModel[ValueParameterDescriptorImpl]

'typeContext' @ [409:128] ==> val typeContext: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createParametersInfoModel[LocalVariableDescriptor]

'defaultValueContext' @ [409:141] ==> value-parameter defaultValueContext: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createParametersInfoModel[ValueParameterDescriptorImpl]

'startFrom' @ [414:20] ==> value-parameter startFrom: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeCodeFragmentContext[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [414:30] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'mapNotNull' @ [414:46] ==> public fun <T, R : Any> Sequence<PsiElement>.mapNotNull(transform: (PsiElement) -> KtElement?): Sequence<KtElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R : Any> -> KtElement

'when {
                    it is KtNamedFunction -> it.bodyExpression ?: it.valueParameterList
                    it is KtPropertyAccessor -> it.bodyExpression
                    it is KtDeclaration && KtPsiUtil.isLocal(it) -> null
                    it is KtConstructor<*> -> it
                    it is KtClassOrObject -> it
                    it is KtFile -> it
                    else -> null
                }' @ [415:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtElement?, entry1: KtElement?, entry2: KtElement?, entry3: KtElement?, entry4: KtElement?, entry5: KtElement?, entry6: KtElement?): KtElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtElement?

'it' @ [416:21] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeCodeFragmentContext.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [416:46] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeCodeFragmentContext.<anonymous>[ValueParameterDescriptorImpl]

'bodyExpression' @ [416:49] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'it' @ [416:67] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeCodeFragmentContext.<anonymous>[ValueParameterDescriptorImpl]

'valueParameterList' @ [416:70] ==> public final val KtNamedFunction.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'it' @ [417:21] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeCodeFragmentContext.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [417:49] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeCodeFragmentContext.<anonymous>[ValueParameterDescriptorImpl]

'bodyExpression' @ [417:52] ==> public final val KtPropertyAccessor.bodyExpression: KtExpression?[MyPropertyDescriptor]

'it' @ [418:21] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeCodeFragmentContext.<anonymous>[ValueParameterDescriptorImpl]

'isLocal' @ [418:54] ==> public open fun isLocal(@NotNull p0: KtDeclaration): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'it' @ [418:62] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeCodeFragmentContext.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [419:21] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeCodeFragmentContext.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [419:47] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeCodeFragmentContext.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [420:21] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeCodeFragmentContext.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [420:46] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeCodeFragmentContext.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [421:21] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeCodeFragmentContext.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [421:37] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeCodeFragmentContext.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [424:15] ==> public fun <T> Sequence<KtElement>.first(): KtElement defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'KtPsiFactory' @ [428:17] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [428:30] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createReturnTypeCodeFragment[ValueParameterDescriptorImpl]

'createTypeCodeFragment' @ [428:39] ==> public final fun createTypeCodeFragment(text: String, context: PsiElement?): KtTypeCodeFragment defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'method' @ [428:62] ==> value-parameter method: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createReturnTypeCodeFragment[ValueParameterDescriptorImpl]

'returnTypeInfo' @ [428:69] ==> public val KotlinMethodDescriptor.returnTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinMethodDescriptor.kt[PropertyDescriptorImpl]

'render' @ [428:84] ==> public fun KotlinTypeInfo.render(): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinTypeInfo.kt[SimpleFunctionDescriptorImpl]

'getTypeCodeFragmentContext' @ [428:94] ==> public final fun getTypeCodeFragmentContext(startFrom: PsiElement): KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion[SimpleFunctionDescriptorImpl]

'method' @ [428:121] ==> value-parameter method: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createReturnTypeCodeFragment[ValueParameterDescriptorImpl]

'baseDeclaration' @ [428:128] ==> public abstract val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'createParametersInfoModel' @ [434:39] ==> private final fun createParametersInfoModel(descriptor: KotlinMethodDescriptor, defaultValueContext: PsiElement): KotlinCallableParameterTableModel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion[SimpleFunctionDescriptorImpl]

'method' @ [434:65] ==> value-parameter method: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createRefactoringProcessorForSilentChangeSignature[ValueParameterDescriptorImpl]

'defaultValueContext' @ [434:73] ==> value-parameter defaultValueContext: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createRefactoringProcessorForSilentChangeSignature[ValueParameterDescriptorImpl]

'parameterTableModel' @ [435:13] ==> val parameterTableModel: KotlinCallableParameterTableModel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createRefactoringProcessorForSilentChangeSignature[LocalVariableDescriptor]

'setParameterInfos' @ [435:33] ==> public open fun setParameterInfos(p0: (MutableList<(KotlinParameterInfo..KotlinParameterInfo?)>..List<(KotlinParameterInfo..KotlinParameterInfo?)>?)): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinCallableParameterTableModel[JavaMethodDescriptor]

'method' @ [435:51] ==> value-parameter method: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createRefactoringProcessorForSilentChangeSignature[ValueParameterDescriptorImpl]

'parameters' @ [435:58] ==> public final val KotlinMethodDescriptor.parameters: (MutableList<(KotlinParameterInfo..KotlinParameterInfo?)>..List<(KotlinParameterInfo..KotlinParameterInfo?)>?)[MyPropertyDescriptor]

'evaluateChangeInfo' @ [436:30] ==> private final fun evaluateChangeInfo(parametersModel: KotlinCallableParameterTableModel, returnTypeCodeFragment: PsiCodeFragment?, methodDescriptor: KotlinMethodDescriptor, visibility: Visibility?, methodName: String, defaultValueContext: PsiElement, forPreview: Boolean): KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion[SimpleFunctionDescriptorImpl]

'parameterTableModel' @ [436:49] ==> val parameterTableModel: KotlinCallableParameterTableModel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createRefactoringProcessorForSilentChangeSignature[LocalVariableDescriptor]

'createReturnTypeCodeFragment' @ [437:49] ==> private final fun createReturnTypeCodeFragment(project: Project, method: KotlinMethodDescriptor): KtTypeCodeFragment defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion[SimpleFunctionDescriptorImpl]

'project' @ [437:78] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createRefactoringProcessorForSilentChangeSignature[ValueParameterDescriptorImpl]

'method' @ [437:87] ==> value-parameter method: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createRefactoringProcessorForSilentChangeSignature[ValueParameterDescriptorImpl]

'method' @ [438:49] ==> value-parameter method: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createRefactoringProcessorForSilentChangeSignature[ValueParameterDescriptorImpl]

'method' @ [439:49] ==> value-parameter method: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createRefactoringProcessorForSilentChangeSignature[ValueParameterDescriptorImpl]

'visibility' @ [439:56] ==> public final val KotlinMethodDescriptor.visibility: (Visibility..Visibility?)[MyPropertyDescriptor]

'method' @ [440:49] ==> value-parameter method: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createRefactoringProcessorForSilentChangeSignature[ValueParameterDescriptorImpl]

'name' @ [440:56] ==> public final val KotlinMethodDescriptor.name: (String..String?)[MyPropertyDescriptor]

'defaultValueContext' @ [441:49] ==> value-parameter defaultValueContext: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createRefactoringProcessorForSilentChangeSignature[ValueParameterDescriptorImpl]

'KotlinChangeSignatureProcessor' @ [443:20] ==> public constructor KotlinChangeSignatureProcessor(project: Project, changeInfo: KotlinChangeInfo, commandName: String) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor[ClassConstructorDescriptorImpl]

'project' @ [443:51] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createRefactoringProcessorForSilentChangeSignature[ValueParameterDescriptorImpl]

'changeInfo' @ [443:60] ==> val changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createRefactoringProcessorForSilentChangeSignature[LocalVariableDescriptor]

'commandName' @ [443:72] ==> value-parameter commandName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.createRefactoringProcessorForSilentChangeSignature[ValueParameterDescriptorImpl]

'this' @ [447:17] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeInfo[ReceiverParameterDescriptorImpl]

'KotlinTypeInfo' @ [447:53] ==> public constructor KotlinTypeInfo(isCovariant: Boolean, type: KotlinType? = ..., text: String? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'isCovariant' @ [447:68] ==> value-parameter isCovariant: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeInfo[ValueParameterDescriptorImpl]

'getContentElement' @ [449:27] ==> public open fun getContentElement(): KtTypeReference? defined in org.jetbrains.kotlin.psi.KtTypeCodeFragment[DeserializedSimpleFunctionDescriptor]

'typeRef' @ [450:24] ==> val typeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeInfo[LocalVariableDescriptor]

'analyze' @ [450:33] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [450:57] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'get' @ [450:67] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?), p1: (KtTypeReference..KtTypeReference?)): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'TYPE' @ [450:86] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'typeRef' @ [450:92] ==> val typeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeInfo[LocalVariableDescriptor]

'when {
                type != null && !type.isError -> KotlinTypeInfo(isCovariant, type, if (forPreview) typeRef.text else null)
                typeRef != null -> KotlinTypeInfo(isCovariant, null, typeRef.text)
                else -> KotlinTypeInfo(isCovariant)
            }' @ [451:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinTypeInfo, entry1: KotlinTypeInfo, entry2: KotlinTypeInfo): KotlinTypeInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinTypeInfo

'type' @ [452:17] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeInfo[LocalVariableDescriptor]

'!' @ [452:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [452:34] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeInfo[LocalVariableDescriptor]

'isError' @ [452:39] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'KotlinTypeInfo' @ [452:50] ==> public constructor KotlinTypeInfo(isCovariant: Boolean, type: KotlinType? = ..., text: String? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'isCovariant' @ [452:65] ==> value-parameter isCovariant: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeInfo[ValueParameterDescriptorImpl]

'type' @ [452:78] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeInfo[LocalVariableDescriptor]

'if (forPreview) typeRef.text else null' @ [452:84] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'forPreview' @ [452:88] ==> value-parameter forPreview: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeInfo[ValueParameterDescriptorImpl]

'typeRef' @ [452:100] ==> val typeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeInfo[LocalVariableDescriptor]

'text' @ [452:108] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'typeRef' @ [453:17] ==> val typeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeInfo[LocalVariableDescriptor]

'KotlinTypeInfo' @ [453:36] ==> public constructor KotlinTypeInfo(isCovariant: Boolean, type: KotlinType? = ..., text: String? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'isCovariant' @ [453:51] ==> value-parameter isCovariant: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeInfo[ValueParameterDescriptorImpl]

'typeRef' @ [453:70] ==> val typeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeInfo[LocalVariableDescriptor]

'text' @ [453:78] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'KotlinTypeInfo' @ [454:25] ==> public constructor KotlinTypeInfo(isCovariant: Boolean, type: KotlinType? = ..., text: String? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'isCovariant' @ [454:40] ==> value-parameter isCovariant: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.getTypeInfo[ValueParameterDescriptorImpl]

'parametersModel' @ [465:30] ==> value-parameter parametersModel: KotlinCallableParameterTableModel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.evaluateChangeInfo[ValueParameterDescriptorImpl]

'items' @ [465:46] ==> public final var KotlinCallableParameterTableModel.items: (MutableList<(ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?)>..List<(ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?)>)[MyPropertyDescriptor]

'map' @ [465:52] ==> public inline fun <T, R> Iterable<(ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?)>.map(transform: ((ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?)) -> (KotlinParameterInfo..KotlinParameterInfo?)): List<(KotlinParameterInfo..KotlinParameterInfo?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.refactoring.changeSignature.ParameterTableModelItemBase<(org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo..org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo?)>..com.intellij.refactoring.changeSignature.ParameterTableModelItemBase<(org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo..org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo?)>?)
    <R> -> (org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo..org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo?)

'parameter' @ [466:37] ==> value-parameter parameter: (ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.evaluateChangeInfo.<anonymous>[ValueParameterDescriptorImpl]

'parameter' @ [466:47] ==> public final val parameter: (KotlinParameterInfo..KotlinParameterInfo?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'parameterInfo' @ [468:17] ==> val parameterInfo: (KotlinParameterInfo..KotlinParameterInfo?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.evaluateChangeInfo.<anonymous>[LocalVariableDescriptor]

'currentTypeInfo' @ [468:31] ==> public final var currentTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'parameter' @ [468:49] ==> value-parameter parameter: (ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.evaluateChangeInfo.<anonymous>[ValueParameterDescriptorImpl]

'typeCodeFragment' @ [468:59] ==> public final val typeCodeFragment: (PsiCodeFragment..PsiCodeFragment?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'getTypeInfo' @ [468:76] ==> public final fun PsiCodeFragment?.getTypeInfo(isCovariant: Boolean, forPreview: Boolean): KotlinTypeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion[SimpleFunctionDescriptorImpl]

'forPreview' @ [468:95] ==> value-parameter forPreview: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.evaluateChangeInfo[ValueParameterDescriptorImpl]

'parameter' @ [470:36] ==> value-parameter parameter: (ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>..ParameterTableModelItemBase<(KotlinParameterInfo..KotlinParameterInfo?)>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.evaluateChangeInfo.<anonymous>[ValueParameterDescriptorImpl]

'defaultValueCodeFragment' @ [470:46] ==> public final val defaultValueCodeFragment: (PsiCodeFragment..PsiCodeFragment?) defined in com.intellij.refactoring.changeSignature.ParameterTableModelItemBase[JavaPropertyDescriptor]

'parameterInfo' @ [471:39] ==> val parameterInfo: (KotlinParameterInfo..KotlinParameterInfo?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.evaluateChangeInfo.<anonymous>[LocalVariableDescriptor]

'defaultValueForCall' @ [471:53] ==> public final var defaultValueForCall: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'codeFragment' @ [472:21] ==> val codeFragment: KtExpressionCodeFragment defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.evaluateChangeInfo.<anonymous>[LocalVariableDescriptor]

'text' @ [472:34] ==> public final val KtExpressionCodeFragment.text: (String..String?)[MyPropertyDescriptor]

'if (oldDefaultValue != null) oldDefaultValue.text else ""' @ [472:43] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'oldDefaultValue' @ [472:47] ==> val oldDefaultValue: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.evaluateChangeInfo.<anonymous>[LocalVariableDescriptor]

'oldDefaultValue' @ [472:72] ==> val oldDefaultValue: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.evaluateChangeInfo.<anonymous>[LocalVariableDescriptor]

'text' @ [472:88] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'parameterInfo' @ [473:21] ==> val parameterInfo: (KotlinParameterInfo..KotlinParameterInfo?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.evaluateChangeInfo.<anonymous>[LocalVariableDescriptor]

'defaultValueForCall' @ [473:35] ==> public final var defaultValueForCall: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'codeFragment' @ [473:57] ==> val codeFragment: KtExpressionCodeFragment defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.evaluateChangeInfo.<anonymous>[LocalVariableDescriptor]

'getContentElement' @ [473:70] ==> public open fun getContentElement(): KtExpression? defined in org.jetbrains.kotlin.psi.KtExpressionCodeFragment[DeserializedSimpleFunctionDescriptor]

'parameterInfo' @ [476:17] ==> val parameterInfo: (KotlinParameterInfo..KotlinParameterInfo?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.evaluateChangeInfo.<anonymous>[LocalVariableDescriptor]

'KotlinChangeInfo' @ [479:20] ==> public constructor KotlinChangeInfo(methodDescriptor: KotlinMethodDescriptor, name: String = ..., newReturnTypeInfo: KotlinTypeInfo = ..., newVisibility: Visibility = ..., parameterInfos: List<KotlinParameterInfo> = ..., receiver: KotlinParameterInfo? = ..., context: PsiElement, primaryPropagationTargets: Collection<PsiElement> = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[ClassConstructorDescriptorImpl]

'methodDescriptor' @ [479:37] ==> value-parameter methodDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.evaluateChangeInfo[ValueParameterDescriptorImpl]

'original' @ [479:54] ==> public abstract val original: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'methodName' @ [480:37] ==> value-parameter methodName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.evaluateChangeInfo[ValueParameterDescriptorImpl]

'returnTypeCodeFragment' @ [481:37] ==> value-parameter returnTypeCodeFragment: PsiCodeFragment? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.evaluateChangeInfo[ValueParameterDescriptorImpl]

'getTypeInfo' @ [481:60] ==> public final fun PsiCodeFragment?.getTypeInfo(isCovariant: Boolean, forPreview: Boolean): KotlinTypeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion[SimpleFunctionDescriptorImpl]

'forPreview' @ [481:78] ==> value-parameter forPreview: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.evaluateChangeInfo[ValueParameterDescriptorImpl]

'visibility' @ [482:37] ==> value-parameter visibility: Visibility? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.evaluateChangeInfo[ValueParameterDescriptorImpl]

'DEFAULT_VISIBILITY' @ [482:64] ==> public final val DEFAULT_VISIBILITY: (Visibility..Visibility?) defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'parameters' @ [483:37] ==> val parameters: List<(KotlinParameterInfo..KotlinParameterInfo?)> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.evaluateChangeInfo[LocalVariableDescriptor]

'parametersModel' @ [484:37] ==> value-parameter parametersModel: KotlinCallableParameterTableModel defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.evaluateChangeInfo[ValueParameterDescriptorImpl]

'receiver' @ [484:53] ==> public final val KotlinCallableParameterTableModel.receiver: KotlinParameterInfo?[MyPropertyDescriptor]

'defaultValueContext' @ [485:37] ==> value-parameter defaultValueContext: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion.evaluateChangeInfo[ValueParameterDescriptorImpl]

