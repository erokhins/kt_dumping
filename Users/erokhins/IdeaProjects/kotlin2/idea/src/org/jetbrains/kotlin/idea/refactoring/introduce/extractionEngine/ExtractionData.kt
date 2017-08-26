'ExtractionOptions' @ [62:23] ==> public constructor ExtractionOptions(inferUnitTypeForUnusedValues: Boolean = ..., enableListBoxing: Boolean = ..., extractAsProperty: Boolean = ..., allowSpecialClassNames: Boolean = ..., captureLocalFunctions: Boolean = ..., canWrapInWith: Boolean = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionOptions[ClassConstructorDescriptorImpl]

'getValue' @ [81:70] ==> public final operator fun getValue(thisRef: R, property: KProperty<*>): T? defined in org.jetbrains.kotlin.psi.CopyableUserDataProperty[DeserializedSimpleFunctionDescriptor]

'create' @ [81:99] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(ResolveResult..ResolveResult?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult..org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult?)

'ExtractionOptions' @ [88:42] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionOptions[FakeCallableDescriptorForObject]

'DEFAULT' @ [88:60] ==> public final val DEFAULT: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionOptions.Companion[PropertyDescriptorImpl]

'originalFile' @ [90:28] ==> public final val originalFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'project' @ [90:41] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'originalRange' @ [91:46] ==> public final val originalRange: KotlinPsiRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'elements' @ [91:60] ==> public abstract val elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedPropertyDescriptor]

'originalElements' @ [92:28] ==> public final val originalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'map' @ [92:45] ==> public inline fun <T, R> Iterable<PsiElement>.map(transform: (PsiElement) -> PsiElement): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> PsiElement

'it' @ [92:51] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.physicalElements.<anonymous>[ValueParameterDescriptorImpl]

'substringContextOrThis' @ [92:54] ==> public val PsiElement.substringContextOrThis: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce[DeserializedPropertyDescriptor]

'originalElements' @ [95:18] ==> public final val originalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'singleOrNull' @ [95:35] ==> public fun <T> List<PsiElement>.singleOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'extractableSubstringInfo' @ [95:69] ==> public var KtExpression.extractableSubstringInfo: ExtractableSubstringInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce[DeserializedPropertyDescriptor]

'options' @ [97:33] ==> public final val options: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'extractAsProperty' @ [97:41] ==> public final val extractAsProperty: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionOptions[PropertyDescriptorImpl]

'targetSibling' @ [98:36] ==> public final val targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'getStrictParentOfType' @ [98:50] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDeclaration

'let' @ [98:90] ==> @InlineOnly public inline fun <T, R> KtDeclaration.let(block: (KtDeclaration) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration
    <R> -> Boolean

'it' @ [99:37] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.insertBefore.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [99:68] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.insertBefore.<anonymous>[ValueParameterDescriptorImpl]

'originalElements' @ [102:23] ==> public final val originalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'filterIsInstance' @ [102:40] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtExpression

'getValue' @ [104:37] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'originalElements' @ [105:32] ==> public final val originalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'when (originalElements.size) {
            0 -> ""
            1 -> originalElements.first().text
            else -> originalFile.text.substring(originalElements.first().startOffset, originalElements.last().endOffset)
        }' @ [106:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (String..String?), entry1: (String..String?), entry2: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'originalElements' @ [106:15] ==> val originalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.codeFragmentText.<anonymous>[LocalVariableDescriptor]

'size' @ [106:32] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'originalElements' @ [108:18] ==> val originalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.codeFragmentText.<anonymous>[LocalVariableDescriptor]

'first' @ [108:35] ==> public fun <T> List<PsiElement>.first(): PsiElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'text' @ [108:43] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'originalFile' @ [109:21] ==> public final val originalFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'text' @ [109:34] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'substring' @ [109:39] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'originalElements' @ [109:49] ==> val originalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.codeFragmentText.<anonymous>[LocalVariableDescriptor]

'first' @ [109:66] ==> public fun <T> List<PsiElement>.first(): PsiElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'startOffset' @ [109:74] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'originalElements' @ [109:87] ==> val originalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.codeFragmentText.<anonymous>[LocalVariableDescriptor]

'last' @ [109:104] ==> public fun <T> List<PsiElement>.last(): PsiElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'endOffset' @ [109:111] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'findCommonParent' @ [113:36] ==> @Nullable public open fun findCommonParent(@NotNull p0: (MutableList<out (PsiElement..PsiElement?)>..List<(PsiElement..PsiElement?)>)): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'physicalElements' @ [113:53] ==> public final val physicalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'getValue' @ [115:44] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'commonParent' @ [115:51] ==> public final val commonParent: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'analyze' @ [115:64] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getValue' @ [117:38] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'KtPsiFactory' @ [117:45] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'originalFile' @ [117:58] ==> public final val originalFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'createParameter' @ [117:72] ==> public final fun createParameter(text: String): KtParameter defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'getValue' @ [118:49] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'KtPsiFactory' @ [118:56] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'originalFile' @ [118:69] ==> public final val originalFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'createFunction' @ [118:83] ==> public final fun createFunction(funDecl: String): KtNamedFunction defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'markReferences' @ [121:9] ==> private final fun markReferences(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[SimpleFunctionDescriptorImpl]

'!' @ [125:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [125:15] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.isExtractableIt[ValueParameterDescriptorImpl]

'context' @ [125:58] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.isExtractableIt[ValueParameterDescriptorImpl]

'AUTO_CREATED_IT' @ [125:81] ==> public final val AUTO_CREATED_IT: (WritableSlice<(ValueParameterDescriptor..ValueParameterDescriptor?), (Boolean..Boolean?)>..WritableSlice<(ValueParameterDescriptor..ValueParameterDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'descriptor' @ [125:98] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.isExtractableIt[ValueParameterDescriptorImpl]

'DescriptorToSourceUtils' @ [126:24] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [126:48] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [126:72] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.isExtractableIt[ValueParameterDescriptorImpl]

'containingDeclaration' @ [126:83] ==> public final val ValueParameterDescriptor.containingDeclaration: CallableDescriptor[MyPropertyDescriptor]

'function' @ [127:16] ==> val function: KtFunctionLiteral? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.isExtractableIt[LocalVariableDescriptor]

'!' @ [127:36] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'function' @ [127:37] ==> val function: KtFunctionLiteral? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.isExtractableIt[LocalVariableDescriptor]

'isInsideOf' @ [127:46] ==> public fun PsiElement.isInsideOf(elements: Iterable<PsiElement>): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'physicalElements' @ [127:57] ==> public final val physicalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'DescriptorToSourceUtilsIde' @ [131:27] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [131:54] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [131:72] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'descriptor' @ [131:81] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [132:13] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getDeclaration[LocalVariableDescriptor]

'declaration' @ [133:20] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getDeclaration[LocalVariableDescriptor]

'when {
            isExtractableIt(descriptor, context) -> itFakeDeclaration
            isSynthesizedInvoke(descriptor) -> synthesizedInvokeDeclaration
            descriptor is SyntheticJavaPropertyDescriptor -> getDeclaration(descriptor.getMethod, context)
            else -> declaration
        }' @ [136:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?, entry3: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'isExtractableIt' @ [137:13] ==> private final fun isExtractableIt(descriptor: DeclarationDescriptor, context: BindingContext): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[SimpleFunctionDescriptorImpl]

'descriptor' @ [137:29] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getDeclaration[ValueParameterDescriptorImpl]

'context' @ [137:41] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getDeclaration[ValueParameterDescriptorImpl]

'itFakeDeclaration' @ [137:53] ==> private final val itFakeDeclaration: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'isSynthesizedInvoke' @ [138:13] ==> public fun isSynthesizedInvoke(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.calls.tasks[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [138:33] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getDeclaration[ValueParameterDescriptorImpl]

'synthesizedInvokeDeclaration' @ [138:48] ==> private final val synthesizedInvokeDeclaration: KtNamedFunction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'descriptor' @ [139:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getDeclaration[ValueParameterDescriptorImpl]

'getDeclaration' @ [139:62] ==> private final tailrec fun getDeclaration(descriptor: DeclarationDescriptor, context: BindingContext): PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[SimpleFunctionDescriptorImpl]

'descriptor' @ [139:77] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getDeclaration[ValueParameterDescriptorImpl]

'getMethod' @ [139:88] ==> public abstract val getMethod: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor[DeserializedPropertyDescriptor]

'context' @ [139:99] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [140:21] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getDeclaration[LocalVariableDescriptor]

'bindingContext' @ [145:23] ==> public final val bindingContext: BindingContext? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'KtTreeVisitorVoid' @ [146:32] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'context' @ [148:21] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences[LocalVariableDescriptor]

'SMARTCAST' @ [148:44] ==> public final val SMARTCAST: (WritableSlice<(KtExpression..KtExpression?), (ExplicitSmartCasts..ExplicitSmartCasts?)>..WritableSlice<(KtExpression..KtExpression?), (ExplicitSmartCasts..ExplicitSmartCasts?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [148:55] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitQualifiedExpression[ValueParameterDescriptorImpl]

'expression' @ [149:21] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitQualifiedExpression[ValueParameterDescriptorImpl]

'selectorExpression' @ [149:32] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'accept' @ [149:52] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'this' @ [149:59] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>[LazyClassReceiverParameterDescriptor]

'super' @ [153:17] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitQualifiedExpression' @ [153:23] ==> public open fun visitQualifiedExpression(@NotNull p0: KtQualifiedExpression): Unit defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaMethodDescriptor]

'expression' @ [153:48] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitQualifiedExpression[ValueParameterDescriptorImpl]

'ref' @ [157:21] ==> value-parameter ref: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'parent' @ [157:25] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'substringInfo' @ [159:35] ==> public final val substringInfo: ExtractableSubstringInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'let' @ [159:50] ==> @InlineOnly public inline fun <T, R> ExtractableSubstringInfo.let(block: (ExtractableSubstringInfo) -> KtSimpleNameExpression?): KtSimpleNameExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtractableSubstringInfo
    <R> -> KtSimpleNameExpression?

'expressions' @ [161:46] ==> public final val expressions: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'single' @ [161:58] ==> public fun <T> List<KtExpression>.single(): KtExpression defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'physicalExpression' @ [162:50] ==> val physicalExpression: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitSimpleNameExpression.<anonymous>[LocalVariableDescriptor]

'getContentRange' @ [162:69] ==> public fun KtStringTemplateExpression.getContentRange(): TextRange defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'startOffset' @ [162:87] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'physicalExpression' @ [162:101] ==> val physicalExpression: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitSimpleNameExpression.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [162:120] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ref' @ [163:45] ==> value-parameter ref: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'startOffset' @ [163:49] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'extractedContentOffset' @ [163:63] ==> val extractedContentOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitSimpleNameExpression.<anonymous>[LocalVariableDescriptor]

'it' @ [164:44] ==> value-parameter it: ExtractableSubstringInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitSimpleNameExpression.<anonymous>[ValueParameterDescriptorImpl]

'relativeContentRange' @ [164:47] ==> public final val relativeContentRange: TextRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractableSubstringInfo[DeserializedPropertyDescriptor]

'startOffset' @ [164:68] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'offsetInExtracted' @ [164:82] ==> val offsetInExtracted: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitSimpleNameExpression.<anonymous>[LocalVariableDescriptor]

'it' @ [165:21] ==> value-parameter it: ExtractableSubstringInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitSimpleNameExpression.<anonymous>[ValueParameterDescriptorImpl]

'template' @ [165:24] ==> public final val template: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractableSubstringInfo[DeserializedPropertyDescriptor]

'findElementAt' @ [165:33] ==> public open fun findElementAt(p0: Int): PsiElement? defined in org.jetbrains.kotlin.psi.KtStringTemplateExpression[JavaMethodDescriptor]

'offsetInTemplate' @ [165:47] ==> val offsetInTemplate: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitSimpleNameExpression.<anonymous>[LocalVariableDescriptor]

'getStrictParentOfType' @ [165:67] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSimpleNameExpression

'ref' @ [166:22] ==> value-parameter ref: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'physicalRef' @ [168:36] ==> val physicalRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'getResolvedCall' @ [168:48] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [168:64] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences[LocalVariableDescriptor]

'context' @ [169:34] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [169:57] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'physicalRef' @ [169:75] ==> val physicalRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'getDeclaration' @ [170:35] ==> private final tailrec fun getDeclaration(descriptor: DeclarationDescriptor, context: BindingContext): PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[SimpleFunctionDescriptorImpl]

'descriptor' @ [170:50] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'context' @ [170:62] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences[LocalVariableDescriptor]

'ResolveResult' @ [172:37] ==> public constructor ResolveResult(originalRefExpr: KtSimpleNameExpression, declaration: PsiElement, descriptor: DeclarationDescriptor, resolvedCall: ResolvedCall<*>?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[ClassConstructorDescriptorImpl]

'physicalRef' @ [172:51] ==> val physicalRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'declaration' @ [172:64] ==> val declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'descriptor' @ [172:77] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'resolvedCall' @ [172:89] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'physicalRef' @ [173:17] ==> val physicalRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'resolveResult' @ [173:29] ==> internal var KtSimpleNameExpression.resolveResult: ResolveResult? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file ExtractionData.kt[PropertyDescriptorImpl]

'resolveResult' @ [173:45] ==> val resolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'ref' @ [174:21] ==> value-parameter ref: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'physicalRef' @ [174:28] ==> val physicalRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'ref' @ [175:21] ==> value-parameter ref: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'resolveResult' @ [175:25] ==> internal var KtSimpleNameExpression.resolveResult: ResolveResult? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file ExtractionData.kt[PropertyDescriptorImpl]

'resolveResult' @ [175:41] ==> val resolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'expressions' @ [179:9] ==> public final val expressions: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'forEach' @ [179:21] ==> @HidesMembers public inline fun <T> Iterable<KtExpression>.forEach(action: (KtExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'it' @ [179:31] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [179:34] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'visitor' @ [179:41] ==> val visitor: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.markReferences[LocalVariableDescriptor]

'context' @ [183:28] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getPossibleTypes[ValueParameterDescriptorImpl]

'getDataFlowInfoAfter' @ [183:36] ==> public fun BindingContext.getDataFlowInfoAfter(position: PsiElement): DataFlowInfo defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'expression' @ [183:57] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getPossibleTypes[ValueParameterDescriptorImpl]

'resolvedCall' @ [185:9] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getPossibleTypes[ValueParameterDescriptorImpl]

'getImplicitReceiverValue' @ [185:23] ==> public fun ResolvedCall<*>.getImplicitReceiverValue(): ImplicitReceiver? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil[DeserializedSimpleFunctionDescriptor]

'let' @ [185:51] ==> @InlineOnly public inline fun <T, R> ImplicitReceiver.let(block: (ImplicitReceiver) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImplicitReceiver
    <R> -> Nothing

'dataFlowInfo' @ [186:20] ==> val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getPossibleTypes[LocalVariableDescriptor]

'getCollectedTypes' @ [186:33] ==> public abstract fun getCollectedTypes(key: DataFlowValue): Set<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[DeserializedSimpleFunctionDescriptor]

'createDataFlowValueForStableReceiver' @ [186:72] ==> @JvmStatic public final fun createDataFlowValueForStableReceiver(receiver: ReceiverValue): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[DeserializedSimpleFunctionDescriptor]

'it' @ [186:109] ==> value-parameter it: ImplicitReceiver defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getPossibleTypes.<anonymous>[ValueParameterDescriptorImpl]

'resolvedCall' @ [189:20] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getPossibleTypes[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [189:34] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'returnType' @ [189:55] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'emptySet' @ [189:76] ==> public fun <T> emptySet(): Set<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'expression' @ [190:36] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getPossibleTypes[ValueParameterDescriptorImpl]

'getResolutionScope' @ [190:47] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'context' @ [190:66] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getPossibleTypes[ValueParameterDescriptorImpl]

'expression' @ [190:75] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getPossibleTypes[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [190:86] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'ownerDescriptor' @ [190:109] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'DataFlowValueFactory' @ [191:29] ==> public object DataFlowValueFactory defined in org.jetbrains.kotlin.resolve.calls.smartcasts[FakeCallableDescriptorForObject]

'createDataFlowValue' @ [191:50] ==> @JvmStatic public final fun createDataFlowValue(expression: KtExpression, type: KotlinType, bindingContext: BindingContext, containingDeclarationOrModule: DeclarationDescriptor): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[DeserializedSimpleFunctionDescriptor]

'expression' @ [191:70] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getPossibleTypes[ValueParameterDescriptorImpl]

'type' @ [191:82] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getPossibleTypes[LocalVariableDescriptor]

'context' @ [191:88] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getPossibleTypes[ValueParameterDescriptorImpl]

'containingDescriptor' @ [191:97] ==> val containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getPossibleTypes[LocalVariableDescriptor]

'dataFlowInfo' @ [192:16] ==> val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getPossibleTypes[LocalVariableDescriptor]

'getCollectedTypes' @ [192:29] ==> public abstract fun getCollectedTypes(key: DataFlowValue): Set<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[DeserializedSimpleFunctionDescriptor]

'dataFlowValue' @ [192:47] ==> val dataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getPossibleTypes[LocalVariableDescriptor]

'bindingContext' @ [196:31] ==> public final val bindingContext: BindingContext? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'listOf' @ [196:56] ==> @InlineOnly public inline fun <T> listOf(): List<ResolvedReferenceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedReferenceInfo

'body' @ [198:29] ==> value-parameter body: KtBlockExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[ValueParameterDescriptorImpl]

'collectDescendantsOfType' @ [198:34] ==> public inline fun <reified T : PsiElement> PsiElement.collectDescendantsOfType(noinline predicate: (KtSimpleNameExpression) -> Boolean = ...): List<KtSimpleNameExpression> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSimpleNameExpression

'it' @ [198:85] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo.<anonymous>[ValueParameterDescriptorImpl]

'resolveResult' @ [198:88] ==> internal var KtSimpleNameExpression.resolveResult: ResolveResult? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file ExtractionData.kt[PropertyDescriptorImpl]

'body' @ [200:23] ==> value-parameter body: KtBlockExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[ValueParameterDescriptorImpl]

'analyze' @ [200:28] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'ArrayList' @ [202:30] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ResolvedReferenceInfo

'newReferences' @ [203:24] ==> val newReferences: List<KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'newRef' @ [204:41] ==> val newRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'resolveResult' @ [204:48] ==> internal var KtSimpleNameExpression.resolveResult: ResolveResult? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file ExtractionData.kt[PropertyDescriptorImpl]

'newRef' @ [211:39] ==> val newRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'getQualifiedExpressionForSelector' @ [211:46] ==> public fun KtElement.getQualifiedExpressionForSelector(): KtQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'if (qualifiedExpression != null) {
                val smartCastTarget = originalResolveResult.originalRefExpr.parent as KtExpression
                smartCast = originalContext[BindingContext.SMARTCAST, smartCastTarget]?.defaultType
                possibleTypes = getPossibleTypes(smartCastTarget, originalResolveResult.resolvedCall, originalContext)
                val receiverDescriptor =
                        (originalResolveResult.resolvedCall?.dispatchReceiver as? ImplicitReceiver)?.declarationDescriptor
                shouldSkipPrimaryReceiver = smartCast == null
                                            && !DescriptorUtils.isCompanionObject(receiverDescriptor)
                                            && qualifiedExpression.receiverExpression !is KtSuperExpression
                if (shouldSkipPrimaryReceiver && !(originalResolveResult.resolvedCall?.hasBothReceivers() ?: false)) continue
            }
            else {
                if (newRef.getParentOfTypeAndBranch<KtCallableReferenceExpression> { callableReference } != null) continue
                smartCast = originalContext[BindingContext.SMARTCAST, originalResolveResult.originalRefExpr]?.defaultType
                possibleTypes = getPossibleTypes(originalResolveResult.originalRefExpr, originalResolveResult.resolvedCall, originalContext)
                shouldSkipPrimaryReceiver = false
            }' @ [212:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'qualifiedExpression' @ [212:17] ==> val qualifiedExpression: KtQualifiedExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'originalResolveResult' @ [213:39] ==> val originalResolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'originalRefExpr' @ [213:61] ==> public final val originalRefExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[PropertyDescriptorImpl]

'parent' @ [213:77] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'smartCast' @ [214:17] ==> val smartCast: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'originalContext' @ [214:29] ==> val originalContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'SMARTCAST' @ [214:60] ==> public final val SMARTCAST: (WritableSlice<(KtExpression..KtExpression?), (ExplicitSmartCasts..ExplicitSmartCasts?)>..WritableSlice<(KtExpression..KtExpression?), (ExplicitSmartCasts..ExplicitSmartCasts?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'smartCastTarget' @ [214:71] ==> val smartCastTarget: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'defaultType' @ [214:89] ==> public abstract val defaultType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.ExplicitSmartCasts[DeserializedPropertyDescriptor]

'possibleTypes' @ [215:17] ==> val possibleTypes: Set<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'getPossibleTypes' @ [215:33] ==> public final fun getPossibleTypes(expression: KtExpression, resolvedCall: ResolvedCall<*>?, context: BindingContext): Set<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[SimpleFunctionDescriptorImpl]

'smartCastTarget' @ [215:50] ==> val smartCastTarget: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'originalResolveResult' @ [215:67] ==> val originalResolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'resolvedCall' @ [215:89] ==> public final val resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[PropertyDescriptorImpl]

'originalContext' @ [215:103] ==> val originalContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'originalResolveResult' @ [217:26] ==> val originalResolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'resolvedCall' @ [217:48] ==> public final val resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[PropertyDescriptorImpl]

'dispatchReceiver' @ [217:62] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'declarationDescriptor' @ [217:102] ==> public abstract val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitReceiver[DeserializedPropertyDescriptor]

'shouldSkipPrimaryReceiver' @ [218:17] ==> val shouldSkipPrimaryReceiver: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'smartCast' @ [218:45] ==> val smartCast: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'!' @ [219:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isCompanionObject' @ [219:65] ==> public open fun isCompanionObject(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'receiverDescriptor' @ [219:83] ==> val receiverDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'qualifiedExpression' @ [220:48] ==> val qualifiedExpression: KtQualifiedExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'receiverExpression' @ [220:68] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'shouldSkipPrimaryReceiver' @ [221:21] ==> val shouldSkipPrimaryReceiver: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'!' @ [221:50] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'originalResolveResult' @ [221:52] ==> val originalResolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'resolvedCall' @ [221:74] ==> public final val resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[PropertyDescriptorImpl]

'hasBothReceivers' @ [221:88] ==> public fun ResolvedCall<*>.hasBothReceivers(): Boolean defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil[DeserializedSimpleFunctionDescriptor]

'newRef' @ [224:21] ==> val newRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [224:28] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtCallableReferenceExpression.() -> PsiElement?): KtCallableReferenceExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallableReferenceExpression

'callableReference' @ [224:86] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'smartCast' @ [225:17] ==> val smartCast: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'originalContext' @ [225:29] ==> val originalContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'SMARTCAST' @ [225:60] ==> public final val SMARTCAST: (WritableSlice<(KtExpression..KtExpression?), (ExplicitSmartCasts..ExplicitSmartCasts?)>..WritableSlice<(KtExpression..KtExpression?), (ExplicitSmartCasts..ExplicitSmartCasts?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'originalResolveResult' @ [225:71] ==> val originalResolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'originalRefExpr' @ [225:93] ==> public final val originalRefExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[PropertyDescriptorImpl]

'defaultType' @ [225:111] ==> public abstract val defaultType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.ExplicitSmartCasts[DeserializedPropertyDescriptor]

'possibleTypes' @ [226:17] ==> val possibleTypes: Set<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'getPossibleTypes' @ [226:33] ==> public final fun getPossibleTypes(expression: KtExpression, resolvedCall: ResolvedCall<*>?, context: BindingContext): Set<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[SimpleFunctionDescriptorImpl]

'originalResolveResult' @ [226:50] ==> val originalResolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'originalRefExpr' @ [226:72] ==> public final val originalRefExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[PropertyDescriptorImpl]

'originalResolveResult' @ [226:89] ==> val originalResolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'resolvedCall' @ [226:111] ==> public final val resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[PropertyDescriptorImpl]

'originalContext' @ [226:125] ==> val originalContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'shouldSkipPrimaryReceiver' @ [227:17] ==> val shouldSkipPrimaryReceiver: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'newRef' @ [230:26] ==> val newRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'parent' @ [230:33] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [233:17] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'==' @ [233:41] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.psi.KtUserType[DeserializedSimpleFunctionDescriptor]

'parent' @ [233:42] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'parent' @ [233:49] ==> public final val KtUserType.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'qualifier' @ [233:73] ==> public final val KtUserType.qualifier: KtUserType?[MyPropertyDescriptor]

'parent' @ [233:86] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'context' @ [235:30] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [235:53] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'newRef' @ [235:71] ==> val newRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'!' @ [236:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'compareDescriptors' @ [236:30] ==> public fun compareDescriptors(project: Project, currentDescriptor: DeclarationDescriptor?, originalDescriptor: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'project' @ [236:49] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'originalResolveResult' @ [236:58] ==> val originalResolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'descriptor' @ [236:80] ==> public final val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[PropertyDescriptorImpl]

'descriptor' @ [236:92] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'originalContext' @ [237:33] ==> val originalContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'diagnostics' @ [237:49] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'forElement' @ [237:61] ==> public abstract fun forElement(psiElement: PsiElement): Collection<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[DeserializedSimpleFunctionDescriptor]

'originalResolveResult' @ [237:72] ==> val originalResolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'originalRefExpr' @ [237:94] ==> public final val originalRefExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[PropertyDescriptorImpl]

'context' @ [237:114] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'diagnostics' @ [237:122] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'forElement' @ [237:134] ==> public abstract fun forElement(psiElement: PsiElement): Collection<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[DeserializedSimpleFunctionDescriptor]

'newRef' @ [237:145] ==> val newRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'smartCast' @ [238:31] ==> val smartCast: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'isBadRef' @ [239:17] ==> val isBadRef: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'!' @ [239:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'originalResolveResult' @ [239:30] ==> val originalResolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'declaration' @ [239:52] ==> public final val declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[PropertyDescriptorImpl]

'isInsideOf' @ [239:64] ==> public fun PsiElement.isInsideOf(elements: Iterable<PsiElement>): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'physicalElements' @ [239:75] ==> public final val physicalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'originalResolveResult' @ [240:44] ==> val originalResolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'resolvedCall' @ [240:66] ==> public final val resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[PropertyDescriptorImpl]

'originalResolvedCall' @ [241:44] ==> val originalResolvedCall: VariableAsFunctionResolvedCall? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'functionCall' @ [241:66] ==> public abstract val functionCall: ResolvedCall<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall[DeserializedPropertyDescriptor]

'originalResolvedCall' @ [242:44] ==> val originalResolvedCall: VariableAsFunctionResolvedCall? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'variableCall' @ [242:66] ==> public abstract val variableCall: ResolvedCall<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall[DeserializedPropertyDescriptor]

'originalFunctionCall' @ [243:40] ==> val originalFunctionCall: ResolvedCall<FunctionDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'resultingDescriptor' @ [243:62] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<FunctionDescriptor>.resultingDescriptor: FunctionDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'if (invokeDescriptor != null) {
                    val invokeDeclaration = getDeclaration(invokeDescriptor, context) ?: synthesizedInvokeDeclaration
                    val variableResolveResult = originalResolveResult.copy(resolvedCall = originalVariableCall!!,
                                                                           descriptor = originalVariableCall.resultingDescriptor)
                    val functionResolveResult = originalResolveResult.copy(resolvedCall = originalFunctionCall,
                                                                           descriptor = originalFunctionCall.resultingDescriptor,
                                                                           declaration = invokeDeclaration)
                    referencesInfo.add(ResolvedReferenceInfo(newRef, variableResolveResult, smartCast, possibleTypes, shouldSkipPrimaryReceiver))
                    referencesInfo.add(ResolvedReferenceInfo(newRef, functionResolveResult, smartCast, possibleTypes, shouldSkipPrimaryReceiver))
                }
                else {
                    referencesInfo.add(ResolvedReferenceInfo(newRef, originalResolveResult, smartCast, possibleTypes, shouldSkipPrimaryReceiver))
                }' @ [244:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'invokeDescriptor' @ [244:21] ==> val invokeDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'getDeclaration' @ [245:45] ==> private final tailrec fun getDeclaration(descriptor: DeclarationDescriptor, context: BindingContext): PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[SimpleFunctionDescriptorImpl]

'invokeDescriptor' @ [245:60] ==> val invokeDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'context' @ [245:78] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'synthesizedInvokeDeclaration' @ [245:90] ==> private final val synthesizedInvokeDeclaration: KtNamedFunction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'originalResolveResult' @ [246:49] ==> val originalResolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'copy' @ [246:71] ==> public final fun copy(originalRefExpr: KtSimpleNameExpression = ..., declaration: PsiElement = ..., descriptor: DeclarationDescriptor = ..., resolvedCall: ResolvedCall<*>? = ...): ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[SimpleFunctionDescriptorImpl]

'originalVariableCall' @ [246:91] ==> val originalVariableCall: ResolvedCall<VariableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'originalVariableCall' @ [247:89] ==> val originalVariableCall: ResolvedCall<VariableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'resultingDescriptor' @ [247:110] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<VariableDescriptor>.resultingDescriptor: VariableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> VariableDescriptor

'originalResolveResult' @ [248:49] ==> val originalResolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'copy' @ [248:71] ==> public final fun copy(originalRefExpr: KtSimpleNameExpression = ..., declaration: PsiElement = ..., descriptor: DeclarationDescriptor = ..., resolvedCall: ResolvedCall<*>? = ...): ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[SimpleFunctionDescriptorImpl]

'originalFunctionCall' @ [248:91] ==> val originalFunctionCall: ResolvedCall<FunctionDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'originalFunctionCall' @ [249:89] ==> val originalFunctionCall: ResolvedCall<FunctionDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'resultingDescriptor' @ [249:110] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<FunctionDescriptor>.resultingDescriptor: FunctionDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'invokeDeclaration' @ [250:90] ==> val invokeDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'referencesInfo' @ [251:21] ==> val referencesInfo: ArrayList<ResolvedReferenceInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'add' @ [251:36] ==> public open fun add(element: ResolvedReferenceInfo): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ResolvedReferenceInfo' @ [251:40] ==> public constructor ResolvedReferenceInfo(refExpr: KtSimpleNameExpression, resolveResult: ResolveResult, smartCast: KotlinType?, possibleTypes: Set<KotlinType>, shouldSkipPrimaryReceiver: Boolean) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolvedReferenceInfo[ClassConstructorDescriptorImpl]

'newRef' @ [251:62] ==> val newRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'variableResolveResult' @ [251:70] ==> val variableResolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'smartCast' @ [251:93] ==> val smartCast: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'possibleTypes' @ [251:104] ==> val possibleTypes: Set<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'shouldSkipPrimaryReceiver' @ [251:119] ==> val shouldSkipPrimaryReceiver: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'referencesInfo' @ [252:21] ==> val referencesInfo: ArrayList<ResolvedReferenceInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'add' @ [252:36] ==> public open fun add(element: ResolvedReferenceInfo): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ResolvedReferenceInfo' @ [252:40] ==> public constructor ResolvedReferenceInfo(refExpr: KtSimpleNameExpression, resolveResult: ResolveResult, smartCast: KotlinType?, possibleTypes: Set<KotlinType>, shouldSkipPrimaryReceiver: Boolean) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolvedReferenceInfo[ClassConstructorDescriptorImpl]

'newRef' @ [252:62] ==> val newRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'functionResolveResult' @ [252:70] ==> val functionResolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'smartCast' @ [252:93] ==> val smartCast: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'possibleTypes' @ [252:104] ==> val possibleTypes: Set<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'shouldSkipPrimaryReceiver' @ [252:119] ==> val shouldSkipPrimaryReceiver: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'referencesInfo' @ [255:21] ==> val referencesInfo: ArrayList<ResolvedReferenceInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'add' @ [255:36] ==> public open fun add(element: ResolvedReferenceInfo): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ResolvedReferenceInfo' @ [255:40] ==> public constructor ResolvedReferenceInfo(refExpr: KtSimpleNameExpression, resolveResult: ResolveResult, smartCast: KotlinType?, possibleTypes: Set<KotlinType>, shouldSkipPrimaryReceiver: Boolean) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolvedReferenceInfo[ClassConstructorDescriptorImpl]

'newRef' @ [255:62] ==> val newRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'originalResolveResult' @ [255:70] ==> val originalResolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'smartCast' @ [255:93] ==> val smartCast: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'possibleTypes' @ [255:104] ==> val possibleTypes: Set<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'shouldSkipPrimaryReceiver' @ [255:119] ==> val shouldSkipPrimaryReceiver: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'referencesInfo' @ [260:16] ==> val referencesInfo: ArrayList<ResolvedReferenceInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData.getBrokenReferencesInfo[LocalVariableDescriptor]

'expressions' @ [264:9] ==> public final val expressions: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'forEach' @ [264:21] ==> @HidesMembers public inline fun <T> Iterable<KtExpression>.forEach(action: (KtExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'unmarkReferencesInside' @ [264:31] ==> public fun unmarkReferencesInside(root: PsiElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file ExtractionData.kt[SimpleFunctionDescriptorImpl]

'!' @ [269:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'root' @ [269:10] ==> value-parameter root: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.unmarkReferencesInside[ValueParameterDescriptorImpl]

'isValid' @ [269:15] ==> public final val PsiElement.isValid: Boolean[MyPropertyDescriptor]

'root' @ [270:5] ==> value-parameter root: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.unmarkReferencesInside[ValueParameterDescriptorImpl]

'forEachDescendantOfType' @ [270:10] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtSimpleNameExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSimpleNameExpression

'it' @ [270:60] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.unmarkReferencesInside.<anonymous>[ValueParameterDescriptorImpl]

'resolveResult' @ [270:63] ==> internal var KtSimpleNameExpression.resolveResult: ResolveResult? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file ExtractionData.kt[PropertyDescriptorImpl]

