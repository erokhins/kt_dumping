'CompletionSessionConfiguration' @ [67:72] ==> public constructor CompletionSessionConfiguration(useBetterPrefixMatcherForNonImportedClasses: Boolean, nonAccessibleDeclarations: Boolean, javaGettersAndSetters: Boolean, javaClassesNotToBeUsed: Boolean, staticMembers: Boolean, dataClassComponentFunctions: Boolean) defined in org.jetbrains.kotlin.idea.completion.CompletionSessionConfiguration[ClassConstructorDescriptorImpl]

'parameters' @ [68:55] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.CompletionSessionConfiguration[ValueParameterDescriptorImpl]

'invocationCount' @ [68:66] ==> public final val CompletionParameters.invocationCount: Int[MyPropertyDescriptor]

'parameters' @ [69:37] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.CompletionSessionConfiguration[ValueParameterDescriptorImpl]

'invocationCount' @ [69:48] ==> public final val CompletionParameters.invocationCount: Int[MyPropertyDescriptor]

'parameters' @ [70:33] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.CompletionSessionConfiguration[ValueParameterDescriptorImpl]

'invocationCount' @ [70:44] ==> public final val CompletionParameters.invocationCount: Int[MyPropertyDescriptor]

'parameters' @ [71:34] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.CompletionSessionConfiguration[ValueParameterDescriptorImpl]

'invocationCount' @ [71:45] ==> public final val CompletionParameters.invocationCount: Int[MyPropertyDescriptor]

'parameters' @ [72:25] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.CompletionSessionConfiguration[ValueParameterDescriptorImpl]

'invocationCount' @ [72:36] ==> public final val CompletionParameters.invocationCount: Int[MyPropertyDescriptor]

'parameters' @ [73:39] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.CompletionSessionConfiguration[ValueParameterDescriptorImpl]

'invocationCount' @ [73:50] ==> public final val CompletionParameters.invocationCount: Int[MyPropertyDescriptor]

'CompletionBenchmarkSink' @ [83:9] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.CompletionBenchmarkSink[FakeCallableDescriptorForObject]

'instance' @ [83:33] ==> public final val instance: CompletionBenchmarkSink defined in org.jetbrains.kotlin.idea.completion.CompletionBenchmarkSink.Companion[PropertyDescriptorImpl]

'onCompletionStarted' @ [83:42] ==> public abstract fun onCompletionStarted(completionSession: CompletionSession): Unit defined in org.jetbrains.kotlin.idea.completion.CompletionBenchmarkSink[SimpleFunctionDescriptorImpl]

'this' @ [83:62] ==> <this> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[LazyClassReceiverParameterDescriptor]

'parameters' @ [86:30] ==> protected final val parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'position' @ [86:41] ==> public final val CompletionParameters.position: PsiElement[MyPropertyDescriptor]

'position' @ [87:26] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'containingFile' @ [87:35] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'file' @ [88:38] ==> protected final val file: KtFile defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'getResolutionFacade' @ [88:43] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [89:38] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'moduleDescriptor' @ [89:55] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'position' @ [90:29] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'project' @ [90:38] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'==' @ [91:33] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.resolve.TargetPlatform[DeserializedSimpleFunctionDescriptor]

'getPlatform' @ [91:56] ==> @NotNull public open fun getPlatform(@NotNull p0: KtFile): TargetPlatform defined in org.jetbrains.kotlin.idea.project.TargetPlatformDetector[JavaMethodDescriptor]

'parameters' @ [91:68] ==> protected final val parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'originalFile' @ [91:79] ==> public final val CompletionParameters.originalFile: PsiFile[MyPropertyDescriptor]

'JvmPlatform' @ [91:106] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'file' @ [92:39] ==> protected final val file: KtFile defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'position' @ [98:26] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'parent' @ [98:35] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'mainReference' @ [98:71] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'if (reference != null) {
            if (reference.expression is KtLabelReferenceExpression) {
                this.nameExpression = null
                this.expression = reference.expression.parent.parent as? KtExpressionWithLabel
            }
            else {
                this.nameExpression = reference.expression
                this.expression = nameExpression
            }
        }
        else {
            this.nameExpression = null
            this.expression = null
        }' @ [99:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'reference' @ [99:13] ==> val reference: KtSimpleNameReference? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.<init>[LocalVariableDescriptor]

'if (reference.expression is KtLabelReferenceExpression) {
                this.nameExpression = null
                this.expression = reference.expression.parent.parent as? KtExpressionWithLabel
            }
            else {
                this.nameExpression = reference.expression
                this.expression = nameExpression
            }' @ [100:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'reference' @ [100:17] ==> val reference: KtSimpleNameReference? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.<init>[LocalVariableDescriptor]

'expression' @ [100:27] ==> public final val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedPropertyDescriptor]

'this' @ [101:17] ==> <this> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[LazyClassReceiverParameterDescriptor]

'nameExpression' @ [101:22] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'this' @ [102:17] ==> <this> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[LazyClassReceiverParameterDescriptor]

'expression' @ [102:22] ==> protected final val expression: KtExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'reference' @ [102:35] ==> val reference: KtSimpleNameReference? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.<init>[LocalVariableDescriptor]

'expression' @ [102:45] ==> public final val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedPropertyDescriptor]

'parent' @ [102:56] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [102:63] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'this' @ [105:17] ==> <this> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[LazyClassReceiverParameterDescriptor]

'nameExpression' @ [105:22] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'reference' @ [105:39] ==> val reference: KtSimpleNameReference? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.<init>[LocalVariableDescriptor]

'expression' @ [105:49] ==> public final val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedPropertyDescriptor]

'this' @ [106:17] ==> <this> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[LazyClassReceiverParameterDescriptor]

'expression' @ [106:22] ==> protected final val expression: KtExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'nameExpression' @ [106:35] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'this' @ [110:13] ==> <this> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[LazyClassReceiverParameterDescriptor]

'nameExpression' @ [110:18] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'this' @ [111:13] ==> <this> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[LazyClassReceiverParameterDescriptor]

'expression' @ [111:18] ==> protected final val expression: KtExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'CompletionBindingContextProvider' @ [115:36] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider[FakeCallableDescriptorForObject]

'getInstance' @ [115:69] ==> public final fun getInstance(project: Project): CompletionBindingContextProvider defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.Companion[SimpleFunctionDescriptorImpl]

'project' @ [115:81] ==> protected final val project: Project defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'getBindingContext' @ [115:90] ==> public final fun getBindingContext(position: PsiElement, resolutionFacade: ResolutionFacade): BindingContext defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider[SimpleFunctionDescriptorImpl]

'position' @ [115:108] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'resolutionFacade' @ [115:118] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'position' @ [116:34] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'getResolutionScope' @ [116:43] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [116:62] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'resolutionFacade' @ [116:78] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'ownerDescriptor' @ [116:96] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'character' @ [118:65] ==> @NotNull public open fun character(): CharPattern defined in com.intellij.patterns.StandardPatterns[JavaMethodDescriptor]

'javaIdentifierStart' @ [118:77] ==> public open fun javaIdentifierStart(): (CharPattern..CharPattern?) defined in com.intellij.patterns.CharPattern[JavaMethodDescriptor]

'andNot' @ [118:99] ==> @NotNull public open fun andNot(p0: raw (ElementPattern<(Any..Any?)>..ElementPattern<*>?)): CharPattern defined in com.intellij.patterns.CharPattern[JavaMethodDescriptor]

'singleCharPattern' @ [118:106] ==> public fun singleCharPattern(char: Char): CharPattern defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'character' @ [119:64] ==> @NotNull public open fun character(): CharPattern defined in com.intellij.patterns.StandardPatterns[JavaMethodDescriptor]

'javaIdentifierPart' @ [119:76] ==> public open fun javaIdentifierPart(): (CharPattern..CharPattern?) defined in com.intellij.patterns.CharPattern[JavaMethodDescriptor]

'andNot' @ [119:97] ==> @NotNull public open fun andNot(p0: raw (ElementPattern<(Any..Any?)>..ElementPattern<*>?)): CharPattern defined in com.intellij.patterns.CharPattern[JavaMethodDescriptor]

'singleCharPattern' @ [119:104] ==> public fun singleCharPattern(char: Char): CharPattern defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'!!' @ [121:28] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: String?): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> String

'findIdentifierPrefix' @ [121:43] ==> public open fun findIdentifierPrefix(p0: (PsiElement..PsiElement?), p1: Int, p2: (ElementPattern<(Char..Char?)>..ElementPattern<(Char..Char?)>?), p3: (ElementPattern<(Char..Char?)>..ElementPattern<(Char..Char?)>?)): (String..String?) defined in com.intellij.codeInsight.completion.CompletionUtil[JavaMethodDescriptor]

'parameters' @ [122:13] ==> protected final val parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'position' @ [122:24] ==> public final val CompletionParameters.position: PsiElement[MyPropertyDescriptor]

'containingFile' @ [122:33] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'parameters' @ [123:13] ==> protected final val parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'offset' @ [123:24] ==> public final val CompletionParameters.offset: Int[MyPropertyDescriptor]

'kotlinIdentifierPartPattern' @ [124:13] ==> private final val kotlinIdentifierPartPattern: CharPattern defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'singleCharPattern' @ [124:44] ==> public fun singleCharPattern(char: Char): CharPattern defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'kotlinIdentifierStartPattern' @ [125:13] ==> private final val kotlinIdentifierStartPattern: CharPattern defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'CamelHumpMatcher' @ [127:35] ==> public constructor CamelHumpMatcher(@NotNull p0: String) defined in com.intellij.codeInsight.completion.impl.CamelHumpMatcher[JavaClassConstructorDescriptor]

'prefix' @ [127:52] ==> protected final val prefix: String defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'prefixMatcher' @ [129:63] ==> protected final val prefixMatcher: CamelHumpMatcher defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'asStringNameFilter' @ [129:77] ==> public fun PrefixMatcher.asStringNameFilter(): (String) -> Boolean defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'isVisibleDescriptor' @ [131:75] ==> private final fun isVisibleDescriptor(descriptor: DeclarationDescriptor, completeNonAccessible: Boolean): Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSession[SimpleFunctionDescriptorImpl]

'it' @ [131:95] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession.isVisibleFilter.<anonymous>[ValueParameterDescriptorImpl]

'configuration' @ [131:123] ==> protected final val configuration: CompletionSessionConfiguration defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'nonAccessibleDeclarations' @ [131:137] ==> public final val nonAccessibleDeclarations: Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSessionConfiguration[PropertyDescriptorImpl]

'isVisibleDescriptor' @ [132:86] ==> private final fun isVisibleDescriptor(descriptor: DeclarationDescriptor, completeNonAccessible: Boolean): Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSession[SimpleFunctionDescriptorImpl]

'it' @ [132:106] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession.isVisibleFilterCheckAlways.<anonymous>[ValueParameterDescriptorImpl]

'ReferenceVariantsHelper' @ [134:45] ==> public constructor ReferenceVariantsHelper(bindingContext: BindingContext, resolutionFacade: ResolutionFacade, moduleDescriptor: ModuleDescriptor, visibilityFilter: (DeclarationDescriptor) -> Boolean, notProperties: Set<FqNameUnsafe> = ...) defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[DeserializedClassConstructorDescriptor]

'bindingContext' @ [134:69] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'resolutionFacade' @ [135:69] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'moduleDescriptor' @ [136:69] ==> protected final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'isVisibleFilter' @ [137:69] ==> protected final val isVisibleFilter: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'getNotProperties' @ [138:90] ==> public final fun getNotProperties(element: PsiElement): Set<FqNameUnsafe> defined in org.jetbrains.kotlin.idea.core.NotPropertiesService.Companion[DeserializedSimpleFunctionDescriptor]

'position' @ [138:107] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'if (nameExpression == null) CallTypeAndReceiver.UNKNOWN else CallTypeAndReceiver.detect(nameExpression)' @ [140:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CallTypeAndReceiver<out KtElement?, *>, elseBranch: CallTypeAndReceiver<out KtElement?, *>): CallTypeAndReceiver<out KtElement?, *>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallTypeAndReceiver<out KtElement?, *>

'nameExpression' @ [140:45] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'UNKNOWN' @ [140:89] ==> public object UNKNOWN : CallTypeAndReceiver<Nothing?, CallType.UNKNOWN> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[FakeCallableDescriptorForObject]

'detect' @ [140:122] ==> public final fun detect(expression: KtSimpleNameExpression): CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.Companion[DeserializedSimpleFunctionDescriptor]

'nameExpression' @ [140:129] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'nameExpression' @ [141:35] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'let' @ [141:51] ==> @InlineOnly public inline fun <T, R> KtSimpleNameExpression.let(block: (KtSimpleNameExpression) -> Collection<ReceiverType>?): Collection<ReceiverType>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameExpression
    <R> -> Collection<ReceiverType>?

'detectReceiverTypes' @ [141:57] ==> protected final fun detectReceiverTypes(bindingContext: BindingContext, nameExpression: KtSimpleNameExpression, callTypeAndReceiver: CallTypeAndReceiver<*, *>): Collection<ReceiverType>? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[SimpleFunctionDescriptorImpl]

'bindingContext' @ [141:77] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'nameExpression' @ [141:93] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [141:109] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'BasicLookupElementFactory' @ [144:47] ==> public constructor BasicLookupElementFactory(project: Project, insertHandlerProvider: InsertHandlerProvider) defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[ClassConstructorDescriptorImpl]

'project' @ [144:73] ==> protected final val project: Project defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'InsertHandlerProvider' @ [144:82] ==> public constructor InsertHandlerProvider(callType: CallType<*>, expectedInfosCalculator: () -> Collection<ExpectedInfo>) defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider[ClassConstructorDescriptorImpl]

'callTypeAndReceiver' @ [144:104] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'callType' @ [144:124] ==> public final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'expectedInfos' @ [144:136] ==> protected abstract val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'getValue' @ [147:57] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'NONE' @ [147:83] ==> enum entry NONE defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'LookupElementsCollector' @ [148:9] ==> public constructor LookupElementsCollector(onFlush: () -> Unit, prefixMatcher: PrefixMatcher, completionParameters: CompletionParameters, resultSet: CompletionResultSet, sorter: CompletionSorter, filter: ((LookupElement) -> Boolean)?) defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[ClassConstructorDescriptorImpl]

'CompletionBenchmarkSink' @ [148:35] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.CompletionBenchmarkSink[FakeCallableDescriptorForObject]

'instance' @ [148:59] ==> public final val instance: CompletionBenchmarkSink defined in org.jetbrains.kotlin.idea.completion.CompletionBenchmarkSink.Companion[PropertyDescriptorImpl]

'onFlush' @ [148:68] ==> public abstract fun onFlush(completionSession: CompletionSession): Unit defined in org.jetbrains.kotlin.idea.completion.CompletionBenchmarkSink[SimpleFunctionDescriptorImpl]

'this' @ [148:76] ==> <this> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[LazyClassReceiverParameterDescriptor]

'prefixMatcher' @ [148:85] ==> protected final val prefixMatcher: CamelHumpMatcher defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'parameters' @ [148:100] ==> protected final val parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'resultSet' @ [148:112] ==> value-parameter resultSet: CompletionResultSet defined in org.jetbrains.kotlin.idea.completion.CompletionSession.<init>[ValueParameterDescriptorImpl]

'createSorter' @ [148:123] ==> protected open fun createSorter(): CompletionSorter defined in org.jetbrains.kotlin.idea.completion.CompletionSession[SimpleFunctionDescriptorImpl]

'file' @ [148:140] ==> protected final val file: KtFile defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'extraCompletionFilter' @ [148:166] ==> public var KtCodeFragment.extraCompletionFilter: ((LookupElement) -> Boolean)? defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[PropertyDescriptorImpl]

'getResolveScope' @ [151:52] ==> public fun getResolveScope(file: KtFile): GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'parameters' @ [151:68] ==> protected final val parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'originalFile' @ [151:79] ==> public final val CompletionParameters.originalFile: PsiFile[MyPropertyDescriptor]

'if (mayIncludeInaccessible) isVisibleFilter else isVisibleFilterCheckAlways' @ [154:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (DeclarationDescriptor) -> Boolean, elseBranch: (DeclarationDescriptor) -> Boolean): (DeclarationDescriptor) -> Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Function1<DeclarationDescriptor, Boolean>

'mayIncludeInaccessible' @ [154:26] ==> value-parameter mayIncludeInaccessible: Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSession.indicesHelper[ValueParameterDescriptorImpl]

'isVisibleFilter' @ [154:50] ==> protected final val isVisibleFilter: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'isVisibleFilterCheckAlways' @ [154:71] ==> protected final val isVisibleFilterCheckAlways: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'KotlinIndicesHelper' @ [155:16] ==> public constructor KotlinIndicesHelper(resolutionFacade: ResolutionFacade, scope: GlobalSearchScope, visibilityFilter: (DeclarationDescriptor) -> Boolean, declarationTranslator: (KtDeclaration) -> KtDeclaration? = ..., applyExcludeSettings: Boolean = ..., filterOutPrivate: Boolean = ..., file: KtFile? = ...) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[DeserializedClassConstructorDescriptor]

'resolutionFacade' @ [155:36] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'searchScope' @ [156:36] ==> protected final val searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'filter' @ [157:36] ==> val filter: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSession.indicesHelper[LocalVariableDescriptor]

'!' @ [158:55] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'mayIncludeInaccessible' @ [158:56] ==> value-parameter mayIncludeInaccessible: Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSession.indicesHelper[ValueParameterDescriptorImpl]

'toFromOriginalFileMapper' @ [159:62] ==> protected final val toFromOriginalFileMapper: ToFromOriginalFileMapper defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'toSyntheticFile' @ [159:87] ==> public final fun <TElement : PsiElement> toSyntheticFile(element: KtDeclaration): KtDeclaration? defined in org.jetbrains.kotlin.idea.completion.ToFromOriginalFileMapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : PsiElement> -> KtDeclaration

'it' @ [159:103] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.completion.CompletionSession.indicesHelper.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [160:43] ==> protected final val file: KtFile defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'!' @ [164:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'configuration' @ [164:14] ==> protected final val configuration: CompletionSessionConfiguration defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'javaClassesNotToBeUsed' @ [164:28] ==> public final val javaClassesNotToBeUsed: Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSessionConfiguration[PropertyDescriptorImpl]

'descriptor' @ [164:54] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession.isVisibleDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [165:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession.isVisibleDescriptor[ValueParameterDescriptorImpl]

'importableFqName' @ [165:28] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'let' @ [165:46] ==> @InlineOnly public inline fun <T, R> FqName.let(block: (FqName) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> Boolean

'isJavaClassNotToBeUsedInKotlin' @ [165:52] ==> public fun isJavaClassNotToBeUsedInKotlin(fqName: FqName): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [168:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession.isVisibleDescriptor[ValueParameterDescriptorImpl]

'!' @ [168:54] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isTypeParameterVisible' @ [168:55] ==> private final fun isTypeParameterVisible(typeParameter: TypeParameterDescriptor): Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSession[SimpleFunctionDescriptorImpl]

'descriptor' @ [168:78] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession.isVisibleDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [170:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession.isVisibleDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [171:27] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession.isVisibleDescriptor[ValueParameterDescriptorImpl]

'isVisible' @ [171:38] ==> public fun DeclarationDescriptorWithVisibility.isVisible(context: PsiElement, receiverExpression: KtExpression?, bindingContext: BindingContext, resolutionFacade: ResolutionFacade): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'position' @ [171:48] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [171:58] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'receiver' @ [171:78] ==> public final val receiver: KtElement? defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'bindingContext' @ [171:105] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'resolutionFacade' @ [171:121] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'visible' @ [172:17] ==> val visible: Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSession.isVisibleDescriptor[LocalVariableDescriptor]

'completeNonAccessible' @ [173:20] ==> value-parameter completeNonAccessible: Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSession.isVisibleDescriptor[ValueParameterDescriptorImpl]

'!' @ [173:46] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [173:47] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession.isVisibleDescriptor[ValueParameterDescriptorImpl]

'isFromLibrary' @ [173:58] ==> private final fun DeclarationDescriptor.isFromLibrary(): Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSession[SimpleFunctionDescriptorImpl]

'isDebuggerContext' @ [173:77] ==> protected final val isDebuggerContext: Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'descriptor' @ [176:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession.isVisibleDescriptor[ValueParameterDescriptorImpl]

'isExcludedFromAutoImport' @ [176:24] ==> public fun DeclarationDescriptor.isExcludedFromAutoImport(project: Project, inFile: KtFile?): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'project' @ [176:49] ==> protected final val project: Project defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'file' @ [176:58] ==> protected final val file: KtFile defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'module' @ [182:13] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'getCapability' @ [182:20] ==> public abstract fun <T> getCapability(capability: ModuleDescriptor.Capability<ModuleOrigin>): ModuleOrigin? defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleOrigin

'OriginCapability' @ [182:34] ==> public val OriginCapability: ModuleDescriptor.Capability<ModuleOrigin> defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedPropertyDescriptor]

'LIBRARY' @ [182:68] ==> enum entry LIBRARY defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleOrigin[FakeCallableDescriptorForObject]

'this' @ [184:13] ==> <this> defined in org.jetbrains.kotlin.idea.completion.CompletionSession.isFromLibrary[ReceiverParameterDescriptorImpl]

'kind' @ [184:49] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'FAKE_OVERRIDE' @ [184:87] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'overriddenDescriptors' @ [185:20] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'all' @ [185:42] ==> public inline fun <T> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.all(predicate: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'it' @ [185:48] ==> value-parameter it: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.idea.completion.CompletionSession.isFromLibrary.<anonymous>[ValueParameterDescriptorImpl]

'isFromLibrary' @ [185:51] ==> private final fun DeclarationDescriptor.isFromLibrary(): Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSession[SimpleFunctionDescriptorImpl]

'typeParameter' @ [192:21] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession.isTypeParameterVisible[ValueParameterDescriptorImpl]

'containingDeclaration' @ [192:35] ==> public final val TypeParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'inDescriptor' @ [193:46] ==> protected final val inDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'parent' @ [194:16] ==> var parent: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.isTypeParameterVisible[LocalVariableDescriptor]

'parent' @ [195:17] ==> var parent: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.isTypeParameterVisible[LocalVariableDescriptor]

'owner' @ [195:27] ==> val owner: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession.isTypeParameterVisible[LocalVariableDescriptor]

'parent' @ [196:17] ==> var parent: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.isTypeParameterVisible[LocalVariableDescriptor]

'!' @ [196:46] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parent' @ [196:47] ==> var parent: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.isTypeParameterVisible[LocalVariableDescriptor]

'isInner' @ [196:54] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'parent' @ [197:13] ==> var parent: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.isTypeParameterVisible[LocalVariableDescriptor]

'parent' @ [197:22] ==> var parent: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.isTypeParameterVisible[LocalVariableDescriptor]

'containingDeclaration' @ [197:29] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'collector' @ [203:9] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'flushToResultSet' @ [203:19] ==> public final fun flushToResultSet(): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'_complete' @ [208:13] ==> private final fun _complete(): Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSession[SimpleFunctionDescriptorImpl]

'also' @ [208:25] ==> @InlineOnly @SinceKotlin public inline fun <T> Boolean.also(block: (Boolean) -> Unit): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'CompletionBenchmarkSink' @ [209:17] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.CompletionBenchmarkSink[FakeCallableDescriptorForObject]

'instance' @ [209:41] ==> public final val instance: CompletionBenchmarkSink defined in org.jetbrains.kotlin.idea.completion.CompletionBenchmarkSink.Companion[PropertyDescriptorImpl]

'onCompletionEnded' @ [209:50] ==> public abstract fun onCompletionEnded(completionSession: CompletionSession, canceled: Boolean): Unit defined in org.jetbrains.kotlin.idea.completion.CompletionBenchmarkSink[SimpleFunctionDescriptorImpl]

'this' @ [209:68] ==> <this> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[LazyClassReceiverParameterDescriptor]

'CompletionBenchmarkSink' @ [212:13] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.CompletionBenchmarkSink[FakeCallableDescriptorForObject]

'instance' @ [212:37] ==> public final val instance: CompletionBenchmarkSink defined in org.jetbrains.kotlin.idea.completion.CompletionBenchmarkSink.Companion[PropertyDescriptorImpl]

'onCompletionEnded' @ [212:46] ==> public abstract fun onCompletionEnded(completionSession: CompletionSession, canceled: Boolean): Unit defined in org.jetbrains.kotlin.idea.completion.CompletionBenchmarkSink[SimpleFunctionDescriptorImpl]

'this' @ [212:64] ==> <this> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[LazyClassReceiverParameterDescriptor]

'pce' @ [213:19] ==> val pce: ProcessCanceledException defined in org.jetbrains.kotlin.idea.completion.CompletionSession.complete[LocalVariableDescriptor]

'string' @ [219:46] ==> @NotNull public open fun string(): StringPattern defined in com.intellij.patterns.StandardPatterns[JavaMethodDescriptor]

'with' @ [219:55] ==> @NotNull public open fun with(p0: (PatternCondition<in (String..String?)>..PatternCondition<in (String..String?)>?)): StringPattern defined in com.intellij.patterns.StringPattern[JavaMethodDescriptor]

'PatternCondition<String>' @ [219:69] ==> public constructor PatternCondition<T : (Any..Any?)>(@Nullable @NonNls p0: String?) defined in com.intellij.patterns.PatternCondition[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'prefix' @ [220:81] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.idea.completion.CompletionSession._complete.<no name provided>.accepts[ValueParameterDescriptorImpl]

'prefix' @ [220:100] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.idea.completion.CompletionSession._complete.<no name provided>.accepts[ValueParameterDescriptorImpl]

'collector' @ [222:9] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'restartCompletionOnPrefixChange' @ [222:19] ==> public final fun restartCompletionOnPrefixChange(prefixCondition: ElementPattern<String>): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'prefixPattern' @ [222:51] ==> val prefixPattern: StringPattern defined in org.jetbrains.kotlin.idea.completion.CompletionSession._complete[LocalVariableDescriptor]

'calcContextForStatisticsInfo' @ [224:33] ==> protected final fun calcContextForStatisticsInfo(): String? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[SimpleFunctionDescriptorImpl]

'statisticsContext' @ [225:13] ==> val statisticsContext: String? defined in org.jetbrains.kotlin.idea.completion.CompletionSession._complete[LocalVariableDescriptor]

'collector' @ [226:13] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'addLookupElementPostProcessor' @ [226:23] ==> public final fun addLookupElementPostProcessor(processor: (LookupElement) -> LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'lookupElement' @ [228:17] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.CompletionSession._complete.<anonymous>[ValueParameterDescriptorImpl]

'putUserDataDeep' @ [228:31] ==> public tailrec fun <T : Any> LookupElement.putUserDataDeep(key: Key<String>, value: String?): Unit defined in org.jetbrains.kotlin.idea.completion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> String

'STATISTICS_INFO_CONTEXT_KEY' @ [228:47] ==> public val STATISTICS_INFO_CONTEXT_KEY: Key<String> defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[PropertyDescriptorImpl]

'statisticsContext' @ [228:76] ==> val statisticsContext: String? defined in org.jetbrains.kotlin.idea.completion.CompletionSession._complete[LocalVariableDescriptor]

'lookupElement' @ [229:17] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.CompletionSession._complete.<anonymous>[ValueParameterDescriptorImpl]

'doComplete' @ [233:9] ==> protected abstract fun doComplete(): Unit defined in org.jetbrains.kotlin.idea.completion.CompletionSession[SimpleFunctionDescriptorImpl]

'flushToResultSet' @ [234:9] ==> protected final fun flushToResultSet(): Unit defined in org.jetbrains.kotlin.idea.completion.CompletionSession[SimpleFunctionDescriptorImpl]

'!' @ [235:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'collector' @ [235:17] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'isResultEmpty' @ [235:27] ==> public final var isResultEmpty: Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[PropertyDescriptorImpl]

'collector' @ [239:9] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'addLookupElementPostProcessor' @ [239:19] ==> public final fun addLookupElementPostProcessor(processor: (LookupElement) -> LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'processor' @ [239:49] ==> value-parameter processor: (LookupElement) -> LookupElement defined in org.jetbrains.kotlin.idea.completion.CompletionSession.addLookupElementPostProcessor[ValueParameterDescriptorImpl]

'ImportableFqNameClassifier' @ [248:48] ==> public constructor ImportableFqNameClassifier(file: KtFile) defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier[DeserializedClassConstructorDescriptor]

'file' @ [248:75] ==> protected final val file: KtFile defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'!!' @ [251:22] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: CompletionSorter?): CompletionSorter[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> CompletionSorter

'defaultSorter' @ [251:39] ==> public open fun defaultSorter(p0: (CompletionParameters..CompletionParameters?), p1: (PrefixMatcher..PrefixMatcher?)): (CompletionSorter..CompletionSorter?) defined in com.intellij.codeInsight.completion.CompletionSorter[JavaMethodDescriptor]

'parameters' @ [251:53] ==> protected final val parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'prefixMatcher' @ [251:65] ==> protected final val prefixMatcher: CamelHumpMatcher defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'sorter' @ [253:9] ==> var sorter: CompletionSorter defined in org.jetbrains.kotlin.idea.completion.CompletionSession.createSorter[LocalVariableDescriptor]

'sorter' @ [253:18] ==> var sorter: CompletionSorter defined in org.jetbrains.kotlin.idea.completion.CompletionSession.createSorter[LocalVariableDescriptor]

'weighBefore' @ [253:25] ==> public abstract fun weighBefore(@NotNull p0: String, vararg p1: (LookupElementWeigher..LookupElementWeigher?)): (CompletionSorter..CompletionSorter?) defined in com.intellij.codeInsight.completion.CompletionSorter[JavaMethodDescriptor]

'DeprecatedWeigher' @ [253:46] ==> public object DeprecatedWeigher : LookupElementWeigher defined in org.jetbrains.kotlin.idea.completion in file Weighers.kt[FakeCallableDescriptorForObject]

'PriorityWeigher' @ [253:65] ==> public object PriorityWeigher : LookupElementWeigher defined in org.jetbrains.kotlin.idea.completion in file Weighers.kt[FakeCallableDescriptorForObject]

'PreferGetSetMethodsToPropertyWeigher' @ [253:82] ==> public object PreferGetSetMethodsToPropertyWeigher : LookupElementWeigher defined in org.jetbrains.kotlin.idea.completion in file Weighers.kt[FakeCallableDescriptorForObject]

'NotImportedWeigher' @ [254:37] ==> public constructor NotImportedWeigher(classifier: ImportableFqNameClassifier) defined in org.jetbrains.kotlin.idea.completion.NotImportedWeigher[ClassConstructorDescriptorImpl]

'importableFqNameClassifier' @ [254:56] ==> protected final val importableFqNameClassifier: ImportableFqNameClassifier defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'NotImportedStaticMemberWeigher' @ [255:37] ==> public constructor NotImportedStaticMemberWeigher(classifier: ImportableFqNameClassifier) defined in org.jetbrains.kotlin.idea.completion.NotImportedStaticMemberWeigher[ClassConstructorDescriptorImpl]

'importableFqNameClassifier' @ [255:68] ==> protected final val importableFqNameClassifier: ImportableFqNameClassifier defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'KindWeigher' @ [256:37] ==> public object KindWeigher : LookupElementWeigher defined in org.jetbrains.kotlin.idea.completion in file Weighers.kt[FakeCallableDescriptorForObject]

'CallableWeigher' @ [256:50] ==> public object CallableWeigher : LookupElementWeigher defined in org.jetbrains.kotlin.idea.completion in file Weighers.kt[FakeCallableDescriptorForObject]

'sorter' @ [258:9] ==> var sorter: CompletionSorter defined in org.jetbrains.kotlin.idea.completion.CompletionSession.createSorter[LocalVariableDescriptor]

'sorter' @ [258:18] ==> var sorter: CompletionSorter defined in org.jetbrains.kotlin.idea.completion.CompletionSession.createSorter[LocalVariableDescriptor]

'weighAfter' @ [258:25] ==> public abstract fun weighAfter(@NotNull p0: String, vararg p1: (LookupElementWeigher..LookupElementWeigher?)): (CompletionSorter..CompletionSorter?) defined in com.intellij.codeInsight.completion.CompletionSorter[JavaMethodDescriptor]

'VariableOrFunctionWeigher' @ [258:45] ==> public object VariableOrFunctionWeigher : LookupElementWeigher defined in org.jetbrains.kotlin.idea.completion in file Weighers.kt[FakeCallableDescriptorForObject]

'ImportedWeigher' @ [258:72] ==> public constructor ImportedWeigher(classifier: ImportableFqNameClassifier) defined in org.jetbrains.kotlin.idea.completion.ImportedWeigher[ClassConstructorDescriptorImpl]

'importableFqNameClassifier' @ [258:88] ==> protected final val importableFqNameClassifier: ImportableFqNameClassifier defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'PreferContextElementsWeigher' @ [260:44] ==> public constructor PreferContextElementsWeigher(context: DeclarationDescriptor) defined in org.jetbrains.kotlin.idea.completion.PreferContextElementsWeigher[ClassConstructorDescriptorImpl]

'inDescriptor' @ [260:73] ==> protected final val inDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'sorter' @ [261:9] ==> var sorter: CompletionSorter defined in org.jetbrains.kotlin.idea.completion.CompletionSession.createSorter[LocalVariableDescriptor]

'if (callTypeAndReceiver is CallTypeAndReceiver.SUPER_MEMBERS) { // for completion after "super." strictly prefer the current member
            sorter.weighBefore("kotlin.deprecated", preferContextElementsWeigher)
        }
        else {
            sorter.weighBefore("kotlin.proximity", preferContextElementsWeigher)
        }' @ [261:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CompletionSorter, elseBranch: CompletionSorter): CompletionSorter[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CompletionSorter

'callTypeAndReceiver' @ [261:22] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'sorter' @ [262:13] ==> var sorter: CompletionSorter defined in org.jetbrains.kotlin.idea.completion.CompletionSession.createSorter[LocalVariableDescriptor]

'weighBefore' @ [262:20] ==> public abstract fun weighBefore(@NotNull p0: String, vararg p1: (LookupElementWeigher..LookupElementWeigher?)): (CompletionSorter..CompletionSorter?) defined in com.intellij.codeInsight.completion.CompletionSorter[JavaMethodDescriptor]

'preferContextElementsWeigher' @ [262:53] ==> val preferContextElementsWeigher: PreferContextElementsWeigher defined in org.jetbrains.kotlin.idea.completion.CompletionSession.createSorter[LocalVariableDescriptor]

'sorter' @ [265:13] ==> var sorter: CompletionSorter defined in org.jetbrains.kotlin.idea.completion.CompletionSession.createSorter[LocalVariableDescriptor]

'weighBefore' @ [265:20] ==> public abstract fun weighBefore(@NotNull p0: String, vararg p1: (LookupElementWeigher..LookupElementWeigher?)): (CompletionSorter..CompletionSorter?) defined in com.intellij.codeInsight.completion.CompletionSorter[JavaMethodDescriptor]

'preferContextElementsWeigher' @ [265:52] ==> val preferContextElementsWeigher: PreferContextElementsWeigher defined in org.jetbrains.kotlin.idea.completion.CompletionSession.createSorter[LocalVariableDescriptor]

'sorter' @ [268:9] ==> var sorter: CompletionSorter defined in org.jetbrains.kotlin.idea.completion.CompletionSession.createSorter[LocalVariableDescriptor]

'sorter' @ [268:18] ==> var sorter: CompletionSorter defined in org.jetbrains.kotlin.idea.completion.CompletionSession.createSorter[LocalVariableDescriptor]

'weighBefore' @ [268:25] ==> public abstract fun weighBefore(@NotNull p0: String, vararg p1: (LookupElementWeigher..LookupElementWeigher?)): (CompletionSorter..CompletionSorter?) defined in com.intellij.codeInsight.completion.CompletionSorter[JavaMethodDescriptor]

'PreferMatchingItemWeigher' @ [268:55] ==> public object PreferMatchingItemWeigher : LookupElementWeigher defined in org.jetbrains.kotlin.idea.completion in file Weighers.kt[FakeCallableDescriptorForObject]

'sorter' @ [271:9] ==> var sorter: CompletionSorter defined in org.jetbrains.kotlin.idea.completion.CompletionSession.createSorter[LocalVariableDescriptor]

'sorter' @ [271:18] ==> var sorter: CompletionSorter defined in org.jetbrains.kotlin.idea.completion.CompletionSession.createSorter[LocalVariableDescriptor]

'weighAfter' @ [271:25] ==> public abstract fun weighAfter(@NotNull p0: String, vararg p1: (LookupElementWeigher..LookupElementWeigher?)): (CompletionSorter..CompletionSorter?) defined in com.intellij.codeInsight.completion.CompletionSorter[JavaMethodDescriptor]

'RealPrefixMatchingWeigher' @ [271:52] ==> public constructor RealPrefixMatchingWeigher() defined in com.intellij.codeInsight.completion.impl.RealPrefixMatchingWeigher[JavaClassConstructorDescriptor]

'sorter' @ [273:9] ==> var sorter: CompletionSorter defined in org.jetbrains.kotlin.idea.completion.CompletionSession.createSorter[LocalVariableDescriptor]

'sorter' @ [273:18] ==> var sorter: CompletionSorter defined in org.jetbrains.kotlin.idea.completion.CompletionSession.createSorter[LocalVariableDescriptor]

'weighAfter' @ [273:25] ==> public abstract fun weighAfter(@NotNull p0: String, vararg p1: (LookupElementWeigher..LookupElementWeigher?)): (CompletionSorter..CompletionSorter?) defined in com.intellij.codeInsight.completion.CompletionSorter[JavaMethodDescriptor]

'ByNameAlphabeticalWeigher' @ [273:56] ==> public object ByNameAlphabeticalWeigher : LookupElementWeigher defined in org.jetbrains.kotlin.idea.completion in file Weighers.kt[FakeCallableDescriptorForObject]

'PreferLessParametersWeigher' @ [273:83] ==> public object PreferLessParametersWeigher : LookupElementWeigher defined in org.jetbrains.kotlin.idea.completion in file Weighers.kt[FakeCallableDescriptorForObject]

'sorter' @ [275:16] ==> var sorter: CompletionSorter defined in org.jetbrains.kotlin.idea.completion.CompletionSession.createSorter[LocalVariableDescriptor]

'expectedInfos' @ [279:13] ==> protected abstract val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'isEmpty' @ [279:27] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'expectedInfos' @ [281:23] ==> protected abstract val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'mapNotNull' @ [282:18] ==> public inline fun <T, R : Any> Iterable<ExpectedInfo>.mapNotNull(transform: (ExpectedInfo) -> FqName?): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo
    <R : Any> -> FqName

'it' @ [282:31] ==> value-parameter it: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.CompletionSession.calcContextForStatisticsInfo.<anonymous>[ValueParameterDescriptorImpl]

'fuzzyType' @ [282:34] ==> public val ExpectedInfo.fuzzyType: FuzzyType? defined in org.jetbrains.kotlin.idea.core[DeserializedPropertyDescriptor]

'type' @ [282:45] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'constructor' @ [282:51] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [282:64] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'importableFqName' @ [282:87] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'distinct' @ [283:18] ==> public fun <T> Iterable<FqName>.distinct(): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'singleOrNull' @ [284:18] ==> public fun <T> List<FqName>.singleOrNull(): FqName? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'let' @ [285:19] ==> @InlineOnly public inline fun <T, R> FqName.let(block: (FqName) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> String

'it' @ [285:40] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.idea.completion.CompletionSession.calcContextForStatisticsInfo.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [287:13] ==> var context: String? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.calcContextForStatisticsInfo[LocalVariableDescriptor]

'context' @ [288:13] ==> var context: String? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.calcContextForStatisticsInfo[LocalVariableDescriptor]

'expectedInfos' @ [288:23] ==> protected abstract val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'mapNotNull' @ [289:22] ==> public inline fun <T, R : Any> Iterable<ExpectedInfo>.mapNotNull(transform: (ExpectedInfo) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo
    <R : Any> -> String

'it' @ [289:35] ==> value-parameter it: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.CompletionSession.calcContextForStatisticsInfo.<anonymous>[ValueParameterDescriptorImpl]

'expectedName' @ [289:38] ==> public final val expectedName: String? defined in org.jetbrains.kotlin.idea.core.ExpectedInfo[DeserializedPropertyDescriptor]

'distinct' @ [290:22] ==> public fun <T> Iterable<String>.distinct(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'singleOrNull' @ [291:22] ==> public fun <T> List<String>.singleOrNull(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'let' @ [292:23] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [292:44] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.completion.CompletionSession.calcContextForStatisticsInfo.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [295:16] ==> var context: String? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.calcContextForStatisticsInfo[LocalVariableDescriptor]

'if (nameExpression != null) {
        ReferenceVariantsCollector(referenceVariantsHelper, indicesHelper(true), prefixMatcher,
                                   nameExpression, callTypeAndReceiver, resolutionFacade, bindingContext,
                                   importableFqNameClassifier, configuration)
    }
    else {
        null
    }' @ [298:48] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ReferenceVariantsCollector?, elseBranch: ReferenceVariantsCollector?): ReferenceVariantsCollector?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ReferenceVariantsCollector?

'nameExpression' @ [298:52] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'ReferenceVariantsCollector' @ [299:9] ==> public constructor ReferenceVariantsCollector(referenceVariantsHelper: ReferenceVariantsHelper, indicesHelper: KotlinIndicesHelper, prefixMatcher: PrefixMatcher, nameExpression: KtSimpleNameExpression, callTypeAndReceiver: CallTypeAndReceiver<*, *>, resolutionFacade: ResolutionFacade, bindingContext: BindingContext, importableFqNameClassifier: ImportableFqNameClassifier, configuration: CompletionSessionConfiguration, runtimeReceiver: ExpressionReceiver? = ...) defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[ClassConstructorDescriptorImpl]

'referenceVariantsHelper' @ [299:36] ==> protected final val referenceVariantsHelper: ReferenceVariantsHelper defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'indicesHelper' @ [299:61] ==> protected final fun indicesHelper(mayIncludeInaccessible: Boolean): KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.completion.CompletionSession[SimpleFunctionDescriptorImpl]

'prefixMatcher' @ [299:82] ==> protected final val prefixMatcher: CamelHumpMatcher defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'nameExpression' @ [300:36] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [300:52] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'resolutionFacade' @ [300:73] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'bindingContext' @ [300:91] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'importableFqNameClassifier' @ [301:36] ==> protected final val importableFqNameClassifier: ImportableFqNameClassifier defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'configuration' @ [301:64] ==> protected final val configuration: CompletionSessionConfiguration defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'ReferenceVariants' @ [308:16] ==> public constructor ReferenceVariants(imported: Collection<DeclarationDescriptor>, notImportedExtensions: Collection<CallableDescriptor>) defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[ClassConstructorDescriptorImpl]

'referenceVariantsHelper' @ [308:34] ==> protected final val referenceVariantsHelper: ReferenceVariantsHelper defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'excludeNonInitializedVariable' @ [308:58] ==> public final fun excludeNonInitializedVariable(variants: Collection<DeclarationDescriptor>, contextElement: PsiElement): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[DeserializedSimpleFunctionDescriptor]

'imported' @ [308:88] ==> public final val imported: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'position' @ [308:98] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'notImportedExtensions' @ [308:109] ==> public final val notImportedExtensions: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'referenceVariantsCollector' @ [312:24] ==> protected final val referenceVariantsCollector: ReferenceVariantsCollector? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'allCollected' @ [312:52] ==> public final val allCollected: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'descriptor' @ [313:61] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession.referenceVariantsWithSingleFunctionTypeParameter.<anonymous>[ValueParameterDescriptorImpl]

'LookupElementFactory' @ [313:97] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[FakeCallableDescriptorForObject]

'hasSingleFunctionTypeParameter' @ [313:118] ==> public final fun hasSingleFunctionTypeParameter(descriptor: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [313:149] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession.referenceVariantsWithSingleFunctionTypeParameter.<anonymous>[ValueParameterDescriptorImpl]

'ReferenceVariants' @ [314:16] ==> public constructor ReferenceVariants(imported: Collection<DeclarationDescriptor>, notImportedExtensions: Collection<CallableDescriptor>) defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[ClassConstructorDescriptorImpl]

'variants' @ [314:34] ==> val variants: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.CompletionSession.referenceVariantsWithSingleFunctionTypeParameter[LocalVariableDescriptor]

'imported' @ [314:43] ==> public final val imported: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'filter' @ [314:52] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'filter' @ [314:59] ==> val filter: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSession.referenceVariantsWithSingleFunctionTypeParameter[LocalVariableDescriptor]

'variants' @ [314:68] ==> val variants: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.CompletionSession.referenceVariantsWithSingleFunctionTypeParameter[LocalVariableDescriptor]

'notImportedExtensions' @ [314:77] ==> public final val notImportedExtensions: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'filter' @ [314:99] ==> public inline fun <T> Iterable<CallableDescriptor>.filter(predicate: (CallableDescriptor) -> Boolean): List<CallableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'filter' @ [314:106] ==> val filter: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSession.referenceVariantsWithSingleFunctionTypeParameter[LocalVariableDescriptor]

'file' @ [318:25] ==> protected final val file: KtFile defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'getCopyableUserData' @ [318:30] ==> @Nullable @Contract public open fun <T : (Any..Any?)> getCopyableUserData(p0: Key<((KtExpression) -> KotlinType?..((KtExpression) -> KotlinType?)?)>): ((KtExpression) -> KotlinType?)? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ((org.jetbrains.kotlin.psi.KtExpression) -> org.jetbrains.kotlin.types.KotlinType?..((org.jetbrains.kotlin.psi.KtExpression) -> org.jetbrains.kotlin.types.KotlinType?)?)

'RUNTIME_TYPE_EVALUATOR' @ [318:65] ==> public final val RUNTIME_TYPE_EVALUATOR: Key<(KtExpression) -> KotlinType?> defined in org.jetbrains.kotlin.psi.KtCodeFragment.Companion[DeserializedPropertyDescriptor]

'referenceVariantsCollector' @ [319:33] ==> protected final val referenceVariantsCollector: ReferenceVariantsCollector? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'allCollected' @ [319:61] ==> public final val allCollected: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [321:32] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'receiver' @ [321:52] ==> public final val receiver: KtElement? defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'bindingContext' @ [322:20] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'getType' @ [322:35] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'explicitReceiver' @ [322:43] ==> val explicitReceiver: KtExpression defined in org.jetbrains.kotlin.idea.completion.CompletionSession.getRuntimeReceiverTypeReferenceVariants[LocalVariableDescriptor]

'!' @ [323:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canHaveSubtypes' @ [323:24] ==> public open fun canHaveSubtypes(p0: (KotlinTypeChecker..KotlinTypeChecker?), @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'DEFAULT' @ [323:58] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'type' @ [323:67] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.completion.CompletionSession.getRuntimeReceiverTypeReferenceVariants[LocalVariableDescriptor]

'invoke' @ [325:27] ==> public abstract operator fun invoke(p1: KtExpression): KotlinType? defined in kotlin.Function1[FunctionInvokeDescriptor]

'explicitReceiver' @ [325:37] ==> val explicitReceiver: KtExpression defined in org.jetbrains.kotlin.idea.completion.CompletionSession.getRuntimeReceiverTypeReferenceVariants[LocalVariableDescriptor]

'runtimeType' @ [326:13] ==> val runtimeType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.getRuntimeReceiverTypeReferenceVariants[LocalVariableDescriptor]

'runtimeType' @ [326:36] ==> val runtimeType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.getRuntimeReceiverTypeReferenceVariants[LocalVariableDescriptor]

'type' @ [326:51] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.completion.CompletionSession.getRuntimeReceiverTypeReferenceVariants[LocalVariableDescriptor]

'ExpressionReceiver' @ [328:34] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[FakeCallableDescriptorForObject]

'create' @ [328:53] ==> public final fun create(expression: KtExpression, type: KotlinType, bindingContext: BindingContext): ExpressionReceiver defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion[DeserializedSimpleFunctionDescriptor]

'explicitReceiver' @ [328:60] ==> val explicitReceiver: KtExpression defined in org.jetbrains.kotlin.idea.completion.CompletionSession.getRuntimeReceiverTypeReferenceVariants[LocalVariableDescriptor]

'runtimeType' @ [328:78] ==> val runtimeType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.getRuntimeReceiverTypeReferenceVariants[LocalVariableDescriptor]

'bindingContext' @ [328:91] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'component1' @ [329:14] ==> public final operator fun component1(): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[SimpleFunctionDescriptorImpl]

'component2' @ [329:24] ==> public final operator fun component2(): Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[SimpleFunctionDescriptorImpl]

'ReferenceVariantsCollector' @ [329:49] ==> public constructor ReferenceVariantsCollector(referenceVariantsHelper: ReferenceVariantsHelper, indicesHelper: KotlinIndicesHelper, prefixMatcher: PrefixMatcher, nameExpression: KtSimpleNameExpression, callTypeAndReceiver: CallTypeAndReceiver<*, *>, resolutionFacade: ResolutionFacade, bindingContext: BindingContext, importableFqNameClassifier: ImportableFqNameClassifier, configuration: CompletionSessionConfiguration, runtimeReceiver: ExpressionReceiver? = ...) defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[ClassConstructorDescriptorImpl]

'referenceVariantsHelper' @ [330:17] ==> protected final val referenceVariantsHelper: ReferenceVariantsHelper defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'indicesHelper' @ [330:42] ==> protected final fun indicesHelper(mayIncludeInaccessible: Boolean): KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.completion.CompletionSession[SimpleFunctionDescriptorImpl]

'prefixMatcher' @ [330:63] ==> protected final val prefixMatcher: CamelHumpMatcher defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'nameExpression' @ [331:17] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [331:35] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'resolutionFacade' @ [331:56] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'bindingContext' @ [331:74] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'importableFqNameClassifier' @ [332:17] ==> protected final val importableFqNameClassifier: ImportableFqNameClassifier defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'configuration' @ [332:45] ==> protected final val configuration: CompletionSessionConfiguration defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'expressionReceiver' @ [332:78] ==> val expressionReceiver: ExpressionReceiver defined in org.jetbrains.kotlin.idea.completion.CompletionSession.getRuntimeReceiverTypeReferenceVariants[LocalVariableDescriptor]

'collectReferenceVariants' @ [333:11] ==> public final fun collectReferenceVariants(descriptorKindFilter: DescriptorKindFilter): ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[SimpleFunctionDescriptorImpl]

'descriptorKindFilter' @ [333:36] ==> protected abstract val descriptorKindFilter: DescriptorKindFilter? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'filterVariantsForRuntimeReceiverType' @ [334:32] ==> private final fun <TDescriptor : DeclarationDescriptor> filterVariantsForRuntimeReceiverType(runtimeVariants: Collection<DeclarationDescriptor>, baseVariants: Collection<DeclarationDescriptor>): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[SimpleFunctionDescriptorImpl]
Inferred types:
    <TDescriptor : DeclarationDescriptor> -> DeclarationDescriptor

'variants' @ [334:69] ==> val variants: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.CompletionSession.getRuntimeReceiverTypeReferenceVariants[LocalVariableDescriptor]

'referenceVariants' @ [334:79] ==> val referenceVariants: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.CompletionSession.getRuntimeReceiverTypeReferenceVariants[LocalVariableDescriptor]

'imported' @ [334:97] ==> public final val imported: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'filterVariantsForRuntimeReceiverType' @ [335:45] ==> private final fun <TDescriptor : DeclarationDescriptor> filterVariantsForRuntimeReceiverType(runtimeVariants: Collection<CallableDescriptor>, baseVariants: Collection<CallableDescriptor>): Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[SimpleFunctionDescriptorImpl]
Inferred types:
    <TDescriptor : DeclarationDescriptor> -> CallableDescriptor

'notImportedExtensions' @ [335:82] ==> val notImportedExtensions: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.CompletionSession.getRuntimeReceiverTypeReferenceVariants[LocalVariableDescriptor]

'referenceVariants' @ [335:105] ==> val referenceVariants: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.CompletionSession.getRuntimeReceiverTypeReferenceVariants[LocalVariableDescriptor]

'notImportedExtensions' @ [335:123] ==> public final val notImportedExtensions: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'ReferenceVariants' @ [337:31] ==> public constructor ReferenceVariants(imported: Collection<DeclarationDescriptor>, notImportedExtensions: Collection<CallableDescriptor>) defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[ClassConstructorDescriptorImpl]

'filteredVariants' @ [337:49] ==> val filteredVariants: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.CompletionSession.getRuntimeReceiverTypeReferenceVariants[LocalVariableDescriptor]

'filteredNotImportedExtensions' @ [337:67] ==> val filteredNotImportedExtensions: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.CompletionSession.getRuntimeReceiverTypeReferenceVariants[LocalVariableDescriptor]

'Pair' @ [338:16] ==> public constructor Pair<out A, out B>(first: ReferenceVariants, second: LookupElementFactory) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> ReferenceVariants
    <out B> -> LookupElementFactory

'runtimeVariants' @ [338:21] ==> val runtimeVariants: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.CompletionSession.getRuntimeReceiverTypeReferenceVariants[LocalVariableDescriptor]

'lookupElementFactory' @ [338:38] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.CompletionSession.getRuntimeReceiverTypeReferenceVariants[ValueParameterDescriptorImpl]

'copy' @ [338:59] ==> public final fun copy(basicFactory: BasicLookupElementFactory = ..., receiverTypes: Collection<ReceiverType>? = ..., callType: CallType<*> = ..., inDescriptor: DeclarationDescriptor = ..., contextVariablesProvider: ContextVariablesProvider = ..., standardLookupElementsPostProcessor: (LookupElement) -> LookupElement = ...): LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'listOf' @ [338:80] ==> public fun <T> listOf(element: ReceiverType): List<ReceiverType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverType

'ReceiverType' @ [338:87] ==> public constructor ReceiverType(type: KotlinType, receiverIndex: Int, implicit: Boolean = ...) defined in org.jetbrains.kotlin.idea.util.ReceiverType[DeserializedClassConstructorDescriptor]

'runtimeType' @ [338:100] ==> val runtimeType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.getRuntimeReceiverTypeReferenceVariants[LocalVariableDescriptor]

'baseVariants' @ [345:34] ==> value-parameter baseVariants: Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.completion.CompletionSession.filterVariantsForRuntimeReceiverType[ValueParameterDescriptorImpl]

'groupBy' @ [345:47] ==> public inline fun <T, K> Iterable<TDescriptor>.groupBy(keySelector: (TDescriptor) -> Name): Map<Name, List<TDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TDescriptor
    <K> -> Name

'it' @ [345:57] ==> value-parameter it: TDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession.filterVariantsForRuntimeReceiverType.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [345:60] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'ArrayList' @ [346:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TDescriptor

'runtimeVariants' @ [347:25] ==> value-parameter runtimeVariants: Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.completion.CompletionSession.filterVariantsForRuntimeReceiverType[ValueParameterDescriptorImpl]

'baseVariantsByName' @ [348:30] ==> val baseVariantsByName: Map<Name, List<TDescriptor>> defined in org.jetbrains.kotlin.idea.completion.CompletionSession.filterVariantsForRuntimeReceiverType[LocalVariableDescriptor]

'variant' @ [348:49] ==> val variant: TDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession.filterVariantsForRuntimeReceiverType[LocalVariableDescriptor]

'name' @ [348:57] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'candidates' @ [349:17] ==> val candidates: List<TDescriptor>? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.filterVariantsForRuntimeReceiverType[LocalVariableDescriptor]

'candidates' @ [349:39] ==> val candidates: List<TDescriptor>? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.filterVariantsForRuntimeReceiverType[LocalVariableDescriptor]

'none' @ [349:50] ==> public inline fun <T> Iterable<TDescriptor>.none(predicate: (TDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TDescriptor

'compareDescriptors' @ [349:57] ==> public fun compareDescriptors(project: Project, currentDescriptor: DeclarationDescriptor?, originalDescriptor: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'project' @ [349:76] ==> protected final val project: Project defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'variant' @ [349:85] ==> val variant: TDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession.filterVariantsForRuntimeReceiverType[LocalVariableDescriptor]

'it' @ [349:94] ==> value-parameter it: TDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession.filterVariantsForRuntimeReceiverType.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [350:17] ==> val result: ArrayList<TDescriptor> defined in org.jetbrains.kotlin.idea.completion.CompletionSession.filterVariantsForRuntimeReceiverType[LocalVariableDescriptor]

'add' @ [350:24] ==> public open fun add(element: TDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'variant' @ [350:28] ==> val variant: TDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession.filterVariantsForRuntimeReceiverType[LocalVariableDescriptor]

'result' @ [353:16] ==> val result: ArrayList<TDescriptor> defined in org.jetbrains.kotlin.idea.completion.CompletionSession.filterVariantsForRuntimeReceiverType[LocalVariableDescriptor]

'nameExpression' @ [357:13] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'==' @ [358:13] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'descriptorKindFilter' @ [358:14] ==> protected abstract val descriptorKindFilter: DescriptorKindFilter? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'kindMask' @ [358:36] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedPropertyDescriptor]

'and' @ [358:51] ==> public final infix fun and(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'CALLABLES_MASK' @ [358:76] ==> public final val CALLABLES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'callTypeAndReceiver' @ [359:13] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [360:16] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'receiver' @ [360:36] ==> public final val receiver: KtElement? defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'ShadowedDeclarationsFilter' @ [364:30] ==> public companion object defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[FakeCallableDescriptorForObject]

'create' @ [364:57] ==> public final fun create(bindingContext: BindingContext, resolutionFacade: ResolutionFacade, context: PsiElement, callTypeAndReceiver: CallTypeAndReceiver<*, *>): ShadowedDeclarationsFilter? defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.Companion[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [364:64] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'resolutionFacade' @ [364:80] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'nameExpression' @ [364:98] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [364:116] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'createNonImportedDeclarationsFilter' @ [365:19] ==> public final fun <TDescriptor : DeclarationDescriptor> createNonImportedDeclarationsFilter(importedDeclarations: Collection<DeclarationDescriptor>): (Collection<CallableDescriptor>) -> Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <TDescriptor : DeclarationDescriptor> -> CallableDescriptor

'referenceVariantsCollector' @ [365:75] ==> protected final val referenceVariantsCollector: ReferenceVariantsCollector? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'allCollected' @ [365:104] ==> public final val allCollected: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'imported' @ [365:117] ==> public final val imported: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'indicesHelper' @ [366:9] ==> protected final fun indicesHelper(mayIncludeInaccessible: Boolean): KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.completion.CompletionSession[SimpleFunctionDescriptorImpl]

'processTopLevelCallables' @ [366:29] ==> public final fun processTopLevelCallables(nameFilter: (String) -> Boolean, processor: (CallableDescriptor) -> Unit): Unit defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[DeserializedSimpleFunctionDescriptor]

'prefixMatcher' @ [366:56] ==> protected final val prefixMatcher: CamelHumpMatcher defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'prefixMatches' @ [366:70] ==> public open fun prefixMatches(@NotNull p0: String): Boolean defined in com.intellij.codeInsight.completion.impl.CamelHumpMatcher[JavaMethodDescriptor]

'it' @ [366:84] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.completion.CompletionSession.processTopLevelCallables.<anonymous>[ValueParameterDescriptorImpl]

'if (shadowedFilter != null) {
                shadowedFilter(listOf(it)).singleOrNull()?.let(processor)
            }
            else {
                processor(it)
            }' @ [367:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'shadowedFilter' @ [367:17] ==> val shadowedFilter: ((Collection<CallableDescriptor>) -> Collection<CallableDescriptor>)? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.processTopLevelCallables[LocalVariableDescriptor]

'invoke' @ [368:17] ==> public abstract operator fun invoke(p1: Collection<CallableDescriptor>): Collection<CallableDescriptor> defined in kotlin.Function1[FunctionInvokeDescriptor]

'listOf' @ [368:32] ==> public fun <T> listOf(element: CallableDescriptor): List<CallableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'it' @ [368:39] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession.processTopLevelCallables.<anonymous>[ValueParameterDescriptorImpl]

'singleOrNull' @ [368:44] ==> public fun <T> Iterable<CallableDescriptor>.singleOrNull(): CallableDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'let' @ [368:60] ==> @InlineOnly public inline fun <T, R> CallableDescriptor.let(block: (CallableDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor
    <R> -> Unit

'processor' @ [368:64] ==> value-parameter processor: (CallableDescriptor) -> Unit defined in org.jetbrains.kotlin.idea.completion.CompletionSession.processTopLevelCallables[ValueParameterDescriptorImpl]

'invoke' @ [371:17] ==> public abstract operator fun invoke(p1: CallableDescriptor): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [371:27] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession.processTopLevelCallables.<anonymous>[ValueParameterDescriptorImpl]

'CollectRequiredTypesContextVariablesProvider' @ [377:24] ==> public constructor CollectRequiredTypesContextVariablesProvider() defined in org.jetbrains.kotlin.idea.completion.CollectRequiredTypesContextVariablesProvider[ClassConstructorDescriptorImpl]

'createLookupElementFactory' @ [378:36] ==> protected open fun createLookupElementFactory(contextVariablesProvider: ContextVariablesProvider): LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.CompletionSession[SimpleFunctionDescriptorImpl]

'provider' @ [378:63] ==> val provider: CollectRequiredTypesContextVariablesProvider defined in org.jetbrains.kotlin.idea.completion.CompletionSession.withCollectRequiredContextVariableTypes[LocalVariableDescriptor]

'invoke' @ [379:9] ==> public abstract operator fun invoke(p1: LookupElementFactory): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'lookupElementFactory' @ [379:16] ==> val lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.CompletionSession.withCollectRequiredContextVariableTypes[LocalVariableDescriptor]

'provider' @ [380:16] ==> val provider: CollectRequiredTypesContextVariablesProvider defined in org.jetbrains.kotlin.idea.completion.CompletionSession.withCollectRequiredContextVariableTypes[LocalVariableDescriptor]

'requiredTypes' @ [380:25] ==> public final val requiredTypes: Set<FuzzyType> defined in org.jetbrains.kotlin.idea.completion.CollectRequiredTypesContextVariablesProvider[PropertyDescriptorImpl]

'createLookupElementFactory' @ [384:36] ==> protected open fun createLookupElementFactory(contextVariablesProvider: ContextVariablesProvider): LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.CompletionSession[SimpleFunctionDescriptorImpl]

'contextVariablesProvider' @ [384:63] ==> value-parameter contextVariablesProvider: ContextVariablesProvider defined in org.jetbrains.kotlin.idea.completion.CompletionSession.withContextVariablesProvider[ValueParameterDescriptorImpl]

'invoke' @ [385:9] ==> public abstract operator fun invoke(p1: LookupElementFactory): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'lookupElementFactory' @ [385:16] ==> val lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.CompletionSession.withContextVariablesProvider[LocalVariableDescriptor]

'LookupElementFactory' @ [389:16] ==> public constructor LookupElementFactory(basicFactory: BasicLookupElementFactory, receiverTypes: Collection<ReceiverType>?, callType: CallType<*>, inDescriptor: DeclarationDescriptor, contextVariablesProvider: ContextVariablesProvider, standardLookupElementsPostProcessor: (LookupElement) -> LookupElement = ...) defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[ClassConstructorDescriptorImpl]

'basicLookupElementFactory' @ [389:37] ==> protected final val basicLookupElementFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'receiverTypes' @ [389:64] ==> protected final val receiverTypes: Collection<ReceiverType>? defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [390:37] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'callType' @ [390:57] ==> public final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'inDescriptor' @ [390:67] ==> protected final val inDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'contextVariablesProvider' @ [390:81] ==> value-parameter contextVariablesProvider: ContextVariablesProvider defined in org.jetbrains.kotlin.idea.completion.CompletionSession.createLookupElementFactory[ValueParameterDescriptorImpl]

'callTypeAndReceiver' @ [396:29] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.CompletionSession.detectReceiverTypes[ValueParameterDescriptorImpl]

'receiverTypesWithIndex' @ [396:49] ==> public fun CallTypeAndReceiver<*, *>.receiverTypesWithIndex(bindingContext: BindingContext, contextElement: PsiElement, moduleDescriptor: ModuleDescriptor, resolutionFacade: ResolutionFacade, stableSmartCastsOnly: Boolean, withImplicitReceiversWhenExplicitPresent: Boolean = ...): Collection<ReceiverType>? defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [397:17] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.CompletionSession.detectReceiverTypes[ValueParameterDescriptorImpl]

'nameExpression' @ [397:33] ==> value-parameter nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.completion.CompletionSession.detectReceiverTypes[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [397:49] ==> protected final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'resolutionFacade' @ [397:67] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [401:13] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.CompletionSession.detectReceiverTypes[ValueParameterDescriptorImpl]

'isDebuggerContext' @ [401:64] ==> protected final val isDebuggerContext: Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSession[PropertyDescriptorImpl]

'receiverTypes' @ [402:13] ==> var receiverTypes: Collection<ReceiverType>? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.detectReceiverTypes[LocalVariableDescriptor]

'receiverTypes' @ [402:29] ==> var receiverTypes: Collection<ReceiverType>? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.detectReceiverTypes[LocalVariableDescriptor]

'map' @ [402:44] ==> public inline fun <T, R> Iterable<ReceiverType>.map(transform: (ReceiverType) -> ReceiverType): List<ReceiverType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverType
    <R> -> ReceiverType

'ReceiverType' @ [402:50] ==> public constructor ReceiverType(type: KotlinType, receiverIndex: Int, implicit: Boolean = ...) defined in org.jetbrains.kotlin.idea.util.ReceiverType[DeserializedClassConstructorDescriptor]

'it' @ [402:63] ==> value-parameter it: ReceiverType defined in org.jetbrains.kotlin.idea.completion.CompletionSession.detectReceiverTypes.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [402:66] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.ReceiverType[DeserializedPropertyDescriptor]

'makeNotNullable' @ [402:71] ==> public fun KotlinType.makeNotNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [402:90] ==> value-parameter it: ReceiverType defined in org.jetbrains.kotlin.idea.completion.CompletionSession.detectReceiverTypes.<anonymous>[ValueParameterDescriptorImpl]

'receiverIndex' @ [402:93] ==> public final val receiverIndex: Int defined in org.jetbrains.kotlin.idea.util.ReceiverType[DeserializedPropertyDescriptor]

'receiverTypes' @ [405:13] ==> var receiverTypes: Collection<ReceiverType>? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.detectReceiverTypes[LocalVariableDescriptor]

'nameExpression' @ [405:38] ==> value-parameter nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.completion.CompletionSession.detectReceiverTypes[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [405:53] ==> public val KtElement.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.idea.project[DeserializedPropertyDescriptor]

'supportsFeature' @ [405:77] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'DslMarkersSupport' @ [405:109] ==> enum entry DslMarkersSupport defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'receiverTypes' @ [406:13] ==> var receiverTypes: Collection<ReceiverType>? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.detectReceiverTypes[LocalVariableDescriptor]

'receiverTypes' @ [406:30] ==> var receiverTypes: Collection<ReceiverType>? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.detectReceiverTypes[LocalVariableDescriptor]

'shadowedByDslMarkers' @ [406:44] ==> public fun Collection<ReceiverType>.shadowedByDslMarkers(): Set<ReceiverType> defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'receiverTypes' @ [409:16] ==> var receiverTypes: Collection<ReceiverType>? defined in org.jetbrains.kotlin.idea.completion.CompletionSession.detectReceiverTypes[LocalVariableDescriptor]

