'when (fromSubjectOfTag?.knownTag) {
            KDocKnownTag.PARAM -> resolveParamLink(fromDescriptor, qualifiedName)
            KDocKnownTag.SAMPLE -> resolveKDocSampleLink(context, resolutionFacade, fromDescriptor, qualifiedName)
            else -> resolveDefaultKDocLink(context, resolutionFacade, fromDescriptor, qualifiedName)
        }' @ [55:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<DeclarationDescriptor>, entry1: Collection<DeclarationDescriptor>, entry2: Collection<DeclarationDescriptor>): Collection<DeclarationDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<DeclarationDescriptor>

'fromSubjectOfTag' @ [55:15] ==> value-parameter fromSubjectOfTag: KDocTag? defined in org.jetbrains.kotlin.idea.kdoc.resolveKDocLink[ValueParameterDescriptorImpl]

'knownTag' @ [55:33] ==> public final val knownTag: KDocKnownTag? defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag[DeserializedPropertyDescriptor]

'KDocKnownTag' @ [56:13] ==> public companion object defined in org.jetbrains.kotlin.kdoc.parser.KDocKnownTag[FakeCallableDescriptorForObject]

'PARAM' @ [56:26] ==> enum entry PARAM defined in org.jetbrains.kotlin.kdoc.parser.KDocKnownTag[FakeCallableDescriptorForObject]

'resolveParamLink' @ [56:35] ==> private fun resolveParamLink(fromDescriptor: DeclarationDescriptor, qualifiedName: List<String>): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.kdoc[SimpleFunctionDescriptorImpl]

'fromDescriptor' @ [56:52] ==> value-parameter fromDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.resolveKDocLink[ValueParameterDescriptorImpl]

'qualifiedName' @ [56:68] ==> value-parameter qualifiedName: List<String> defined in org.jetbrains.kotlin.idea.kdoc.resolveKDocLink[ValueParameterDescriptorImpl]

'KDocKnownTag' @ [57:13] ==> public companion object defined in org.jetbrains.kotlin.kdoc.parser.KDocKnownTag[FakeCallableDescriptorForObject]

'SAMPLE' @ [57:26] ==> enum entry SAMPLE defined in org.jetbrains.kotlin.kdoc.parser.KDocKnownTag[FakeCallableDescriptorForObject]

'resolveKDocSampleLink' @ [57:36] ==> public fun resolveKDocSampleLink(context: BindingContext, resolutionFacade: ResolutionFacade, fromDescriptor: DeclarationDescriptor, qualifiedName: List<String>): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.kdoc[SimpleFunctionDescriptorImpl]

'context' @ [57:58] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.kdoc.resolveKDocLink[ValueParameterDescriptorImpl]

'resolutionFacade' @ [57:67] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.kdoc.resolveKDocLink[ValueParameterDescriptorImpl]

'fromDescriptor' @ [57:85] ==> value-parameter fromDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.resolveKDocLink[ValueParameterDescriptorImpl]

'qualifiedName' @ [57:101] ==> value-parameter qualifiedName: List<String> defined in org.jetbrains.kotlin.idea.kdoc.resolveKDocLink[ValueParameterDescriptorImpl]

'resolveDefaultKDocLink' @ [58:21] ==> private fun resolveDefaultKDocLink(context: BindingContext, resolutionFacade: ResolutionFacade, fromDescriptor: DeclarationDescriptor, qualifiedName: List<String>): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.kdoc[SimpleFunctionDescriptorImpl]

'context' @ [58:44] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.kdoc.resolveKDocLink[ValueParameterDescriptorImpl]

'resolutionFacade' @ [58:53] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.kdoc.resolveKDocLink[ValueParameterDescriptorImpl]

'fromDescriptor' @ [58:71] ==> value-parameter fromDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.resolveKDocLink[ValueParameterDescriptorImpl]

'qualifiedName' @ [58:87] ==> value-parameter qualifiedName: List<String> defined in org.jetbrains.kotlin.idea.kdoc.resolveKDocLink[ValueParameterDescriptorImpl]

'when (fromDescriptor) {
        is CallableDescriptor -> {
            return fromDescriptor.valueParameters + fromDescriptor.typeParameters
        }

        is ClassifierDescriptor -> {
            val typeParams = fromDescriptor.typeConstructor.parameters
            if (fromDescriptor is ClassDescriptor) {
                val constructorDescriptor = fromDescriptor.unsubstitutedPrimaryConstructor
                if (constructorDescriptor != null) {
                    return typeParams + constructorDescriptor.valueParameters
                }
            }
            return typeParams
        }

        else -> {
            return emptyList()
        }
    }' @ [64:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'fromDescriptor' @ [64:11] ==> value-parameter fromDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getParamDescriptors[ValueParameterDescriptorImpl]

'fromDescriptor' @ [66:20] ==> value-parameter fromDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getParamDescriptors[ValueParameterDescriptorImpl]

'valueParameters' @ [66:35] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'fromDescriptor' @ [66:53] ==> value-parameter fromDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getParamDescriptors[ValueParameterDescriptorImpl]

'typeParameters' @ [66:68] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'fromDescriptor' @ [70:30] ==> value-parameter fromDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getParamDescriptors[ValueParameterDescriptorImpl]

'typeConstructor' @ [70:45] ==> public final val ClassifierDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'parameters' @ [70:61] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'fromDescriptor' @ [71:17] ==> value-parameter fromDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getParamDescriptors[ValueParameterDescriptorImpl]

'fromDescriptor' @ [72:45] ==> value-parameter fromDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getParamDescriptors[ValueParameterDescriptorImpl]

'unsubstitutedPrimaryConstructor' @ [72:60] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'constructorDescriptor' @ [73:21] ==> val constructorDescriptor: ClassConstructorDescriptor? defined in org.jetbrains.kotlin.idea.kdoc.getParamDescriptors[LocalVariableDescriptor]

'typeParams' @ [74:28] ==> val typeParams: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.idea.kdoc.getParamDescriptors[LocalVariableDescriptor]

'constructorDescriptor' @ [74:41] ==> val constructorDescriptor: ClassConstructorDescriptor? defined in org.jetbrains.kotlin.idea.kdoc.getParamDescriptors[LocalVariableDescriptor]

'valueParameters' @ [74:63] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'typeParams' @ [77:20] ==> val typeParams: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.idea.kdoc.getParamDescriptors[LocalVariableDescriptor]

'emptyList' @ [81:20] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'qualifiedName' @ [87:16] ==> value-parameter qualifiedName: List<String> defined in org.jetbrains.kotlin.idea.kdoc.resolveParamLink[ValueParameterDescriptorImpl]

'singleOrNull' @ [87:30] ==> public fun <T> List<String>.singleOrNull(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'emptyList' @ [87:55] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'getParamDescriptors' @ [88:12] ==> public fun getParamDescriptors(fromDescriptor: DeclarationDescriptor): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.kdoc[SimpleFunctionDescriptorImpl]

'fromDescriptor' @ [88:32] ==> value-parameter fromDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.resolveParamLink[ValueParameterDescriptorImpl]

'filter' @ [88:48] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [88:57] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.resolveParamLink.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [88:60] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [88:65] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [88:79] ==> val name: String defined in org.jetbrains.kotlin.idea.kdoc.resolveParamLink[LocalVariableDescriptor]

'SampleResolutionService' @ [98:30] ==> public companion object defined in org.jetbrains.kotlin.idea.kdoc.SampleResolutionService[FakeCallableDescriptorForObject]

'resolveSample' @ [98:54] ==> internal final fun resolveSample(context: BindingContext, fromDescriptor: DeclarationDescriptor, resolutionFacade: ResolutionFacade, qualifiedName: List<String>): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.kdoc.SampleResolutionService.Companion[SimpleFunctionDescriptorImpl]

'context' @ [98:68] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.kdoc.resolveKDocSampleLink[ValueParameterDescriptorImpl]

'fromDescriptor' @ [98:77] ==> value-parameter fromDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.resolveKDocSampleLink[ValueParameterDescriptorImpl]

'resolutionFacade' @ [98:93] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.kdoc.resolveKDocSampleLink[ValueParameterDescriptorImpl]

'qualifiedName' @ [98:111] ==> value-parameter qualifiedName: List<String> defined in org.jetbrains.kotlin.idea.kdoc.resolveKDocSampleLink[ValueParameterDescriptorImpl]

'resolvedViaService' @ [99:9] ==> val resolvedViaService: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.kdoc.resolveKDocSampleLink[LocalVariableDescriptor]

'isNotEmpty' @ [99:28] ==> @InlineOnly public inline fun <T> Collection<DeclarationDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'resolvedViaService' @ [99:49] ==> val resolvedViaService: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.kdoc.resolveKDocSampleLink[LocalVariableDescriptor]

'resolveDefaultKDocLink' @ [101:12] ==> private fun resolveDefaultKDocLink(context: BindingContext, resolutionFacade: ResolutionFacade, fromDescriptor: DeclarationDescriptor, qualifiedName: List<String>): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.kdoc[SimpleFunctionDescriptorImpl]

'context' @ [101:35] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.kdoc.resolveKDocSampleLink[ValueParameterDescriptorImpl]

'resolutionFacade' @ [101:44] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.kdoc.resolveKDocSampleLink[ValueParameterDescriptorImpl]

'fromDescriptor' @ [101:62] ==> value-parameter fromDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.resolveKDocSampleLink[ValueParameterDescriptorImpl]

'qualifiedName' @ [101:78] ==> value-parameter qualifiedName: List<String> defined in org.jetbrains.kotlin.idea.kdoc.resolveKDocSampleLink[ValueParameterDescriptorImpl]

'getKDocLinkResolutionScope' @ [111:24] ==> public fun getKDocLinkResolutionScope(resolutionFacade: ResolutionFacade, contextDescriptor: DeclarationDescriptor): LexicalScope defined in org.jetbrains.kotlin.idea.kdoc in file resolveKDocLink.kt[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [111:51] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[ValueParameterDescriptorImpl]

'fromDescriptor' @ [111:69] ==> value-parameter fromDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[ValueParameterDescriptorImpl]

'qualifiedName' @ [113:9] ==> value-parameter qualifiedName: List<String> defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[ValueParameterDescriptorImpl]

'size' @ [113:23] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'identifier' @ [114:30] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'qualifiedName' @ [114:41] ==> value-parameter qualifiedName: List<String> defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[ValueParameterDescriptorImpl]

'single' @ [114:55] ==> public fun <T> List<String>.single(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'SmartList' @ [116:33] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'descriptorsByName' @ [117:9] ==> val descriptorsByName: SmartList<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'addIfNotNull' @ [117:27] ==> public fun <T : Any> MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>.addIfNotNull(t: DeclarationDescriptor?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'contextScope' @ [117:40] ==> val contextScope: LexicalScope defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'findClassifier' @ [117:53] ==> public fun HierarchicalScope.findClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'shortName' @ [117:68] ==> val shortName: Name defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'FROM_IDE' @ [117:96] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'descriptorsByName' @ [118:9] ==> val descriptorsByName: SmartList<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'addIfNotNull' @ [118:27] ==> public fun <T : Any> MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>.addIfNotNull(t: DeclarationDescriptor?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'contextScope' @ [118:40] ==> val contextScope: LexicalScope defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'findPackage' @ [118:53] ==> public fun HierarchicalScope.findPackage(name: Name): PackageViewDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'shortName' @ [118:65] ==> val shortName: Name defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'descriptorsByName' @ [119:9] ==> val descriptorsByName: SmartList<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'addAll' @ [119:27] ==> public open fun addAll(elements: Collection<(DeclarationDescriptor..DeclarationDescriptor?)>): Boolean defined in org.jetbrains.kotlin.utils.SmartList[JavaMethodDescriptor]

'contextScope' @ [119:34] ==> val contextScope: LexicalScope defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'collectFunctions' @ [119:47] ==> public fun HierarchicalScope.collectFunctions(name: Name, location: LookupLocation): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'shortName' @ [119:64] ==> val shortName: Name defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'FROM_IDE' @ [119:92] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'descriptorsByName' @ [120:9] ==> val descriptorsByName: SmartList<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'addAll' @ [120:27] ==> public open fun addAll(elements: Collection<(DeclarationDescriptor..DeclarationDescriptor?)>): Boolean defined in org.jetbrains.kotlin.utils.SmartList[JavaMethodDescriptor]

'contextScope' @ [120:34] ==> val contextScope: LexicalScope defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'collectVariables' @ [120:47] ==> public fun HierarchicalScope.collectVariables(name: Name, location: LookupLocation): Collection<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'shortName' @ [120:64] ==> val shortName: Name defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'FROM_IDE' @ [120:92] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'descriptorsByName' @ [123:32] ==> val descriptorsByName: SmartList<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'filter' @ [123:50] ==> public inline fun <T> Iterable<(DeclarationDescriptor..DeclarationDescriptor?)>.filter(predicate: ((DeclarationDescriptor..DeclarationDescriptor?)) -> Boolean): List<(DeclarationDescriptor..DeclarationDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'it' @ [123:59] ==> value-parameter it: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [123:62] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'fromDescriptor' @ [123:87] ==> value-parameter fromDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[ValueParameterDescriptorImpl]

'localDescriptors' @ [124:13] ==> val localDescriptors: List<(DeclarationDescriptor..DeclarationDescriptor?)> defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'isNotEmpty' @ [124:30] ==> @InlineOnly public inline fun <T> Collection<(DeclarationDescriptor..DeclarationDescriptor?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'localDescriptors' @ [124:51] ==> val localDescriptors: List<(DeclarationDescriptor..DeclarationDescriptor?)> defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'descriptorsByName' @ [126:16] ==> val descriptorsByName: SmartList<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'fromDescriptor' @ [129:28] ==> value-parameter fromDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[ValueParameterDescriptorImpl]

'module' @ [129:43] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'resolutionFacade' @ [130:39] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[ValueParameterDescriptorImpl]

'getFrontendService' @ [130:56] ==> public abstract fun <T : Any> getFrontendService(moduleDescriptor: ModuleDescriptor, serviceClass: Class<QualifiedExpressionResolver>): QualifiedExpressionResolver defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> QualifiedExpressionResolver

'moduleDescriptor' @ [130:75] ==> val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'QualifiedExpressionResolver' @ [130:93] ==> public constructor QualifiedExpressionResolver() defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver[DeserializedClassConstructorDescriptor]

'java' @ [130:128] ==> public val <T> KClass<QualifiedExpressionResolver>.java: Class<QualifiedExpressionResolver> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> QualifiedExpressionResolver

'DescriptorToSourceUtils' @ [132:26] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [132:50] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'fromDescriptor' @ [132:74] ==> value-parameter fromDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [133:19] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'resolutionFacade' @ [133:32] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[ValueParameterDescriptorImpl]

'project' @ [133:49] ==> public abstract val project: Project defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[PropertyDescriptorImpl]

'factory' @ [135:24] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'createExpressionCodeFragment' @ [135:32] ==> public final fun createExpressionCodeFragment(text: String, context: PsiElement?): KtExpressionCodeFragment defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'qualifiedName' @ [135:61] ==> value-parameter qualifiedName: List<String> defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[ValueParameterDescriptorImpl]

'joinToString' @ [135:75] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'contextElement' @ [135:94] ==> val contextElement: PsiElement? defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'codeFragment' @ [136:31] ==> val codeFragment: KtExpressionCodeFragment defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'findElementAt' @ [136:44] ==> public open fun findElementAt(p0: Int): PsiElement? defined in org.jetbrains.kotlin.psi.KtExpressionCodeFragment[JavaMethodDescriptor]

'codeFragment' @ [136:58] ==> val codeFragment: KtExpressionCodeFragment defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'textLength' @ [136:71] ==> public final val KtExpressionCodeFragment.textLength: Int[MyPropertyDescriptor]

'getStrictParentOfType' @ [136:88] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtQualifiedExpression

'emptyList' @ [136:145] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'component1' @ [137:10] ==> public final operator fun component1(): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.QualifiedExpressionResolveResult[DeserializedSimpleFunctionDescriptor]

'component2' @ [137:22] ==> public final operator fun component2(): Name? defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.QualifiedExpressionResolveResult[DeserializedSimpleFunctionDescriptor]

'qualifiedExpressionResolver' @ [137:36] ==> val qualifiedExpressionResolver: QualifiedExpressionResolver defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'resolveClassOrPackageInQualifiedExpression' @ [137:64] ==> public final fun resolveClassOrPackageInQualifiedExpression(expression: KtQualifiedExpression, scope: LexicalScope, context: BindingContext): QualifiedExpressionResolver.QualifiedExpressionResolveResult defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver[DeserializedSimpleFunctionDescriptor]

'qualifiedExpression' @ [137:107] ==> val qualifiedExpression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'contextScope' @ [137:128] ==> val contextScope: LexicalScope defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'context' @ [137:142] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[ValueParameterDescriptorImpl]

'descriptor' @ [138:9] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'emptyList' @ [138:36] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'memberName' @ [139:9] ==> val memberName: Name? defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'getKDocLinkMemberScope' @ [140:27] ==> public fun getKDocLinkMemberScope(descriptor: DeclarationDescriptor, contextScope: LexicalScope): MemberScope defined in org.jetbrains.kotlin.idea.kdoc in file resolveKDocLink.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [140:50] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'contextScope' @ [140:62] ==> val contextScope: LexicalScope defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'memberScope' @ [141:16] ==> val memberScope: MemberScope defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'getContributedFunctions' @ [141:28] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'memberName' @ [141:52] ==> val memberName: Name? defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'FROM_IDE' @ [141:81] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'memberScope' @ [142:16] ==> val memberScope: MemberScope defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'getContributedVariables' @ [142:28] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'memberName' @ [142:52] ==> val memberName: Name? defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'FROM_IDE' @ [142:81] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'listOfNotNull' @ [143:16] ==> public fun <T : Any> listOfNotNull(element: ClassifierDescriptor?): List<ClassifierDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassifierDescriptor

'memberScope' @ [143:30] ==> val memberScope: MemberScope defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'getContributedClassifier' @ [143:42] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'memberName' @ [143:67] ==> val memberName: Name? defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'FROM_IDE' @ [143:96] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'listOf' @ [145:12] ==> public fun <T> listOf(element: DeclarationDescriptor): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'descriptor' @ [145:19] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.kdoc.resolveDefaultKDocLink[LocalVariableDescriptor]

'descriptor' @ [149:12] ==> value-parameter descriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getPackageInnerScope[ValueParameterDescriptorImpl]

'containingDeclaration' @ [149:23] ==> public final val PackageFragmentDescriptor.containingDeclaration: ModuleDescriptor[MyPropertyDescriptor]

'getPackage' @ [149:45] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [149:56] ==> value-parameter descriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getPackageInnerScope[ValueParameterDescriptorImpl]

'fqName' @ [149:67] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'memberScope' @ [149:75] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'LexicalScopeImpl' @ [154:23] ==> @JvmOverloads public constructor LexicalScopeImpl(parent: HierarchicalScope, ownerDescriptor: DeclarationDescriptor, isOwnerDescriptorAccessibleByLabel: Boolean, implicitReceiver: ReceiverParameterDescriptor?, kind: LexicalScopeKind, redeclarationChecker: LocalRedeclarationChecker = ..., initialize: LexicalScopeImpl.InitializeHandler.() -> Unit = ...) defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeImpl[DeserializedClassConstructorDescriptor]

'outerScope' @ [154:40] ==> value-parameter outerScope: LexicalScope defined in org.jetbrains.kotlin.idea.kdoc.getClassInnerScope[ValueParameterDescriptorImpl]

'descriptor' @ [154:52] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getClassInnerScope[ValueParameterDescriptorImpl]

'descriptor' @ [154:71] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getClassInnerScope[ValueParameterDescriptorImpl]

'thisAsReceiverParameter' @ [154:82] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'SYNTHETIC' @ [155:57] ==> enum entry SYNTHETIC defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeKind[FakeCallableDescriptorForObject]

'descriptor' @ [156:9] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getClassInnerScope[ValueParameterDescriptorImpl]

'declaredTypeParameters' @ [156:20] ==> public final val ClassDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'forEach' @ [156:43] ==> @HidesMembers public inline fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.forEach(action: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'addClassifierDescriptor' @ [156:53] ==> public final fun addClassifierDescriptor(classifierDescriptor: ClassifierDescriptor): Unit defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeImpl.InitializeHandler[DeserializedSimpleFunctionDescriptor]

'it' @ [156:77] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.idea.kdoc.getClassInnerScope.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [157:9] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getClassInnerScope[ValueParameterDescriptorImpl]

'constructors' @ [157:20] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'forEach' @ [157:33] ==> @HidesMembers public inline fun <T> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.forEach(action: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'addFunctionDescriptor' @ [157:43] ==> public final fun addFunctionDescriptor(functionDescriptor: FunctionDescriptor): Unit defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeImpl.InitializeHandler[DeserializedSimpleFunctionDescriptor]

'it' @ [157:65] ==> value-parameter it: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.idea.kdoc.getClassInnerScope.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'listOfNotNull' @ [160:22] ==> public fun <T : Any> listOfNotNull(vararg elements: MemberScope?): List<MemberScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> MemberScope

'descriptor' @ [161:13] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getClassInnerScope[ValueParameterDescriptorImpl]

'defaultType' @ [161:24] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'memberScope' @ [161:36] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'descriptor' @ [162:13] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getClassInnerScope[ValueParameterDescriptorImpl]

'staticScope' @ [162:24] ==> public final val ClassDescriptor.staticScope: MemberScope[MyPropertyDescriptor]

'descriptor' @ [163:13] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getClassInnerScope[ValueParameterDescriptorImpl]

'companionObjectDescriptor' @ [163:24] ==> public final val ClassDescriptor.companionObjectDescriptor: ClassDescriptor?[MyPropertyDescriptor]

'defaultType' @ [163:51] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'memberScope' @ [163:64] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'LexicalChainedScope' @ [165:12] ==> @JvmOverloads public constructor LexicalChainedScope(parent: LexicalScope, ownerDescriptor: DeclarationDescriptor, isOwnerDescriptorAccessibleByLabel: Boolean, implicitReceiver: ReceiverParameterDescriptor?, kind: LexicalScopeKind, memberScopes: List<MemberScope>, isStaticScope: Boolean = ...) defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope[DeserializedClassConstructorDescriptor]

'headerScope' @ [165:32] ==> val headerScope: LexicalScopeImpl defined in org.jetbrains.kotlin.idea.kdoc.getClassInnerScope[LocalVariableDescriptor]

'descriptor' @ [165:45] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getClassInnerScope[ValueParameterDescriptorImpl]

'SYNTHETIC' @ [165:87] ==> enum entry SYNTHETIC defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeKind[FakeCallableDescriptorForObject]

'scopeChain' @ [165:98] ==> val scopeChain: List<MemberScope> defined in org.jetbrains.kotlin.idea.kdoc.getClassInnerScope[LocalVariableDescriptor]

'when (contextDescriptor) {
        is ClassDescriptor ->
            getClassInnerScope(getOuterScope(contextDescriptor, resolutionFacade), contextDescriptor)

        is FunctionDescriptor ->
            FunctionDescriptorUtil.getFunctionInnerScope(getOuterScope(contextDescriptor, resolutionFacade),
                                                         contextDescriptor, LocalRedeclarationChecker.DO_NOTHING)

        is PropertyDescriptor ->
            ScopeUtils.makeScopeForPropertyHeader(getOuterScope(contextDescriptor, resolutionFacade), contextDescriptor)

        is DeclarationDescriptorNonRoot ->
            getOuterScope(contextDescriptor, resolutionFacade)

        else -> throw IllegalArgumentException("Cannot find resolution scope for root $contextDescriptor")
    }' @ [169:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: LexicalScope, entry1: LexicalScope, entry2: LexicalScope, entry3: LexicalScope, entry4: LexicalScope): LexicalScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> LexicalScope

'contextDescriptor' @ [169:18] ==> value-parameter contextDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getKDocLinkResolutionScope[ValueParameterDescriptorImpl]

'getClassInnerScope' @ [171:13] ==> private fun getClassInnerScope(outerScope: LexicalScope, descriptor: ClassDescriptor): LexicalScope defined in org.jetbrains.kotlin.idea.kdoc in file resolveKDocLink.kt[SimpleFunctionDescriptorImpl]

'getOuterScope' @ [171:32] ==> private fun getOuterScope(descriptor: DeclarationDescriptorWithSource, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.kdoc in file resolveKDocLink.kt[SimpleFunctionDescriptorImpl]

'contextDescriptor' @ [171:46] ==> value-parameter contextDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getKDocLinkResolutionScope[ValueParameterDescriptorImpl]

'resolutionFacade' @ [171:65] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.kdoc.getKDocLinkResolutionScope[ValueParameterDescriptorImpl]

'contextDescriptor' @ [171:84] ==> value-parameter contextDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getKDocLinkResolutionScope[ValueParameterDescriptorImpl]

'getFunctionInnerScope' @ [174:36] ==> @NotNull public open fun getFunctionInnerScope(@NotNull p0: LexicalScope, @NotNull p1: FunctionDescriptor, @NotNull p2: LocalRedeclarationChecker): LexicalScope defined in org.jetbrains.kotlin.resolve.FunctionDescriptorUtil[JavaMethodDescriptor]

'getOuterScope' @ [174:58] ==> private fun getOuterScope(descriptor: DeclarationDescriptorWithSource, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.kdoc in file resolveKDocLink.kt[SimpleFunctionDescriptorImpl]

'contextDescriptor' @ [174:72] ==> value-parameter contextDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getKDocLinkResolutionScope[ValueParameterDescriptorImpl]

'resolutionFacade' @ [174:91] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.kdoc.getKDocLinkResolutionScope[ValueParameterDescriptorImpl]

'contextDescriptor' @ [175:58] ==> value-parameter contextDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getKDocLinkResolutionScope[ValueParameterDescriptorImpl]

'DO_NOTHING' @ [175:103] ==> public object DO_NOTHING : LocalRedeclarationChecker defined in org.jetbrains.kotlin.resolve.scopes.LocalRedeclarationChecker[FakeCallableDescriptorForObject]

'makeScopeForPropertyHeader' @ [178:24] ==> public open fun makeScopeForPropertyHeader(@NotNull p0: LexicalScope, @NotNull p1: PropertyDescriptor): (LexicalScope..LexicalScope?) defined in org.jetbrains.kotlin.resolve.scopes.ScopeUtils[JavaMethodDescriptor]

'getOuterScope' @ [178:51] ==> private fun getOuterScope(descriptor: DeclarationDescriptorWithSource, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.kdoc in file resolveKDocLink.kt[SimpleFunctionDescriptorImpl]

'contextDescriptor' @ [178:65] ==> value-parameter contextDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getKDocLinkResolutionScope[ValueParameterDescriptorImpl]

'resolutionFacade' @ [178:84] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.kdoc.getKDocLinkResolutionScope[ValueParameterDescriptorImpl]

'contextDescriptor' @ [178:103] ==> value-parameter contextDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getKDocLinkResolutionScope[ValueParameterDescriptorImpl]

'getOuterScope' @ [181:13] ==> private fun getOuterScope(descriptor: DeclarationDescriptorWithSource, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.kdoc in file resolveKDocLink.kt[SimpleFunctionDescriptorImpl]

'contextDescriptor' @ [181:27] ==> value-parameter contextDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getKDocLinkResolutionScope[ValueParameterDescriptorImpl]

'resolutionFacade' @ [181:46] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.kdoc.getKDocLinkResolutionScope[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [183:23] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'contextDescriptor' @ [183:88] ==> value-parameter contextDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getKDocLinkResolutionScope[ValueParameterDescriptorImpl]

'descriptor' @ [188:18] ==> value-parameter descriptor: DeclarationDescriptorWithSource defined in org.jetbrains.kotlin.idea.kdoc.getOuterScope[ValueParameterDescriptorImpl]

'containingDeclaration' @ [188:29] ==> public final val DeclarationDescriptorWithSource.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'if (parent is PackageFragmentDescriptor) {
        val containingFile = (descriptor.source as? PsiSourceElement)?.psi?.containingFile as? KtFile
                             ?: return LexicalScope.Base(ImportingScope.Empty, parent)
        val kotlinCacheService = ServiceManager.getService(containingFile.project, KotlinCacheService::class.java)
        val facadeToUse = kotlinCacheService?.getResolutionFacade(listOf(containingFile)) ?: resolutionFacade
        return facadeToUse.getFileResolutionScope(containingFile)
    }
    else {
        return getKDocLinkResolutionScope(resolutionFacade, parent)
    }' @ [189:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'parent' @ [189:9] ==> val parent: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getOuterScope[LocalVariableDescriptor]

'?:' @ [190:30] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtFile?, right: KtFile): KtFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtFile

'descriptor' @ [190:31] ==> value-parameter descriptor: DeclarationDescriptorWithSource defined in org.jetbrains.kotlin.idea.kdoc.getOuterScope[ValueParameterDescriptorImpl]

'source' @ [190:42] ==> public final val DeclarationDescriptorWithSource.source: SourceElement[MyPropertyDescriptor]

'psi' @ [190:72] ==> public abstract val psi: PsiElement? defined in org.jetbrains.kotlin.resolve.source.PsiSourceElement[DeserializedPropertyDescriptor]

'containingFile' @ [190:77] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'Base' @ [191:53] ==> public constructor Base(parent: HierarchicalScope, ownerDescriptor: DeclarationDescriptor) defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope.Base[DeserializedClassConstructorDescriptor]

'Empty' @ [191:73] ==> public object Empty : BaseImportingScope defined in org.jetbrains.kotlin.resolve.scopes.ImportingScope[FakeCallableDescriptorForObject]

'parent' @ [191:80] ==> val parent: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getOuterScope[LocalVariableDescriptor]

'getService' @ [192:49] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(KotlinCacheService..KotlinCacheService?)>): (KotlinCacheService..KotlinCacheService?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinCacheService

'containingFile' @ [192:60] ==> val containingFile: KtFile defined in org.jetbrains.kotlin.idea.kdoc.getOuterScope[LocalVariableDescriptor]

'project' @ [192:75] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'KotlinCacheService' @ [192:84] ==> public companion object defined in org.jetbrains.kotlin.caches.resolve.KotlinCacheService[FakeCallableDescriptorForObject]

'java' @ [192:110] ==> public val <T> KClass<KotlinCacheService>.java: Class<KotlinCacheService> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinCacheService

'kotlinCacheService' @ [193:27] ==> val kotlinCacheService: (KotlinCacheService..KotlinCacheService?) defined in org.jetbrains.kotlin.idea.kdoc.getOuterScope[LocalVariableDescriptor]

'getResolutionFacade' @ [193:47] ==> public abstract fun getResolutionFacade(elements: List<KtElement>): ResolutionFacade defined in org.jetbrains.kotlin.caches.resolve.KotlinCacheService[SimpleFunctionDescriptorImpl]

'listOf' @ [193:67] ==> public fun <T> listOf(element: KtFile): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'containingFile' @ [193:74] ==> val containingFile: KtFile defined in org.jetbrains.kotlin.idea.kdoc.getOuterScope[LocalVariableDescriptor]

'resolutionFacade' @ [193:94] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.kdoc.getOuterScope[ValueParameterDescriptorImpl]

'facadeToUse' @ [194:16] ==> val facadeToUse: ResolutionFacade defined in org.jetbrains.kotlin.idea.kdoc.getOuterScope[LocalVariableDescriptor]

'getFileResolutionScope' @ [194:28] ==> public fun ResolutionFacade.getFileResolutionScope(file: KtFile): LexicalScope defined in org.jetbrains.kotlin.idea.util in file scopeUtils.kt[SimpleFunctionDescriptorImpl]

'containingFile' @ [194:51] ==> val containingFile: KtFile defined in org.jetbrains.kotlin.idea.kdoc.getOuterScope[LocalVariableDescriptor]

'getKDocLinkResolutionScope' @ [197:16] ==> public fun getKDocLinkResolutionScope(resolutionFacade: ResolutionFacade, contextDescriptor: DeclarationDescriptor): LexicalScope defined in org.jetbrains.kotlin.idea.kdoc in file resolveKDocLink.kt[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [197:43] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.kdoc.getOuterScope[ValueParameterDescriptorImpl]

'parent' @ [197:61] ==> val parent: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getOuterScope[LocalVariableDescriptor]

'when (descriptor) {
        is PackageFragmentDescriptor -> getPackageInnerScope(descriptor)

        is PackageViewDescriptor -> descriptor.memberScope

        is ClassDescriptor -> {
            ChainedMemberScope("Member scope for KDoc resolve", listOfNotNull(
                    descriptor.unsubstitutedMemberScope,
                    descriptor.staticScope,
                    descriptor.companionObjectDescriptor?.unsubstitutedMemberScope,
                    ExtensionsScope(descriptor, contextScope)
            ))
        }

        else -> MemberScope.Empty
    }' @ [202:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: MemberScope, entry1: MemberScope, entry2: MemberScope, entry3: MemberScope): MemberScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> MemberScope

'descriptor' @ [202:18] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getKDocLinkMemberScope[ValueParameterDescriptorImpl]

'getPackageInnerScope' @ [203:41] ==> private fun getPackageInnerScope(descriptor: PackageFragmentDescriptor): MemberScope defined in org.jetbrains.kotlin.idea.kdoc in file resolveKDocLink.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [203:62] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getKDocLinkMemberScope[ValueParameterDescriptorImpl]

'descriptor' @ [205:37] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getKDocLinkMemberScope[ValueParameterDescriptorImpl]

'memberScope' @ [205:48] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'ChainedMemberScope' @ [208:13] ==> public constructor ChainedMemberScope(debugName: String, scopes: List<MemberScope>) defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope[DeserializedClassConstructorDescriptor]

'listOfNotNull' @ [208:65] ==> public fun <T : Any> listOfNotNull(vararg elements: MemberScope?): List<MemberScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> MemberScope

'descriptor' @ [209:21] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getKDocLinkMemberScope[ValueParameterDescriptorImpl]

'unsubstitutedMemberScope' @ [209:32] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'descriptor' @ [210:21] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getKDocLinkMemberScope[ValueParameterDescriptorImpl]

'staticScope' @ [210:32] ==> public final val ClassDescriptor.staticScope: MemberScope[MyPropertyDescriptor]

'descriptor' @ [211:21] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getKDocLinkMemberScope[ValueParameterDescriptorImpl]

'companionObjectDescriptor' @ [211:32] ==> public final val ClassDescriptor.companionObjectDescriptor: ClassDescriptor?[MyPropertyDescriptor]

'unsubstitutedMemberScope' @ [211:59] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'ExtensionsScope' @ [212:21] ==> public constructor ExtensionsScope(receiverClass: ClassDescriptor, contextScope: LexicalScope) defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope[ClassConstructorDescriptorImpl]

'descriptor' @ [212:37] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.getKDocLinkMemberScope[ValueParameterDescriptorImpl]

'contextScope' @ [212:49] ==> value-parameter contextScope: LexicalScope defined in org.jetbrains.kotlin.idea.kdoc.getKDocLinkMemberScope[ValueParameterDescriptorImpl]

'MemberScope' @ [216:17] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[FakeCallableDescriptorForObject]

'Empty' @ [216:29] ==> public object Empty : MemberScopeImpl defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[FakeCallableDescriptorForObject]

'listOf' @ [224:33] ==> public fun <T> listOf(element: SimpleType): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'receiverClass' @ [224:40] ==> private final val receiverClass: ClassDescriptor defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope[PropertyDescriptorImpl]

'defaultType' @ [224:54] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'contextScope' @ [227:16] ==> private final val contextScope: LexicalScope defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope[PropertyDescriptorImpl]

'collectFunctions' @ [227:29] ==> public fun HierarchicalScope.collectFunctions(name: Name, location: LookupLocation): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'name' @ [227:46] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope.getContributedFunctions[ValueParameterDescriptorImpl]

'location' @ [227:52] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope.getContributedFunctions[ValueParameterDescriptorImpl]

'flatMap' @ [228:18] ==> public inline fun <T, R> Iterable<FunctionDescriptor>.flatMap(transform: (FunctionDescriptor) -> Iterable<SimpleFunctionDescriptor>): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor
    <R> -> SimpleFunctionDescriptor

'if (it is SimpleFunctionDescriptor && it.isExtension) it.substituteExtensionIfCallable(receiverTypes, CallType.DOT) else emptyList()' @ [228:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<SimpleFunctionDescriptor>, elseBranch: Collection<SimpleFunctionDescriptor>): Collection<SimpleFunctionDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<SimpleFunctionDescriptor>

'it' @ [228:32] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope.getContributedFunctions.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [228:66] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope.getContributedFunctions.<anonymous>[ValueParameterDescriptorImpl]

'isExtension' @ [228:69] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'it' @ [228:82] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope.getContributedFunctions.<anonymous>[ValueParameterDescriptorImpl]

'substituteExtensionIfCallable' @ [228:85] ==> public fun <TCallable : CallableDescriptor> SimpleFunctionDescriptor.substituteExtensionIfCallable(receiverTypes: Collection<KotlinType>, callType: CallType<*>): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.idea.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <TCallable : CallableDescriptor> -> SimpleFunctionDescriptor

'receiverTypes' @ [228:115] ==> private final val receiverTypes: List<SimpleType> defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope[PropertyDescriptorImpl]

'DOT' @ [228:139] ==> public object DOT : CallType<KtExpression> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'emptyList' @ [228:149] ==> public fun <T> emptyList(): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'contextScope' @ [232:16] ==> private final val contextScope: LexicalScope defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope[PropertyDescriptorImpl]

'collectVariables' @ [232:29] ==> public fun HierarchicalScope.collectVariables(name: Name, location: LookupLocation): Collection<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'name' @ [232:46] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope.getContributedVariables[ValueParameterDescriptorImpl]

'location' @ [232:52] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope.getContributedVariables[ValueParameterDescriptorImpl]

'flatMap' @ [233:18] ==> public inline fun <T, R> Iterable<VariableDescriptor>.flatMap(transform: (VariableDescriptor) -> Iterable<PropertyDescriptor>): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor
    <R> -> PropertyDescriptor

'if (it is PropertyDescriptor && it.isExtension) it.substituteExtensionIfCallable(receiverTypes, CallType.DOT) else emptyList()' @ [233:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<PropertyDescriptor>, elseBranch: Collection<PropertyDescriptor>): Collection<PropertyDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<PropertyDescriptor>

'it' @ [233:32] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope.getContributedVariables.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [233:60] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope.getContributedVariables.<anonymous>[ValueParameterDescriptorImpl]

'isExtension' @ [233:63] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'it' @ [233:76] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope.getContributedVariables.<anonymous>[ValueParameterDescriptorImpl]

'substituteExtensionIfCallable' @ [233:79] ==> public fun <TCallable : CallableDescriptor> PropertyDescriptor.substituteExtensionIfCallable(receiverTypes: Collection<KotlinType>, callType: CallType<*>): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.idea.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <TCallable : CallableDescriptor> -> PropertyDescriptor

'receiverTypes' @ [233:109] ==> private final val receiverTypes: List<SimpleType> defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope[PropertyDescriptorImpl]

'DOT' @ [233:133] ==> public object DOT : CallType<KtExpression> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'emptyList' @ [233:143] ==> public fun <T> emptyList(): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'in' @ [239:13] ==> public abstract fun contains(element: DescriptorKindExclude): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'Extensions' @ [239:35] ==> public object Extensions : DescriptorKindExclude defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[FakeCallableDescriptorForObject]

'kindFilter' @ [239:49] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope.getContributedDescriptors[ValueParameterDescriptorImpl]

'excludes' @ [239:60] ==> public final val excludes: List<DescriptorKindExclude> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedPropertyDescriptor]

'emptyList' @ [239:77] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'contextScope' @ [240:16] ==> private final val contextScope: LexicalScope defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope[PropertyDescriptorImpl]

'collectDescriptorsFiltered' @ [240:29] ==> public fun HierarchicalScope.collectDescriptorsFiltered(kindFilter: DescriptorKindFilter = ..., nameFilter: (Name) -> Boolean = ..., changeNamesForAliased: Boolean = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'kindFilter' @ [240:56] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope.getContributedDescriptors[ValueParameterDescriptorImpl]

'NonExtensions' @ [240:97] ==> public object NonExtensions : DescriptorKindExclude defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[FakeCallableDescriptorForObject]

'nameFilter' @ [240:112] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope.getContributedDescriptors[ValueParameterDescriptorImpl]

'flatMap' @ [241:18] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.flatMap(transform: (DeclarationDescriptor) -> Iterable<CallableDescriptor>): List<CallableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> CallableDescriptor

'if (it is CallableDescriptor && it.isExtension) it.substituteExtensionIfCallable(receiverTypes, CallType.DOT) else emptyList()' @ [241:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<CallableDescriptor>, elseBranch: Collection<CallableDescriptor>): Collection<CallableDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<CallableDescriptor>

'it' @ [241:32] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope.getContributedDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [241:60] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope.getContributedDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'isExtension' @ [241:63] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'it' @ [241:76] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope.getContributedDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'substituteExtensionIfCallable' @ [241:79] ==> public fun <TCallable : CallableDescriptor> CallableDescriptor.substituteExtensionIfCallable(receiverTypes: Collection<KotlinType>, callType: CallType<*>): Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <TCallable : CallableDescriptor> -> CallableDescriptor

'receiverTypes' @ [241:109] ==> private final val receiverTypes: List<SimpleType> defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope[PropertyDescriptorImpl]

'DOT' @ [241:133] ==> public object DOT : CallType<KtExpression> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'emptyList' @ [241:143] ==> public fun <T> emptyList(): List<CallableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'getContributedDescriptors' @ [245:16] ==> public open fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope[SimpleFunctionDescriptorImpl]

'DescriptorKindFilter' @ [245:55] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'FUNCTIONS' @ [245:76] ==> @field:JvmField public final val FUNCTIONS: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'map' @ [246:18] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.map(transform: (DeclarationDescriptor) -> Name): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> Name

'it' @ [246:24] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope.getFunctionNames.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [246:27] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'toSet' @ [247:18] ==> public fun <T> Iterable<Name>.toSet(): Set<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'getContributedDescriptors' @ [251:16] ==> public open fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope[SimpleFunctionDescriptorImpl]

'DescriptorKindFilter' @ [251:55] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'VARIABLES' @ [251:76] ==> @field:JvmField public final val VARIABLES: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'map' @ [252:18] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.map(transform: (DeclarationDescriptor) -> Name): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> Name

'it' @ [252:24] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope.getVariableNames.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [252:27] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'toSet' @ [253:18] ==> public fun <T> Iterable<Name>.toSet(): Set<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'p' @ [257:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [257:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'receiverClass' @ [257:37] ==> private final val receiverClass: ClassDescriptor defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope[PropertyDescriptorImpl]

'name' @ [257:51] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'contextScope' @ [258:9] ==> private final val contextScope: LexicalScope defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope[PropertyDescriptorImpl]

'printStructure' @ [258:22] ==> public abstract fun printStructure(p: Printer): Unit defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedSimpleFunctionDescriptor]

'p' @ [258:37] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.idea.kdoc.ExtensionsScope.printScopeStructure[ValueParameterDescriptorImpl]

