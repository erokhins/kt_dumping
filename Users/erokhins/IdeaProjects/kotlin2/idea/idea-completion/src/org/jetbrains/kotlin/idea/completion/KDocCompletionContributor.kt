'CompletionContributor' @ [47:35] ==> public constructor CompletionContributor() defined in com.intellij.codeInsight.completion.CompletionContributor[JavaClassConstructorDescriptor]

'extend' @ [49:9] ==> public final fun extend(@Nullable p0: CompletionType?, @NotNull p1: ElementPattern<out (PsiElement..PsiElement?)>, p2: (CompletionProvider<(CompletionParameters..CompletionParameters?)>..CompletionProvider<(CompletionParameters..CompletionParameters?)>?)): Unit defined in org.jetbrains.kotlin.idea.completion.KDocCompletionContributor[JavaMethodDescriptor]

'BASIC' @ [49:31] ==> enum entry BASIC defined in com.intellij.codeInsight.completion.CompletionType[FakeCallableDescriptorForObject]

'psiElement' @ [49:38] ==> public open fun psiElement(): (PsiElementPattern.Capture<(PsiElement..PsiElement?)>..PsiElementPattern.Capture<(PsiElement..PsiElement?)>?) defined in com.intellij.patterns.PlatformPatterns[JavaMethodDescriptor]

'inside' @ [49:51] ==> public open fun inside(@NotNull p0: Class<out (PsiElement..PsiElement?)>): (PsiElementPattern.Capture<(PsiElement..PsiElement?)>..PsiElementPattern.Capture<(PsiElement..PsiElement?)>?) defined in com.intellij.patterns.PsiElementPattern.Capture[JavaMethodDescriptor]

'KDocName' @ [49:58] ==> public constructor KDocName(node: ASTNode) defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocName[DeserializedClassConstructorDescriptor]

'java' @ [49:74] ==> public val <T> KClass<KDocName>.java: Class<KDocName> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KDocName

'KDocNameCompletionProvider' @ [50:16] ==> public object KDocNameCompletionProvider : CompletionProvider<CompletionParameters> defined in org.jetbrains.kotlin.idea.completion in file KDocCompletionContributor.kt[FakeCallableDescriptorForObject]

'extend' @ [52:9] ==> public final fun extend(@Nullable p0: CompletionType?, @NotNull p1: ElementPattern<out (PsiElement..PsiElement?)>, p2: (CompletionProvider<(CompletionParameters..CompletionParameters?)>..CompletionProvider<(CompletionParameters..CompletionParameters?)>?)): Unit defined in org.jetbrains.kotlin.idea.completion.KDocCompletionContributor[JavaMethodDescriptor]

'BASIC' @ [52:31] ==> enum entry BASIC defined in com.intellij.codeInsight.completion.CompletionType[FakeCallableDescriptorForObject]

'psiElement' @ [53:16] ==> public open fun psiElement(): (PsiElementPattern.Capture<(PsiElement..PsiElement?)>..PsiElementPattern.Capture<(PsiElement..PsiElement?)>?) defined in com.intellij.patterns.PlatformPatterns[JavaMethodDescriptor]

'afterLeaf' @ [53:29] ==> @NotNull public open fun afterLeaf(@NotNull p0: ElementPattern<out (PsiElement..PsiElement?)>): PsiElementPattern.Capture<(PsiElement..PsiElement?)> defined in com.intellij.patterns.PsiElementPattern.Capture[JavaMethodDescriptor]

'or' @ [54:41] ==> @SafeVarargs @NotNull public open fun <E : (Any..Any?)> or(@NotNull vararg p0: (ElementPattern<out (PsiElement..PsiElement?)>..ElementPattern<out (PsiElement..PsiElement?)>?)): ElementPattern<(PsiElement..PsiElement?)> defined in com.intellij.patterns.StandardPatterns[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'psiElement' @ [54:44] ==> public open fun psiElement(p0: (IElementType..IElementType?)): (PsiElementPattern.Capture<(PsiElement..PsiElement?)>..PsiElementPattern.Capture<(PsiElement..PsiElement?)>?) defined in com.intellij.patterns.PlatformPatterns[JavaMethodDescriptor]

'LEADING_ASTERISK' @ [54:66] ==> public final val LEADING_ASTERISK: (KDocToken..KDocToken?) defined in org.jetbrains.kotlin.kdoc.lexer.KDocTokens[JavaPropertyDescriptor]

'psiElement' @ [54:85] ==> public open fun psiElement(p0: (IElementType..IElementType?)): (PsiElementPattern.Capture<(PsiElement..PsiElement?)>..PsiElementPattern.Capture<(PsiElement..PsiElement?)>?) defined in com.intellij.patterns.PlatformPatterns[JavaMethodDescriptor]

'START' @ [54:107] ==> public final val START: (KDocToken..KDocToken?) defined in org.jetbrains.kotlin.kdoc.lexer.KDocTokens[JavaPropertyDescriptor]

'KDocTagCompletionProvider' @ [55:16] ==> public object KDocTagCompletionProvider : CompletionProvider<CompletionParameters> defined in org.jetbrains.kotlin.idea.completion in file KDocCompletionContributor.kt[FakeCallableDescriptorForObject]

'extend' @ [57:9] ==> public final fun extend(@Nullable p0: CompletionType?, @NotNull p1: ElementPattern<out (PsiElement..PsiElement?)>, p2: (CompletionProvider<(CompletionParameters..CompletionParameters?)>..CompletionProvider<(CompletionParameters..CompletionParameters?)>?)): Unit defined in org.jetbrains.kotlin.idea.completion.KDocCompletionContributor[JavaMethodDescriptor]

'BASIC' @ [57:31] ==> enum entry BASIC defined in com.intellij.codeInsight.completion.CompletionType[FakeCallableDescriptorForObject]

'psiElement' @ [58:16] ==> public open fun psiElement(p0: (IElementType..IElementType?)): (PsiElementPattern.Capture<(PsiElement..PsiElement?)>..PsiElementPattern.Capture<(PsiElement..PsiElement?)>?) defined in com.intellij.patterns.PlatformPatterns[JavaMethodDescriptor]

'TAG_NAME' @ [58:38] ==> public final val TAG_NAME: (KDocToken..KDocToken?) defined in org.jetbrains.kotlin.kdoc.lexer.KDocTokens[JavaPropertyDescriptor]

'KDocTagCompletionProvider' @ [58:49] ==> public object KDocTagCompletionProvider : CompletionProvider<CompletionParameters> defined in org.jetbrains.kotlin.idea.completion in file KDocCompletionContributor.kt[FakeCallableDescriptorForObject]

'CompletionProvider<CompletionParameters>' @ [62:37] ==> protected/*protected and package*/ constructor CompletionProvider<V : (CompletionParameters..CompletionParameters?)>() defined in com.intellij.codeInsight.completion.CompletionProvider[JavaClassConstructorDescriptor]
Inferred types:
    <V : (CompletionParameters..CompletionParameters?)> -> CompletionParameters

'KDocNameCompletionSession' @ [64:9] ==> public constructor KDocNameCompletionSession(parameters: CompletionParameters, toFromOriginalFileMapper: ToFromOriginalFileMapper, resultSet: CompletionResultSet) defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession[ClassConstructorDescriptorImpl]

'parameters' @ [64:35] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionProvider.addCompletions[ValueParameterDescriptorImpl]

'create' @ [64:72] ==> public final fun create(parameters: CompletionParameters): ToFromOriginalFileMapper defined in org.jetbrains.kotlin.idea.completion.ToFromOriginalFileMapper.Companion[SimpleFunctionDescriptorImpl]

'parameters' @ [64:79] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionProvider.addCompletions[ValueParameterDescriptorImpl]

'result' @ [64:92] ==> value-parameter result: CompletionResultSet defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionProvider.addCompletions[ValueParameterDescriptorImpl]

'complete' @ [64:100] ==> public final fun complete(): Boolean defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession[SimpleFunctionDescriptorImpl]

'CompletionSession' @ [72:5] ==> public constructor CompletionSession(configuration: CompletionSessionConfiguration, parameters: CompletionParameters, toFromOriginalFileMapper: ToFromOriginalFileMapper, resultSet: CompletionResultSet) defined in org.jetbrains.kotlin.idea.completion.CompletionSession[ClassConstructorDescriptorImpl]

'CompletionSessionConfiguration' @ [72:23] ==> public fun CompletionSessionConfiguration(parameters: CompletionParameters): CompletionSessionConfiguration defined in org.jetbrains.kotlin.idea.completion in file CompletionSession.kt[SimpleFunctionDescriptorImpl]

'parameters' @ [72:54] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.<init>[ValueParameterDescriptorImpl]

'parameters' @ [72:67] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.<init>[ValueParameterDescriptorImpl]

'toFromOriginalFileMapper' @ [72:79] ==> value-parameter toFromOriginalFileMapper: ToFromOriginalFileMapper defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.<init>[ValueParameterDescriptorImpl]

'resultSet' @ [72:105] ==> value-parameter resultSet: CompletionResultSet defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.<init>[ValueParameterDescriptorImpl]

'emptyList' @ [75:66] ==> public fun <T> emptyList(): List<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo

'parameters' @ [78:24] ==> protected final val parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession[PropertyDescriptorImpl]

'position' @ [78:35] ==> public final val CompletionParameters.position: PsiElement[MyPropertyDescriptor]

'getParentOfType' @ [78:44] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KDocName? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KDocName

'position' @ [79:27] ==> val position: KDocName defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.doComplete[LocalVariableDescriptor]

'getContainingDoc' @ [79:36] ==> public final fun getContainingDoc(): KDoc defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocName[DeserializedSimpleFunctionDescriptor]

'getOwner' @ [79:55] ==> public abstract fun getOwner(): KtDeclaration? defined in org.jetbrains.kotlin.kdoc.psi.api.KDoc[DeserializedSimpleFunctionDescriptor]

'position' @ [80:24] ==> val position: KDocName defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.doComplete[LocalVariableDescriptor]

'getStrictParentOfType' @ [80:33] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KDocLink? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KDocLink

'bindingContext' @ [81:37] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession[PropertyDescriptorImpl]

'DECLARATION_TO_DESCRIPTOR' @ [81:67] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'declaration' @ [81:94] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.doComplete[LocalVariableDescriptor]

'if (kdocLink.getTagIfSubject()?.knownTag == KDocKnownTag.PARAM) {
            addParamCompletions(position, declarationDescriptor)
        }
        else {
            addLinkCompletions(declarationDescriptor, kdocLink)
        }' @ [82:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'kdocLink' @ [82:13] ==> val kdocLink: KDocLink defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.doComplete[LocalVariableDescriptor]

'getTagIfSubject' @ [82:22] ==> public final fun getTagIfSubject(): KDocTag? defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocLink[DeserializedSimpleFunctionDescriptor]

'knownTag' @ [82:41] ==> public final val knownTag: KDocKnownTag? defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag[DeserializedPropertyDescriptor]

'PARAM' @ [82:66] ==> enum entry PARAM defined in org.jetbrains.kotlin.kdoc.parser.KDocKnownTag[FakeCallableDescriptorForObject]

'addParamCompletions' @ [83:13] ==> private final fun addParamCompletions(position: KDocName, declarationDescriptor: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession[SimpleFunctionDescriptorImpl]

'position' @ [83:33] ==> val position: KDocName defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.doComplete[LocalVariableDescriptor]

'declarationDescriptor' @ [83:43] ==> val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.doComplete[LocalVariableDescriptor]

'addLinkCompletions' @ [86:13] ==> private final fun addLinkCompletions(declarationDescriptor: DeclarationDescriptor, kDocLink: KDocLink): Unit defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession[SimpleFunctionDescriptorImpl]

'declarationDescriptor' @ [86:32] ==> val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.doComplete[LocalVariableDescriptor]

'kdocLink' @ [86:55] ==> val kdocLink: KDocLink defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.doComplete[LocalVariableDescriptor]

'position' @ [93:23] ==> value-parameter position: KDocName defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.addParamCompletions[ValueParameterDescriptorImpl]

'getContainingSection' @ [93:32] ==> public final fun getContainingSection(): KDocSection defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocName[DeserializedSimpleFunctionDescriptor]

'section' @ [94:36] ==> val section: KDocSection defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.addParamCompletions[LocalVariableDescriptor]

'findTagsByName' @ [94:44] ==> public final fun findTagsByName(name: String): List<KDocTag> defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocSection[DeserializedSimpleFunctionDescriptor]

'map' @ [94:68] ==> public inline fun <T, R> Iterable<KDocTag>.map(transform: (KDocTag) -> String?): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KDocTag
    <R> -> String?

'it' @ [94:74] ==> value-parameter it: KDocTag defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.addParamCompletions.<anonymous>[ValueParameterDescriptorImpl]

'getSubjectName' @ [94:77] ==> public open fun getSubjectName(): String? defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag[DeserializedSimpleFunctionDescriptor]

'toSet' @ [94:96] ==> public fun <T> Iterable<String?>.toSet(): Set<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'getParamDescriptors' @ [95:9] ==> public fun getParamDescriptors(fromDescriptor: DeclarationDescriptor): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.kdoc[DeserializedSimpleFunctionDescriptor]

'declarationDescriptor' @ [95:29] ==> value-parameter declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.addParamCompletions[ValueParameterDescriptorImpl]

'filter' @ [96:18] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [96:27] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.addParamCompletions.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [96:30] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [96:35] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'documentedParameters' @ [96:50] ==> val documentedParameters: Set<String?> defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.addParamCompletions[LocalVariableDescriptor]

'forEach' @ [97:18] ==> @HidesMembers public inline fun <T> Iterable<DeclarationDescriptor>.forEach(action: (DeclarationDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'collector' @ [98:21] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession[PropertyDescriptorImpl]

'addElement' @ [98:31] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'basicLookupElementFactory' @ [98:42] ==> protected final val basicLookupElementFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession[PropertyDescriptorImpl]

'createLookupElement' @ [98:68] ==> public final fun createLookupElement(descriptor: DeclarationDescriptor, qualifyNestedClasses: Boolean = ..., includeClassTypeArguments: Boolean = ..., parametersAndTypeGrayed: Boolean = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[SimpleFunctionDescriptorImpl]

'it' @ [98:88] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.addParamCompletions.<anonymous>[ValueParameterDescriptorImpl]

'getKDocLinkResolutionScope' @ [103:28] ==> public fun getKDocLinkResolutionScope(resolutionFacade: ResolutionFacade, contextDescriptor: DeclarationDescriptor): LexicalScope defined in org.jetbrains.kotlin.idea.kdoc[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [103:55] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession[PropertyDescriptorImpl]

'declarationDescriptor' @ [103:73] ==> value-parameter declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.collectDescriptorsForLinkCompletion[ValueParameterDescriptorImpl]

'kDocLink' @ [105:29] ==> value-parameter kDocLink: KDocLink defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.collectDescriptorsForLinkCompletion[ValueParameterDescriptorImpl]

'getLinkText' @ [105:38] ==> public final fun getLinkText(): String defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocLink[DeserializedSimpleFunctionDescriptor]

'split' @ [105:52] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'dropLast' @ [105:63] ==> public fun <T> List<String>.dropLast(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'descriptorNameFilter' @ [106:26] ==> protected final val descriptorNameFilter: (String) -> Boolean defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession[PropertyDescriptorImpl]

'toNameFilter' @ [106:47] ==> public fun ((String) -> Boolean).toNameFilter(): (Name) -> Boolean defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'if (qualifiedLink.isNotEmpty()) {
            val parentDescriptors = resolveKDocLink(bindingContext, resolutionFacade, declarationDescriptor, kDocLink.getTagIfSubject(), qualifiedLink)
            return parentDescriptors
                    .flatMap {
                        val scope = getKDocLinkMemberScope(it, contextScope)
                        scope.getContributedDescriptors(nameFilter = nameFilter)
                    }
        }
        else {
            return contextScope.collectDescriptorsFiltered(DescriptorKindFilter.ALL, nameFilter, changeNamesForAliased = true)
        }' @ [107:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'qualifiedLink' @ [107:13] ==> val qualifiedLink: List<String> defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.collectDescriptorsForLinkCompletion[LocalVariableDescriptor]

'isNotEmpty' @ [107:27] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'resolveKDocLink' @ [108:37] ==> public fun resolveKDocLink(context: BindingContext, resolutionFacade: ResolutionFacade, fromDescriptor: DeclarationDescriptor, fromSubjectOfTag: KDocTag?, qualifiedName: List<String>): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.kdoc[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [108:53] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession[PropertyDescriptorImpl]

'resolutionFacade' @ [108:69] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession[PropertyDescriptorImpl]

'declarationDescriptor' @ [108:87] ==> value-parameter declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.collectDescriptorsForLinkCompletion[ValueParameterDescriptorImpl]

'kDocLink' @ [108:110] ==> value-parameter kDocLink: KDocLink defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.collectDescriptorsForLinkCompletion[ValueParameterDescriptorImpl]

'getTagIfSubject' @ [108:119] ==> public final fun getTagIfSubject(): KDocTag? defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocLink[DeserializedSimpleFunctionDescriptor]

'qualifiedLink' @ [108:138] ==> val qualifiedLink: List<String> defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.collectDescriptorsForLinkCompletion[LocalVariableDescriptor]

'parentDescriptors' @ [109:20] ==> val parentDescriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.collectDescriptorsForLinkCompletion[LocalVariableDescriptor]

'flatMap' @ [110:22] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.flatMap(transform: (DeclarationDescriptor) -> Iterable<DeclarationDescriptor>): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> DeclarationDescriptor

'getKDocLinkMemberScope' @ [111:37] ==> public fun getKDocLinkMemberScope(descriptor: DeclarationDescriptor, contextScope: LexicalScope): MemberScope defined in org.jetbrains.kotlin.idea.kdoc[DeserializedSimpleFunctionDescriptor]

'it' @ [111:60] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.collectDescriptorsForLinkCompletion.<anonymous>[ValueParameterDescriptorImpl]

'contextScope' @ [111:64] ==> val contextScope: LexicalScope defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.collectDescriptorsForLinkCompletion[LocalVariableDescriptor]

'scope' @ [112:25] ==> val scope: MemberScope defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.collectDescriptorsForLinkCompletion.<anonymous>[LocalVariableDescriptor]

'getContributedDescriptors' @ [112:31] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'nameFilter' @ [112:70] ==> val nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.collectDescriptorsForLinkCompletion[LocalVariableDescriptor]

'contextScope' @ [116:20] ==> val contextScope: LexicalScope defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.collectDescriptorsForLinkCompletion[LocalVariableDescriptor]

'collectDescriptorsFiltered' @ [116:33] ==> public fun HierarchicalScope.collectDescriptorsFiltered(kindFilter: DescriptorKindFilter = ..., nameFilter: (Name) -> Boolean = ..., changeNamesForAliased: Boolean = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'ALL' @ [116:81] ==> @field:JvmField public final val ALL: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'nameFilter' @ [116:86] ==> val nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.collectDescriptorsForLinkCompletion[LocalVariableDescriptor]

'collectDescriptorsForLinkCompletion' @ [121:9] ==> private final fun collectDescriptorsForLinkCompletion(declarationDescriptor: DeclarationDescriptor, kDocLink: KDocLink): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession[SimpleFunctionDescriptorImpl]

'declarationDescriptor' @ [121:45] ==> value-parameter declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.addLinkCompletions[ValueParameterDescriptorImpl]

'kDocLink' @ [121:68] ==> value-parameter kDocLink: KDocLink defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.addLinkCompletions[ValueParameterDescriptorImpl]

'forEach' @ [121:78] ==> @HidesMembers public inline fun <T> Iterable<DeclarationDescriptor>.forEach(action: (DeclarationDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'basicLookupElementFactory' @ [122:27] ==> protected final val basicLookupElementFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession[PropertyDescriptorImpl]

'createLookupElement' @ [122:53] ==> public final fun createLookupElement(descriptor: DeclarationDescriptor, qualifyNestedClasses: Boolean = ..., includeClassTypeArguments: Boolean = ..., parametersAndTypeGrayed: Boolean = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[SimpleFunctionDescriptorImpl]

'it' @ [122:73] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.addLinkCompletions.<anonymous>[ValueParameterDescriptorImpl]

'collector' @ [123:13] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession[PropertyDescriptorImpl]

'addElement' @ [123:23] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'LookupElementDecorator<LookupElement>' @ [123:43] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'element' @ [123:81] ==> val element: LookupElement defined in org.jetbrains.kotlin.idea.completion.KDocNameCompletionSession.addLinkCompletions.<anonymous>[LocalVariableDescriptor]

'CompletionProvider<CompletionParameters>' @ [132:36] ==> protected/*protected and package*/ constructor CompletionProvider<V : (CompletionParameters..CompletionParameters?)>() defined in com.intellij.codeInsight.completion.CompletionProvider[JavaClassConstructorDescriptor]
Inferred types:
    <V : (CompletionParameters..CompletionParameters?)> -> CompletionParameters

'findIdentifierPrefix' @ [135:37] ==> public open fun findIdentifierPrefix(p0: (PsiElement..PsiElement?), p1: Int, p2: (ElementPattern<(Char..Char?)>..ElementPattern<(Char..Char?)>?), p3: (ElementPattern<(Char..Char?)>..ElementPattern<(Char..Char?)>?)): (String..String?) defined in com.intellij.codeInsight.completion.CompletionUtil[JavaMethodDescriptor]

'parameters' @ [136:17] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.KDocTagCompletionProvider.addCompletions[ValueParameterDescriptorImpl]

'position' @ [136:28] ==> public final val CompletionParameters.position: PsiElement[MyPropertyDescriptor]

'containingFile' @ [136:37] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'parameters' @ [137:17] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.KDocTagCompletionProvider.addCompletions[ValueParameterDescriptorImpl]

'offset' @ [137:28] ==> public final val CompletionParameters.offset: Int[MyPropertyDescriptor]

'or' @ [138:17] ==> public infix fun <T> ElementPattern<(Char..Char?)>.or(rhs: ElementPattern<(Char..Char?)>): ElementPattern<(Char..Char?)> defined in org.jetbrains.kotlin.idea.completion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (kotlin.Char..kotlin.Char?)

'character' @ [138:34] ==> @NotNull public open fun character(): CharPattern defined in com.intellij.patterns.StandardPatterns[JavaMethodDescriptor]

'javaIdentifierPart' @ [138:46] ==> public open fun javaIdentifierPart(): (CharPattern..CharPattern?) defined in com.intellij.patterns.CharPattern[JavaMethodDescriptor]

'singleCharPattern' @ [138:70] ==> public fun singleCharPattern(char: Char): CharPattern defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'or' @ [139:17] ==> public infix fun <T> ElementPattern<(Char..Char?)>.or(rhs: ElementPattern<(Char..Char?)>): ElementPattern<(Char..Char?)> defined in org.jetbrains.kotlin.idea.completion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (kotlin.Char..kotlin.Char?)

'character' @ [139:34] ==> @NotNull public open fun character(): CharPattern defined in com.intellij.patterns.StandardPatterns[JavaMethodDescriptor]

'javaIdentifierStart' @ [139:46] ==> public open fun javaIdentifierStart(): (CharPattern..CharPattern?) defined in com.intellij.patterns.CharPattern[JavaMethodDescriptor]

'singleCharPattern' @ [139:71] ==> public fun singleCharPattern(char: Char): CharPattern defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'prefix' @ [141:13] ==> val prefix: (String..String?) defined in org.jetbrains.kotlin.idea.completion.KDocTagCompletionProvider.addCompletions[LocalVariableDescriptor]

'isNotEmpty' @ [141:20] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!' @ [141:36] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'prefix' @ [141:37] ==> val prefix: (String..String?) defined in org.jetbrains.kotlin.idea.completion.KDocTagCompletionProvider.addCompletions[LocalVariableDescriptor]

'startsWith' @ [141:44] ==> public fun CharSequence.startsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'parameters' @ [144:25] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.KDocTagCompletionProvider.addCompletions[ValueParameterDescriptorImpl]

'position' @ [144:36] ==> public final val CompletionParameters.position: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [144:45] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KDoc? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KDoc

'getOwner' @ [144:79] ==> public abstract fun getOwner(): KtDeclaration? defined in org.jetbrains.kotlin.kdoc.psi.api.KDoc[DeserializedSimpleFunctionDescriptor]

'result' @ [145:32] ==> value-parameter result: CompletionResultSet defined in org.jetbrains.kotlin.idea.completion.KDocTagCompletionProvider.addCompletions[ValueParameterDescriptorImpl]

'withPrefixMatcher' @ [145:39] ==> @Contract @NotNull public abstract fun withPrefixMatcher(@NotNull p0: String): CompletionResultSet defined in com.intellij.codeInsight.completion.CompletionResultSet[JavaMethodDescriptor]

'prefix' @ [145:57] ==> val prefix: (String..String?) defined in org.jetbrains.kotlin.idea.completion.KDocTagCompletionProvider.addCompletions[LocalVariableDescriptor]

'KDocKnownTag' @ [146:9] ==> public companion object defined in org.jetbrains.kotlin.kdoc.parser.KDocKnownTag[FakeCallableDescriptorForObject]

'values' @ [146:22] ==> public final fun values(): Array<KDocKnownTag> defined in org.jetbrains.kotlin.kdoc.parser.KDocKnownTag[SimpleFunctionDescriptorImpl]

'forEach' @ [146:31] ==> public inline fun <T> Array<out KDocKnownTag>.forEach(action: (KDocKnownTag) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KDocKnownTag

'kdocOwner' @ [147:17] ==> val kdocOwner: KtDeclaration? defined in org.jetbrains.kotlin.idea.completion.KDocTagCompletionProvider.addCompletions[LocalVariableDescriptor]

'it' @ [147:38] ==> value-parameter it: KDocKnownTag defined in org.jetbrains.kotlin.idea.completion.KDocTagCompletionProvider.addCompletions.<anonymous>[ValueParameterDescriptorImpl]

'isApplicable' @ [147:41] ==> private final fun KDocKnownTag.isApplicable(declaration: KtDeclaration): Boolean defined in org.jetbrains.kotlin.idea.completion.KDocTagCompletionProvider[SimpleFunctionDescriptorImpl]

'kdocOwner' @ [147:54] ==> val kdocOwner: KtDeclaration? defined in org.jetbrains.kotlin.idea.completion.KDocTagCompletionProvider.addCompletions[LocalVariableDescriptor]

'resultWithPrefix' @ [148:17] ==> val resultWithPrefix: CompletionResultSet defined in org.jetbrains.kotlin.idea.completion.KDocTagCompletionProvider.addCompletions[LocalVariableDescriptor]

'addElement' @ [148:34] ==> public abstract fun addElement(@NotNull p0: LookupElement): Unit defined in com.intellij.codeInsight.completion.CompletionResultSet[JavaMethodDescriptor]

'create' @ [148:66] ==> @NotNull public open fun create(@NotNull p0: String): LookupElementBuilder defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'+' @ [148:73] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'it' @ [148:79] ==> value-parameter it: KDocKnownTag defined in org.jetbrains.kotlin.idea.completion.KDocTagCompletionProvider.addCompletions.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [148:82] ==> public final val name: String defined in org.jetbrains.kotlin.kdoc.parser.KDocKnownTag[DeserializedPropertyDescriptor]

'toLowerCase' @ [148:87] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'when (this) {
        KDocKnownTag.CONSTRUCTOR, KDocKnownTag.PROPERTY -> declaration is KtClassOrObject
        KDocKnownTag.RETURN -> declaration is KtNamedFunction
        KDocKnownTag.RECEIVER -> declaration is KtNamedFunction && declaration.receiverTypeReference != null
        else -> true
    }' @ [153:73] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [153:79] ==> <this> defined in org.jetbrains.kotlin.idea.completion.KDocTagCompletionProvider.isApplicable[ReceiverParameterDescriptorImpl]

'KDocKnownTag' @ [154:9] ==> public companion object defined in org.jetbrains.kotlin.kdoc.parser.KDocKnownTag[FakeCallableDescriptorForObject]

'CONSTRUCTOR' @ [154:22] ==> enum entry CONSTRUCTOR defined in org.jetbrains.kotlin.kdoc.parser.KDocKnownTag[FakeCallableDescriptorForObject]

'KDocKnownTag' @ [154:35] ==> public companion object defined in org.jetbrains.kotlin.kdoc.parser.KDocKnownTag[FakeCallableDescriptorForObject]

'PROPERTY' @ [154:48] ==> enum entry PROPERTY defined in org.jetbrains.kotlin.kdoc.parser.KDocKnownTag[FakeCallableDescriptorForObject]

'declaration' @ [154:60] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.completion.KDocTagCompletionProvider.isApplicable[ValueParameterDescriptorImpl]

'KDocKnownTag' @ [155:9] ==> public companion object defined in org.jetbrains.kotlin.kdoc.parser.KDocKnownTag[FakeCallableDescriptorForObject]

'RETURN' @ [155:22] ==> enum entry RETURN defined in org.jetbrains.kotlin.kdoc.parser.KDocKnownTag[FakeCallableDescriptorForObject]

'declaration' @ [155:32] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.completion.KDocTagCompletionProvider.isApplicable[ValueParameterDescriptorImpl]

'KDocKnownTag' @ [156:9] ==> public companion object defined in org.jetbrains.kotlin.kdoc.parser.KDocKnownTag[FakeCallableDescriptorForObject]

'RECEIVER' @ [156:22] ==> enum entry RECEIVER defined in org.jetbrains.kotlin.kdoc.parser.KDocKnownTag[FakeCallableDescriptorForObject]

'declaration' @ [156:34] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.completion.KDocTagCompletionProvider.isApplicable[ValueParameterDescriptorImpl]

'declaration' @ [156:68] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.completion.KDocTagCompletionProvider.isApplicable[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [156:80] ==> public final val KtNamedFunction.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

