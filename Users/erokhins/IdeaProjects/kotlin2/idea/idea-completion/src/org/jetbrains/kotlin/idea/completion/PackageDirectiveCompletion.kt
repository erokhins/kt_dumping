'psiElement' @ [36:47] ==> public open fun psiElement(): (PsiElementPattern.Capture<(PsiElement..PsiElement?)>..PsiElementPattern.Capture<(PsiElement..PsiElement?)>?) defined in com.intellij.patterns.PlatformPatterns[JavaMethodDescriptor]

'inside' @ [36:60] ==> public open fun inside(@NotNull p0: Class<out (PsiElement..PsiElement?)>): (PsiElementPattern.Capture<(PsiElement..PsiElement?)>..PsiElementPattern.Capture<(PsiElement..PsiElement?)>?) defined in com.intellij.patterns.PsiElementPattern.Capture[JavaMethodDescriptor]

'java' @ [36:93] ==> public val <T> KClass<KtPackageDirective>.java: Class<KtPackageDirective> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtPackageDirective

'parameters' @ [39:24] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[ValueParameterDescriptorImpl]

'position' @ [39:35] ==> public final val CompletionParameters.position: PsiElement[MyPropertyDescriptor]

'!' @ [40:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ACTIVATION_PATTERN' @ [40:14] ==> public final val ACTIVATION_PATTERN: (PsiElementPattern.Capture<(PsiElement..PsiElement?)>..PsiElementPattern.Capture<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion[PropertyDescriptorImpl]

'accepts' @ [40:33] ==> public final fun accepts(@Nullable p0: Any?): Boolean defined in com.intellij.patterns.PsiElementPattern.Capture[JavaMethodDescriptor]

'position' @ [40:41] ==> val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[LocalVariableDescriptor]

'position' @ [42:20] ==> val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[LocalVariableDescriptor]

'containingFile' @ [42:29] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'file' @ [44:26] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[LocalVariableDescriptor]

'findElementAt' @ [44:31] ==> public open fun findElementAt(p0: Int): PsiElement? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'parameters' @ [44:45] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[ValueParameterDescriptorImpl]

'offset' @ [44:56] ==> public final val CompletionParameters.offset: Int[MyPropertyDescriptor]

'parent' @ [44:65] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parameters' @ [46:28] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[ValueParameterDescriptorImpl]

'offset' @ [46:39] ==> public final val CompletionParameters.offset: Int[MyPropertyDescriptor]

'expression' @ [46:48] ==> val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[LocalVariableDescriptor]

'textOffset' @ [46:59] ==> public final val KtSimpleNameExpression.textOffset: Int[MyPropertyDescriptor]

'expression' @ [47:22] ==> val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[LocalVariableDescriptor]

'text' @ [47:33] ==> public final val KtSimpleNameExpression.text: (String..String?)[MyPropertyDescriptor]

'PlainPrefixMatcher' @ [48:29] ==> public constructor PlainPrefixMatcher(p0: (String..String?)) defined in com.intellij.codeInsight.completion.PlainPrefixMatcher[JavaClassConstructorDescriptor]

'prefix' @ [48:48] ==> val prefix: String defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[LocalVariableDescriptor]

'substring' @ [48:55] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'prefixLength' @ [48:68] ==> val prefixLength: Int defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[LocalVariableDescriptor]

'result' @ [49:22] ==> value-parameter result: CompletionResultSet defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[ValueParameterDescriptorImpl]

'withPrefixMatcher' @ [49:29] ==> @Contract @NotNull public abstract fun withPrefixMatcher(@NotNull p0: PrefixMatcher): CompletionResultSet defined in com.intellij.codeInsight.completion.CompletionResultSet[JavaMethodDescriptor]

'prefixMatcher' @ [49:47] ==> val prefixMatcher: PlainPrefixMatcher defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[LocalVariableDescriptor]

'expression' @ [51:32] ==> val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[LocalVariableDescriptor]

'getResolutionFacade' @ [51:43] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [53:34] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[LocalVariableDescriptor]

'moduleDescriptor' @ [53:51] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'getPackage' @ [53:68] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'file' @ [53:79] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[LocalVariableDescriptor]

'packageFqName' @ [53:84] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'parent' @ [53:98] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'memberScope' @ [53:108] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'packageMemberScope' @ [55:24] ==> val packageMemberScope: MemberScope defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[LocalVariableDescriptor]

'getContributedDescriptors' @ [55:43] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'PACKAGES' @ [55:90] ==> @field:JvmField public final val PACKAGES: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'prefixMatcher' @ [55:100] ==> val prefixMatcher: PlainPrefixMatcher defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[LocalVariableDescriptor]

'asNameFilter' @ [55:114] ==> public fun PrefixMatcher.asNameFilter(): (Name) -> Boolean defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'BasicLookupElementFactory' @ [56:36] ==> public constructor BasicLookupElementFactory(project: Project, insertHandlerProvider: InsertHandlerProvider) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[ClassConstructorDescriptorImpl]

'resolutionFacade' @ [56:62] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[LocalVariableDescriptor]

'project' @ [56:79] ==> public abstract val project: Project defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'InsertHandlerProvider' @ [56:88] ==> public constructor InsertHandlerProvider(callType: CallType<*>, expectedInfosCalculator: () -> Collection<ExpectedInfo>) defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider[ClassConstructorDescriptorImpl]

'PACKAGE_DIRECTIVE' @ [56:130] ==> public object PACKAGE_DIRECTIVE : CallType<KtExpression?> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'emptyList' @ [56:177] ==> public fun <T> emptyList(): List<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo

'variants' @ [57:25] ==> val variants: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[LocalVariableDescriptor]

'lookupElementFactory' @ [58:33] ==> val lookupElementFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[LocalVariableDescriptor]

'createLookupElement' @ [58:54] ==> public final fun createLookupElement(descriptor: DeclarationDescriptor, qualifyNestedClasses: Boolean = ..., includeClassTypeArguments: Boolean = ..., parametersAndTypeGrayed: Boolean = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[SimpleFunctionDescriptorImpl]

'variant' @ [58:74] ==> val variant: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[LocalVariableDescriptor]

'!' @ [59:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'lookupElement' @ [59:18] ==> val lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[LocalVariableDescriptor]

'lookupString' @ [59:32] ==> public final val LookupElement.lookupString: String[MyPropertyDescriptor]

'contains' @ [59:45] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'DUMMY_IDENTIFIER' @ [59:54] ==> public final val DUMMY_IDENTIFIER: String defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion[PropertyDescriptorImpl]

'result' @ [60:17] ==> val result: CompletionResultSet defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[LocalVariableDescriptor]

'addElement' @ [60:24] ==> public abstract fun addElement(@NotNull p0: LookupElement): Unit defined in com.intellij.codeInsight.completion.CompletionResultSet[JavaMethodDescriptor]

'lookupElement' @ [60:35] ==> val lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.PackageDirectiveCompletion.perform[LocalVariableDescriptor]

