'DescriptorRenderer' @ [50:36] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'SHORT_NAMES_IN_TYPES' @ [50:55] ==> @field:JvmField public final val SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'withOptions' @ [50:76] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'parameterNamesInFunctionalTypes' @ [50:90] ==> public abstract var parameterNamesInFunctionalTypes: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'if (descriptor is CallableMemberDescriptor)
            DescriptorUtils.unwrapFakeOverride(descriptor)
        else
            descriptor' @ [59:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DeclarationDescriptor, elseBranch: DeclarationDescriptor): DeclarationDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DeclarationDescriptor

'descriptor' @ [59:31] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElement[ValueParameterDescriptorImpl]

'unwrapFakeOverride' @ [60:29] ==> @NotNull public open fun <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> unwrapFakeOverride(@NotNull p0: CallableMemberDescriptor): CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> -> CallableMemberDescriptor

'descriptor' @ [60:48] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElement[ValueParameterDescriptorImpl]

'descriptor' @ [62:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElement[ValueParameterDescriptorImpl]

'createLookupElementUnwrappedDescriptor' @ [63:16] ==> private final fun createLookupElementUnwrappedDescriptor(descriptor: DeclarationDescriptor, qualifyNestedClasses: Boolean, includeClassTypeArguments: Boolean, parametersAndTypeGrayed: Boolean): LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[SimpleFunctionDescriptorImpl]

'_descriptor' @ [63:55] ==> val _descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElement[LocalVariableDescriptor]

'qualifyNestedClasses' @ [63:68] ==> value-parameter qualifyNestedClasses: Boolean = ... defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElement[ValueParameterDescriptorImpl]

'includeClassTypeArguments' @ [63:90] ==> value-parameter includeClassTypeArguments: Boolean = ... defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElement[ValueParameterDescriptorImpl]

'parametersAndTypeGrayed' @ [63:117] ==> value-parameter parametersAndTypeGrayed: Boolean = ... defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElement[ValueParameterDescriptorImpl]

'DeclarationLookupObjectImpl' @ [67:37] ==> public constructor DeclarationLookupObjectImpl(descriptor: DeclarationDescriptor?) defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[ClassConstructorDescriptorImpl]

'psiClass' @ [69:25] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[ValueParameterDescriptorImpl]

'psiClass' @ [70:48] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[ValueParameterDescriptorImpl]

'getIcon' @ [70:57] ==> public abstract fun getIcon(@Iconable.IconFlags p0: Int): (Icon..Icon?) defined in com.intellij.psi.PsiClass[JavaMethodDescriptor]

'flags' @ [70:65] ==> value-parameter flags: Int defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass.<no name provided>.getIcon[ValueParameterDescriptorImpl]

'create' @ [72:44] ==> public open fun create(@NotNull p0: Any, @NotNull p1: String): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'lookupObject' @ [72:51] ==> val lookupObject: <no name provided> defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'psiClass' @ [72:65] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[ValueParameterDescriptorImpl]

'name' @ [72:74] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'withInsertHandler' @ [73:18] ==> @Contract public open fun withInsertHandler(@Nullable p0: InsertHandler<(LookupElement..LookupElement?)>?): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'KotlinClassifierInsertHandler' @ [73:36] ==> public object KotlinClassifierInsertHandler : BaseDeclarationInsertHandler defined in org.jetbrains.kotlin.idea.completion.handlers in file KotlinClassifierInsertHandler.kt[FakeCallableDescriptorForObject]

'psiClass' @ [75:26] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[ValueParameterDescriptorImpl]

'typeParameters' @ [75:35] ==> public final val PsiClass.typeParameters: (Array<(PsiTypeParameter..PsiTypeParameter?)>..Array<out (PsiTypeParameter..PsiTypeParameter?)>)[MyPropertyDescriptor]

'includeClassTypeArguments' @ [76:13] ==> value-parameter includeClassTypeArguments: Boolean = ... defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[ValueParameterDescriptorImpl]

'typeParams' @ [76:42] ==> val typeParams: (Array<(PsiTypeParameter..PsiTypeParameter?)>..Array<out (PsiTypeParameter..PsiTypeParameter?)>) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'isNotEmpty' @ [76:53] ==> @InlineOnly public inline fun <T> Array<out (PsiTypeParameter..PsiTypeParameter?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiTypeParameter..com.intellij.psi.PsiTypeParameter?)

'element' @ [77:13] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'element' @ [77:23] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'appendTailText' @ [77:31] ==> @Contract public open fun appendTailText(@NotNull p0: String, p1: Boolean): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'typeParams' @ [77:46] ==> val typeParams: (Array<(PsiTypeParameter..PsiTypeParameter?)>..Array<out (PsiTypeParameter..PsiTypeParameter?)>) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'map' @ [77:57] ==> public inline fun <T, R> Array<out (PsiTypeParameter..PsiTypeParameter?)>.map(transform: ((PsiTypeParameter..PsiTypeParameter?)) -> String?): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiTypeParameter..com.intellij.psi.PsiTypeParameter?)
    <R> -> String?

'it' @ [77:63] ==> value-parameter it: (PsiTypeParameter..PsiTypeParameter?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [77:66] ==> public final val PsiTypeParameter.name: String?[MyPropertyDescriptor]

'joinToString' @ [77:73] ==> public fun <T> Iterable<String?>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String?) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'psiClass' @ [80:29] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[ValueParameterDescriptorImpl]

'qualifiedName' @ [80:38] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'qualifiedName' @ [81:29] ==> val qualifiedName: String defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'substringBeforeLast' @ [81:43] ==> public fun String.substringBeforeLast(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ROOT' @ [81:75] ==> public final val ROOT: (FqName..FqName?) defined in org.jetbrains.kotlin.name.FqName[JavaPropertyDescriptor]

'toString' @ [81:80] ==> public open fun toString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'qualifyNestedClasses' @ [83:13] ==> value-parameter qualifyNestedClasses: Boolean = ... defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[ValueParameterDescriptorImpl]

'psiClass' @ [84:29] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[ValueParameterDescriptorImpl]

'parents' @ [84:38] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'takeWhile' @ [84:46] ==> public fun <T> Sequence<PsiElement>.takeWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [84:58] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass.<anonymous>[ValueParameterDescriptorImpl]

'count' @ [84:75] ==> public fun <T> Sequence<PsiElement>.count(): Int defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'nestLevel' @ [85:17] ==> val nestLevel: Int defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'psiClass' @ [86:32] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[ValueParameterDescriptorImpl]

'name' @ [86:41] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'..' @ [87:27] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'nestLevel' @ [87:30] ==> val nestLevel: Int defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'containerName' @ [88:42] ==> var containerName: String defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'substringAfterLast' @ [88:56] ==> public fun String.substringAfterLast(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'element' @ [89:21] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'element' @ [89:31] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'withLookupString' @ [89:39] ==> @Contract public open fun withLookupString(@NotNull p0: String): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'outerClassName' @ [89:56] ==> val outerClassName: String defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'itemText' @ [90:21] ==> var itemText: String? defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'outerClassName' @ [90:32] ==> val outerClassName: String defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'itemText' @ [90:55] ==> var itemText: String? defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'containerName' @ [91:21] ==> var containerName: String defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'containerName' @ [91:37] ==> var containerName: String defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'substringBeforeLast' @ [91:51] ==> public fun String.substringBeforeLast(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ROOT' @ [91:83] ==> public final val ROOT: (FqName..FqName?) defined in org.jetbrains.kotlin.name.FqName[JavaPropertyDescriptor]

'toString' @ [91:88] ==> public open fun toString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'element' @ [93:17] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'element' @ [93:27] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'withPresentableText' @ [93:35] ==> @Contract public open fun withPresentableText(@NotNull p0: String): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'itemText' @ [93:55] ==> var itemText: String? defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'element' @ [97:9] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'element' @ [97:19] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'appendTailText' @ [97:27] ==> @Contract public open fun appendTailText(@NotNull p0: String, p1: Boolean): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'containerName' @ [97:46] ==> var containerName: String defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'lookupObject' @ [99:13] ==> val lookupObject: <no name provided> defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'isDeprecated' @ [99:26] ==> public open val isDeprecated: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass.<no name provided>[PropertyDescriptorImpl]

'element' @ [100:13] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'element' @ [100:23] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'withStrikeoutness' @ [100:31] ==> @Contract public open fun withStrikeoutness(p0: Boolean): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'element' @ [103:16] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForJavaClass[LocalVariableDescriptor]

'withIconFromLookupObject' @ [103:24] ==> private final fun LookupElement.withIconFromLookupObject(): LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[SimpleFunctionDescriptorImpl]

'create' @ [107:44] ==> public open fun create(@NotNull p0: Any, @NotNull p1: String): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'PackageLookupObject' @ [107:51] ==> public constructor PackageLookupObject(fqName: FqName) defined in org.jetbrains.kotlin.idea.core.completion.PackageLookupObject[DeserializedClassConstructorDescriptor]

'name' @ [107:71] ==> value-parameter name: FqName defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForPackage[ValueParameterDescriptorImpl]

'name' @ [107:78] ==> value-parameter name: FqName defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForPackage[ValueParameterDescriptorImpl]

'shortName' @ [107:83] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'asString' @ [107:95] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'element' @ [109:9] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForPackage[LocalVariableDescriptor]

'element' @ [109:19] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForPackage[LocalVariableDescriptor]

'withInsertHandler' @ [109:27] ==> @Contract public open fun withInsertHandler(@Nullable p0: InsertHandler<(LookupElement..LookupElement?)>?): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'BaseDeclarationInsertHandler' @ [109:45] ==> public constructor BaseDeclarationInsertHandler() defined in org.jetbrains.kotlin.idea.completion.handlers.BaseDeclarationInsertHandler[ClassConstructorDescriptorImpl]

'!' @ [111:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'name' @ [111:14] ==> value-parameter name: FqName defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForPackage[ValueParameterDescriptorImpl]

'parent' @ [111:19] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'isRoot' @ [111:28] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'element' @ [112:13] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForPackage[LocalVariableDescriptor]

'element' @ [112:23] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForPackage[LocalVariableDescriptor]

'appendTailText' @ [112:31] ==> @Contract public open fun appendTailText(@NotNull p0: String, p1: Boolean): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'name' @ [112:51] ==> value-parameter name: FqName defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForPackage[ValueParameterDescriptorImpl]

'asString' @ [112:56] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'element' @ [115:16] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementForPackage[LocalVariableDescriptor]

'withIconFromLookupObject' @ [115:24] ==> private final fun LookupElement.withIconFromLookupObject(): LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[SimpleFunctionDescriptorImpl]

'getValue' @ [124:32] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'DescriptorToSourceUtilsIde' @ [124:39] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [124:66] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [124:84] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[PropertyDescriptorImpl]

'descriptor' @ [124:93] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [126:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'declarationLazy' @ [127:13] ==> val declarationLazy: PsiElement? defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'declarationLazy' @ [128:13] ==> val declarationLazy: PsiElement? defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'createLookupElementForJavaClass' @ [132:20] ==> public final fun createLookupElementForJavaClass(psiClass: PsiClass, qualifyNestedClasses: Boolean = ..., includeClassTypeArguments: Boolean = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[SimpleFunctionDescriptorImpl]

'declarationLazy' @ [132:52] ==> val declarationLazy: PsiElement? defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'qualifyNestedClasses' @ [132:69] ==> value-parameter qualifyNestedClasses: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'includeClassTypeArguments' @ [132:91] ==> value-parameter includeClassTypeArguments: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [135:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'createLookupElementForPackage' @ [136:20] ==> public final fun createLookupElementForPackage(name: FqName): LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [136:50] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'fqName' @ [136:61] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'descriptor' @ [138:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'createLookupElementForPackage' @ [139:20] ==> public final fun createLookupElementForPackage(name: FqName): LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [139:50] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'fqName' @ [139:61] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'when (descriptor) {
            is ConstructorDescriptor -> {
                // for constructor use name and icon of containing class
                val classifierDescriptor = descriptor.containingDeclaration
                lookupObject = object : DeclarationLookupObjectImpl(descriptor) {
                    override val psiElement by lazy { DescriptorToSourceUtilsIde.getAnyDeclaration(project, classifierDescriptor) }
                    override fun getIcon(flags: Int) = KotlinDescriptorIconProvider.getIcon(classifierDescriptor, psiElement, flags)
                }
                classifierDescriptor.name.asString()
            }

            is SyntheticJavaPropertyDescriptor -> {
                lookupObject = object : DeclarationLookupObjectImpl(descriptor) {
                    override val psiElement by lazy { DescriptorToSourceUtilsIde.getAnyDeclaration(project, descriptor.getMethod) }
                    override fun getIcon(flags: Int) = KotlinDescriptorIconProvider.getIcon(descriptor, null, flags)
                }
                descriptor.name.asString()
            }

            else -> {
                lookupObject = object : DeclarationLookupObjectImpl(descriptor) {
                    override val psiElement by lazy { DescriptorToSourceUtils.getSourceFromDescriptor(descriptor) }

                    override fun getIcon(flags: Int) = KotlinDescriptorIconProvider.getIcon(descriptor, psiElement, flags)
                }
                descriptor.name.asString()
            }
        }' @ [143:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'descriptor' @ [143:34] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [146:44] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'containingDeclaration' @ [146:55] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'lookupObject' @ [147:17] ==> val lookupObject: DeclarationLookupObject defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'DeclarationLookupObjectImpl' @ [147:41] ==> public constructor DeclarationLookupObjectImpl(descriptor: DeclarationDescriptor?) defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [147:69] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'getValue' @ [148:48] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'DescriptorToSourceUtilsIde' @ [148:55] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [148:82] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [148:100] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[PropertyDescriptorImpl]

'classifierDescriptor' @ [148:109] ==> val classifierDescriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'getIcon' @ [149:85] ==> @Nullable public open fun getIcon(@NotNull p0: DeclarationDescriptor, @Nullable p1: PsiElement?, @Iconable.IconFlags p2: Int): Icon? defined in org.jetbrains.kotlin.idea.KotlinDescriptorIconProvider[JavaMethodDescriptor]

'classifierDescriptor' @ [149:93] ==> val classifierDescriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'psiElement' @ [149:115] ==> public open val psiElement: PsiElement? defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor.<no name provided>[PropertyDescriptorImpl]

'flags' @ [149:127] ==> value-parameter flags: Int defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor.<no name provided>.getIcon[ValueParameterDescriptorImpl]

'classifierDescriptor' @ [151:17] ==> val classifierDescriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'name' @ [151:38] ==> public final val ClassifierDescriptorWithTypeParameters.name: Name[MyPropertyDescriptor]

'asString' @ [151:43] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'lookupObject' @ [155:17] ==> val lookupObject: DeclarationLookupObject defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'DeclarationLookupObjectImpl' @ [155:41] ==> public constructor DeclarationLookupObjectImpl(descriptor: DeclarationDescriptor?) defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [155:69] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'getValue' @ [156:48] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'DescriptorToSourceUtilsIde' @ [156:55] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [156:82] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [156:100] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[PropertyDescriptorImpl]

'descriptor' @ [156:109] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'getMethod' @ [156:120] ==> public abstract val getMethod: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor[DeserializedPropertyDescriptor]

'getIcon' @ [157:85] ==> @Nullable public open fun getIcon(@NotNull p0: DeclarationDescriptor, @Nullable p1: PsiElement?, @Iconable.IconFlags p2: Int): Icon? defined in org.jetbrains.kotlin.idea.KotlinDescriptorIconProvider[JavaMethodDescriptor]

'descriptor' @ [157:93] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'flags' @ [157:111] ==> value-parameter flags: Int defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor.<no name provided>.getIcon[ValueParameterDescriptorImpl]

'descriptor' @ [159:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'name' @ [159:28] ==> public final val SyntheticJavaPropertyDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [159:33] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'lookupObject' @ [163:17] ==> val lookupObject: DeclarationLookupObject defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'DeclarationLookupObjectImpl' @ [163:41] ==> public constructor DeclarationLookupObjectImpl(descriptor: DeclarationDescriptor?) defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [163:69] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'getValue' @ [164:48] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'DescriptorToSourceUtils' @ [164:55] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'getSourceFromDescriptor' @ [164:79] ==> @JvmStatic public final fun getSourceFromDescriptor(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [164:103] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'getIcon' @ [166:85] ==> @Nullable public open fun getIcon(@NotNull p0: DeclarationDescriptor, @Nullable p1: PsiElement?, @Iconable.IconFlags p2: Int): Icon? defined in org.jetbrains.kotlin.idea.KotlinDescriptorIconProvider[JavaMethodDescriptor]

'descriptor' @ [166:93] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'psiElement' @ [166:105] ==> public open val psiElement: PsiElement? defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor.<no name provided>[PropertyDescriptorImpl]

'flags' @ [166:117] ==> value-parameter flags: Int defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor.<no name provided>.getIcon[ValueParameterDescriptorImpl]

'descriptor' @ [168:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'name' @ [168:28] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [168:33] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'create' @ [172:44] ==> public open fun create(@NotNull p0: Any, @NotNull p1: String): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'lookupObject' @ [172:51] ==> val lookupObject: DeclarationLookupObject defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'name' @ [172:65] ==> val name: String defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'insertHandlerProvider' @ [174:29] ==> public final val insertHandlerProvider: InsertHandlerProvider defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[PropertyDescriptorImpl]

'insertHandler' @ [174:51] ==> public final fun insertHandler(descriptor: DeclarationDescriptor): InsertHandler<LookupElement> defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider[SimpleFunctionDescriptorImpl]

'descriptor' @ [174:65] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'element' @ [175:9] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'element' @ [175:19] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'withInsertHandler' @ [175:27] ==> @Contract public open fun withInsertHandler(@Nullable p0: InsertHandler<(LookupElement..LookupElement?)>?): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'insertHandler' @ [175:45] ==> val insertHandler: InsertHandler<LookupElement> defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'when (descriptor) {
            is FunctionDescriptor -> {
                val returnType = descriptor.returnType
                element = element.withTypeText(if (returnType != null) SHORT_NAMES_RENDERER.renderType(returnType) else "", parametersAndTypeGrayed)

                val insertsLambda = (insertHandler as? KotlinFunctionInsertHandler.Normal)?.lambdaInfo != null
                if (insertsLambda) {
                    element = element.appendTailText(" {...} ", parametersAndTypeGrayed)
                }

                element = element.appendTailText(SHORT_NAMES_RENDERER.renderFunctionParameters(descriptor), parametersAndTypeGrayed || insertsLambda)
            }

            is VariableDescriptor -> {
                element = element.withTypeText(SHORT_NAMES_RENDERER.renderType(descriptor.type), parametersAndTypeGrayed)
            }

            is ClassifierDescriptorWithTypeParameters -> {
                val typeParams = descriptor.declaredTypeParameters
                if (includeClassTypeArguments && typeParams.isNotEmpty()) {
                    element = element.appendTailText(typeParams.joinToString(", ", "<", ">") { it.name.asString() }, true)
                }

                var container = descriptor.containingDeclaration

                if (descriptor.isArtificialImportAliasedDescriptor) {
                    container = descriptor.original // we show original descriptor instead of container for import aliased descriptors
                }
                else if (qualifyNestedClasses) {
                    element = element.withPresentableText(SHORT_NAMES_RENDERER.renderClassifierName(descriptor))

                    while (container is ClassDescriptor) {
                        val containerName = container.name
                        if (!containerName.isSpecial) {
                            element = element.withLookupString(containerName.asString())
                        }
                        container = container.containingDeclaration
                    }
                }

                if (container is PackageFragmentDescriptor || container is ClassifierDescriptor) {
                    element = element.appendTailText(" (" + DescriptorUtils.getFqName(container) + ")", true)
                }

                if (descriptor is TypeAliasDescriptor) {
                    // here we render with DescriptorRenderer.SHORT_NAMES_IN_TYPES to include parameter names in functional types
                    element = element.withTypeText(DescriptorRenderer.SHORT_NAMES_IN_TYPES.renderType(descriptor.underlyingType), false)
                }
            }

            else -> {
                element = element.withTypeText(SHORT_NAMES_RENDERER.render(descriptor), parametersAndTypeGrayed)
            }
        }' @ [177:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'descriptor' @ [177:15] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [179:34] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'returnType' @ [179:45] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'element' @ [180:17] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'element' @ [180:27] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'withTypeText' @ [180:35] ==> @Contract public open fun withTypeText(@Nullable p0: String?, p1: Boolean): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'if (returnType != null) SHORT_NAMES_RENDERER.renderType(returnType) else ""' @ [180:48] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'returnType' @ [180:52] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'SHORT_NAMES_RENDERER' @ [180:72] ==> public final val SHORT_NAMES_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.Companion[PropertyDescriptorImpl]

'renderType' @ [180:93] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'returnType' @ [180:104] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'parametersAndTypeGrayed' @ [180:125] ==> value-parameter parametersAndTypeGrayed: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'!=' @ [182:37] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.idea.completion.handlers.GenerateLambdaInfo[DeserializedSimpleFunctionDescriptor]

'insertHandler' @ [182:38] ==> val insertHandler: InsertHandler<LookupElement> defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'lambdaInfo' @ [182:93] ==> public final val lambdaInfo: GenerateLambdaInfo? defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinFunctionInsertHandler.Normal[PropertyDescriptorImpl]

'insertsLambda' @ [183:21] ==> val insertsLambda: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'element' @ [184:21] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'element' @ [184:31] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'appendTailText' @ [184:39] ==> @Contract public open fun appendTailText(@NotNull p0: String, p1: Boolean): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'parametersAndTypeGrayed' @ [184:65] ==> value-parameter parametersAndTypeGrayed: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'element' @ [187:17] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'element' @ [187:27] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'appendTailText' @ [187:35] ==> @Contract public open fun appendTailText(@NotNull p0: String, p1: Boolean): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'SHORT_NAMES_RENDERER' @ [187:50] ==> public final val SHORT_NAMES_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.Companion[PropertyDescriptorImpl]

'renderFunctionParameters' @ [187:71] ==> public final fun renderFunctionParameters(functionDescriptor: FunctionDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [187:96] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'parametersAndTypeGrayed' @ [187:109] ==> value-parameter parametersAndTypeGrayed: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'insertsLambda' @ [187:136] ==> val insertsLambda: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'element' @ [191:17] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'element' @ [191:27] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'withTypeText' @ [191:35] ==> @Contract public open fun withTypeText(@Nullable p0: String?, p1: Boolean): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'SHORT_NAMES_RENDERER' @ [191:48] ==> public final val SHORT_NAMES_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.Companion[PropertyDescriptorImpl]

'renderType' @ [191:69] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [191:80] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'type' @ [191:91] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'parametersAndTypeGrayed' @ [191:98] ==> value-parameter parametersAndTypeGrayed: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [195:34] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'declaredTypeParameters' @ [195:45] ==> public final val ClassifierDescriptorWithTypeParameters.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'includeClassTypeArguments' @ [196:21] ==> value-parameter includeClassTypeArguments: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'typeParams' @ [196:50] ==> val typeParams: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'isNotEmpty' @ [196:61] ==> @InlineOnly public inline fun <T> Collection<(TypeParameterDescriptor..TypeParameterDescriptor?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'element' @ [197:21] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'element' @ [197:31] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'appendTailText' @ [197:39] ==> @Contract public open fun appendTailText(@NotNull p0: String, p1: Boolean): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'typeParams' @ [197:54] ==> val typeParams: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'joinToString' @ [197:65] ==> public fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((TypeParameterDescriptor..TypeParameterDescriptor?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'it' @ [197:96] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [197:99] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [197:104] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'descriptor' @ [200:33] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'containingDeclaration' @ [200:44] ==> public final val ClassifierDescriptorWithTypeParameters.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'if (descriptor.isArtificialImportAliasedDescriptor) {
                    container = descriptor.original // we show original descriptor instead of container for import aliased descriptors
                }
                else if (qualifyNestedClasses) {
                    element = element.withPresentableText(SHORT_NAMES_RENDERER.renderClassifierName(descriptor))

                    while (container is ClassDescriptor) {
                        val containerName = container.name
                        if (!containerName.isSpecial) {
                            element = element.withLookupString(containerName.asString())
                        }
                        container = container.containingDeclaration
                    }
                }' @ [202:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'descriptor' @ [202:21] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'isArtificialImportAliasedDescriptor' @ [202:32] ==> public val DeclarationDescriptor.isArtificialImportAliasedDescriptor: Boolean defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[PropertyDescriptorImpl]

'container' @ [203:21] ==> var container: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'descriptor' @ [203:33] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'original' @ [203:44] ==> public final val ClassifierDescriptorWithTypeParameters.original: ClassifierDescriptor[MyPropertyDescriptor]

'qualifyNestedClasses' @ [205:26] ==> value-parameter qualifyNestedClasses: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'element' @ [206:21] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'element' @ [206:31] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'withPresentableText' @ [206:39] ==> @Contract public open fun withPresentableText(@NotNull p0: String): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'SHORT_NAMES_RENDERER' @ [206:59] ==> public final val SHORT_NAMES_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.Companion[PropertyDescriptorImpl]

'renderClassifierName' @ [206:80] ==> public abstract fun renderClassifierName(klass: ClassifierDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [206:101] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'container' @ [208:28] ==> var container: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'container' @ [209:45] ==> var container: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'name' @ [209:55] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'!' @ [210:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containerName' @ [210:30] ==> val containerName: Name defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'isSpecial' @ [210:44] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'element' @ [211:29] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'element' @ [211:39] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'withLookupString' @ [211:47] ==> @Contract public open fun withLookupString(@NotNull p0: String): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'containerName' @ [211:64] ==> val containerName: Name defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'asString' @ [211:78] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'container' @ [213:25] ==> var container: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'container' @ [213:37] ==> var container: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'containingDeclaration' @ [213:47] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'container' @ [217:21] ==> var container: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'container' @ [217:63] ==> var container: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'element' @ [218:21] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'element' @ [218:31] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'appendTailText' @ [218:39] ==> @Contract public open fun appendTailText(@NotNull p0: String, p1: Boolean): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'+' @ [218:54] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getFqName' @ [218:77] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'container' @ [218:87] ==> var container: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'descriptor' @ [221:21] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'element' @ [223:21] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'element' @ [223:31] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'withTypeText' @ [223:39] ==> @Contract public open fun withTypeText(@Nullable p0: String?, p1: Boolean): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'SHORT_NAMES_IN_TYPES' @ [223:71] ==> @field:JvmField public final val SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'renderType' @ [223:92] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [223:103] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'underlyingType' @ [223:114] ==> public abstract val underlyingType: SimpleType defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'element' @ [228:17] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'element' @ [228:27] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'withTypeText' @ [228:35] ==> @Contract public open fun withTypeText(@Nullable p0: String?, p1: Boolean): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'SHORT_NAMES_RENDERER' @ [228:48] ==> public final val SHORT_NAMES_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.Companion[PropertyDescriptorImpl]

'render' @ [228:69] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [228:76] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'parametersAndTypeGrayed' @ [228:89] ==> value-parameter parametersAndTypeGrayed: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [232:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'appendContainerAndReceiverInformation' @ [233:13] ==> public final fun appendContainerAndReceiverInformation(descriptor: CallableDescriptor, appendTailText: (String) -> Unit): Unit defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [233:51] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'element' @ [233:65] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'element' @ [233:75] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'appendTailText' @ [233:83] ==> @Contract public open fun appendTailText(@NotNull p0: String, p1: Boolean): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'it' @ [233:98] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [236:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'getterName' @ [237:37] ==> @NotNull public open fun getterName(@NotNull p0: String): String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'name' @ [237:48] ==> val name: String defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'getterName' @ [238:17] ==> val getterName: String defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'name' @ [238:31] ==> val name: String defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'element' @ [239:17] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'element' @ [239:27] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'withLookupString' @ [239:35] ==> @Contract public open fun withLookupString(@NotNull p0: String): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'getterName' @ [239:52] ==> val getterName: String defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'descriptor' @ [241:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[ValueParameterDescriptorImpl]

'isVar' @ [241:28] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'element' @ [242:17] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'element' @ [242:27] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'withLookupString' @ [242:35] ==> @Contract public open fun withLookupString(@NotNull p0: String): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'setterName' @ [242:59] ==> @NotNull public open fun setterName(@NotNull p0: String): String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'name' @ [242:70] ==> val name: String defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'lookupObject' @ [246:13] ==> val lookupObject: DeclarationLookupObject defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'isDeprecated' @ [246:26] ==> public abstract val isDeprecated: Boolean defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'element' @ [247:13] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'element' @ [247:23] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'withStrikeoutness' @ [247:31] ==> @Contract public open fun withStrikeoutness(p0: Boolean): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'!=' @ [250:13] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.idea.completion.handlers.GenerateLambdaInfo[DeserializedSimpleFunctionDescriptor]

'insertHandler' @ [250:14] ==> val insertHandler: InsertHandler<LookupElement> defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'lambdaInfo' @ [250:69] ==> public final val lambdaInfo: GenerateLambdaInfo? defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinFunctionInsertHandler.Normal[PropertyDescriptorImpl]

'element' @ [251:13] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'putUserData' @ [251:21] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(Unit..Unit?)>, @Nullable p1: Unit?): Unit defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Unit..kotlin.Unit?)

'ACCEPT_OPENING_BRACE' @ [251:60] ==> public final val ACCEPT_OPENING_BRACE: Key<Unit> defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.Companion[PropertyDescriptorImpl]

'Unit' @ [251:82] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'element' @ [254:16] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.createLookupElementUnwrappedDescriptor[LocalVariableDescriptor]

'withIconFromLookupObject' @ [254:24] ==> private final fun LookupElement.withIconFromLookupObject(): LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[SimpleFunctionDescriptorImpl]

'CompletionInformationProvider' @ [258:27] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.CompletionInformationProvider[FakeCallableDescriptorForObject]

'EP_NAME' @ [258:57] ==> public final val EP_NAME: ExtensionPointName<CompletionInformationProvider> defined in org.jetbrains.kotlin.idea.completion.CompletionInformationProvider.Companion[PropertyDescriptorImpl]

'extensions' @ [258:65] ==> public final val <T : (Any..Any?)> ExtensionPointName<CompletionInformationProvider>.extensions: (Array<(CompletionInformationProvider..CompletionInformationProvider?)>..Array<out (CompletionInformationProvider..CompletionInformationProvider?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CompletionInformationProvider

'firstNotNullResult' @ [258:76] ==> public inline fun <T, R : Any> Array<(CompletionInformationProvider..CompletionInformationProvider?)>.firstNotNullResult(transform: ((CompletionInformationProvider..CompletionInformationProvider?)) -> String?): String? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.completion.CompletionInformationProvider..org.jetbrains.kotlin.idea.completion.CompletionInformationProvider?)
    <R : Any> -> String

'it' @ [259:13] ==> value-parameter it: (CompletionInformationProvider..CompletionInformationProvider?) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.appendContainerAndReceiverInformation.<anonymous>[ValueParameterDescriptorImpl]

'getContainerAndReceiverInformation' @ [259:16] ==> public abstract fun getContainerAndReceiverInformation(descriptor: DeclarationDescriptor): String? defined in org.jetbrains.kotlin.idea.completion.CompletionInformationProvider[SimpleFunctionDescriptorImpl]

'descriptor' @ [259:51] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.appendContainerAndReceiverInformation[ValueParameterDescriptorImpl]

'information' @ [262:13] ==> val information: String? defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.appendContainerAndReceiverInformation[LocalVariableDescriptor]

'invoke' @ [263:13] ==> public abstract operator fun invoke(p1: String): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'information' @ [263:28] ==> val information: String? defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.appendContainerAndReceiverInformation[LocalVariableDescriptor]

'descriptor' @ [267:33] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.appendContainerAndReceiverInformation[ValueParameterDescriptorImpl]

'original' @ [267:44] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'extensionReceiverParameter' @ [267:53] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'extensionReceiver' @ [268:13] ==> val extensionReceiver: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.appendContainerAndReceiverInformation[LocalVariableDescriptor]

'when {
                descriptor is SamAdapterExtensionFunctionDescriptor -> {
                    // no need to show them as extensions
                    return
                }

                descriptor is SyntheticJavaPropertyDescriptor -> {
                    var from = descriptor.getMethod.name.asString() + "()"
                    descriptor.setMethod?.let { from += "/" + it.name.asString() + "()" }
                    appendTailText(" (from $from)")
                    return
                }

                else -> {
                    val receiverPresentation = SHORT_NAMES_RENDERER.renderType(extensionReceiver.type)
                    appendTailText(" for $receiverPresentation")
                }
            }' @ [269:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'descriptor' @ [270:17] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.appendContainerAndReceiverInformation[ValueParameterDescriptorImpl]

'descriptor' @ [275:17] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.appendContainerAndReceiverInformation[ValueParameterDescriptorImpl]

'descriptor' @ [276:32] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.appendContainerAndReceiverInformation[ValueParameterDescriptorImpl]

'getMethod' @ [276:43] ==> public abstract val getMethod: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor[DeserializedPropertyDescriptor]

'name' @ [276:53] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [276:58] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'descriptor' @ [277:21] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.appendContainerAndReceiverInformation[ValueParameterDescriptorImpl]

'setMethod' @ [277:32] ==> public abstract val setMethod: FunctionDescriptor? defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor[DeserializedPropertyDescriptor]

'let' @ [277:43] ==> @InlineOnly public inline fun <T, R> FunctionDescriptor.let(block: (FunctionDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor
    <R> -> Unit

'from' @ [277:49] ==> var from: String defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.appendContainerAndReceiverInformation[LocalVariableDescriptor]

'+' @ [277:57] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'it' @ [277:63] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.appendContainerAndReceiverInformation.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [277:66] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [277:71] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'invoke' @ [278:21] ==> public abstract operator fun invoke(p1: String): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'from' @ [278:45] ==> var from: String defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.appendContainerAndReceiverInformation[LocalVariableDescriptor]

'SHORT_NAMES_RENDERER' @ [283:48] ==> public final val SHORT_NAMES_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.Companion[PropertyDescriptorImpl]

'renderType' @ [283:69] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'extensionReceiver' @ [283:80] ==> val extensionReceiver: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.appendContainerAndReceiverInformation[LocalVariableDescriptor]

'type' @ [283:98] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'invoke' @ [284:21] ==> public abstract operator fun invoke(p1: String): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'receiverPresentation' @ [284:43] ==> val receiverPresentation: String defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.appendContainerAndReceiverInformation[LocalVariableDescriptor]

'containerPresentation' @ [289:37] ==> private final fun containerPresentation(descriptor: DeclarationDescriptor): String? defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [289:59] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.appendContainerAndReceiverInformation[ValueParameterDescriptorImpl]

'containerPresentation' @ [290:13] ==> val containerPresentation: String? defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.appendContainerAndReceiverInformation[LocalVariableDescriptor]

'invoke' @ [291:13] ==> public abstract operator fun invoke(p1: String): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'invoke' @ [292:13] ==> public abstract operator fun invoke(p1: String): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'containerPresentation' @ [292:28] ==> val containerPresentation: String? defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.appendContainerAndReceiverInformation[LocalVariableDescriptor]

'when {
            descriptor.isArtificialImportAliasedDescriptor -> {
                return "(${DescriptorUtils.getFqName(descriptor.original)})"
            }

            descriptor.isExtension -> {
                val container = descriptor.containingDeclaration
                val containerPresentation = when (container) {
                    is ClassDescriptor -> DescriptorUtils.getFqNameFromTopLevelClass(container).toString()
                    is PackageFragmentDescriptor -> container.fqName.toString()
                    else -> return null
                }
                return "in $containerPresentation"
            }

            else -> {
                val container = descriptor.containingDeclaration as? PackageFragmentDescriptor
                                // we show container only for global functions and properties
                                ?: return null
                //TODO: it would be probably better to show it also for static declarations which are not from the current class (imported)
                return "(${container.fqName})"
            }
        }' @ [297:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'descriptor' @ [298:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.containerPresentation[ValueParameterDescriptorImpl]

'isArtificialImportAliasedDescriptor' @ [298:24] ==> public val DeclarationDescriptor.isArtificialImportAliasedDescriptor: Boolean defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[PropertyDescriptorImpl]

'getFqName' @ [299:44] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [299:54] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.containerPresentation[ValueParameterDescriptorImpl]

'original' @ [299:65] ==> public final val DeclarationDescriptor.original: DeclarationDescriptor[MyPropertyDescriptor]

'descriptor' @ [302:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.containerPresentation[ValueParameterDescriptorImpl]

'isExtension' @ [302:24] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'descriptor' @ [303:33] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.containerPresentation[ValueParameterDescriptorImpl]

'containingDeclaration' @ [303:44] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'when (container) {
                    is ClassDescriptor -> DescriptorUtils.getFqNameFromTopLevelClass(container).toString()
                    is PackageFragmentDescriptor -> container.fqName.toString()
                    else -> return null
                }' @ [304:45] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'container' @ [304:51] ==> val container: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.containerPresentation[LocalVariableDescriptor]

'getFqNameFromTopLevelClass' @ [305:59] ==> @NotNull public open fun getFqNameFromTopLevelClass(@NotNull p0: DeclarationDescriptor): FqName defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'container' @ [305:86] ==> val container: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.containerPresentation[LocalVariableDescriptor]

'toString' @ [305:97] ==> public open fun toString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'container' @ [306:53] ==> val container: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.containerPresentation[LocalVariableDescriptor]

'fqName' @ [306:63] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'toString' @ [306:70] ==> public open fun toString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'containerPresentation' @ [309:29] ==> val containerPresentation: String defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.containerPresentation[LocalVariableDescriptor]

'descriptor' @ [313:33] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.containerPresentation[ValueParameterDescriptorImpl]

'containingDeclaration' @ [313:44] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'container' @ [317:28] ==> val container: PackageFragmentDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.containerPresentation[LocalVariableDescriptor]

'fqName' @ [317:38] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'LookupElementDecorator<LookupElement>' @ [324:25] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'this' @ [324:63] ==> <this> defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.withIconFromLookupObject[ReceiverParameterDescriptorImpl]

'super' @ [326:17] ==> <this> defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.withIconFromLookupObject.<no name provided>[LazyClassReceiverParameterDescriptor]

'renderElement' @ [326:23] ==> public open fun renderElement(p0: (LookupElementPresentation..LookupElementPresentation?)): Unit defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaMethodDescriptor]

'presentation' @ [326:37] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.withIconFromLookupObject.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'presentation' @ [327:17] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.withIconFromLookupObject.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'icon' @ [327:30] ==> public final var LookupElementPresentation.icon: Icon?[MyPropertyDescriptor]

'getRawIcon' @ [327:63] ==> @Nullable public open fun getRawIcon(p0: (LookupElement..LookupElement?), p1: Boolean): Icon? defined in com.intellij.codeInsight.lookup.DefaultLookupItemRenderer[JavaMethodDescriptor]

'this@withIconFromLookupObject' @ [327:74] ==> <this> defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.withIconFromLookupObject[ReceiverParameterDescriptorImpl]

'presentation' @ [327:105] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.withIconFromLookupObject.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'isReal' @ [327:118] ==> public final val LookupElementPresentation.isReal: Boolean[MyPropertyDescriptor]

