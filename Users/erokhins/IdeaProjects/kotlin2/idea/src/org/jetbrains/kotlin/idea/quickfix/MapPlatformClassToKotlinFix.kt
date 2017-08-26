'KotlinQuickFixAction<KtReferenceExpression>' @ [50:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtReferenceExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtReferenceExpression

'element' @ [50:49] ==> value-parameter element: KtReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.<init>[ValueParameterDescriptorImpl]

'DescriptorRenderer' @ [53:42] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'FQ_NAMES_IN_TYPES' @ [53:61] ==> @field:JvmField public final val FQ_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'renderType' @ [53:79] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'platformClass' @ [53:90] ==> private final val platformClass: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix[PropertyDescriptorImpl]

'defaultType' @ [53:104] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'possibleClasses' @ [54:27] ==> private final val possibleClasses: Collection<ClassDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix[PropertyDescriptorImpl]

'singleOrNull' @ [54:43] ==> public fun <T> Iterable<ClassDescriptor>.singleOrNull(): ClassDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'if (singleClass != null)
            "Change all usages of '$platformClassQualifiedName' in this file to '${DescriptorRenderer.FQ_NAMES_IN_TYPES.renderType(singleClass.defaultType)}'"
        else
            "Change all usages of '$platformClassQualifiedName' in this file to a Kotlin class"' @ [55:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'singleClass' @ [55:20] ==> val singleClass: ClassDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.getText[LocalVariableDescriptor]

'platformClassQualifiedName' @ [56:37] ==> val platformClassQualifiedName: String defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.getText[LocalVariableDescriptor]

'DescriptorRenderer' @ [56:84] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'FQ_NAMES_IN_TYPES' @ [56:103] ==> @field:JvmField public final val FQ_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'renderType' @ [56:121] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'singleClass' @ [56:132] ==> val singleClass: ClassDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.getText[LocalVariableDescriptor]

'defaultType' @ [56:144] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'platformClassQualifiedName' @ [58:37] ==> val platformClassQualifiedName: String defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.getText[LocalVariableDescriptor]

'file' @ [64:30] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[ValueParameterDescriptorImpl]

'analyzeFully' @ [64:35] ==> public fun KtElement.analyzeFully(): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'ArrayList' @ [66:23] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtImportDirective

'ArrayList' @ [67:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtUserType

'bindingContext' @ [69:28] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[LocalVariableDescriptor]

'diagnostics' @ [69:43] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'diagnostic' @ [70:17] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[LocalVariableDescriptor]

'factory' @ [70:28] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'PLATFORM_CLASS_MAPPED_TO_KOTLIN' @ [70:47] ==> public final val PLATFORM_CLASS_MAPPED_TO_KOTLIN: (DiagnosticFactory1<(KtElement..KtElement?), (MutableCollection<(ClassDescriptor..ClassDescriptor?)>..Collection<(ClassDescriptor..ClassDescriptor?)>?)>..DiagnosticFactory1<(KtElement..KtElement?), (MutableCollection<(ClassDescriptor..ClassDescriptor?)>..Collection<(ClassDescriptor..ClassDescriptor?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'getImportOrUsageFromDiagnostic' @ [72:27] ==> private final fun getImportOrUsageFromDiagnostic(diagnostic: Diagnostic): KtReferenceExpression? defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.Companion[SimpleFunctionDescriptorImpl]

'diagnostic' @ [72:58] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[LocalVariableDescriptor]

'resolveToClass' @ [73:17] ==> private final fun resolveToClass(referenceExpression: KtReferenceExpression, context: BindingContext): ClassDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.Companion[SimpleFunctionDescriptorImpl]

'refExpr' @ [73:32] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[LocalVariableDescriptor]

'bindingContext' @ [73:41] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[LocalVariableDescriptor]

'platformClass' @ [73:60] ==> private final val platformClass: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix[PropertyDescriptorImpl]

'refExpr' @ [75:26] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[LocalVariableDescriptor]

'getStrictParentOfType' @ [75:34] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtImportDirective? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtImportDirective

'if (import != null) {
                imports.add(import)
            }
            else {
                usages.add(refExpr.getStrictParentOfType<KtUserType>() ?: continue)
            }' @ [76:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'import' @ [76:17] ==> val import: KtImportDirective? defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[LocalVariableDescriptor]

'imports' @ [77:17] ==> val imports: ArrayList<KtImportDirective> defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[LocalVariableDescriptor]

'add' @ [77:25] ==> public open fun add(element: KtImportDirective): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'import' @ [77:29] ==> val import: KtImportDirective? defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[LocalVariableDescriptor]

'usages' @ [80:17] ==> val usages: ArrayList<KtUserType> defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[LocalVariableDescriptor]

'add' @ [80:24] ==> public open fun add(element: KtUserType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'refExpr' @ [80:28] ==> val refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[LocalVariableDescriptor]

'getStrictParentOfType' @ [80:36] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtUserType? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtUserType

'imports' @ [84:9] ==> val imports: ArrayList<KtImportDirective> defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[LocalVariableDescriptor]

'forEach' @ [84:17] ==> @HidesMembers public inline fun <T> Iterable<KtImportDirective>.forEach(action: (KtImportDirective) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtImportDirective

'it' @ [84:27] ==> value-parameter it: KtImportDirective defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'delete' @ [84:30] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtImportDirective[JavaMethodDescriptor]

'usages' @ [86:13] ==> val usages: ArrayList<KtUserType> defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[LocalVariableDescriptor]

'isEmpty' @ [86:20] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'replaceUsagesWithFirstClass' @ [91:32] ==> private final fun replaceUsagesWithFirstClass(project: Project, usages: List<KtUserType>): List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix[SimpleFunctionDescriptorImpl]

'project' @ [91:60] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[ValueParameterDescriptorImpl]

'usages' @ [91:69] ==> val usages: ArrayList<KtUserType> defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[LocalVariableDescriptor]

'possibleClasses' @ [93:13] ==> private final val possibleClasses: Collection<ClassDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix[PropertyDescriptorImpl]

'size' @ [93:29] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'editor' @ [93:41] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[ValueParameterDescriptorImpl]

'LinkedHashSet' @ [94:33] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'possibleClasses' @ [95:27] ==> private final val possibleClasses: Collection<ClassDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix[PropertyDescriptorImpl]

'possibleTypes' @ [96:17] ==> val possibleTypes: LinkedHashSet<String> defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[LocalVariableDescriptor]

'add' @ [96:31] ==> public open fun add(element: String): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'klass' @ [96:35] ==> val klass: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[LocalVariableDescriptor]

'name' @ [96:41] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [96:46] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'buildAndShowTemplate' @ [98:13] ==> private final fun buildAndShowTemplate(project: Project, editor: Editor, file: PsiFile, replacedElements: Collection<PsiElement>, options: LinkedHashSet<String>): Unit defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix[SimpleFunctionDescriptorImpl]

'project' @ [98:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[ValueParameterDescriptorImpl]

'editor' @ [98:43] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[ValueParameterDescriptorImpl]

'file' @ [98:51] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[ValueParameterDescriptorImpl]

'replacedElements' @ [98:57] ==> val replacedElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[LocalVariableDescriptor]

'possibleTypes' @ [98:75] ==> val possibleTypes: LinkedHashSet<String> defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.invoke[LocalVariableDescriptor]

'possibleClasses' @ [103:32] ==> private final val possibleClasses: Collection<ClassDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix[PropertyDescriptorImpl]

'first' @ [103:48] ==> public fun <T> Iterable<ClassDescriptor>.first(): ClassDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'replacementClass' @ [104:36] ==> val replacementClass: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.replaceUsagesWithFirstClass[LocalVariableDescriptor]

'name' @ [104:53] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [104:58] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'ArrayList' @ [105:32] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'usages' @ [106:23] ==> value-parameter usages: List<KtUserType> defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.replaceUsagesWithFirstClass[ValueParameterDescriptorImpl]

'usage' @ [107:33] ==> val usage: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.replaceUsagesWithFirstClass[LocalVariableDescriptor]

'typeArgumentList' @ [107:39] ==> public final val KtUserType.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'typeArguments' @ [108:39] ==> val typeArguments: KtTypeArgumentList? defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.replaceUsagesWithFirstClass[LocalVariableDescriptor]

'text' @ [108:54] ==> public final val KtTypeArgumentList.text: (String..String?)[MyPropertyDescriptor]

'KtPsiFactory' @ [109:35] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [109:48] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.replaceUsagesWithFirstClass[ValueParameterDescriptorImpl]

'createType' @ [109:57] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'replacementClassName' @ [109:68] ==> val replacementClassName: String defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.replaceUsagesWithFirstClass[LocalVariableDescriptor]

'typeArgumentsString' @ [109:91] ==> val typeArgumentsString: String defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.replaceUsagesWithFirstClass[LocalVariableDescriptor]

'replacementType' @ [110:42] ==> val replacementType: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.replaceUsagesWithFirstClass[LocalVariableDescriptor]

'typeElement' @ [110:58] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'usage' @ [111:35] ==> val usage: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.replaceUsagesWithFirstClass[LocalVariableDescriptor]

'replace' @ [111:41] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtUserType[JavaMethodDescriptor]

'replacementTypeElement' @ [111:49] ==> val replacementTypeElement: KtTypeElement defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.replaceUsagesWithFirstClass[LocalVariableDescriptor]

'replacedElement' @ [112:38] ==> val replacedElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.replaceUsagesWithFirstClass[LocalVariableDescriptor]

'firstChild' @ [112:54] ==> public final val PsiElement.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'assert' @ [113:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'replacedExpression' @ [113:20] ==> val replacedExpression: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.replaceUsagesWithFirstClass[LocalVariableDescriptor]

'replacedElements' @ [114:13] ==> val replacedElements: ArrayList<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.replaceUsagesWithFirstClass[LocalVariableDescriptor]

'add' @ [114:30] ==> public open fun add(element: PsiElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'replacedExpression' @ [114:34] ==> val replacedExpression: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.replaceUsagesWithFirstClass[LocalVariableDescriptor]

'replacedElements' @ [116:16] ==> val replacedElements: ArrayList<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.replaceUsagesWithFirstClass[LocalVariableDescriptor]

'getInstance' @ [126:28] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [126:40] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[ValueParameterDescriptorImpl]

'commitAllDocuments' @ [126:49] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'getInstance' @ [127:28] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [127:40] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[ValueParameterDescriptorImpl]

'doPostponedOperationsAndUnblockDocument' @ [127:49] ==> public abstract fun doPostponedOperationsAndUnblockDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'editor' @ [127:89] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[ValueParameterDescriptorImpl]

'document' @ [127:96] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'replacedElements' @ [129:41] ==> value-parameter replacedElements: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[ValueParameterDescriptorImpl]

'iterator' @ [129:58] ==> public abstract fun iterator(): Iterator<PsiElement> defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'next' @ [129:69] ==> public abstract operator fun next(): PsiElement defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'editor' @ [131:26] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[ValueParameterDescriptorImpl]

'caretModel' @ [131:33] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'caretModel' @ [132:25] ==> val caretModel: CaretModel defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[LocalVariableDescriptor]

'offset' @ [132:36] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'caretModel' @ [133:9] ==> val caretModel: CaretModel defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[LocalVariableDescriptor]

'moveToOffset' @ [133:20] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'file' @ [133:33] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[ValueParameterDescriptorImpl]

'node' @ [133:38] ==> public final val PsiFile.node: (FileASTNode..FileASTNode?)[MyPropertyDescriptor]

'startOffset' @ [133:43] ==> public final val FileASTNode.startOffset: Int[MyPropertyDescriptor]

'TemplateBuilderImpl' @ [135:23] ==> public constructor TemplateBuilderImpl(@NotNull p0: PsiElement) defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaClassConstructorDescriptor]

'file' @ [135:43] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[ValueParameterDescriptorImpl]

'MyLookupExpression' @ [136:26] ==> public constructor MyLookupExpression(p0: (String..String?), p1: (LinkedHashSet<(String..String?)>..LinkedHashSet<(String..String?)>?), p2: (PsiNamedElement..PsiNamedElement?), p3: (PsiElement..PsiElement?), p4: Boolean, p5: (String..String?)) defined in com.intellij.refactoring.rename.inplace.MyLookupExpression[JavaClassConstructorDescriptor]

'primaryReplacedExpression' @ [136:45] ==> val primaryReplacedExpression: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[LocalVariableDescriptor]

'text' @ [136:71] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'options' @ [136:77] ==> value-parameter options: LinkedHashSet<String> defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[ValueParameterDescriptorImpl]

'builder' @ [138:9] ==> val builder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[LocalVariableDescriptor]

'replaceElement' @ [138:17] ==> public open fun replaceElement(p0: (PsiElement..PsiElement?), p1: (String..String?), p2: (Expression..Expression?), p3: Boolean): Unit defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'primaryReplacedExpression' @ [138:32] ==> val primaryReplacedExpression: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[LocalVariableDescriptor]

'PRIMARY_USAGE' @ [138:59] ==> private final val PRIMARY_USAGE: String defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix[PropertyDescriptorImpl]

'expression' @ [138:74] ==> val expression: MyLookupExpression defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[LocalVariableDescriptor]

'replacedElements' @ [139:36] ==> value-parameter replacedElements: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[ValueParameterDescriptorImpl]

'replacedExpression' @ [140:17] ==> val replacedExpression: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[LocalVariableDescriptor]

'primaryReplacedExpression' @ [140:40] ==> val primaryReplacedExpression: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[LocalVariableDescriptor]

'builder' @ [141:13] ==> val builder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[LocalVariableDescriptor]

'replaceElement' @ [141:21] ==> public open fun replaceElement(p0: (PsiElement..PsiElement?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'replacedExpression' @ [141:36] ==> val replacedExpression: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[LocalVariableDescriptor]

'OTHER_USAGE' @ [141:56] ==> private final val OTHER_USAGE: String defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix[PropertyDescriptorImpl]

'PRIMARY_USAGE' @ [141:69] ==> private final val PRIMARY_USAGE: String defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix[PropertyDescriptorImpl]

'getInstance' @ [144:25] ==> public open fun getInstance(p0: (Project..Project?)): (TemplateManager..TemplateManager?) defined in com.intellij.codeInsight.template.TemplateManager[JavaMethodDescriptor]

'project' @ [144:37] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[ValueParameterDescriptorImpl]

'startTemplate' @ [144:46] ==> public abstract fun startTemplate(@NotNull p0: Editor, @NotNull p1: Template, p2: (TemplateEditingListener..TemplateEditingListener?)): Unit defined in com.intellij.codeInsight.template.TemplateManager[JavaMethodDescriptor]

'editor' @ [144:60] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[ValueParameterDescriptorImpl]

'builder' @ [144:68] ==> val builder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[LocalVariableDescriptor]

'buildInlineTemplate' @ [144:76] ==> public open fun buildInlineTemplate(): (Template..Template?) defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'TemplateEditingAdapter' @ [144:108] ==> public constructor TemplateEditingAdapter() defined in com.intellij.codeInsight.template.TemplateEditingAdapter[JavaClassConstructorDescriptor]

'caretModel' @ [146:17] ==> val caretModel: CaretModel defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[LocalVariableDescriptor]

'moveToOffset' @ [146:28] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'oldOffset' @ [146:41] ==> val oldOffset: Int defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.buildAndShowTemplate[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactoryWithDelegate<KtReferenceExpression, Companion.Data>' @ [151:24] ==> public constructor KotlinSingleIntentionActionFactoryWithDelegate<E : KtElement, D : Any>(actionPriority: IntentionActionPriority = ...) defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactoryWithDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> KtReferenceExpression
    <D : Any> -> Data

'getImportOrUsageFromDiagnostic' @ [156:19] ==> private final fun getImportOrUsageFromDiagnostic(diagnostic: Diagnostic): KtReferenceExpression? defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.Companion[SimpleFunctionDescriptorImpl]

'diagnostic' @ [156:50] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.Companion.getElementOfInterest[ValueParameterDescriptorImpl]

'element' @ [159:27] ==> value-parameter element: KtReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.Companion.extractFixData[ValueParameterDescriptorImpl]

'analyze' @ [159:35] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [159:59] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'resolveToClass' @ [160:33] ==> private final fun resolveToClass(referenceExpression: KtReferenceExpression, context: BindingContext): ClassDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.Companion[SimpleFunctionDescriptorImpl]

'element' @ [160:48] ==> value-parameter element: KtReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.Companion.extractFixData[ValueParameterDescriptorImpl]

'context' @ [160:57] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.Companion.extractFixData[LocalVariableDescriptor]

'PLATFORM_CLASS_MAPPED_TO_KOTLIN' @ [161:42] ==> public final val PLATFORM_CLASS_MAPPED_TO_KOTLIN: (DiagnosticFactory1<(KtElement..KtElement?), (MutableCollection<(ClassDescriptor..ClassDescriptor?)>..Collection<(ClassDescriptor..ClassDescriptor?)>?)>..DiagnosticFactory1<(KtElement..KtElement?), (MutableCollection<(ClassDescriptor..ClassDescriptor?)>..Collection<(ClassDescriptor..ClassDescriptor?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [161:74] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters1<(KtElement..KtElement?), (MutableCollection<(ClassDescriptor..ClassDescriptor?)>..Collection<(ClassDescriptor..ClassDescriptor?)>?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'diagnostic' @ [161:79] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.Companion.extractFixData[ValueParameterDescriptorImpl]

'a' @ [161:91] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<(KtElement..KtElement?), (MutableCollection<(ClassDescriptor..ClassDescriptor?)>..Collection<(ClassDescriptor..ClassDescriptor?)>?)>.a: (MutableCollection<(ClassDescriptor..ClassDescriptor?)>..Collection<(ClassDescriptor..ClassDescriptor?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)
    <A : (Any..Any?)> -> (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)>?)

'Data' @ [162:20] ==> public constructor Data(platformClass: ClassDescriptor, possibleClasses: Collection<ClassDescriptor>) defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.Companion.Data[ClassConstructorDescriptorImpl]

'platformClass' @ [162:25] ==> val platformClass: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.Companion.extractFixData[LocalVariableDescriptor]

'possibleClasses' @ [162:40] ==> val possibleClasses: (MutableCollection<(ClassDescriptor..ClassDescriptor?)>..Collection<(ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.Companion.extractFixData[LocalVariableDescriptor]

'MapPlatformClassToKotlinFix' @ [166:20] ==> public constructor MapPlatformClassToKotlinFix(element: KtReferenceExpression, platformClass: ClassDescriptor, possibleClasses: Collection<ClassDescriptor>) defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix[ClassConstructorDescriptorImpl]

'originalElement' @ [166:48] ==> value-parameter originalElement: KtReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.Companion.createFix[ValueParameterDescriptorImpl]

'data' @ [166:65] ==> value-parameter data: MapPlatformClassToKotlinFix.Companion.Data defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.Companion.createFix[ValueParameterDescriptorImpl]

'platformClass' @ [166:70] ==> public final val platformClass: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.Companion.Data[PropertyDescriptorImpl]

'data' @ [166:85] ==> value-parameter data: MapPlatformClassToKotlinFix.Companion.Data defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.Companion.createFix[ValueParameterDescriptorImpl]

'possibleClasses' @ [166:90] ==> public final val possibleClasses: Collection<ClassDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.Companion.Data[PropertyDescriptorImpl]

'referenceExpression' @ [170:20] ==> value-parameter referenceExpression: KtReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.Companion.resolveToClass[ValueParameterDescriptorImpl]

'mainReference' @ [170:40] ==> public val KtReferenceExpression.mainReference: KtReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'resolveToDescriptors' @ [170:54] ==> public abstract fun resolveToDescriptors(bindingContext: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references.KtReference[DeserializedSimpleFunctionDescriptor]

'context' @ [170:75] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.Companion.resolveToClass[ValueParameterDescriptorImpl]

'firstIsInstanceOrNull' @ [170:84] ==> public inline fun <reified T : Any> Iterable<*>.firstIsInstanceOrNull(): ClassDescriptor? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ClassDescriptor

'diagnostic' @ [174:26] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.Companion.getImportOrUsageFromDiagnostic[ValueParameterDescriptorImpl]

'psiElement' @ [174:37] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [174:48] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtImportDirective? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtImportDirective

'if (import != null) {
                import.importedReference?.getQualifiedElementSelector() as? KtReferenceExpression
            }
            else {
                (diagnostic.psiElement.getNonStrictParentOfType<KtUserType>() ?: return null).referenceExpression
            }' @ [175:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtReferenceExpression?, elseBranch: KtReferenceExpression?): KtReferenceExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtReferenceExpression?

'import' @ [175:24] ==> val import: KtImportDirective? defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.Companion.getImportOrUsageFromDiagnostic[LocalVariableDescriptor]

'import' @ [176:17] ==> val import: KtImportDirective? defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.Companion.getImportOrUsageFromDiagnostic[LocalVariableDescriptor]

'importedReference' @ [176:24] ==> public final val KtImportDirective.importedReference: KtExpression?[MyPropertyDescriptor]

'getQualifiedElementSelector' @ [176:43] ==> public fun KtElement.getQualifiedElementSelector(): KtElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'diagnostic' @ [179:18] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.MapPlatformClassToKotlinFix.Companion.getImportOrUsageFromDiagnostic[ValueParameterDescriptorImpl]

'psiElement' @ [179:29] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [179:40] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtUserType? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtUserType

'referenceExpression' @ [179:95] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

