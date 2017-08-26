'!' @ [60:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'languageVersionSettings' @ [60:14] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.check[ValueParameterDescriptorImpl]

'supportsFeature' @ [60:38] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'MultiPlatformProjects' @ [60:70] ==> enum entry MultiPlatformProjects defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'descriptor' @ [62:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.check[ValueParameterDescriptorImpl]

'!' @ [64:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'languageVersionSettings' @ [64:26] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.check[ValueParameterDescriptorImpl]

'getFlag' @ [64:50] ==> public abstract fun <T> getFlag(flag: AnalysisFlag<Boolean>): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'multiPlatformDoNotCheckImpl' @ [64:71] ==> @JvmStatic public final val multiPlatformDoNotCheckImpl: AnalysisFlag<Boolean> defined in org.jetbrains.kotlin.config.AnalysisFlag.Flags[DeserializedPropertyDescriptor]

'if (descriptor.isHeader && declaration.hasModifier(KtTokens.HEADER_KEYWORD)) {
            checkHeaderDeclarationHasImplementation(declaration, descriptor, diagnosticHolder, descriptor.module, checkImpl)
        }
        else if (checkImpl && descriptor.isImpl && declaration.hasModifier(KtTokens.IMPL_KEYWORD)) {
            checkImplementationHasHeaderDeclaration(declaration, descriptor, diagnosticHolder)
        }' @ [65:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'descriptor' @ [65:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.check[ValueParameterDescriptorImpl]

'isHeader' @ [65:24] ==> public final val MemberDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'declaration' @ [65:36] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.check[ValueParameterDescriptorImpl]

'hasModifier' @ [65:48] ==> public abstract fun hasModifier(@NotNull modifier: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'HEADER_KEYWORD' @ [65:69] ==> public final val HEADER_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'checkHeaderDeclarationHasImplementation' @ [66:13] ==> public final fun checkHeaderDeclarationHasImplementation(reportOn: KtDeclaration, descriptor: MemberDescriptor, diagnosticHolder: DiagnosticSink, platformModule: ModuleDescriptor, checkImpl: Boolean): Unit defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [66:53] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [66:66] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.check[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [66:78] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [66:96] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.check[ValueParameterDescriptorImpl]

'module' @ [66:107] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'checkImpl' @ [66:115] ==> val checkImpl: Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.check[LocalVariableDescriptor]

'checkImpl' @ [68:18] ==> val checkImpl: Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.check[LocalVariableDescriptor]

'descriptor' @ [68:31] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.check[ValueParameterDescriptorImpl]

'isImpl' @ [68:42] ==> public final val MemberDescriptor.isImpl: Boolean[MyPropertyDescriptor]

'declaration' @ [68:52] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.check[ValueParameterDescriptorImpl]

'hasModifier' @ [68:64] ==> public abstract fun hasModifier(@NotNull modifier: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'IMPL_KEYWORD' @ [68:85] ==> public final val IMPL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'checkImplementationHasHeaderDeclaration' @ [69:13] ==> private final fun checkImplementationHasHeaderDeclaration(reportOn: KtDeclaration, descriptor: MemberDescriptor, diagnosticHolder: DiagnosticSink): Unit defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [69:53] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [69:66] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.check[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [69:78] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.check[ValueParameterDescriptorImpl]

'findImplForHeader' @ [80:29] ==> private final fun findImplForHeader(header: MemberDescriptor, platformModule: ModuleDescriptor, checkImpl: Boolean): Map<HeaderImplDeclarationChecker.Compatibility, List<MemberDescriptor>>? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'descriptor' @ [80:47] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.checkHeaderDeclarationHasImplementation[ValueParameterDescriptorImpl]

'platformModule' @ [80:59] ==> value-parameter platformModule: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.checkHeaderDeclarationHasImplementation[ValueParameterDescriptorImpl]

'checkImpl' @ [80:75] ==> value-parameter checkImpl: Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.checkHeaderDeclarationHasImplementation[ValueParameterDescriptorImpl]

'compatibility' @ [82:13] ==> val compatibility: Map<HeaderImplDeclarationChecker.Compatibility, List<MemberDescriptor>>? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.checkHeaderDeclarationHasImplementation[LocalVariableDescriptor]

'Compatible' @ [82:38] ==> public object Compatible : HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility[FakeCallableDescriptorForObject]

'compatibility' @ [82:53] ==> val compatibility: Map<HeaderImplDeclarationChecker.Compatibility, List<MemberDescriptor>>? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.checkHeaderDeclarationHasImplementation[LocalVariableDescriptor]

'assert' @ [83:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'compatibility' @ [83:20] ==> val compatibility: Map<HeaderImplDeclarationChecker.Compatibility, List<MemberDescriptor>>? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.checkHeaderDeclarationHasImplementation[LocalVariableDescriptor]

'keys' @ [83:34] ==> public abstract val keys: Set<HeaderImplDeclarationChecker.Compatibility> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'all' @ [83:39] ==> public inline fun <T> Iterable<HeaderImplDeclarationChecker.Compatibility>.all(predicate: (HeaderImplDeclarationChecker.Compatibility) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Compatibility

'it' @ [83:45] ==> value-parameter it: HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.checkHeaderDeclarationHasImplementation.<anonymous>[ValueParameterDescriptorImpl]

'Suppress' @ [84:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'compatibility' @ [85:35] ==> val compatibility: Map<HeaderImplDeclarationChecker.Compatibility, List<MemberDescriptor>>? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.checkHeaderDeclarationHasImplementation[LocalVariableDescriptor]

'diagnosticHolder' @ [86:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.checkHeaderDeclarationHasImplementation[ValueParameterDescriptorImpl]

'report' @ [86:30] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'HEADER_WITHOUT_IMPLEMENTATION' @ [86:44] ==> public final val HEADER_WITHOUT_IMPLEMENTATION: (DiagnosticFactory3<(KtDeclaration..KtDeclaration?), (MemberDescriptor..MemberDescriptor?), (ModuleDescriptor..ModuleDescriptor?), (MutableMap<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>..Map<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>?)>..DiagnosticFactory3<(KtDeclaration..KtDeclaration?), (MemberDescriptor..MemberDescriptor?), (ModuleDescriptor..ModuleDescriptor?), (MutableMap<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>..Map<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [86:74] ==> @NotNull public open fun on(@NotNull element: KtDeclaration, @NotNull a: MemberDescriptor, @NotNull b: ModuleDescriptor, @NotNull c: (MutableMap<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>..Map<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>)): ParametrizedDiagnostic<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'reportOn' @ [86:77] ==> value-parameter reportOn: KtDeclaration defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.checkHeaderDeclarationHasImplementation[ValueParameterDescriptorImpl]

'descriptor' @ [86:87] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.checkHeaderDeclarationHasImplementation[ValueParameterDescriptorImpl]

'platformModule' @ [86:99] ==> value-parameter platformModule: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.checkHeaderDeclarationHasImplementation[ValueParameterDescriptorImpl]

'incompatibility' @ [86:115] ==> val incompatibility: Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<MemberDescriptor>> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.checkHeaderDeclarationHasImplementation[LocalVariableDescriptor]

'when (header) {
            is CallableMemberDescriptor -> {
                header.findNamesakesFromModule(platformModule).filter { impl ->
                    header != impl &&
                    // TODO: support non-source definitions (e.g. from Java)
                    DescriptorToSourceUtils.getSourceFromDescriptor(impl) is KtElement
                }.groupBy { impl ->
                    areCompatibleCallables(header, impl, checkImpl)
                }
            }
            is ClassDescriptor -> {
                header.findClassifiersFromModule(platformModule).filter { impl ->
                    header != impl &&
                    DescriptorToSourceUtils.getSourceFromDescriptor(impl) is KtElement
                }.groupBy { impl ->
                    areCompatibleClassifiers(header, impl, checkImpl)
                }
            }
            else -> null
        }' @ [95:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Map<HeaderImplDeclarationChecker.Compatibility, List<MemberDescriptor>>?, entry1: Map<HeaderImplDeclarationChecker.Compatibility, List<MemberDescriptor>>?, entry2: Map<HeaderImplDeclarationChecker.Compatibility, List<MemberDescriptor>>?): Map<HeaderImplDeclarationChecker.Compatibility, List<MemberDescriptor>>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Map<Compatibility, List<MemberDescriptor>>?

'header' @ [95:22] ==> value-parameter header: MemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findImplForHeader[ValueParameterDescriptorImpl]

'header' @ [97:17] ==> value-parameter header: MemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findImplForHeader[ValueParameterDescriptorImpl]

'findNamesakesFromModule' @ [97:24] ==> private final fun CallableMemberDescriptor.findNamesakesFromModule(module: ModuleDescriptor): Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'platformModule' @ [97:48] ==> value-parameter platformModule: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findImplForHeader[ValueParameterDescriptorImpl]

'filter' @ [97:64] ==> public inline fun <T> Iterable<CallableMemberDescriptor>.filter(predicate: (CallableMemberDescriptor) -> Boolean): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'header' @ [98:21] ==> value-parameter header: MemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findImplForHeader[ValueParameterDescriptorImpl]

'impl' @ [98:31] ==> value-parameter impl: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findImplForHeader.<anonymous>[ValueParameterDescriptorImpl]

'DescriptorToSourceUtils' @ [100:21] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'getSourceFromDescriptor' @ [100:45] ==> @JvmStatic public final fun getSourceFromDescriptor(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'impl' @ [100:69] ==> value-parameter impl: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findImplForHeader.<anonymous>[ValueParameterDescriptorImpl]

'groupBy' @ [101:19] ==> public inline fun <T, K> Iterable<CallableMemberDescriptor>.groupBy(keySelector: (CallableMemberDescriptor) -> HeaderImplDeclarationChecker.Compatibility): Map<HeaderImplDeclarationChecker.Compatibility, List<CallableMemberDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor
    <K> -> Compatibility

'areCompatibleCallables' @ [102:21] ==> private final fun areCompatibleCallables(a: CallableMemberDescriptor, b: CallableMemberDescriptor, checkImpl: Boolean, platformModule: ModuleDescriptor = ..., parentSubstitutor: HeaderImplDeclarationChecker.Substitutor? = ...): HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'header' @ [102:44] ==> value-parameter header: MemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findImplForHeader[ValueParameterDescriptorImpl]

'impl' @ [102:52] ==> value-parameter impl: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findImplForHeader.<anonymous>[ValueParameterDescriptorImpl]

'checkImpl' @ [102:58] ==> value-parameter checkImpl: Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findImplForHeader[ValueParameterDescriptorImpl]

'header' @ [106:17] ==> value-parameter header: MemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findImplForHeader[ValueParameterDescriptorImpl]

'findClassifiersFromModule' @ [106:24] ==> private final fun ClassifierDescriptorWithTypeParameters.findClassifiersFromModule(module: ModuleDescriptor): Collection<ClassifierDescriptorWithTypeParameters> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'platformModule' @ [106:50] ==> value-parameter platformModule: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findImplForHeader[ValueParameterDescriptorImpl]

'filter' @ [106:66] ==> public inline fun <T> Iterable<ClassifierDescriptorWithTypeParameters>.filter(predicate: (ClassifierDescriptorWithTypeParameters) -> Boolean): List<ClassifierDescriptorWithTypeParameters> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptorWithTypeParameters

'header' @ [107:21] ==> value-parameter header: MemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findImplForHeader[ValueParameterDescriptorImpl]

'impl' @ [107:31] ==> value-parameter impl: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findImplForHeader.<anonymous>[ValueParameterDescriptorImpl]

'DescriptorToSourceUtils' @ [108:21] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'getSourceFromDescriptor' @ [108:45] ==> @JvmStatic public final fun getSourceFromDescriptor(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'impl' @ [108:69] ==> value-parameter impl: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findImplForHeader.<anonymous>[ValueParameterDescriptorImpl]

'groupBy' @ [109:19] ==> public inline fun <T, K> Iterable<ClassifierDescriptorWithTypeParameters>.groupBy(keySelector: (ClassifierDescriptorWithTypeParameters) -> HeaderImplDeclarationChecker.Compatibility): Map<HeaderImplDeclarationChecker.Compatibility, List<ClassifierDescriptorWithTypeParameters>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptorWithTypeParameters
    <K> -> Compatibility

'areCompatibleClassifiers' @ [110:21] ==> private final fun areCompatibleClassifiers(a: ClassDescriptor, other: ClassifierDescriptor, checkImpl: Boolean): HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'header' @ [110:46] ==> value-parameter header: MemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findImplForHeader[ValueParameterDescriptorImpl]

'impl' @ [110:54] ==> value-parameter impl: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findImplForHeader.<anonymous>[ValueParameterDescriptorImpl]

'checkImpl' @ [110:60] ==> value-parameter checkImpl: Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findImplForHeader[ValueParameterDescriptorImpl]

'findHeaderForImpl' @ [123:29] ==> private final fun findHeaderForImpl(impl: MemberDescriptor, commonModule: ModuleDescriptor): Map<HeaderImplDeclarationChecker.Compatibility, List<MemberDescriptor>>? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'descriptor' @ [123:47] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.checkImplementationHasHeaderDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [123:59] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.checkImplementationHasHeaderDeclaration[ValueParameterDescriptorImpl]

'module' @ [123:70] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'compatibility' @ [125:13] ==> val compatibility: Map<HeaderImplDeclarationChecker.Compatibility, List<MemberDescriptor>>? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.checkImplementationHasHeaderDeclaration[LocalVariableDescriptor]

'Compatible' @ [125:38] ==> public object Compatible : HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility[FakeCallableDescriptorForObject]

'compatibility' @ [125:53] ==> val compatibility: Map<HeaderImplDeclarationChecker.Compatibility, List<MemberDescriptor>>? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.checkImplementationHasHeaderDeclaration[LocalVariableDescriptor]

'assert' @ [126:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'compatibility' @ [126:20] ==> val compatibility: Map<HeaderImplDeclarationChecker.Compatibility, List<MemberDescriptor>>? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.checkImplementationHasHeaderDeclaration[LocalVariableDescriptor]

'keys' @ [126:34] ==> public abstract val keys: Set<HeaderImplDeclarationChecker.Compatibility> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'all' @ [126:39] ==> public inline fun <T> Iterable<HeaderImplDeclarationChecker.Compatibility>.all(predicate: (HeaderImplDeclarationChecker.Compatibility) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Compatibility

'it' @ [126:45] ==> value-parameter it: HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.checkImplementationHasHeaderDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [128:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.checkImplementationHasHeaderDeclaration[ValueParameterDescriptorImpl]

'report' @ [128:30] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'IMPLEMENTATION_WITHOUT_HEADER' @ [128:44] ==> public final val IMPLEMENTATION_WITHOUT_HEADER: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [128:74] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'reportOn' @ [128:77] ==> value-parameter reportOn: KtDeclaration defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.checkImplementationHasHeaderDeclaration[ValueParameterDescriptorImpl]

'modifierList' @ [128:86] ==> public final val KtDeclaration.modifierList: KtModifierList?[MyPropertyDescriptor]

'getModifier' @ [128:101] ==> @Nullable public open fun getModifier(@NotNull tokenType: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'IMPL_KEYWORD' @ [128:122] ==> public final val IMPL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'when (impl) {
            is CallableMemberDescriptor -> {
                val container = impl.containingDeclaration
                val candidates = when (container) {
                    is ClassDescriptor -> {
                        val headerClass = findHeaderForImpl(container, commonModule)?.get(Compatible)?.firstOrNull() as? ClassDescriptor
                        headerClass?.getMembers(impl.name).orEmpty()
                    }
                    is PackageFragmentDescriptor -> impl.findNamesakesFromModule(commonModule)
                    else -> return null // do not report anything for incorrect code, e.g. 'impl' local function
                }

                candidates.filter { declaration ->
                    impl != declaration && declaration.isHeader
                }.groupBy { declaration ->
                    // TODO: optimize by caching this per impl-header class pair, do not create a new substitutor for each impl member
                    val substitutor =
                            if (container is ClassDescriptor) {
                                val headerClass = declaration.containingDeclaration as ClassDescriptor
                                // TODO: this might not work for members of inner generic classes
                                Substitutor(headerClass.declaredTypeParameters, container.declaredTypeParameters)
                            }
                            else null
                    areCompatibleCallables(declaration, impl, checkImpl = false, parentSubstitutor = substitutor)
                }
            }
            is ClassifierDescriptorWithTypeParameters -> {
                impl.findClassifiersFromModule(commonModule).filter { declaration ->
                    impl != declaration &&
                    declaration is ClassDescriptor && declaration.isHeader
                }.groupBy { header ->
                    areCompatibleClassifiers(header as ClassDescriptor, impl, checkImpl = false)
                }
            }
            else -> null
        }' @ [133:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Map<HeaderImplDeclarationChecker.Compatibility, List<MemberDescriptor>>?, entry1: Map<HeaderImplDeclarationChecker.Compatibility, List<MemberDescriptor>>?, entry2: Map<HeaderImplDeclarationChecker.Compatibility, List<MemberDescriptor>>?): Map<HeaderImplDeclarationChecker.Compatibility, List<MemberDescriptor>>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Map<Compatibility, List<MemberDescriptor>>?

'impl' @ [133:22] ==> value-parameter impl: MemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl[ValueParameterDescriptorImpl]

'impl' @ [135:33] ==> value-parameter impl: MemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl[ValueParameterDescriptorImpl]

'containingDeclaration' @ [135:38] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'when (container) {
                    is ClassDescriptor -> {
                        val headerClass = findHeaderForImpl(container, commonModule)?.get(Compatible)?.firstOrNull() as? ClassDescriptor
                        headerClass?.getMembers(impl.name).orEmpty()
                    }
                    is PackageFragmentDescriptor -> impl.findNamesakesFromModule(commonModule)
                    else -> return null // do not report anything for incorrect code, e.g. 'impl' local function
                }' @ [136:34] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<CallableMemberDescriptor>, entry1: Collection<CallableMemberDescriptor>, entry2: Collection<CallableMemberDescriptor>): Collection<CallableMemberDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<CallableMemberDescriptor>

'container' @ [136:40] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl[LocalVariableDescriptor]

'findHeaderForImpl' @ [138:43] ==> private final fun findHeaderForImpl(impl: MemberDescriptor, commonModule: ModuleDescriptor): Map<HeaderImplDeclarationChecker.Compatibility, List<MemberDescriptor>>? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'container' @ [138:61] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl[LocalVariableDescriptor]

'commonModule' @ [138:72] ==> value-parameter commonModule: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl[ValueParameterDescriptorImpl]

'get' @ [138:87] ==> public abstract operator fun get(key: HeaderImplDeclarationChecker.Compatibility): List<MemberDescriptor>? defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'Compatible' @ [138:91] ==> public object Compatible : HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility[FakeCallableDescriptorForObject]

'firstOrNull' @ [138:104] ==> public fun <T> List<MemberDescriptor>.firstOrNull(): MemberDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberDescriptor

'headerClass' @ [139:25] ==> val headerClass: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl[LocalVariableDescriptor]

'getMembers' @ [139:38] ==> private final fun ClassDescriptor.getMembers(name: Name? = ...): Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'impl' @ [139:49] ==> value-parameter impl: MemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl[ValueParameterDescriptorImpl]

'name' @ [139:54] ==> public final val CallableMemberDescriptor.name: Name[MyPropertyDescriptor]

'orEmpty' @ [139:60] ==> @InlineOnly public inline fun <T> Collection<CallableMemberDescriptor>?.orEmpty(): Collection<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'impl' @ [141:53] ==> value-parameter impl: MemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl[ValueParameterDescriptorImpl]

'findNamesakesFromModule' @ [141:58] ==> private final fun CallableMemberDescriptor.findNamesakesFromModule(module: ModuleDescriptor): Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'commonModule' @ [141:82] ==> value-parameter commonModule: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl[ValueParameterDescriptorImpl]

'candidates' @ [145:17] ==> val candidates: Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl[LocalVariableDescriptor]

'filter' @ [145:28] ==> public inline fun <T> Iterable<CallableMemberDescriptor>.filter(predicate: (CallableMemberDescriptor) -> Boolean): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'impl' @ [146:21] ==> value-parameter impl: MemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl[ValueParameterDescriptorImpl]

'declaration' @ [146:29] ==> value-parameter declaration: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [146:44] ==> value-parameter declaration: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl.<anonymous>[ValueParameterDescriptorImpl]

'isHeader' @ [146:56] ==> public final val CallableMemberDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'groupBy' @ [147:19] ==> public inline fun <T, K> Iterable<CallableMemberDescriptor>.groupBy(keySelector: (CallableMemberDescriptor) -> HeaderImplDeclarationChecker.Compatibility): Map<HeaderImplDeclarationChecker.Compatibility, List<CallableMemberDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor
    <K> -> Compatibility

'if (container is ClassDescriptor) {
                                val headerClass = declaration.containingDeclaration as ClassDescriptor
                                // TODO: this might not work for members of inner generic classes
                                Substitutor(headerClass.declaredTypeParameters, container.declaredTypeParameters)
                            }
                            else null' @ [150:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: HeaderImplDeclarationChecker.Substitutor?, elseBranch: HeaderImplDeclarationChecker.Substitutor?): HeaderImplDeclarationChecker.Substitutor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Substitutor?

'container' @ [150:33] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl[LocalVariableDescriptor]

'declaration' @ [151:51] ==> value-parameter declaration: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [151:63] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'Substitutor' @ [153:33] ==> public constructor Substitutor(aTypeParams: List<TypeParameterDescriptor>, bTypeParams: List<TypeParameterDescriptor>, parent: HeaderImplDeclarationChecker.Substitutor? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Substitutor[ClassConstructorDescriptorImpl]

'headerClass' @ [153:45] ==> val headerClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl.<anonymous>[LocalVariableDescriptor]

'declaredTypeParameters' @ [153:57] ==> public final val ClassDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'container' @ [153:81] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl[LocalVariableDescriptor]

'declaredTypeParameters' @ [153:91] ==> public final val ClassDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'areCompatibleCallables' @ [156:21] ==> private final fun areCompatibleCallables(a: CallableMemberDescriptor, b: CallableMemberDescriptor, checkImpl: Boolean, platformModule: ModuleDescriptor = ..., parentSubstitutor: HeaderImplDeclarationChecker.Substitutor? = ...): HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [156:44] ==> value-parameter declaration: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl.<anonymous>[ValueParameterDescriptorImpl]

'impl' @ [156:57] ==> value-parameter impl: MemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl[ValueParameterDescriptorImpl]

'substitutor' @ [156:102] ==> val substitutor: HeaderImplDeclarationChecker.Substitutor? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl.<anonymous>[LocalVariableDescriptor]

'impl' @ [160:17] ==> value-parameter impl: MemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl[ValueParameterDescriptorImpl]

'findClassifiersFromModule' @ [160:22] ==> private final fun ClassifierDescriptorWithTypeParameters.findClassifiersFromModule(module: ModuleDescriptor): Collection<ClassifierDescriptorWithTypeParameters> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'commonModule' @ [160:48] ==> value-parameter commonModule: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl[ValueParameterDescriptorImpl]

'filter' @ [160:62] ==> public inline fun <T> Iterable<ClassifierDescriptorWithTypeParameters>.filter(predicate: (ClassifierDescriptorWithTypeParameters) -> Boolean): List<ClassifierDescriptorWithTypeParameters> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptorWithTypeParameters

'impl' @ [161:21] ==> value-parameter impl: MemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl[ValueParameterDescriptorImpl]

'declaration' @ [161:29] ==> value-parameter declaration: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [162:21] ==> value-parameter declaration: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [162:55] ==> value-parameter declaration: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl.<anonymous>[ValueParameterDescriptorImpl]

'isHeader' @ [162:67] ==> public final val ClassDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'groupBy' @ [163:19] ==> public inline fun <T, K> Iterable<ClassifierDescriptorWithTypeParameters>.groupBy(keySelector: (ClassifierDescriptorWithTypeParameters) -> HeaderImplDeclarationChecker.Compatibility): Map<HeaderImplDeclarationChecker.Compatibility, List<ClassifierDescriptorWithTypeParameters>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptorWithTypeParameters
    <K> -> Compatibility

'areCompatibleClassifiers' @ [164:21] ==> private final fun areCompatibleClassifiers(a: ClassDescriptor, other: ClassifierDescriptor, checkImpl: Boolean): HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'header' @ [164:46] ==> value-parameter header: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl.<anonymous>[ValueParameterDescriptorImpl]

'impl' @ [164:73] ==> value-parameter impl: MemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findHeaderForImpl[ValueParameterDescriptorImpl]

'findImplForHeader' @ [172:13] ==> private final fun findImplForHeader(header: MemberDescriptor, platformModule: ModuleDescriptor, checkImpl: Boolean): Map<HeaderImplDeclarationChecker.Compatibility, List<MemberDescriptor>>? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'this' @ [172:31] ==> <this> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findCompatibleImplForHeader[ReceiverParameterDescriptorImpl]

'platformModule' @ [172:37] ==> value-parameter platformModule: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findCompatibleImplForHeader[ValueParameterDescriptorImpl]

'get' @ [172:61] ==> public abstract operator fun get(key: HeaderImplDeclarationChecker.Compatibility): List<MemberDescriptor>? defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'Compatible' @ [172:65] ==> public object Compatible : HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility[FakeCallableDescriptorForObject]

'orEmpty' @ [172:77] ==> @InlineOnly public inline fun <T> List<MemberDescriptor>?.orEmpty(): List<MemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberDescriptor

'findHeaderForImpl' @ [175:13] ==> private final fun findHeaderForImpl(impl: MemberDescriptor, commonModule: ModuleDescriptor): Map<HeaderImplDeclarationChecker.Compatibility, List<MemberDescriptor>>? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'this' @ [175:31] ==> <this> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findCompatibleHeaderForImpl[ReceiverParameterDescriptorImpl]

'commonModule' @ [175:37] ==> value-parameter commonModule: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findCompatibleHeaderForImpl[ValueParameterDescriptorImpl]

'get' @ [175:52] ==> public abstract operator fun get(key: HeaderImplDeclarationChecker.Compatibility): List<MemberDescriptor>? defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'Compatible' @ [175:56] ==> public object Compatible : HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility[FakeCallableDescriptorForObject]

'orEmpty' @ [175:68] ==> @InlineOnly public inline fun <T> List<MemberDescriptor>?.orEmpty(): List<MemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberDescriptor

'containingDeclaration' @ [178:37] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'when (containingDeclaration) {
            is PackageFragmentDescriptor -> {
                listOf(module.getPackage(containingDeclaration.fqName).memberScope)
            }
            is ClassDescriptor -> {
                val classes = containingDeclaration.findClassifiersFromModule(module).filterIsInstance<ClassDescriptor>()
                if (this is ConstructorDescriptor) return classes.flatMap { it.constructors }

                classes.map { it.unsubstitutedMemberScope }
            }
            else -> return emptyList()
        }' @ [179:22] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<MemberScope>, entry1: List<MemberScope>, entry2: List<MemberScope>): List<MemberScope>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<MemberScope>

'containingDeclaration' @ [179:28] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findNamesakesFromModule[LocalVariableDescriptor]

'listOf' @ [181:17] ==> public fun <T> listOf(element: MemberScope): List<MemberScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberScope

'module' @ [181:24] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findNamesakesFromModule[ValueParameterDescriptorImpl]

'getPackage' @ [181:31] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'containingDeclaration' @ [181:42] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findNamesakesFromModule[LocalVariableDescriptor]

'fqName' @ [181:64] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'memberScope' @ [181:72] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'containingDeclaration' @ [184:31] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findNamesakesFromModule[LocalVariableDescriptor]

'findClassifiersFromModule' @ [184:53] ==> private final fun ClassifierDescriptorWithTypeParameters.findClassifiersFromModule(module: ModuleDescriptor): Collection<ClassifierDescriptorWithTypeParameters> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'module' @ [184:79] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findNamesakesFromModule[ValueParameterDescriptorImpl]

'filterIsInstance' @ [184:87] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> ClassDescriptor

'this' @ [185:21] ==> <this> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findNamesakesFromModule[ReceiverParameterDescriptorImpl]

'classes' @ [185:59] ==> val classes: List<ClassDescriptor> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findNamesakesFromModule[LocalVariableDescriptor]

'flatMap' @ [185:67] ==> public inline fun <T, R> Iterable<ClassDescriptor>.flatMap(transform: (ClassDescriptor) -> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>): List<(ClassConstructorDescriptor..ClassConstructorDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'it' @ [185:77] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findNamesakesFromModule.<anonymous>[ValueParameterDescriptorImpl]

'constructors' @ [185:80] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'classes' @ [187:17] ==> val classes: List<ClassDescriptor> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findNamesakesFromModule[LocalVariableDescriptor]

'map' @ [187:25] ==> public inline fun <T, R> Iterable<ClassDescriptor>.map(transform: (ClassDescriptor) -> MemberScope): List<MemberScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> MemberScope

'it' @ [187:31] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findNamesakesFromModule.<anonymous>[ValueParameterDescriptorImpl]

'unsubstitutedMemberScope' @ [187:34] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'emptyList' @ [189:28] ==> public fun <T> emptyList(): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'when (this) {
            is FunctionDescriptor -> scopes.flatMap { it.getContributedFunctions(name, NoLookupLocation.FOR_ALREADY_TRACKED) }
            is PropertyDescriptor -> scopes.flatMap { it.getContributedVariables(name, NoLookupLocation.FOR_ALREADY_TRACKED) }
            else -> throw AssertionError("Unsupported declaration: $this")
        }' @ [192:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<CallableMemberDescriptor>, entry1: Collection<CallableMemberDescriptor>, entry2: Collection<CallableMemberDescriptor>): Collection<CallableMemberDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<CallableMemberDescriptor>

'this' @ [192:22] ==> <this> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findNamesakesFromModule[ReceiverParameterDescriptorImpl]

'scopes' @ [193:38] ==> val scopes: List<MemberScope> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findNamesakesFromModule[LocalVariableDescriptor]

'flatMap' @ [193:45] ==> public inline fun <T, R> Iterable<MemberScope>.flatMap(transform: (MemberScope) -> Iterable<SimpleFunctionDescriptor>): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberScope
    <R> -> SimpleFunctionDescriptor

'it' @ [193:55] ==> value-parameter it: MemberScope defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findNamesakesFromModule.<anonymous>[ValueParameterDescriptorImpl]

'getContributedFunctions' @ [193:58] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [193:82] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'FOR_ALREADY_TRACKED' @ [193:105] ==> enum entry FOR_ALREADY_TRACKED defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'scopes' @ [194:38] ==> val scopes: List<MemberScope> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findNamesakesFromModule[LocalVariableDescriptor]

'flatMap' @ [194:45] ==> public inline fun <T, R> Iterable<MemberScope>.flatMap(transform: (MemberScope) -> Iterable<PropertyDescriptor>): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberScope
    <R> -> PropertyDescriptor

'it' @ [194:55] ==> value-parameter it: MemberScope defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findNamesakesFromModule.<anonymous>[ValueParameterDescriptorImpl]

'getContributedVariables' @ [194:58] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [194:82] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'FOR_ALREADY_TRACKED' @ [194:105] ==> enum entry FOR_ALREADY_TRACKED defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'AssertionError' @ [195:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'this' @ [195:69] ==> <this> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findNamesakesFromModule[ReceiverParameterDescriptorImpl]

'classId' @ [202:23] ==> public val ClassifierDescriptorWithTypeParameters.classId: ClassId? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'emptyList' @ [202:41] ==> public fun <T> emptyList(): List<ClassifierDescriptorWithTypeParameters> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptorWithTypeParameters

'getDescriptorsFiltered' @ [205:17] ==> public fun MemberScope.getDescriptorsFiltered(kindFilter: DescriptorKindFilter = ..., nameFilter: (Name) -> Boolean = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes[DeserializedSimpleFunctionDescriptor]

'CLASSIFIERS' @ [205:61] ==> @field:JvmField public final val CLASSIFIERS: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'it' @ [205:76] ==> value-parameter it: Name defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findClassifiersFromModule.getAllClassifiers.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [205:82] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findClassifiersFromModule.getAllClassifiers[ValueParameterDescriptorImpl]

'filterIsInstance' @ [206:26] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<ClassifierDescriptorWithTypeParameters> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> ClassifierDescriptorWithTypeParameters

'classId' @ [208:24] ==> val classId: ClassId defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findClassifiersFromModule[LocalVariableDescriptor]

'relativeClassName' @ [208:32] ==> public final val ClassId.relativeClassName: FqName[MyPropertyDescriptor]

'pathSegments' @ [208:50] ==> @NotNull public open fun pathSegments(): (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'module' @ [209:27] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findClassifiersFromModule[ValueParameterDescriptorImpl]

'getPackage' @ [209:34] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'classId' @ [209:45] ==> val classId: ClassId defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findClassifiersFromModule[LocalVariableDescriptor]

'packageFqName' @ [209:53] ==> public final val ClassId.packageFqName: FqName[MyPropertyDescriptor]

'memberScope' @ [209:68] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'getAllClassifiers' @ [209:80] ==> local final fun MemberScope.getAllClassifiers(name: Name): Collection<ClassifierDescriptorWithTypeParameters> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findClassifiersFromModule[SimpleFunctionDescriptorImpl]

'segments' @ [209:98] ==> val segments: (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findClassifiersFromModule[LocalVariableDescriptor]

'first' @ [209:107] ==> public fun <T> List<(Name..Name?)>.first(): (Name..Name?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.name.Name..org.jetbrains.kotlin.name.Name?)

'segments' @ [211:22] ==> val segments: (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findClassifiersFromModule[LocalVariableDescriptor]

'subList' @ [211:31] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): MutableList<(Name..Name?)> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'segments' @ [211:42] ==> val segments: (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findClassifiersFromModule[LocalVariableDescriptor]

'size' @ [211:51] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'classifiers' @ [212:13] ==> var classifiers: Collection<ClassifierDescriptorWithTypeParameters> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findClassifiersFromModule[LocalVariableDescriptor]

'classifiers' @ [212:27] ==> var classifiers: Collection<ClassifierDescriptorWithTypeParameters> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findClassifiersFromModule[LocalVariableDescriptor]

'mapNotNull' @ [212:39] ==> public inline fun <T, R : Any> Iterable<ClassifierDescriptorWithTypeParameters>.mapNotNull(transform: (ClassifierDescriptorWithTypeParameters) -> ClassifierDescriptorWithTypeParameters?): List<ClassifierDescriptorWithTypeParameters> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptorWithTypeParameters
    <R : Any> -> ClassifierDescriptorWithTypeParameters

'classifier' @ [213:18] ==> value-parameter classifier: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findClassifiersFromModule.<anonymous>[ValueParameterDescriptorImpl]

'unsubstitutedInnerClassesScope' @ [213:51] ==> public final val ClassDescriptor.unsubstitutedInnerClassesScope: MemberScope[MyPropertyDescriptor]

'getContributedClassifier' @ [213:83] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [214:25] ==> val name: (Name..Name?) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findClassifiersFromModule[LocalVariableDescriptor]

'FOR_ALREADY_TRACKED' @ [214:48] ==> enum entry FOR_ALREADY_TRACKED defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'classifiers' @ [219:16] ==> var classifiers: Collection<ClassifierDescriptorWithTypeParameters> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.findClassifiersFromModule[LocalVariableDescriptor]

'Compatibility' @ [227:13] ==> private constructor Compatibility() defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility[ClassConstructorDescriptorImpl]

'Incompatible' @ [230:37] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Incompatible' @ [232:37] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Incompatible' @ [233:41] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Incompatible' @ [235:37] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Incompatible' @ [236:33] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Incompatible' @ [238:37] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Incompatible' @ [239:41] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Incompatible' @ [241:47] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Incompatible' @ [242:46] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Incompatible' @ [246:49] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Incompatible' @ [247:49] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Incompatible' @ [251:35] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Incompatible' @ [252:40] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Incompatible' @ [256:32] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Incompatible' @ [258:37] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Incompatible' @ [260:33] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Incompatible' @ [264:17] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'unimplemented' @ [264:66] ==> value-parameter unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible.ClassScopes.<init>[ValueParameterDescriptorImpl]

'Incompatible' @ [266:34] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Incompatible' @ [270:31] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Incompatible' @ [271:33] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Incompatible' @ [273:47] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Incompatible' @ [274:44] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Incompatible' @ [275:43] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Incompatible' @ [277:29] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Incompatible' @ [279:30] ==> private constructor Incompatible(reason: String?, unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[ClassConstructorDescriptorImpl]

'Compatibility' @ [282:29] ==> private constructor Compatibility() defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility[ClassConstructorDescriptorImpl]

'b' @ [290:48] ==> value-parameter b: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'module' @ [290:50] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'assert' @ [293:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'a' @ [293:16] ==> value-parameter a: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'name' @ [293:18] ==> public final val CallableMemberDescriptor.name: Name[MyPropertyDescriptor]

'b' @ [293:26] ==> value-parameter b: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'name' @ [293:28] ==> public final val CallableMemberDescriptor.name: Name[MyPropertyDescriptor]

'a' @ [293:112] ==> value-parameter a: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'b' @ [293:116] ==> value-parameter b: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'assert' @ [294:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'a' @ [294:16] ==> value-parameter a: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'containingDeclaration' @ [294:18] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'b' @ [294:62] ==> value-parameter b: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'containingDeclaration' @ [294:64] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'a' @ [295:133] ==> value-parameter a: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'b' @ [295:137] ==> value-parameter b: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'a' @ [298:34] ==> value-parameter a: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [298:36] ==> public final val CallableMemberDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'b' @ [299:34] ==> value-parameter b: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [299:36] ==> public final val CallableMemberDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'!=' @ [300:13] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'aExtensionReceiver' @ [300:14] ==> val aExtensionReceiver: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'bExtensionReceiver' @ [300:46] ==> val bExtensionReceiver: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'ParameterShape' @ [300:95] ==> public object ParameterShape : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'a' @ [302:23] ==> value-parameter a: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'valueParameters' @ [302:25] ==> public final val CallableMemberDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'b' @ [303:23] ==> value-parameter b: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'valueParameters' @ [303:25] ==> public final val CallableMemberDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'aParams' @ [304:13] ==> val aParams: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'size' @ [304:21] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'bParams' @ [304:29] ==> val bParams: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'size' @ [304:37] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'ParameterCount' @ [304:63] ==> public object ParameterCount : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'a' @ [306:27] ==> value-parameter a: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'typeParameters' @ [306:29] ==> public final val CallableMemberDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'b' @ [307:27] ==> value-parameter b: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'typeParameters' @ [307:29] ==> public final val CallableMemberDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'aTypeParams' @ [308:13] ==> val aTypeParams: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'size' @ [308:25] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'bTypeParams' @ [308:33] ==> val bTypeParams: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'size' @ [308:45] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'TypeParameterCount' @ [308:71] ==> public object TypeParameterCount : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'Substitutor' @ [310:27] ==> public constructor Substitutor(aTypeParams: List<TypeParameterDescriptor>, bTypeParams: List<TypeParameterDescriptor>, parent: HeaderImplDeclarationChecker.Substitutor? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Substitutor[ClassConstructorDescriptorImpl]

'aTypeParams' @ [310:39] ==> val aTypeParams: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'bTypeParams' @ [310:52] ==> val bTypeParams: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'parentSubstitutor' @ [310:65] ==> value-parameter parentSubstitutor: HeaderImplDeclarationChecker.Substitutor? = ... defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'!' @ [312:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'areCompatibleTypeLists' @ [312:14] ==> private final fun areCompatibleTypeLists(a: List<KotlinType?>, b: List<KotlinType?>, platformModule: ModuleDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'aParams' @ [312:37] ==> val aParams: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'map' @ [312:45] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> KotlinType?): List<KotlinType?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> KotlinType?

'invoke' @ [312:51] ==> public open fun invoke(type: KotlinType?): KotlinType? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Substitutor[SimpleFunctionDescriptorImpl]

'it' @ [312:63] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [312:66] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'bParams' @ [312:75] ==> val bParams: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'map' @ [312:83] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> KotlinType

'it' @ [312:89] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [312:92] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'platformModule' @ [312:100] ==> value-parameter platformModule: ModuleDescriptor = ... defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'!' @ [313:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'areCompatibleTypes' @ [313:14] ==> private final fun areCompatibleTypes(a: KotlinType?, b: KotlinType?, platformModule: ModuleDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'aExtensionReceiver' @ [313:33] ==> val aExtensionReceiver: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'type' @ [313:53] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'let' @ [313:59] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> KotlinType?

'substitutor' @ [313:63] ==> val substitutor: HeaderImplDeclarationChecker.Substitutor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'bExtensionReceiver' @ [313:77] ==> val bExtensionReceiver: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'type' @ [313:97] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'platformModule' @ [313:103] ==> value-parameter platformModule: ModuleDescriptor = ... defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'ParameterTypes' @ [314:33] ==> public object ParameterTypes : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'!' @ [315:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'areCompatibleTypes' @ [315:14] ==> private final fun areCompatibleTypes(a: KotlinType?, b: KotlinType?, platformModule: ModuleDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'invoke' @ [315:33] ==> public open fun invoke(type: KotlinType?): KotlinType? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Substitutor[SimpleFunctionDescriptorImpl]

'a' @ [315:45] ==> value-parameter a: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'returnType' @ [315:47] ==> public final val CallableMemberDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'b' @ [315:60] ==> value-parameter b: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'returnType' @ [315:62] ==> public final val CallableMemberDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'platformModule' @ [315:74] ==> value-parameter platformModule: ModuleDescriptor = ... defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'ReturnType' @ [315:111] ==> public object ReturnType : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'b' @ [317:13] ==> value-parameter b: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'hasStableParameterNames' @ [317:15] ==> public abstract fun hasStableParameterNames(): Boolean defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor[JavaMethodDescriptor]

'!' @ [317:44] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'equalsBy' @ [317:45] ==> private final inline fun <T, K> equalsBy(first: List<(ValueParameterDescriptor..ValueParameterDescriptor?)>, second: List<(ValueParameterDescriptor..ValueParameterDescriptor?)>, selector: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Name): Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <K> -> Name

'aParams' @ [317:54] ==> val aParams: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'bParams' @ [317:63] ==> val bParams: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'getName' @ [317:98] ==> @NotNull public abstract fun getName(): Name defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[JavaMethodDescriptor]

'ParameterNames' @ [317:128] ==> public object ParameterNames : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'!' @ [318:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'equalsBy' @ [318:14] ==> private final inline fun <T, K> equalsBy(first: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>, second: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>, selector: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> Name): Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <K> -> Name

'aTypeParams' @ [318:23] ==> val aTypeParams: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'bTypeParams' @ [318:36] ==> val bTypeParams: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'getName' @ [318:74] ==> @NotNull public abstract fun getName(): Name defined in org.jetbrains.kotlin.descriptors.TypeParameterDescriptor[JavaMethodDescriptor]

'TypeParameterNames' @ [318:104] ==> public object TypeParameterNames : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'a' @ [320:13] ==> value-parameter a: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'modality' @ [320:15] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'b' @ [320:27] ==> value-parameter b: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'modality' @ [320:29] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [320:59] ==> public object Modality : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'a' @ [321:13] ==> value-parameter a: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'visibility' @ [321:15] ==> public final val CallableMemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'b' @ [321:29] ==> value-parameter b: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'visibility' @ [321:31] ==> public final val CallableMemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'Visibility' @ [321:63] ==> public object Visibility : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'areCompatibleTypeParameters' @ [323:9] ==> private final fun areCompatibleTypeParameters(a: List<TypeParameterDescriptor>, b: List<TypeParameterDescriptor>, platformModule: ModuleDescriptor, substitutor: HeaderImplDeclarationChecker.Substitutor): HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'aTypeParams' @ [323:37] ==> val aTypeParams: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'bTypeParams' @ [323:50] ==> val bTypeParams: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'platformModule' @ [323:63] ==> value-parameter platformModule: ModuleDescriptor = ... defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'substitutor' @ [323:79] ==> val substitutor: HeaderImplDeclarationChecker.Substitutor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'let' @ [323:92] ==> @InlineOnly public inline fun <T, R> HeaderImplDeclarationChecker.Compatibility.let(block: (HeaderImplDeclarationChecker.Compatibility) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Compatibility
    <R> -> Unit

'it' @ [323:102] ==> value-parameter it: HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables.<anonymous>[ValueParameterDescriptorImpl]

'Compatible' @ [323:108] ==> public object Compatible : HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility[FakeCallableDescriptorForObject]

'it' @ [323:127] ==> value-parameter it: HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [325:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'equalsBy' @ [325:14] ==> private final inline fun <T, K> equalsBy(first: List<(ValueParameterDescriptor..ValueParameterDescriptor?)>, second: List<(ValueParameterDescriptor..ValueParameterDescriptor?)>, selector: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <K> -> Boolean

'aParams' @ [325:23] ==> val aParams: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'bParams' @ [325:32] ==> val bParams: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'declaresDefaultValue' @ [325:67] ==> public abstract fun declaresDefaultValue(): Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedSimpleFunctionDescriptor]

'ValueParameterHasDefault' @ [325:110] ==> public object ValueParameterHasDefault : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'!' @ [326:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'equalsBy' @ [326:14] ==> private final inline fun <T, K> equalsBy(first: List<(ValueParameterDescriptor..ValueParameterDescriptor?)>, second: List<(ValueParameterDescriptor..ValueParameterDescriptor?)>, selector: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> List<Boolean>): Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <K> -> List<Boolean>

'aParams' @ [326:23] ==> val aParams: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'bParams' @ [326:32] ==> val bParams: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[LocalVariableDescriptor]

'listOf' @ [326:48] ==> public fun <T> listOf(vararg elements: Boolean): List<Boolean> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'p' @ [326:55] ==> value-parameter p: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables.<anonymous>[ValueParameterDescriptorImpl]

'varargElementType' @ [326:57] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'p' @ [326:84] ==> value-parameter p: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables.<anonymous>[ValueParameterDescriptorImpl]

'isCrossinline' @ [326:86] ==> public abstract val isCrossinline: Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'p' @ [326:101] ==> value-parameter p: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables.<anonymous>[ValueParameterDescriptorImpl]

'isNoinline' @ [326:103] ==> public abstract val isNoinline: Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'ValueParameterModifiers' @ [326:139] ==> public object ValueParameterModifiers : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'when {
            a is FunctionDescriptor && b is FunctionDescriptor -> areCompatibleFunctions(a, b).let { if (it != Compatible) return it }
            a is PropertyDescriptor && b is PropertyDescriptor -> areCompatibleProperties(a, b).let { if (it != Compatible) return it }
            else -> throw AssertionError("Unsupported declarations: $a, $b")
        }' @ [328:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'a' @ [329:13] ==> value-parameter a: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'b' @ [329:40] ==> value-parameter b: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'areCompatibleFunctions' @ [329:67] ==> private final fun areCompatibleFunctions(a: FunctionDescriptor, b: FunctionDescriptor): HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'a' @ [329:90] ==> value-parameter a: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'b' @ [329:93] ==> value-parameter b: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'let' @ [329:96] ==> @InlineOnly public inline fun <T, R> HeaderImplDeclarationChecker.Compatibility.let(block: (HeaderImplDeclarationChecker.Compatibility) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Compatibility
    <R> -> Unit

'it' @ [329:106] ==> value-parameter it: HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables.<anonymous>[ValueParameterDescriptorImpl]

'Compatible' @ [329:112] ==> public object Compatible : HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility[FakeCallableDescriptorForObject]

'it' @ [329:131] ==> value-parameter it: HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables.<anonymous>[ValueParameterDescriptorImpl]

'a' @ [330:13] ==> value-parameter a: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'b' @ [330:40] ==> value-parameter b: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'areCompatibleProperties' @ [330:67] ==> private final fun areCompatibleProperties(a: PropertyDescriptor, b: PropertyDescriptor): HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'a' @ [330:91] ==> value-parameter a: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'b' @ [330:94] ==> value-parameter b: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'let' @ [330:97] ==> @InlineOnly public inline fun <T, R> HeaderImplDeclarationChecker.Compatibility.let(block: (HeaderImplDeclarationChecker.Compatibility) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Compatibility
    <R> -> Unit

'it' @ [330:107] ==> value-parameter it: HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables.<anonymous>[ValueParameterDescriptorImpl]

'Compatible' @ [330:113] ==> public object Compatible : HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility[FakeCallableDescriptorForObject]

'it' @ [330:132] ==> value-parameter it: HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables.<anonymous>[ValueParameterDescriptorImpl]

'AssertionError' @ [331:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'a' @ [331:70] ==> value-parameter a: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'b' @ [331:74] ==> value-parameter b: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'checkImpl' @ [334:13] ==> value-parameter checkImpl: Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'!' @ [334:26] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'b' @ [334:27] ==> value-parameter b: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'isImpl' @ [334:29] ==> public final val CallableMemberDescriptor.isImpl: Boolean[MyPropertyDescriptor]

'b' @ [334:39] ==> value-parameter b: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleCallables[ValueParameterDescriptorImpl]

'kind' @ [334:41] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DECLARATION' @ [334:79] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'NoImpl' @ [334:112] ==> public object NoImpl : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'Compatible' @ [336:16] ==> public object Compatible : HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility[FakeCallableDescriptorForObject]

'a' @ [340:13] ==> value-parameter a: KotlinType? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypes[ValueParameterDescriptorImpl]

'b' @ [340:31] ==> value-parameter b: KotlinType? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypes[ValueParameterDescriptorImpl]

'b' @ [341:13] ==> value-parameter b: KotlinType? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypes[ValueParameterDescriptorImpl]

'with' @ [343:9] ==> @InlineOnly public inline fun <T, R> with(receiver: NewKotlinTypeChecker, block: NewKotlinTypeChecker.() -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NewKotlinTypeChecker
    <R> -> Nothing

'NewKotlinTypeChecker' @ [343:14] ==> public object NewKotlinTypeChecker : KotlinTypeChecker defined in org.jetbrains.kotlin.types.checker[FakeCallableDescriptorForObject]

'TypeCheckerContext' @ [344:36] ==> public constructor TypeCheckerContext(errorTypeEqualsToAnything: Boolean, allowedTypeVariable: Boolean = ...) defined in org.jetbrains.kotlin.types.checker.TypeCheckerContext[DeserializedClassConstructorDescriptor]

'isHeaderClassAndImplTypeAlias' @ [346:28] ==> private final fun isHeaderClassAndImplTypeAlias(headerTypeConstructor: TypeConstructor, implTypeConstructor: TypeConstructor, platformModule: ModuleDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'a' @ [346:58] ==> value-parameter a: TypeConstructor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypes.<anonymous>.<no name provided>.areEqualTypeConstructors[ValueParameterDescriptorImpl]

'b' @ [346:61] ==> value-parameter b: TypeConstructor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypes.<anonymous>.<no name provided>.areEqualTypeConstructors[ValueParameterDescriptorImpl]

'platformModule' @ [346:64] ==> value-parameter platformModule: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypes[ValueParameterDescriptorImpl]

'isHeaderClassAndImplTypeAlias' @ [347:28] ==> private final fun isHeaderClassAndImplTypeAlias(headerTypeConstructor: TypeConstructor, implTypeConstructor: TypeConstructor, platformModule: ModuleDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'b' @ [347:58] ==> value-parameter b: TypeConstructor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypes.<anonymous>.<no name provided>.areEqualTypeConstructors[ValueParameterDescriptorImpl]

'a' @ [347:61] ==> value-parameter a: TypeConstructor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypes.<anonymous>.<no name provided>.areEqualTypeConstructors[ValueParameterDescriptorImpl]

'platformModule' @ [347:64] ==> value-parameter platformModule: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypes[ValueParameterDescriptorImpl]

'super' @ [348:28] ==> <this> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypes.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'areEqualTypeConstructors' @ [348:34] ==> public open fun areEqualTypeConstructors(a: TypeConstructor, b: TypeConstructor): Boolean defined in org.jetbrains.kotlin.types.checker.TypeCheckerContext[DeserializedSimpleFunctionDescriptor]

'a' @ [348:59] ==> value-parameter a: TypeConstructor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypes.<anonymous>.<no name provided>.areEqualTypeConstructors[ValueParameterDescriptorImpl]

'b' @ [348:62] ==> value-parameter b: TypeConstructor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypes.<anonymous>.<no name provided>.areEqualTypeConstructors[ValueParameterDescriptorImpl]

'context' @ [351:20] ==> val context: <no name provided> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypes.<anonymous>[LocalVariableDescriptor]

'equalTypes' @ [351:28] ==> public final fun TypeCheckerContext.equalTypes(a: UnwrappedType, b: UnwrappedType): Boolean defined in org.jetbrains.kotlin.types.checker.NewKotlinTypeChecker[DeserializedSimpleFunctionDescriptor]

'a' @ [351:39] ==> value-parameter a: KotlinType? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypes[ValueParameterDescriptorImpl]

'unwrap' @ [351:41] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'b' @ [351:51] ==> value-parameter b: KotlinType? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypes[ValueParameterDescriptorImpl]

'unwrap' @ [351:53] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'headerTypeConstructor' @ [364:22] ==> value-parameter headerTypeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.isHeaderClassAndImplTypeAlias[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [364:44] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'implTypeConstructor' @ [365:20] ==> value-parameter implTypeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.isHeaderClassAndImplTypeAlias[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [365:40] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'header' @ [366:16] ==> val header: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.isHeaderClassAndImplTypeAlias[LocalVariableDescriptor]

'header' @ [367:16] ==> val header: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.isHeaderClassAndImplTypeAlias[LocalVariableDescriptor]

'isHeader' @ [367:23] ==> public final val ClassifierDescriptorWithTypeParameters.isHeader: Boolean[MyPropertyDescriptor]

'impl' @ [368:16] ==> val impl: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.isHeaderClassAndImplTypeAlias[LocalVariableDescriptor]

'header' @ [369:16] ==> val header: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.isHeaderClassAndImplTypeAlias[LocalVariableDescriptor]

'findClassifiersFromModule' @ [369:23] ==> private final fun ClassifierDescriptorWithTypeParameters.findClassifiersFromModule(module: ModuleDescriptor): Collection<ClassifierDescriptorWithTypeParameters> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'platformModule' @ [369:49] ==> value-parameter platformModule: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.isHeaderClassAndImplTypeAlias[ValueParameterDescriptorImpl]

'any' @ [369:65] ==> public inline fun <T> Iterable<ClassifierDescriptorWithTypeParameters>.any(predicate: (ClassifierDescriptorWithTypeParameters) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptorWithTypeParameters

'==' @ [373:20] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.ClassDescriptor[DeserializedSimpleFunctionDescriptor]

'classifier' @ [373:21] ==> value-parameter classifier: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.isHeaderClassAndImplTypeAlias.<anonymous>[ValueParameterDescriptorImpl]

'classDescriptor' @ [373:58] ==> public abstract val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'impl' @ [373:77] ==> val impl: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.isHeaderClassAndImplTypeAlias[LocalVariableDescriptor]

'a' @ [378:19] ==> value-parameter a: List<KotlinType?> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypeLists[ValueParameterDescriptorImpl]

'indices' @ [378:21] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'!' @ [379:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'areCompatibleTypes' @ [379:18] ==> private final fun areCompatibleTypes(a: KotlinType?, b: KotlinType?, platformModule: ModuleDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'a' @ [379:37] ==> value-parameter a: List<KotlinType?> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypeLists[ValueParameterDescriptorImpl]

'i' @ [379:39] ==> val i: Int defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypeLists[LocalVariableDescriptor]

'b' @ [379:43] ==> value-parameter b: List<KotlinType?> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypeLists[ValueParameterDescriptorImpl]

'i' @ [379:45] ==> val i: Int defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypeLists[LocalVariableDescriptor]

'platformModule' @ [379:49] ==> value-parameter platformModule: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypeLists[ValueParameterDescriptorImpl]

'!' @ [390:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'areCompatibleTypeLists' @ [390:14] ==> private final fun areCompatibleTypeLists(a: List<KotlinType?>, b: List<KotlinType?>, platformModule: ModuleDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'a' @ [390:37] ==> value-parameter a: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypeParameters[ValueParameterDescriptorImpl]

'map' @ [390:39] ==> public inline fun <T, R> Iterable<TypeParameterDescriptor>.map(transform: (TypeParameterDescriptor) -> KotlinType?): List<KotlinType?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <R> -> KotlinType?

'invoke' @ [390:45] ==> public open fun invoke(type: KotlinType?): KotlinType? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Substitutor[SimpleFunctionDescriptorImpl]

'it' @ [390:57] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypeParameters.<anonymous>[ValueParameterDescriptorImpl]

'defaultType' @ [390:60] ==> public final val TypeParameterDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'b' @ [390:76] ==> value-parameter b: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypeParameters[ValueParameterDescriptorImpl]

'map' @ [390:78] ==> public inline fun <T, R> Iterable<TypeParameterDescriptor>.map(transform: (TypeParameterDescriptor) -> SimpleType): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <R> -> SimpleType

'it' @ [390:84] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypeParameters.<anonymous>[ValueParameterDescriptorImpl]

'defaultType' @ [390:87] ==> public final val TypeParameterDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'platformModule' @ [390:102] ==> value-parameter platformModule: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypeParameters[ValueParameterDescriptorImpl]

'TypeParameterUpperBounds' @ [391:33] ==> public object TypeParameterUpperBounds : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'!' @ [392:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'equalsBy' @ [392:14] ==> private final inline fun <T, K> equalsBy(first: List<TypeParameterDescriptor>, second: List<TypeParameterDescriptor>, selector: (TypeParameterDescriptor) -> Variance): Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> TypeParameterDescriptor
    <K> -> Variance

'a' @ [392:23] ==> value-parameter a: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypeParameters[ValueParameterDescriptorImpl]

'b' @ [392:26] ==> value-parameter b: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypeParameters[ValueParameterDescriptorImpl]

'getVariance' @ [392:54] ==> @NotNull public abstract fun getVariance(): Variance defined in org.jetbrains.kotlin.descriptors.TypeParameterDescriptor[JavaMethodDescriptor]

'TypeParameterVariance' @ [392:88] ==> public object TypeParameterVariance : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'!' @ [393:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'equalsBy' @ [393:14] ==> private final inline fun <T, K> equalsBy(first: List<TypeParameterDescriptor>, second: List<TypeParameterDescriptor>, selector: (TypeParameterDescriptor) -> Boolean): Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> TypeParameterDescriptor
    <K> -> Boolean

'a' @ [393:23] ==> value-parameter a: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypeParameters[ValueParameterDescriptorImpl]

'b' @ [393:26] ==> value-parameter b: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleTypeParameters[ValueParameterDescriptorImpl]

'isReified' @ [393:54] ==> public abstract fun isReified(): Boolean defined in org.jetbrains.kotlin.descriptors.TypeParameterDescriptor[JavaMethodDescriptor]

'TypeParameterReified' @ [393:86] ==> public object TypeParameterReified : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'Compatible' @ [395:16] ==> public object Compatible : HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility[FakeCallableDescriptorForObject]

'!' @ [399:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'equalBy' @ [399:14] ==> private final inline fun <T, K> equalBy(first: FunctionDescriptor, second: FunctionDescriptor, selector: (FunctionDescriptor) -> Boolean): Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> FunctionDescriptor
    <K> -> Boolean

'a' @ [399:22] ==> value-parameter a: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleFunctions[ValueParameterDescriptorImpl]

'b' @ [399:25] ==> value-parameter b: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleFunctions[ValueParameterDescriptorImpl]

'f' @ [399:35] ==> value-parameter f: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleFunctions.<anonymous>[ValueParameterDescriptorImpl]

'isSuspend' @ [399:37] ==> public final val FunctionDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

'FunctionModifiersDifferent' @ [399:70] ==> public object FunctionModifiersDifferent : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'a' @ [401:13] ==> value-parameter a: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleFunctions[ValueParameterDescriptorImpl]

'isExternal' @ [401:15] ==> public final val FunctionDescriptor.isExternal: Boolean[MyPropertyDescriptor]

'!' @ [401:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'b' @ [401:30] ==> value-parameter b: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleFunctions[ValueParameterDescriptorImpl]

'isExternal' @ [401:32] ==> public final val FunctionDescriptor.isExternal: Boolean[MyPropertyDescriptor]

'a' @ [402:13] ==> value-parameter a: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleFunctions[ValueParameterDescriptorImpl]

'isInfix' @ [402:15] ==> public final val FunctionDescriptor.isInfix: Boolean[MyPropertyDescriptor]

'!' @ [402:26] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'b' @ [402:27] ==> value-parameter b: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleFunctions[ValueParameterDescriptorImpl]

'isInfix' @ [402:29] ==> public final val FunctionDescriptor.isInfix: Boolean[MyPropertyDescriptor]

'a' @ [403:13] ==> value-parameter a: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleFunctions[ValueParameterDescriptorImpl]

'isInline' @ [403:15] ==> public final val FunctionDescriptor.isInline: Boolean[MyPropertyDescriptor]

'!' @ [403:27] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'b' @ [403:28] ==> value-parameter b: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleFunctions[ValueParameterDescriptorImpl]

'isInline' @ [403:30] ==> public final val FunctionDescriptor.isInline: Boolean[MyPropertyDescriptor]

'a' @ [404:13] ==> value-parameter a: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleFunctions[ValueParameterDescriptorImpl]

'isOperator' @ [404:15] ==> public final val FunctionDescriptor.isOperator: Boolean[MyPropertyDescriptor]

'!' @ [404:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'b' @ [404:30] ==> value-parameter b: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleFunctions[ValueParameterDescriptorImpl]

'isOperator' @ [404:32] ==> public final val FunctionDescriptor.isOperator: Boolean[MyPropertyDescriptor]

'a' @ [405:13] ==> value-parameter a: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleFunctions[ValueParameterDescriptorImpl]

'isTailrec' @ [405:15] ==> public final val FunctionDescriptor.isTailrec: Boolean[MyPropertyDescriptor]

'!' @ [405:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'b' @ [405:29] ==> value-parameter b: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleFunctions[ValueParameterDescriptorImpl]

'isTailrec' @ [405:31] ==> public final val FunctionDescriptor.isTailrec: Boolean[MyPropertyDescriptor]

'FunctionModifiersNotSubset' @ [405:62] ==> public object FunctionModifiersNotSubset : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'Compatible' @ [407:16] ==> public object Compatible : HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility[FakeCallableDescriptorForObject]

'!' @ [411:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'equalBy' @ [411:14] ==> private final inline fun <T, K> equalBy(first: PropertyDescriptor, second: PropertyDescriptor, selector: (PropertyDescriptor) -> Boolean): Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> PropertyDescriptor
    <K> -> Boolean

'a' @ [411:22] ==> value-parameter a: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleProperties[ValueParameterDescriptorImpl]

'b' @ [411:25] ==> value-parameter b: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleProperties[ValueParameterDescriptorImpl]

'p' @ [411:35] ==> value-parameter p: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleProperties.<anonymous>[ValueParameterDescriptorImpl]

'isVar' @ [411:37] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'PropertyKind' @ [411:66] ==> public object PropertyKind : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'!' @ [412:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'equalBy' @ [412:14] ==> private final inline fun <T, K> equalBy(first: PropertyDescriptor, second: PropertyDescriptor, selector: (PropertyDescriptor) -> List<Boolean>): Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> PropertyDescriptor
    <K> -> List<Boolean>

'a' @ [412:22] ==> value-parameter a: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleProperties[ValueParameterDescriptorImpl]

'b' @ [412:25] ==> value-parameter b: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleProperties[ValueParameterDescriptorImpl]

'listOf' @ [412:35] ==> public fun <T> listOf(vararg elements: Boolean): List<Boolean> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'p' @ [412:42] ==> value-parameter p: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleProperties.<anonymous>[ValueParameterDescriptorImpl]

'isConst' @ [412:44] ==> public final val PropertyDescriptor.isConst: Boolean[MyPropertyDescriptor]

'p' @ [412:53] ==> value-parameter p: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleProperties.<anonymous>[ValueParameterDescriptorImpl]

'isLateInit' @ [412:55] ==> public final val PropertyDescriptor.isLateInit: Boolean[MyPropertyDescriptor]

'PropertyModifiers' @ [412:90] ==> public object PropertyModifiers : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'Compatible' @ [414:16] ==> public object Compatible : HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility[FakeCallableDescriptorForObject]

'assert' @ [418:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'a' @ [418:16] ==> value-parameter a: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[ValueParameterDescriptorImpl]

'fqNameUnsafe' @ [418:18] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'other' @ [418:34] ==> value-parameter other: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[ValueParameterDescriptorImpl]

'fqNameUnsafe' @ [418:40] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'a' @ [418:132] ==> value-parameter a: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[ValueParameterDescriptorImpl]

'other' @ [418:136] ==> value-parameter other: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[ValueParameterDescriptorImpl]

'when (other) {
            is ClassDescriptor -> other
            is TypeAliasDescriptor -> {
                implTypealias = true
                other.classDescriptor ?: return Compatible // do not report extra error on erroneous typealias
            }
            else -> throw AssertionError("Incorrect impl classifier for $a: $other")
        }' @ [421:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ClassDescriptor, entry1: ClassDescriptor, entry2: ClassDescriptor): ClassDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ClassDescriptor

'other' @ [421:23] ==> value-parameter other: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[ValueParameterDescriptorImpl]

'other' @ [422:35] ==> value-parameter other: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[ValueParameterDescriptorImpl]

'implTypealias' @ [424:17] ==> var implTypealias: Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'other' @ [425:17] ==> value-parameter other: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[ValueParameterDescriptorImpl]

'classDescriptor' @ [425:23] ==> public abstract val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'Compatible' @ [425:49] ==> public object Compatible : HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility[FakeCallableDescriptorForObject]

'AssertionError' @ [427:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'a' @ [427:74] ==> value-parameter a: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[ValueParameterDescriptorImpl]

'other' @ [427:78] ==> value-parameter other: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[ValueParameterDescriptorImpl]

'a' @ [430:13] ==> value-parameter a: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[ValueParameterDescriptorImpl]

'kind' @ [430:15] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'b' @ [430:23] ==> val b: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'kind' @ [430:25] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ClassKind' @ [430:51] ==> public object ClassKind : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'!' @ [432:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'equalBy' @ [432:14] ==> private final inline fun <T, K> equalBy(first: ClassDescriptor, second: ClassDescriptor, selector: (ClassDescriptor) -> List<Boolean>): Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ClassDescriptor
    <K> -> List<Boolean>

'a' @ [432:22] ==> value-parameter a: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[ValueParameterDescriptorImpl]

'b' @ [432:25] ==> val b: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'listOf' @ [432:30] ==> public fun <T> listOf(vararg elements: Boolean): List<Boolean> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'it' @ [432:37] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers.<anonymous>[ValueParameterDescriptorImpl]

'isCompanionObject' @ [432:40] ==> public final val ClassDescriptor.isCompanionObject: Boolean[MyPropertyDescriptor]

'it' @ [432:59] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers.<anonymous>[ValueParameterDescriptorImpl]

'isInner' @ [432:62] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'ClassModifiers' @ [432:94] ==> public object ClassModifiers : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'a' @ [434:27] ==> value-parameter a: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[ValueParameterDescriptorImpl]

'declaredTypeParameters' @ [434:29] ==> public final val ClassDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'b' @ [435:27] ==> val b: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'declaredTypeParameters' @ [435:29] ==> public final val ClassDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'aTypeParams' @ [436:13] ==> val aTypeParams: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'size' @ [436:25] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'bTypeParams' @ [436:33] ==> val bTypeParams: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'size' @ [436:45] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'TypeParameterCount' @ [436:71] ==> public object TypeParameterCount : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'a' @ [438:13] ==> value-parameter a: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[ValueParameterDescriptorImpl]

'modality' @ [438:15] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'b' @ [438:27] ==> val b: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'modality' @ [438:29] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'!' @ [438:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'a' @ [438:43] ==> value-parameter a: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[ValueParameterDescriptorImpl]

'modality' @ [438:45] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'FINAL' @ [438:66] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'b' @ [438:75] ==> val b: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'modality' @ [438:77] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'OPEN' @ [438:98] ==> enum entry OPEN defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'Modality' @ [438:125] ==> public object Modality : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'a' @ [440:13] ==> value-parameter a: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[ValueParameterDescriptorImpl]

'visibility' @ [440:15] ==> public final val ClassDescriptor.visibility: Visibility[MyPropertyDescriptor]

'b' @ [440:29] ==> val b: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'visibility' @ [440:31] ==> public final val ClassDescriptor.visibility: Visibility[MyPropertyDescriptor]

'Visibility' @ [440:63] ==> public object Visibility : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'other' @ [442:30] ==> value-parameter other: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[ValueParameterDescriptorImpl]

'module' @ [442:36] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'Substitutor' @ [443:27] ==> public constructor Substitutor(aTypeParams: List<TypeParameterDescriptor>, bTypeParams: List<TypeParameterDescriptor>, parent: HeaderImplDeclarationChecker.Substitutor? = ...) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Substitutor[ClassConstructorDescriptorImpl]

'aTypeParams' @ [443:39] ==> val aTypeParams: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'bTypeParams' @ [443:52] ==> val bTypeParams: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'areCompatibleTypeParameters' @ [444:9] ==> private final fun areCompatibleTypeParameters(a: List<TypeParameterDescriptor>, b: List<TypeParameterDescriptor>, platformModule: ModuleDescriptor, substitutor: HeaderImplDeclarationChecker.Substitutor): HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'aTypeParams' @ [444:37] ==> val aTypeParams: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'bTypeParams' @ [444:50] ==> val bTypeParams: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'platformModule' @ [444:63] ==> val platformModule: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'substitutor' @ [444:79] ==> val substitutor: HeaderImplDeclarationChecker.Substitutor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'let' @ [444:92] ==> @InlineOnly public inline fun <T, R> HeaderImplDeclarationChecker.Compatibility.let(block: (HeaderImplDeclarationChecker.Compatibility) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Compatibility
    <R> -> Unit

'it' @ [444:102] ==> value-parameter it: HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers.<anonymous>[ValueParameterDescriptorImpl]

'Compatible' @ [444:108] ==> public object Compatible : HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility[FakeCallableDescriptorForObject]

'it' @ [444:127] ==> value-parameter it: HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers.<anonymous>[ValueParameterDescriptorImpl]

'a' @ [448:27] ==> value-parameter a: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[ValueParameterDescriptorImpl]

'typeConstructor' @ [448:29] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'supertypes' @ [448:45] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'filterNot' @ [448:56] ==> public inline fun <T> Iterable<(KotlinType..KotlinType?)>.filterNot(predicate: ((KotlinType..KotlinType?)) -> Boolean): List<(KotlinType..KotlinType?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'KotlinBuiltIns' @ [448:66] ==> protected/*protected and package*/ constructor KotlinBuiltIns(@NotNull p0: StorageManager) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaClassConstructorDescriptor]

'isAny' @ [448:82] ==> public open fun isAny(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'b' @ [449:27] ==> val b: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'typeConstructor' @ [449:29] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'supertypes' @ [449:45] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'filterNot' @ [449:56] ==> public inline fun <T> Iterable<(KotlinType..KotlinType?)>.filterNot(predicate: ((KotlinType..KotlinType?)) -> Boolean): List<(KotlinType..KotlinType?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'KotlinBuiltIns' @ [449:66] ==> protected/*protected and package*/ constructor KotlinBuiltIns(@NotNull p0: StorageManager) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaClassConstructorDescriptor]

'isAny' @ [449:82] ==> public open fun isAny(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'aSupertypes' @ [450:13] ==> val aSupertypes: List<(KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'map' @ [450:25] ==> public inline fun <T, R> Iterable<(KotlinType..KotlinType?)>.map(transform: ((KotlinType..KotlinType?)) -> KotlinType?): List<KotlinType?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R> -> KotlinType?

'substitutor' @ [450:29] ==> val substitutor: HeaderImplDeclarationChecker.Substitutor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'any' @ [450:42] ==> public inline fun <T> Iterable<KotlinType?>.any(predicate: (KotlinType?) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType?

'bSupertypes' @ [451:13] ==> val bSupertypes: List<(KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'none' @ [451:25] ==> public inline fun <T> Iterable<(KotlinType..KotlinType?)>.none(predicate: ((KotlinType..KotlinType?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'areCompatibleTypes' @ [451:46] ==> private final fun areCompatibleTypes(a: KotlinType?, b: KotlinType?, platformModule: ModuleDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'aSupertype' @ [451:65] ==> value-parameter aSupertype: KotlinType? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers.<anonymous>[ValueParameterDescriptorImpl]

'bSupertype' @ [451:77] ==> value-parameter bSupertype: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'platformModule' @ [451:89] ==> val platformModule: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'Supertypes' @ [452:32] ==> public object Supertypes : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'areCompatibleClassScopes' @ [454:9] ==> private final fun areCompatibleClassScopes(a: ClassDescriptor, b: ClassDescriptor, checkImpl: Boolean, platformModule: ModuleDescriptor, substitutor: HeaderImplDeclarationChecker.Substitutor): HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'a' @ [454:34] ==> value-parameter a: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[ValueParameterDescriptorImpl]

'b' @ [454:37] ==> val b: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'checkImpl' @ [454:40] ==> value-parameter checkImpl: Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[ValueParameterDescriptorImpl]

'!' @ [454:53] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'implTypealias' @ [454:54] ==> var implTypealias: Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'platformModule' @ [454:69] ==> val platformModule: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'substitutor' @ [454:85] ==> val substitutor: HeaderImplDeclarationChecker.Substitutor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'let' @ [454:98] ==> @InlineOnly public inline fun <T, R> HeaderImplDeclarationChecker.Compatibility.let(block: (HeaderImplDeclarationChecker.Compatibility) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Compatibility
    <R> -> Unit

'it' @ [454:108] ==> value-parameter it: HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers.<anonymous>[ValueParameterDescriptorImpl]

'Compatible' @ [454:114] ==> public object Compatible : HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility[FakeCallableDescriptorForObject]

'it' @ [454:133] ==> value-parameter it: HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers.<anonymous>[ValueParameterDescriptorImpl]

'checkImpl' @ [456:13] ==> value-parameter checkImpl: Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[ValueParameterDescriptorImpl]

'!' @ [456:26] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'b' @ [456:27] ==> val b: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'isImpl' @ [456:29] ==> public final val ClassDescriptor.isImpl: Boolean[MyPropertyDescriptor]

'!' @ [456:39] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'implTypealias' @ [456:40] ==> var implTypealias: Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassifiers[LocalVariableDescriptor]

'NoImpl' @ [456:75] ==> public object NoImpl : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'Compatible' @ [458:16] ==> public object Compatible : HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility[FakeCallableDescriptorForObject]

'arrayListOf' @ [468:29] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, MutableCollection<CallableMemberDescriptor>>>> /* = ArrayList<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, MutableCollection<CallableMemberDescriptor>>>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<CallableMemberDescriptor, Map<Incompatible, MutableCollection<CallableMemberDescriptor>>>

'b' @ [470:30] ==> value-parameter b: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[ValueParameterDescriptorImpl]

'getMembers' @ [470:32] ==> private final fun ClassDescriptor.getMembers(name: Name? = ...): Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'groupBy' @ [470:45] ==> public inline fun <T, K> Iterable<CallableMemberDescriptor>.groupBy(keySelector: (CallableMemberDescriptor) -> Name): Map<Name, List<CallableMemberDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor
    <K> -> Name

'it' @ [470:55] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [470:58] ==> public final val CallableMemberDescriptor.name: Name[MyPropertyDescriptor]

'a' @ [472:32] ==> value-parameter a: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[ValueParameterDescriptorImpl]

'getMembers' @ [472:34] ==> private final fun ClassDescriptor.getMembers(name: Name? = ...): Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'!' @ [473:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'aMember' @ [473:18] ==> val aMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[LocalVariableDescriptor]

'kind' @ [473:26] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [473:31] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'bMembersByName' @ [475:27] ==> val bMembersByName: Map<Name, List<CallableMemberDescriptor>> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[LocalVariableDescriptor]

'aMember' @ [475:42] ==> val aMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[LocalVariableDescriptor]

'name' @ [475:50] ==> public final val CallableMemberDescriptor.name: Name[MyPropertyDescriptor]

'orEmpty' @ [475:56] ==> @InlineOnly public inline fun <T> List<CallableMemberDescriptor>?.orEmpty(): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'keysToMap' @ [475:66] ==> public fun <K, V> Iterable<CallableMemberDescriptor>.keysToMap(value: (CallableMemberDescriptor) -> HeaderImplDeclarationChecker.Compatibility): Map<CallableMemberDescriptor, HeaderImplDeclarationChecker.Compatibility> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> CallableMemberDescriptor
    <V> -> Compatibility

'areCompatibleCallables' @ [476:17] ==> private final fun areCompatibleCallables(a: CallableMemberDescriptor, b: CallableMemberDescriptor, checkImpl: Boolean, platformModule: ModuleDescriptor = ..., parentSubstitutor: HeaderImplDeclarationChecker.Substitutor? = ...): HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[SimpleFunctionDescriptorImpl]

'aMember' @ [476:40] ==> val aMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[LocalVariableDescriptor]

'bMember' @ [476:49] ==> value-parameter bMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes.<anonymous>[ValueParameterDescriptorImpl]

'checkImpl' @ [476:58] ==> value-parameter checkImpl: Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[ValueParameterDescriptorImpl]

'platformModule' @ [476:69] ==> value-parameter platformModule: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[ValueParameterDescriptorImpl]

'substitutor' @ [476:85] ==> value-parameter substitutor: HeaderImplDeclarationChecker.Substitutor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[ValueParameterDescriptorImpl]

'mapping' @ [478:17] ==> val mapping: Map<CallableMemberDescriptor, HeaderImplDeclarationChecker.Compatibility> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[LocalVariableDescriptor]

'values' @ [478:25] ==> public abstract val values: Collection<HeaderImplDeclarationChecker.Compatibility> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'any' @ [478:32] ==> public inline fun <T> Iterable<HeaderImplDeclarationChecker.Compatibility>.any(predicate: (HeaderImplDeclarationChecker.Compatibility) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Compatibility

'it' @ [478:38] ==> value-parameter it: HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes.<anonymous>[ValueParameterDescriptorImpl]

'Compatible' @ [478:44] ==> public object Compatible : HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility[FakeCallableDescriptorForObject]

'mutableMapOf' @ [480:38] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<HeaderImplDeclarationChecker.Compatibility.Incompatible, MutableCollection<CallableMemberDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Incompatible
    <V> -> MutableCollection<CallableMemberDescriptor>

'component1' @ [481:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<CallableMemberDescriptor, HeaderImplDeclarationChecker.Compatibility>.component1(): CallableMemberDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> CallableMemberDescriptor
    <V> -> Compatibility

'component2' @ [481:31] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<CallableMemberDescriptor, HeaderImplDeclarationChecker.Compatibility>.component2(): HeaderImplDeclarationChecker.Compatibility defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> CallableMemberDescriptor
    <V> -> Compatibility

'mapping' @ [481:49] ==> val mapping: Map<CallableMemberDescriptor, HeaderImplDeclarationChecker.Compatibility> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[LocalVariableDescriptor]

'when (compatibility) {
                    Compatible -> continue@outer
                    is Incompatible -> incompatibilityMap.getOrPut(compatibility) { SmartList() }.add(descriptor)
                }' @ [482:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'compatibility' @ [482:23] ==> val compatibility: HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[LocalVariableDescriptor]

'Compatible' @ [483:21] ==> public object Compatible : HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility[FakeCallableDescriptorForObject]

'incompatibilityMap' @ [484:40] ==> val incompatibilityMap: MutableMap<HeaderImplDeclarationChecker.Compatibility.Incompatible, MutableCollection<CallableMemberDescriptor>> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[LocalVariableDescriptor]

'getOrPut' @ [484:59] ==> public inline fun <K, V> MutableMap<HeaderImplDeclarationChecker.Compatibility.Incompatible, MutableCollection<CallableMemberDescriptor>>.getOrPut(key: HeaderImplDeclarationChecker.Compatibility.Incompatible, defaultValue: () -> MutableCollection<CallableMemberDescriptor>): MutableCollection<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Incompatible
    <V> -> MutableCollection<CallableMemberDescriptor>

'compatibility' @ [484:68] ==> val compatibility: HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[LocalVariableDescriptor]

'SmartList' @ [484:85] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'add' @ [484:99] ==> public abstract fun add(element: CallableMemberDescriptor): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [484:103] ==> val descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[LocalVariableDescriptor]

'unimplemented' @ [488:13] ==> val unimplemented: ArrayList<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, MutableCollection<CallableMemberDescriptor>>>> /* = ArrayList<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, MutableCollection<CallableMemberDescriptor>>>> */ defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[LocalVariableDescriptor]

'add' @ [488:27] ==> public open fun add(element: Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, MutableCollection<CallableMemberDescriptor>>>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'aMember' @ [488:31] ==> val aMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[LocalVariableDescriptor]

'incompatibilityMap' @ [488:42] ==> val incompatibilityMap: MutableMap<HeaderImplDeclarationChecker.Compatibility.Incompatible, MutableCollection<CallableMemberDescriptor>> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[LocalVariableDescriptor]

'a' @ [491:13] ==> value-parameter a: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[ValueParameterDescriptorImpl]

'kind' @ [491:15] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_CLASS' @ [491:33] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'unsubstitutedMemberScope' @ [493:21] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'getDescriptorsFiltered' @ [493:46] ==> public fun MemberScope.getDescriptorsFiltered(kindFilter: DescriptorKindFilter = ..., nameFilter: (Name) -> Boolean = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes[DeserializedSimpleFunctionDescriptor]

'filter' @ [493:71] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'DescriptorUtils' @ [493:78] ==> private constructor DescriptorUtils() defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaClassConstructorDescriptor]

'isEnumEntry' @ [493:95] ==> public open fun isEnumEntry(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'map' @ [493:108] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.map(transform: (DeclarationDescriptor) -> Name): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> Name

'it' @ [493:114] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes.enumEntries.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [493:117] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'a' @ [494:28] ==> value-parameter a: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[ValueParameterDescriptorImpl]

'enumEntries' @ [494:30] ==> local final fun ClassDescriptor.enumEntries(): List<Name> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[SimpleFunctionDescriptorImpl]

'b' @ [495:28] ==> value-parameter b: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[ValueParameterDescriptorImpl]

'enumEntries' @ [495:30] ==> local final fun ClassDescriptor.enumEntries(): List<Name> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[SimpleFunctionDescriptorImpl]

'!' @ [497:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'bEntries' @ [497:18] ==> val bEntries: List<Name> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[LocalVariableDescriptor]

'containsAll' @ [497:27] ==> public abstract fun containsAll(elements: Collection<Name>): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'aEntries' @ [497:39] ==> val aEntries: List<Name> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[LocalVariableDescriptor]

'EnumEntries' @ [497:70] ==> public object EnumEntries : HeaderImplDeclarationChecker.Compatibility.Incompatible defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible[FakeCallableDescriptorForObject]

'unimplemented' @ [502:13] ==> val unimplemented: ArrayList<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, MutableCollection<CallableMemberDescriptor>>>> /* = ArrayList<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, MutableCollection<CallableMemberDescriptor>>>> */ defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[LocalVariableDescriptor]

'isEmpty' @ [502:27] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'Compatible' @ [502:45] ==> public object Compatible : HeaderImplDeclarationChecker.Compatibility defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility[FakeCallableDescriptorForObject]

'ClassScopes' @ [504:29] ==> public constructor ClassScopes(unimplemented: List<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, Collection<CallableMemberDescriptor>>>>) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible.ClassScopes[ClassConstructorDescriptorImpl]

'unimplemented' @ [504:41] ==> val unimplemented: ArrayList<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, MutableCollection<CallableMemberDescriptor>>>> /* = ArrayList<Pair<CallableMemberDescriptor, Map<HeaderImplDeclarationChecker.Compatibility.Incompatible, MutableCollection<CallableMemberDescriptor>>>> */ defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.areCompatibleClassScopes[LocalVariableDescriptor]

'if (name != null) { it -> it == name } else MemberScope.ALL_NAME_FILTER' @ [508:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Name) -> Boolean, elseBranch: (Name) -> Boolean): (Name) -> Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Function1<Name, Boolean>

'name' @ [508:30] ==> value-parameter name: Name? = ... defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.getMembers[ValueParameterDescriptorImpl]

'it' @ [508:52] ==> value-parameter it: Name defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.getMembers.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [508:58] ==> value-parameter name: Name? = ... defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.getMembers[ValueParameterDescriptorImpl]

'ALL_NAME_FILTER' @ [508:82] ==> public final val ALL_NAME_FILTER: (Name) -> Boolean defined in org.jetbrains.kotlin.resolve.scopes.MemberScope.Companion[DeserializedPropertyDescriptor]

'defaultType' @ [509:16] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'memberScope' @ [509:28] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'getDescriptorsFiltered' @ [509:40] ==> public fun MemberScope.getDescriptorsFiltered(kindFilter: DescriptorKindFilter = ..., nameFilter: (Name) -> Boolean = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes[DeserializedSimpleFunctionDescriptor]

'nameFilter' @ [509:76] ==> val nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.getMembers[LocalVariableDescriptor]

'filterIsInstance' @ [509:88] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> CallableMemberDescriptor

'constructors' @ [510:16] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'filter' @ [510:29] ==> public inline fun <T> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.filter(predicate: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> Boolean): List<(ClassConstructorDescriptor..ClassConstructorDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'invoke' @ [510:38] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [510:49] ==> value-parameter it: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.getMembers.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [510:52] ==> public final val ClassConstructorDescriptor.name: Name[MyPropertyDescriptor]

'invoke' @ [514:13] ==> public abstract operator fun invoke(p1: T): K defined in kotlin.Function1[FunctionInvokeDescriptor]

'first' @ [514:22] ==> value-parameter first: T defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.equalBy[ValueParameterDescriptorImpl]

'invoke' @ [514:32] ==> public abstract operator fun invoke(p1: T): K defined in kotlin.Function1[FunctionInvokeDescriptor]

'second' @ [514:41] ==> value-parameter second: T defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.equalBy[ValueParameterDescriptorImpl]

'first' @ [517:19] ==> value-parameter first: List<T> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.equalsBy[ValueParameterDescriptorImpl]

'indices' @ [517:25] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'invoke' @ [518:17] ==> public abstract operator fun invoke(p1: T): K defined in kotlin.Function1[FunctionInvokeDescriptor]

'first' @ [518:26] ==> value-parameter first: List<T> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.equalsBy[ValueParameterDescriptorImpl]

'i' @ [518:32] ==> val i: Int defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.equalsBy[LocalVariableDescriptor]

'invoke' @ [518:39] ==> public abstract operator fun invoke(p1: T): K defined in kotlin.Function1[FunctionInvokeDescriptor]

'second' @ [518:48] ==> value-parameter second: List<T> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.equalsBy[ValueParameterDescriptorImpl]

'i' @ [518:55] ==> val i: Int defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.equalsBy[LocalVariableDescriptor]

'create' @ [530:55] ==> @NotNull public open fun create(@NotNull p0: TypeSubstitution): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'createByParametersMap' @ [531:45] ==> @JvmStatic public final fun createByParametersMap(map: Map<TypeParameterDescriptor, TypeProjection>): TypeConstructorSubstitution defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution.Companion[DeserializedSimpleFunctionDescriptor]

'aTypeParams' @ [531:67] ==> value-parameter aTypeParams: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Substitutor.<init>[ValueParameterDescriptorImpl]

'keysToMap' @ [531:79] ==> public fun <K, V> Iterable<TypeParameterDescriptor>.keysToMap(value: (TypeParameterDescriptor) -> TypeProjection): Map<TypeParameterDescriptor, TypeProjection> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeParameterDescriptor
    <V> -> TypeProjection

'bTypeParams' @ [532:21] ==> value-parameter bTypeParams: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Substitutor.<init>[ValueParameterDescriptorImpl]

'it' @ [532:33] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Substitutor.typeSubstitutor.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [532:36] ==> public final val TypeParameterDescriptor.index: Int[MyPropertyDescriptor]

'defaultType' @ [532:43] ==> public final val TypeParameterDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'asTypeProjection' @ [532:55] ==> public fun KotlinType.asTypeProjection(): TypeProjection defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'parent' @ [537:18] ==> private final val parent: HeaderImplDeclarationChecker.Substitutor? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Substitutor[PropertyDescriptorImpl]

'invoke' @ [537:26] ==> public open fun invoke(type: KotlinType?): KotlinType? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Substitutor[SimpleFunctionDescriptorImpl]

'type' @ [537:33] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Substitutor.invoke[ValueParameterDescriptorImpl]

'type' @ [537:42] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Substitutor.invoke[ValueParameterDescriptorImpl]

'asTypeProjection' @ [537:49] ==> public fun KotlinType.asTypeProjection(): TypeProjection defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'let' @ [537:69] ==> @InlineOnly public inline fun <T, R> TypeProjection.let(block: (TypeProjection) -> TypeProjection?): TypeProjection? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> TypeProjection?

'typeSubstitutor' @ [537:73] ==> private final val typeSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Substitutor[PropertyDescriptorImpl]

'substitute' @ [537:90] ==> @Nullable public open fun substitute(@NotNull p0: TypeProjection): TypeProjection? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'type' @ [537:103] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

