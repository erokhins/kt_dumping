'DomElementsInspection<MavenDomProjectModel>' @ [45:42] ==> public constructor DomElementsInspection<T : (DomElement..DomElement?)>(p0: (Class<out (MavenDomProjectModel..MavenDomProjectModel?)>..Class<out (MavenDomProjectModel..MavenDomProjectModel?)>?), @NotNull vararg p1: (Class<out (MavenDomProjectModel..MavenDomProjectModel?)>..Class<out (MavenDomProjectModel..MavenDomProjectModel?)>?)) defined in com.intellij.util.xml.highlighting.DomElementsInspection[JavaClassConstructorDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> MavenDomProjectModel

'java' @ [45:114] ==> public val <T> KClass<MavenDomProjectModel>.java: Class<MavenDomProjectModel> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> MavenDomProjectModel

'domFileElement' @ [49:13] ==> value-parameter domFileElement: DomFileElement<MavenDomProjectModel>? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[ValueParameterDescriptorImpl]

'holder' @ [49:39] ==> value-parameter holder: DomElementAnnotationHolder? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[ValueParameterDescriptorImpl]

'domFileElement' @ [53:22] ==> value-parameter domFileElement: DomFileElement<MavenDomProjectModel>? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[ValueParameterDescriptorImpl]

'module' @ [53:37] ==> public final val <T : (DomElement..DomElement?)> DomFileElement<MavenDomProjectModel>.module: Module?[MyPropertyDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> MavenDomProjectModel

'getInstance' @ [54:44] ==> public open fun getInstance(p0: (Project..Project?)): (MavenProjectsManager..MavenProjectsManager?) defined in org.jetbrains.idea.maven.project.MavenProjectsManager[JavaMethodDescriptor]

'module' @ [54:56] ==> val module: Module defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'project' @ [54:63] ==> public final val Module.project: Project[MyPropertyDescriptor]

'manager' @ [55:28] ==> val manager: (MavenProjectsManager..MavenProjectsManager?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'findProject' @ [55:36] ==> @Nullable public open fun findProject(@NotNull p0: Module): MavenProject? defined in org.jetbrains.idea.maven.project.MavenProjectsManager[JavaMethodDescriptor]

'module' @ [55:48] ==> val module: Module defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'PomFile' @ [57:19] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'forFileOrNull' @ [57:27] ==> public final fun forFileOrNull(xmlFile: XmlFile): PomFile? defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion[SimpleFunctionDescriptorImpl]

'domFileElement' @ [57:41] ==> value-parameter domFileElement: DomFileElement<MavenDomProjectModel>? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[ValueParameterDescriptorImpl]

'file' @ [57:56] ==> public final val <T : (DomElement..DomElement?)> DomFileElement<MavenDomProjectModel>.file: XmlFile[MyPropertyDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> MavenDomProjectModel

'module' @ [58:28] ==> val module: Module defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'hasJavaFiles' @ [58:35] ==> public fun Module.hasJavaFiles(): Boolean defined in org.jetbrains.kotlin.idea.maven.inspections in file KotlinMavenPluginPhaseInspection.kt[SimpleFunctionDescriptorImpl]

'mavenProject' @ [61:26] ==> val mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'plugins' @ [61:39] ==> public final val MavenProject.plugins: (MutableList<(MavenPlugin..MavenPlugin?)>..List<(MavenPlugin..MavenPlugin?)>)[MyPropertyDescriptor]

'filter' @ [62:18] ==> public inline fun <T> Iterable<(MavenPlugin..MavenPlugin?)>.filter(predicate: ((MavenPlugin..MavenPlugin?)) -> Boolean): List<(MavenPlugin..MavenPlugin?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.model.MavenPlugin..org.jetbrains.idea.maven.model.MavenPlugin?)

'it' @ [62:27] ==> value-parameter it: (MavenPlugin..MavenPlugin?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'isKotlinMavenPlugin' @ [62:30] ==> private fun MavenPlugin.isKotlinMavenPlugin(): Boolean defined in org.jetbrains.kotlin.idea.maven.inspections[SimpleFunctionDescriptorImpl]

'flatMap' @ [63:18] ==> public inline fun <T, R> Iterable<(MavenPlugin..MavenPlugin?)>.flatMap(transform: ((MavenPlugin..MavenPlugin?)) -> Iterable<(MavenPlugin.Execution..MavenPlugin.Execution?)>): List<(MavenPlugin.Execution..MavenPlugin.Execution?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.model.MavenPlugin..org.jetbrains.idea.maven.model.MavenPlugin?)
    <R> -> (org.jetbrains.idea.maven.model.MavenPlugin.Execution..org.jetbrains.idea.maven.model.MavenPlugin.Execution?)

'it' @ [63:28] ==> value-parameter it: (MavenPlugin..MavenPlugin?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'executions' @ [63:31] ==> public final val MavenPlugin.executions: (MutableList<(MavenPlugin.Execution..MavenPlugin.Execution?)>..List<(MavenPlugin.Execution..MavenPlugin.Execution?)>?)[MyPropertyDescriptor]

'executions' @ [64:40] ==> val executions: List<(MavenPlugin.Execution..MavenPlugin.Execution?)> defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'flatMapTo' @ [64:51] ==> public inline fun <T, R, C : MutableCollection<in (String..String?)>> Iterable<(MavenPlugin.Execution..MavenPlugin.Execution?)>.flatMapTo(destination: HashSet<(String..String?)>, transform: ((MavenPlugin.Execution..MavenPlugin.Execution?)) -> Iterable<(String..String?)>): HashSet<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.model.MavenPlugin.Execution..org.jetbrains.idea.maven.model.MavenPlugin.Execution?)
    <R> -> (kotlin.String..kotlin.String?)
    <C : MutableCollection<in R>> -> HashSet<(kotlin.String..kotlin.String?)>

'HashSet' @ [64:61] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'it' @ [64:74] ==> value-parameter it: (MavenPlugin.Execution..MavenPlugin.Execution?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'goals' @ [64:77] ==> public final val MavenPlugin.Execution.goals: (MutableList<(String..String?)>..List<(String..String?)>?)[MyPropertyDescriptor]

'PomFile' @ [65:31] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'Compile' @ [65:51] ==> public final val Compile: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'allGoalsSet' @ [65:62] ==> val allGoalsSet: Set<String> defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'PomFile' @ [65:77] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'TestCompile' @ [65:97] ==> public final val TestCompile: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'allGoalsSet' @ [65:112] ==> val allGoalsSet: Set<String> defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'PomFile' @ [66:30] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'Js' @ [66:50] ==> public final val Js: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'allGoalsSet' @ [66:56] ==> val allGoalsSet: Set<String> defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'PomFile' @ [66:71] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'TestJs' @ [66:91] ==> public final val TestJs: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'allGoalsSet' @ [66:101] ==> val allGoalsSet: Set<String> defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'pom' @ [68:32] ==> val pom: PomFile defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'findKotlinPlugins' @ [68:36] ==> public final fun findKotlinPlugins(): List<(MavenDomPlugin..MavenDomPlugin?)> defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'pomKotlinPlugins' @ [70:30] ==> val pomKotlinPlugins: List<(MavenDomPlugin..MavenDomPlugin?)> defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'if (PomFile.KotlinGoals.Compile !in allGoalsSet && PomFile.KotlinGoals.Js !in allGoalsSet) {
                val fixes = if (hasJavaFiles) {
                    arrayOf(AddExecutionLocalFix(domFileElement.file, module, kotlinPlugin, PomFile.KotlinGoals.Compile))
                }
                else {
                    arrayOf(AddExecutionLocalFix(domFileElement.file, module, kotlinPlugin, PomFile.KotlinGoals.Compile),
                            AddExecutionLocalFix(domFileElement.file, module, kotlinPlugin, PomFile.KotlinGoals.Js))
                }

                holder.createProblem(kotlinPlugin.artifactId.createStableCopy(),
                                     HighlightSeverity.WARNING,
                                     "Kotlin plugin has no compile executions",
                                     *fixes)
            }
            else {
                if (hasJavaFiles) {
                    pom.findExecutions(kotlinPlugin, PomFile.KotlinGoals.Compile).notAtPhase(PomFile.DefaultPhases.ProcessSources).forEach { badExecution ->
                        val javacPlugin = mavenProject.findPlugin("org.apache.maven.plugins", "maven-compiler-plugin")
                        val existingJavac = pom.domModel.build.plugins.plugins.firstOrNull {
                            it.groupId.stringValue == "org.apache.maven.plugins" &&
                            it.artifactId.stringValue == "maven-compiler-plugin"
                        }

                        if (existingJavac == null
                            || !pom.isPluginAfter(existingJavac, kotlinPlugin)
                            || pom.isExecutionEnabled(javacPlugin, "default-compile")
                            || pom.isExecutionEnabled(javacPlugin, "default-testCompile")
                            || pom.isPluginExecutionMissing(javacPlugin, "default-compile", "compile")
                            || pom.isPluginExecutionMissing(javacPlugin, "default-testCompile", "testCompile")) {

                            holder.createProblem(badExecution.phase.createStableCopy(),
                                                 HighlightSeverity.WARNING,
                                                 "Kotlin plugin should run before javac so kotlin classes could be visible from Java",
                                                 FixExecutionPhaseLocalFix(badExecution, PomFile.DefaultPhases.ProcessSources),
                                                 AddJavaExecutionsLocalFix(module, domFileElement.file, kotlinPlugin))
                        }
                    }

                    pom.findExecutions(kotlinPlugin, PomFile.KotlinGoals.Js, PomFile.KotlinGoals.TestJs).forEach { badExecution ->
                        holder.createProblem(badExecution.goals.goals.first { it.isJsGoal() }.createStableCopy(),
                                             HighlightSeverity.WARNING,
                                             "JavaScript goal configured for module with Java files")
                    }
                }

                val stdlibDependencies = mavenProject.findDependencies(KotlinMavenConfigurator.GROUP_ID, MAVEN_STDLIB_ID)
                val jsDependencies = mavenProject.findDependencies(KotlinMavenConfigurator.GROUP_ID, MAVEN_JS_STDLIB_ID)

                if (hasJvmExecution && stdlibDependencies.isEmpty()) {
                    holder.createProblem(kotlinPlugin.artifactId.createStableCopy(),
                                         HighlightSeverity.WARNING,
                                         "Kotlin JVM compiler configured but no $MAVEN_STDLIB_ID dependency",
                                         FixAddStdlibLocalFix(domFileElement.file, MAVEN_STDLIB_ID, kotlinPlugin.version.rawText))
                }
                if (hasJsExecution && jsDependencies.isEmpty()) {
                    holder.createProblem(kotlinPlugin.artifactId.createStableCopy(),
                                         HighlightSeverity.WARNING,
                                         "Kotlin JavaScript compiler configured but no $MAVEN_JS_STDLIB_ID dependency",
                                         FixAddStdlibLocalFix(domFileElement.file, MAVEN_JS_STDLIB_ID, kotlinPlugin.version.rawText))
                }
            }' @ [71:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'PomFile' @ [71:17] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'Compile' @ [71:37] ==> public final val Compile: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'allGoalsSet' @ [71:49] ==> val allGoalsSet: Set<String> defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'PomFile' @ [71:64] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'Js' @ [71:84] ==> public final val Js: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'allGoalsSet' @ [71:91] ==> val allGoalsSet: Set<String> defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'if (hasJavaFiles) {
                    arrayOf(AddExecutionLocalFix(domFileElement.file, module, kotlinPlugin, PomFile.KotlinGoals.Compile))
                }
                else {
                    arrayOf(AddExecutionLocalFix(domFileElement.file, module, kotlinPlugin, PomFile.KotlinGoals.Compile),
                            AddExecutionLocalFix(domFileElement.file, module, kotlinPlugin, PomFile.KotlinGoals.Js))
                }' @ [72:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Array<KotlinMavenPluginPhaseInspection.AddExecutionLocalFix>, elseBranch: Array<KotlinMavenPluginPhaseInspection.AddExecutionLocalFix>): Array<KotlinMavenPluginPhaseInspection.AddExecutionLocalFix>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Array<AddExecutionLocalFix>

'hasJavaFiles' @ [72:33] ==> val hasJavaFiles: Boolean defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'arrayOf' @ [73:21] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KotlinMavenPluginPhaseInspection.AddExecutionLocalFix): Array<KotlinMavenPluginPhaseInspection.AddExecutionLocalFix> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> AddExecutionLocalFix

'AddExecutionLocalFix' @ [73:29] ==> public constructor AddExecutionLocalFix(file: XmlFile, module: Module, kotlinPlugin: MavenDomPlugin, goal: String) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.AddExecutionLocalFix[ClassConstructorDescriptorImpl]

'domFileElement' @ [73:50] ==> value-parameter domFileElement: DomFileElement<MavenDomProjectModel>? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[ValueParameterDescriptorImpl]

'file' @ [73:65] ==> public final val <T : (DomElement..DomElement?)> DomFileElement<MavenDomProjectModel>.file: XmlFile[MyPropertyDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> MavenDomProjectModel

'module' @ [73:71] ==> val module: Module defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'kotlinPlugin' @ [73:79] ==> val kotlinPlugin: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'PomFile' @ [73:93] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'Compile' @ [73:113] ==> public final val Compile: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'arrayOf' @ [76:21] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KotlinMavenPluginPhaseInspection.AddExecutionLocalFix): Array<KotlinMavenPluginPhaseInspection.AddExecutionLocalFix> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> AddExecutionLocalFix

'AddExecutionLocalFix' @ [76:29] ==> public constructor AddExecutionLocalFix(file: XmlFile, module: Module, kotlinPlugin: MavenDomPlugin, goal: String) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.AddExecutionLocalFix[ClassConstructorDescriptorImpl]

'domFileElement' @ [76:50] ==> value-parameter domFileElement: DomFileElement<MavenDomProjectModel>? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[ValueParameterDescriptorImpl]

'file' @ [76:65] ==> public final val <T : (DomElement..DomElement?)> DomFileElement<MavenDomProjectModel>.file: XmlFile[MyPropertyDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> MavenDomProjectModel

'module' @ [76:71] ==> val module: Module defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'kotlinPlugin' @ [76:79] ==> val kotlinPlugin: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'PomFile' @ [76:93] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'Compile' @ [76:113] ==> public final val Compile: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'AddExecutionLocalFix' @ [77:29] ==> public constructor AddExecutionLocalFix(file: XmlFile, module: Module, kotlinPlugin: MavenDomPlugin, goal: String) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.AddExecutionLocalFix[ClassConstructorDescriptorImpl]

'domFileElement' @ [77:50] ==> value-parameter domFileElement: DomFileElement<MavenDomProjectModel>? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[ValueParameterDescriptorImpl]

'file' @ [77:65] ==> public final val <T : (DomElement..DomElement?)> DomFileElement<MavenDomProjectModel>.file: XmlFile[MyPropertyDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> MavenDomProjectModel

'module' @ [77:71] ==> val module: Module defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'kotlinPlugin' @ [77:79] ==> val kotlinPlugin: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'PomFile' @ [77:93] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'Js' @ [77:113] ==> public final val Js: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'holder' @ [80:17] ==> value-parameter holder: DomElementAnnotationHolder? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[ValueParameterDescriptorImpl]

'createProblem' @ [80:24] ==> public abstract fun createProblem(@NotNull p0: DomElement, p1: (HighlightSeverity..HighlightSeverity?), p2: (String..String?), vararg p3: (LocalQuickFix..LocalQuickFix?)): (DomElementProblemDescriptor..DomElementProblemDescriptor?) defined in com.intellij.util.xml.highlighting.DomElementAnnotationHolder[JavaMethodDescriptor]

'kotlinPlugin' @ [80:38] ==> val kotlinPlugin: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'artifactId' @ [80:51] ==> public final val MavenDomPlugin.artifactId: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'createStableCopy' @ [80:62] ==> public abstract fun <T : (DomElement..DomElement?)> createStableCopy(): (DomElement..DomElement?) defined in com.intellij.util.xml.GenericDomValue[JavaMethodDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> DomElement

'WARNING' @ [81:56] ==> public final val WARNING: (HighlightSeverity..HighlightSeverity?) defined in com.intellij.lang.annotation.HighlightSeverity[JavaPropertyDescriptor]

'fixes' @ [83:39] ==> val fixes: Array<KotlinMavenPluginPhaseInspection.AddExecutionLocalFix> defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'hasJavaFiles' @ [86:21] ==> val hasJavaFiles: Boolean defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'pom' @ [87:21] ==> val pom: PomFile defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'findExecutions' @ [87:25] ==> public final fun findExecutions(plugin: MavenDomPlugin, vararg goals: String): List<(MavenDomPluginExecution..MavenDomPluginExecution?)> defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'kotlinPlugin' @ [87:40] ==> val kotlinPlugin: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'PomFile' @ [87:54] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'Compile' @ [87:74] ==> public final val Compile: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'notAtPhase' @ [87:83] ==> private fun List<MavenDomPluginExecution>.notAtPhase(phase: String): List<MavenDomPluginExecution> defined in org.jetbrains.kotlin.idea.maven.inspections[SimpleFunctionDescriptorImpl]

'PomFile' @ [87:94] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'ProcessSources' @ [87:116] ==> public final val ProcessSources: String defined in org.jetbrains.kotlin.idea.maven.PomFile.DefaultPhases[PropertyDescriptorImpl]

'forEach' @ [87:132] ==> @HidesMembers public inline fun <T> Iterable<MavenDomPluginExecution>.forEach(action: (MavenDomPluginExecution) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenDomPluginExecution

'mavenProject' @ [88:43] ==> val mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'findPlugin' @ [88:56] ==> @Nullable public open fun findPlugin(@Nullable p0: String?, @Nullable p1: String?): MavenPlugin? defined in org.jetbrains.idea.maven.project.MavenProject[JavaMethodDescriptor]

'pom' @ [89:45] ==> val pom: PomFile defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'domModel' @ [89:49] ==> public final val domModel: MavenDomProjectModel defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'build' @ [89:58] ==> public final val MavenDomProjectModel.build: MavenDomBuild[MyPropertyDescriptor]

'plugins' @ [89:64] ==> public final val MavenDomBuild.plugins: MavenDomPlugins[MyPropertyDescriptor]

'plugins' @ [89:72] ==> public final val MavenDomPlugins.plugins: (MutableList<(MavenDomPlugin..MavenDomPlugin?)>..List<(MavenDomPlugin..MavenDomPlugin?)>)[MyPropertyDescriptor]

'firstOrNull' @ [89:80] ==> public inline fun <T> Iterable<(MavenDomPlugin..MavenDomPlugin?)>.firstOrNull(predicate: ((MavenDomPlugin..MavenDomPlugin?)) -> Boolean): MavenDomPlugin? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomPlugin..org.jetbrains.idea.maven.dom.model.MavenDomPlugin?)

'it' @ [90:29] ==> value-parameter it: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'groupId' @ [90:32] ==> public final val MavenDomPlugin.groupId: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'stringValue' @ [90:40] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'it' @ [91:29] ==> value-parameter it: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'artifactId' @ [91:32] ==> public final val MavenDomPlugin.artifactId: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'stringValue' @ [91:43] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'existingJavac' @ [94:29] ==> val existingJavac: MavenDomPlugin? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>[LocalVariableDescriptor]

'!' @ [95:32] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'pom' @ [95:33] ==> val pom: PomFile defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'isPluginAfter' @ [95:37] ==> public final fun isPluginAfter(plugin: MavenDomPlugin, referencePlugin: MavenDomPlugin): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'existingJavac' @ [95:51] ==> val existingJavac: MavenDomPlugin? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>[LocalVariableDescriptor]

'kotlinPlugin' @ [95:66] ==> val kotlinPlugin: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'pom' @ [96:32] ==> val pom: PomFile defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'isExecutionEnabled' @ [96:36] ==> public final fun isExecutionEnabled(plugin: MavenPlugin?, executionId: String): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'javacPlugin' @ [96:55] ==> val javacPlugin: MavenPlugin? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>[LocalVariableDescriptor]

'pom' @ [97:32] ==> val pom: PomFile defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'isExecutionEnabled' @ [97:36] ==> public final fun isExecutionEnabled(plugin: MavenPlugin?, executionId: String): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'javacPlugin' @ [97:55] ==> val javacPlugin: MavenPlugin? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>[LocalVariableDescriptor]

'pom' @ [98:32] ==> val pom: PomFile defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'isPluginExecutionMissing' @ [98:36] ==> public final fun isPluginExecutionMissing(plugin: MavenPlugin?, excludedExecutionId: String, goal: String): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'javacPlugin' @ [98:61] ==> val javacPlugin: MavenPlugin? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>[LocalVariableDescriptor]

'pom' @ [99:32] ==> val pom: PomFile defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'isPluginExecutionMissing' @ [99:36] ==> public final fun isPluginExecutionMissing(plugin: MavenPlugin?, excludedExecutionId: String, goal: String): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'javacPlugin' @ [99:61] ==> val javacPlugin: MavenPlugin? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>[LocalVariableDescriptor]

'holder' @ [101:29] ==> value-parameter holder: DomElementAnnotationHolder? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[ValueParameterDescriptorImpl]

'createProblem' @ [101:36] ==> public abstract fun createProblem(@NotNull p0: DomElement, p1: (HighlightSeverity..HighlightSeverity?), p2: (String..String?), vararg p3: (LocalQuickFix..LocalQuickFix?)): (DomElementProblemDescriptor..DomElementProblemDescriptor?) defined in com.intellij.util.xml.highlighting.DomElementAnnotationHolder[JavaMethodDescriptor]

'badExecution' @ [101:50] ==> value-parameter badExecution: MavenDomPluginExecution defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'phase' @ [101:63] ==> public final val MavenDomPluginExecution.phase: GenericDomValue<(String..String?)>[MyPropertyDescriptor]

'createStableCopy' @ [101:69] ==> public abstract fun <T : (DomElement..DomElement?)> createStableCopy(): (DomElement..DomElement?) defined in com.intellij.util.xml.GenericDomValue[JavaMethodDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> DomElement

'WARNING' @ [102:68] ==> public final val WARNING: (HighlightSeverity..HighlightSeverity?) defined in com.intellij.lang.annotation.HighlightSeverity[JavaPropertyDescriptor]

'FixExecutionPhaseLocalFix' @ [104:50] ==> public constructor FixExecutionPhaseLocalFix(execution: MavenDomPluginExecution, newPhase: String) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.FixExecutionPhaseLocalFix[ClassConstructorDescriptorImpl]

'badExecution' @ [104:76] ==> value-parameter badExecution: MavenDomPluginExecution defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'PomFile' @ [104:90] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'ProcessSources' @ [104:112] ==> public final val ProcessSources: String defined in org.jetbrains.kotlin.idea.maven.PomFile.DefaultPhases[PropertyDescriptorImpl]

'AddJavaExecutionsLocalFix' @ [105:50] ==> public constructor AddJavaExecutionsLocalFix(module: Module, file: XmlFile, kotlinPlugin: MavenDomPlugin) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.AddJavaExecutionsLocalFix[ClassConstructorDescriptorImpl]

'module' @ [105:76] ==> val module: Module defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'domFileElement' @ [105:84] ==> value-parameter domFileElement: DomFileElement<MavenDomProjectModel>? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[ValueParameterDescriptorImpl]

'file' @ [105:99] ==> public final val <T : (DomElement..DomElement?)> DomFileElement<MavenDomProjectModel>.file: XmlFile[MyPropertyDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> MavenDomProjectModel

'kotlinPlugin' @ [105:105] ==> val kotlinPlugin: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'pom' @ [109:21] ==> val pom: PomFile defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'findExecutions' @ [109:25] ==> public final fun findExecutions(plugin: MavenDomPlugin, vararg goals: String): List<(MavenDomPluginExecution..MavenDomPluginExecution?)> defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'kotlinPlugin' @ [109:40] ==> val kotlinPlugin: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'PomFile' @ [109:54] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'Js' @ [109:74] ==> public final val Js: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'PomFile' @ [109:78] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'TestJs' @ [109:98] ==> public final val TestJs: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'forEach' @ [109:106] ==> @HidesMembers public inline fun <T> Iterable<(MavenDomPluginExecution..MavenDomPluginExecution?)>.forEach(action: ((MavenDomPluginExecution..MavenDomPluginExecution?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomPluginExecution..org.jetbrains.idea.maven.dom.model.MavenDomPluginExecution?)

'holder' @ [110:25] ==> value-parameter holder: DomElementAnnotationHolder? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[ValueParameterDescriptorImpl]

'createProblem' @ [110:32] ==> @NotNull public abstract fun createProblem(@NotNull p0: DomElement, p1: (HighlightSeverity..HighlightSeverity?), p2: (String..String?)): DomElementProblemDescriptor defined in com.intellij.util.xml.highlighting.DomElementAnnotationHolder[JavaMethodDescriptor]

'badExecution' @ [110:46] ==> value-parameter badExecution: (MavenDomPluginExecution..MavenDomPluginExecution?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'goals' @ [110:59] ==> public final val MavenDomPluginExecution.goals: MavenDomGoals[MyPropertyDescriptor]

'goals' @ [110:65] ==> public final val MavenDomGoals.goals: (MutableList<(MavenDomGoal..MavenDomGoal?)>..List<(MavenDomGoal..MavenDomGoal?)>?)[MyPropertyDescriptor]

'first' @ [110:71] ==> public inline fun <T> Iterable<(MavenDomGoal..MavenDomGoal?)>.first(predicate: ((MavenDomGoal..MavenDomGoal?)) -> Boolean): (MavenDomGoal..MavenDomGoal?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomGoal..org.jetbrains.idea.maven.dom.model.MavenDomGoal?)

'it' @ [110:79] ==> value-parameter it: (MavenDomGoal..MavenDomGoal?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isJsGoal' @ [110:82] ==> private fun MavenDomGoal.isJsGoal(): Boolean defined in org.jetbrains.kotlin.idea.maven.inspections[SimpleFunctionDescriptorImpl]

'createStableCopy' @ [110:95] ==> public abstract fun <T : (DomElement..DomElement?)> createStableCopy(): (DomElement..DomElement?) defined in org.jetbrains.idea.maven.dom.model.MavenDomGoal[JavaMethodDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> DomElement

'WARNING' @ [111:64] ==> public final val WARNING: (HighlightSeverity..HighlightSeverity?) defined in com.intellij.lang.annotation.HighlightSeverity[JavaPropertyDescriptor]

'mavenProject' @ [116:42] ==> val mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'findDependencies' @ [116:55] ==> @NotNull public open fun findDependencies(@Nullable p0: String?, @Nullable p1: String?): (MutableList<(MavenArtifact..MavenArtifact?)>..List<(MavenArtifact..MavenArtifact?)>) defined in org.jetbrains.idea.maven.project.MavenProject[JavaMethodDescriptor]

'KotlinMavenConfigurator' @ [116:72] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator[FakeCallableDescriptorForObject]

'GROUP_ID' @ [116:96] ==> public final val GROUP_ID: String defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[PropertyDescriptorImpl]

'MAVEN_STDLIB_ID' @ [116:106] ==> public val MAVEN_STDLIB_ID: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'mavenProject' @ [117:38] ==> val mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'findDependencies' @ [117:51] ==> @NotNull public open fun findDependencies(@Nullable p0: String?, @Nullable p1: String?): (MutableList<(MavenArtifact..MavenArtifact?)>..List<(MavenArtifact..MavenArtifact?)>) defined in org.jetbrains.idea.maven.project.MavenProject[JavaMethodDescriptor]

'KotlinMavenConfigurator' @ [117:68] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator[FakeCallableDescriptorForObject]

'GROUP_ID' @ [117:92] ==> public final val GROUP_ID: String defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[PropertyDescriptorImpl]

'MAVEN_JS_STDLIB_ID' @ [117:102] ==> public val MAVEN_JS_STDLIB_ID: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'hasJvmExecution' @ [119:21] ==> val hasJvmExecution: Boolean defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'stdlibDependencies' @ [119:40] ==> val stdlibDependencies: (MutableList<(MavenArtifact..MavenArtifact?)>..List<(MavenArtifact..MavenArtifact?)>) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'isEmpty' @ [119:59] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'holder' @ [120:21] ==> value-parameter holder: DomElementAnnotationHolder? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[ValueParameterDescriptorImpl]

'createProblem' @ [120:28] ==> public abstract fun createProblem(@NotNull p0: DomElement, p1: (HighlightSeverity..HighlightSeverity?), p2: (String..String?), vararg p3: (LocalQuickFix..LocalQuickFix?)): (DomElementProblemDescriptor..DomElementProblemDescriptor?) defined in com.intellij.util.xml.highlighting.DomElementAnnotationHolder[JavaMethodDescriptor]

'kotlinPlugin' @ [120:42] ==> val kotlinPlugin: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'artifactId' @ [120:55] ==> public final val MavenDomPlugin.artifactId: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'createStableCopy' @ [120:66] ==> public abstract fun <T : (DomElement..DomElement?)> createStableCopy(): (DomElement..DomElement?) defined in com.intellij.util.xml.GenericDomValue[JavaMethodDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> DomElement

'WARNING' @ [121:60] ==> public final val WARNING: (HighlightSeverity..HighlightSeverity?) defined in com.intellij.lang.annotation.HighlightSeverity[JavaPropertyDescriptor]

'MAVEN_STDLIB_ID' @ [122:82] ==> public val MAVEN_STDLIB_ID: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'FixAddStdlibLocalFix' @ [123:42] ==> public constructor FixAddStdlibLocalFix(pomFile: XmlFile, id: String, version: String?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.FixAddStdlibLocalFix[ClassConstructorDescriptorImpl]

'domFileElement' @ [123:63] ==> value-parameter domFileElement: DomFileElement<MavenDomProjectModel>? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[ValueParameterDescriptorImpl]

'file' @ [123:78] ==> public final val <T : (DomElement..DomElement?)> DomFileElement<MavenDomProjectModel>.file: XmlFile[MyPropertyDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> MavenDomProjectModel

'MAVEN_STDLIB_ID' @ [123:84] ==> public val MAVEN_STDLIB_ID: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'kotlinPlugin' @ [123:101] ==> val kotlinPlugin: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'version' @ [123:114] ==> public final val MavenDomPlugin.version: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'rawText' @ [123:122] ==> public final val <T : (Any..Any?)> GenericDomValue<(String..String?)>.rawText: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'hasJsExecution' @ [125:21] ==> val hasJsExecution: Boolean defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'jsDependencies' @ [125:39] ==> val jsDependencies: (MutableList<(MavenArtifact..MavenArtifact?)>..List<(MavenArtifact..MavenArtifact?)>) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'isEmpty' @ [125:54] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'holder' @ [126:21] ==> value-parameter holder: DomElementAnnotationHolder? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[ValueParameterDescriptorImpl]

'createProblem' @ [126:28] ==> public abstract fun createProblem(@NotNull p0: DomElement, p1: (HighlightSeverity..HighlightSeverity?), p2: (String..String?), vararg p3: (LocalQuickFix..LocalQuickFix?)): (DomElementProblemDescriptor..DomElementProblemDescriptor?) defined in com.intellij.util.xml.highlighting.DomElementAnnotationHolder[JavaMethodDescriptor]

'kotlinPlugin' @ [126:42] ==> val kotlinPlugin: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'artifactId' @ [126:55] ==> public final val MavenDomPlugin.artifactId: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'createStableCopy' @ [126:66] ==> public abstract fun <T : (DomElement..DomElement?)> createStableCopy(): (DomElement..DomElement?) defined in com.intellij.util.xml.GenericDomValue[JavaMethodDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> DomElement

'WARNING' @ [127:60] ==> public final val WARNING: (HighlightSeverity..HighlightSeverity?) defined in com.intellij.lang.annotation.HighlightSeverity[JavaPropertyDescriptor]

'MAVEN_JS_STDLIB_ID' @ [128:89] ==> public val MAVEN_JS_STDLIB_ID: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'FixAddStdlibLocalFix' @ [129:42] ==> public constructor FixAddStdlibLocalFix(pomFile: XmlFile, id: String, version: String?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.FixAddStdlibLocalFix[ClassConstructorDescriptorImpl]

'domFileElement' @ [129:63] ==> value-parameter domFileElement: DomFileElement<MavenDomProjectModel>? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[ValueParameterDescriptorImpl]

'file' @ [129:78] ==> public final val <T : (DomElement..DomElement?)> DomFileElement<MavenDomProjectModel>.file: XmlFile[MyPropertyDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> MavenDomProjectModel

'MAVEN_JS_STDLIB_ID' @ [129:84] ==> public val MAVEN_JS_STDLIB_ID: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'kotlinPlugin' @ [129:104] ==> val kotlinPlugin: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'version' @ [129:117] ==> public final val MavenDomPlugin.version: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'rawText' @ [129:125] ==> public final val <T : (Any..Any?)> GenericDomValue<(String..String?)>.rawText: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'pom' @ [134:34] ==> val pom: PomFile defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'findDependencies' @ [134:38] ==> public final fun findDependencies(artifact: MavenId, scope: MavenArtifactScope? = ...): List<(MavenDomDependency..MavenDomDependency?)> defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'MavenId' @ [134:55] ==> public constructor MavenId(@Nullable p0: String?, @Nullable p1: String?, @Nullable p2: String?) defined in org.jetbrains.idea.maven.model.MavenId[JavaClassConstructorDescriptor]

'KotlinMavenConfigurator' @ [134:63] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator[FakeCallableDescriptorForObject]

'GROUP_ID' @ [134:87] ==> public final val GROUP_ID: String defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[PropertyDescriptorImpl]

'MAVEN_STDLIB_ID' @ [134:97] ==> public val MAVEN_STDLIB_ID: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'!' @ [135:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasJvmExecution' @ [135:14] ==> val hasJvmExecution: Boolean defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'stdlibDependencies' @ [135:33] ==> val stdlibDependencies: List<(MavenDomDependency..MavenDomDependency?)> defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'isNotEmpty' @ [135:52] ==> @InlineOnly public inline fun <T> Collection<(MavenDomDependency..MavenDomDependency?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomDependency..org.jetbrains.idea.maven.dom.model.MavenDomDependency?)

'stdlibDependencies' @ [136:13] ==> val stdlibDependencies: List<(MavenDomDependency..MavenDomDependency?)> defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'forEach' @ [136:32] ==> @HidesMembers public inline fun <T> Iterable<(MavenDomDependency..MavenDomDependency?)>.forEach(action: ((MavenDomDependency..MavenDomDependency?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomDependency..org.jetbrains.idea.maven.dom.model.MavenDomDependency?)

'holder' @ [137:17] ==> value-parameter holder: DomElementAnnotationHolder? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[ValueParameterDescriptorImpl]

'createProblem' @ [137:24] ==> public abstract fun createProblem(@NotNull p0: DomElement, p1: (HighlightSeverity..HighlightSeverity?), p2: (String..String?), vararg p3: (LocalQuickFix..LocalQuickFix?)): (DomElementProblemDescriptor..DomElementProblemDescriptor?) defined in com.intellij.util.xml.highlighting.DomElementAnnotationHolder[JavaMethodDescriptor]

'dep' @ [137:38] ==> value-parameter dep: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'artifactId' @ [137:42] ==> public final val MavenDomDependency.artifactId: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'createStableCopy' @ [137:53] ==> public abstract fun <T : (DomElement..DomElement?)> createStableCopy(): (DomElement..DomElement?) defined in com.intellij.util.xml.GenericDomValue[JavaMethodDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> DomElement

'WARNING' @ [138:56] ==> public final val WARNING: (HighlightSeverity..HighlightSeverity?) defined in com.intellij.lang.annotation.HighlightSeverity[JavaPropertyDescriptor]

'dep' @ [139:50] ==> value-parameter dep: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'artifactId' @ [139:54] ==> public final val MavenDomDependency.artifactId: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'ConfigurePluginExecutionLocalFix' @ [140:38] ==> public constructor ConfigurePluginExecutionLocalFix(module: Module, xmlFile: XmlFile, goal: String, version: String?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.ConfigurePluginExecutionLocalFix[ClassConstructorDescriptorImpl]

'module' @ [140:71] ==> val module: Module defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'domFileElement' @ [140:79] ==> value-parameter domFileElement: DomFileElement<MavenDomProjectModel>? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[ValueParameterDescriptorImpl]

'file' @ [140:94] ==> public final val <T : (DomElement..DomElement?)> DomFileElement<MavenDomProjectModel>.file: XmlFile[MyPropertyDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> MavenDomProjectModel

'PomFile' @ [140:100] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'Compile' @ [140:120] ==> public final val Compile: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'dep' @ [140:129] ==> value-parameter dep: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [140:133] ==> public final val MavenDomDependency.version: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'rawText' @ [140:141] ==> public final val <T : (Any..Any?)> GenericDomValue<(String..String?)>.rawText: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'pom' @ [144:36] ==> val pom: PomFile defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'findDependencies' @ [144:40] ==> public final fun findDependencies(artifact: MavenId, scope: MavenArtifactScope? = ...): List<(MavenDomDependency..MavenDomDependency?)> defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'MavenId' @ [144:57] ==> public constructor MavenId(@Nullable p0: String?, @Nullable p1: String?, @Nullable p2: String?) defined in org.jetbrains.idea.maven.model.MavenId[JavaClassConstructorDescriptor]

'KotlinMavenConfigurator' @ [144:65] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator[FakeCallableDescriptorForObject]

'GROUP_ID' @ [144:89] ==> public final val GROUP_ID: String defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[PropertyDescriptorImpl]

'MAVEN_JS_STDLIB_ID' @ [144:99] ==> public val MAVEN_JS_STDLIB_ID: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'!' @ [145:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasJsExecution' @ [145:14] ==> val hasJsExecution: Boolean defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'stdlibJsDependencies' @ [145:32] ==> val stdlibJsDependencies: List<(MavenDomDependency..MavenDomDependency?)> defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'isNotEmpty' @ [145:53] ==> @InlineOnly public inline fun <T> Collection<(MavenDomDependency..MavenDomDependency?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomDependency..org.jetbrains.idea.maven.dom.model.MavenDomDependency?)

'stdlibJsDependencies' @ [146:13] ==> val stdlibJsDependencies: List<(MavenDomDependency..MavenDomDependency?)> defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'forEach' @ [146:34] ==> @HidesMembers public inline fun <T> Iterable<(MavenDomDependency..MavenDomDependency?)>.forEach(action: ((MavenDomDependency..MavenDomDependency?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomDependency..org.jetbrains.idea.maven.dom.model.MavenDomDependency?)

'holder' @ [147:17] ==> value-parameter holder: DomElementAnnotationHolder? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[ValueParameterDescriptorImpl]

'createProblem' @ [147:24] ==> public abstract fun createProblem(@NotNull p0: DomElement, p1: (HighlightSeverity..HighlightSeverity?), p2: (String..String?), vararg p3: (LocalQuickFix..LocalQuickFix?)): (DomElementProblemDescriptor..DomElementProblemDescriptor?) defined in com.intellij.util.xml.highlighting.DomElementAnnotationHolder[JavaMethodDescriptor]

'dep' @ [147:38] ==> value-parameter dep: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'artifactId' @ [147:42] ==> public final val MavenDomDependency.artifactId: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'createStableCopy' @ [147:53] ==> public abstract fun <T : (DomElement..DomElement?)> createStableCopy(): (DomElement..DomElement?) defined in com.intellij.util.xml.GenericDomValue[JavaMethodDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> DomElement

'WARNING' @ [148:56] ==> public final val WARNING: (HighlightSeverity..HighlightSeverity?) defined in com.intellij.lang.annotation.HighlightSeverity[JavaPropertyDescriptor]

'dep' @ [149:50] ==> value-parameter dep: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'artifactId' @ [149:54] ==> public final val MavenDomDependency.artifactId: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'ConfigurePluginExecutionLocalFix' @ [150:38] ==> public constructor ConfigurePluginExecutionLocalFix(module: Module, xmlFile: XmlFile, goal: String, version: String?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.ConfigurePluginExecutionLocalFix[ClassConstructorDescriptorImpl]

'module' @ [150:71] ==> val module: Module defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'domFileElement' @ [150:79] ==> value-parameter domFileElement: DomFileElement<MavenDomProjectModel>? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[ValueParameterDescriptorImpl]

'file' @ [150:94] ==> public final val <T : (DomElement..DomElement?)> DomFileElement<MavenDomProjectModel>.file: XmlFile[MyPropertyDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> MavenDomProjectModel

'PomFile' @ [150:100] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'Js' @ [150:120] ==> public final val Js: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'dep' @ [150:124] ==> value-parameter dep: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [150:128] ==> public final val MavenDomDependency.version: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'rawText' @ [150:136] ==> public final val <T : (Any..Any?)> GenericDomValue<(String..String?)>.rawText: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'pom' @ [154:9] ==> val pom: PomFile defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[LocalVariableDescriptor]

'findKotlinExecutions' @ [154:13] ==> public final fun findKotlinExecutions(): List<(MavenDomPluginExecution..MavenDomPluginExecution?)> defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'filter' @ [154:36] ==> public inline fun <T> Iterable<(MavenDomPluginExecution..MavenDomPluginExecution?)>.filter(predicate: ((MavenDomPluginExecution..MavenDomPluginExecution?)) -> Boolean): List<(MavenDomPluginExecution..MavenDomPluginExecution?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomPluginExecution..org.jetbrains.idea.maven.dom.model.MavenDomPluginExecution?)

'it' @ [155:13] ==> value-parameter it: (MavenDomPluginExecution..MavenDomPluginExecution?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'goals' @ [155:16] ==> public final val MavenDomPluginExecution.goals: MavenDomGoals[MyPropertyDescriptor]

'goals' @ [155:22] ==> public final val MavenDomGoals.goals: (MutableList<(MavenDomGoal..MavenDomGoal?)>..List<(MavenDomGoal..MavenDomGoal?)>?)[MyPropertyDescriptor]

'any' @ [155:28] ==> public inline fun <T> Iterable<(MavenDomGoal..MavenDomGoal?)>.any(predicate: ((MavenDomGoal..MavenDomGoal?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomGoal..org.jetbrains.idea.maven.dom.model.MavenDomGoal?)

'it' @ [155:34] ==> value-parameter it: (MavenDomGoal..MavenDomGoal?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'rawText' @ [155:37] ==> public final val MavenDomGoal.rawText: (String..String?)[MyPropertyDescriptor]

'PomFile' @ [155:48] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'Compile' @ [155:68] ==> public final val Compile: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'it' @ [155:79] ==> value-parameter it: (MavenDomGoal..MavenDomGoal?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'rawText' @ [155:82] ==> public final val MavenDomGoal.rawText: (String..String?)[MyPropertyDescriptor]

'PomFile' @ [155:93] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'Js' @ [155:113] ==> public final val Js: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'it' @ [156:16] ==> value-parameter it: (MavenDomPluginExecution..MavenDomPluginExecution?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'goals' @ [156:19] ==> public final val MavenDomPluginExecution.goals: MavenDomGoals[MyPropertyDescriptor]

'goals' @ [156:25] ==> public final val MavenDomGoals.goals: (MutableList<(MavenDomGoal..MavenDomGoal?)>..List<(MavenDomGoal..MavenDomGoal?)>?)[MyPropertyDescriptor]

'any' @ [156:31] ==> public inline fun <T> Iterable<(MavenDomGoal..MavenDomGoal?)>.any(predicate: ((MavenDomGoal..MavenDomGoal?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomGoal..org.jetbrains.idea.maven.dom.model.MavenDomGoal?)

'it' @ [156:37] ==> value-parameter it: (MavenDomGoal..MavenDomGoal?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'rawText' @ [156:40] ==> public final val MavenDomGoal.rawText: (String..String?)[MyPropertyDescriptor]

'PomFile' @ [156:51] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'TestCompile' @ [156:71] ==> public final val TestCompile: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'it' @ [156:86] ==> value-parameter it: (MavenDomGoal..MavenDomGoal?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'rawText' @ [156:89] ==> public final val MavenDomGoal.rawText: (String..String?)[MyPropertyDescriptor]

'PomFile' @ [156:100] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'TestJs' @ [156:120] ==> public final val TestJs: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'forEach' @ [157:11] ==> @HidesMembers public inline fun <T> Iterable<(MavenDomPluginExecution..MavenDomPluginExecution?)>.forEach(action: ((MavenDomPluginExecution..MavenDomPluginExecution?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomPluginExecution..org.jetbrains.idea.maven.dom.model.MavenDomPluginExecution?)

'holder' @ [158:13] ==> value-parameter holder: DomElementAnnotationHolder? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement[ValueParameterDescriptorImpl]

'createProblem' @ [158:20] ==> @NotNull public abstract fun createProblem(@NotNull p0: DomElement, p1: (HighlightSeverity..HighlightSeverity?), p2: (String..String?)): DomElementProblemDescriptor defined in com.intellij.util.xml.highlighting.DomElementAnnotationHolder[JavaMethodDescriptor]

'badExecution' @ [158:34] ==> value-parameter badExecution: (MavenDomPluginExecution..MavenDomPluginExecution?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'goals' @ [158:47] ==> public final val MavenDomPluginExecution.goals: MavenDomGoals[MyPropertyDescriptor]

'createStableCopy' @ [158:53] ==> public abstract fun <T : (DomElement..DomElement?)> createStableCopy(): (DomElement..DomElement?) defined in org.jetbrains.idea.maven.dom.model.MavenDomGoals[JavaMethodDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> DomElement

'WEAK_WARNING' @ [159:52] ==> public final val WEAK_WARNING: (HighlightSeverity..HighlightSeverity?) defined in com.intellij.lang.annotation.HighlightSeverity[JavaPropertyDescriptor]

'goal' @ [165:43] ==> public final val goal: String defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.AddExecutionLocalFix[PropertyDescriptorImpl]

'PomFile' @ [170:13] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'forFileOrNull' @ [170:21] ==> public final fun forFileOrNull(xmlFile: XmlFile): PomFile? defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion[SimpleFunctionDescriptorImpl]

'file' @ [170:35] ==> public final val file: XmlFile defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.AddExecutionLocalFix[PropertyDescriptorImpl]

'addKotlinExecution' @ [170:42] ==> public final fun addKotlinExecution(module: Module, plugin: MavenDomPlugin, executionId: String, phase: String, isTest: Boolean, goals: List<String>): Unit defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'module' @ [170:61] ==> public final val module: Module defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.AddExecutionLocalFix[PropertyDescriptorImpl]

'kotlinPlugin' @ [170:69] ==> public final val kotlinPlugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.AddExecutionLocalFix[PropertyDescriptorImpl]

'goal' @ [170:83] ==> public final val goal: String defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.AddExecutionLocalFix[PropertyDescriptorImpl]

'PomFile' @ [170:89] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'getPhase' @ [170:97] ==> @Deprecated public final fun getPhase(hasJavaFiles: Boolean, isTest: Boolean): String defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion[SimpleFunctionDescriptorImpl]

'module' @ [170:106] ==> public final val module: Module defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.AddExecutionLocalFix[PropertyDescriptorImpl]

'hasJavaFiles' @ [170:113] ==> public fun Module.hasJavaFiles(): Boolean defined in org.jetbrains.kotlin.idea.maven.inspections in file KotlinMavenPluginPhaseInspection.kt[SimpleFunctionDescriptorImpl]

'listOf' @ [170:144] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'goal' @ [170:151] ==> public final val goal: String defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.AddExecutionLocalFix[PropertyDescriptorImpl]

'newPhase' @ [175:52] ==> public final val newPhase: String defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.FixExecutionPhaseLocalFix[PropertyDescriptorImpl]

'execution' @ [180:13] ==> public final val execution: MavenDomPluginExecution defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.FixExecutionPhaseLocalFix[PropertyDescriptorImpl]

'phase' @ [180:23] ==> public final val MavenDomPluginExecution.phase: GenericDomValue<(String..String?)>[MyPropertyDescriptor]

'value' @ [180:29] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.value: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'newPhase' @ [180:37] ==> public final val newPhase: String defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.FixExecutionPhaseLocalFix[PropertyDescriptorImpl]

'name' @ [186:40] ==> public final val KotlinMavenPluginPhaseInspection.AddJavaExecutionsLocalFix.name: String[MyPropertyDescriptor]

'PomFile' @ [189:13] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'forFileOrNull' @ [189:21] ==> public final fun forFileOrNull(xmlFile: XmlFile): PomFile? defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion[SimpleFunctionDescriptorImpl]

'file' @ [189:35] ==> public final val file: XmlFile defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.AddJavaExecutionsLocalFix[PropertyDescriptorImpl]

'addJavacExecutions' @ [189:42] ==> public final fun addJavacExecutions(module: Module, kotlinPlugin: MavenDomPlugin): Unit defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'module' @ [189:61] ==> public final val module: Module defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.AddJavaExecutionsLocalFix[PropertyDescriptorImpl]

'kotlinPlugin' @ [189:69] ==> public final val kotlinPlugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.AddJavaExecutionsLocalFix[PropertyDescriptorImpl]

'id' @ [194:40] ==> public final val id: String defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.FixAddStdlibLocalFix[PropertyDescriptorImpl]

'PomFile' @ [198:13] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'forFileOrNull' @ [198:21] ==> public final fun forFileOrNull(xmlFile: XmlFile): PomFile? defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion[SimpleFunctionDescriptorImpl]

'pomFile' @ [198:35] ==> public final val pomFile: XmlFile defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.FixAddStdlibLocalFix[PropertyDescriptorImpl]

'addDependency' @ [198:45] ==> public final fun addDependency(artifact: MavenId, scope: MavenArtifactScope? = ..., classifier: String? = ..., optional: Boolean = ..., systemPath: String? = ...): MavenDomDependency defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'MavenId' @ [198:59] ==> public constructor MavenId(@Nullable p0: String?, @Nullable p1: String?, @Nullable p2: String?) defined in org.jetbrains.idea.maven.model.MavenId[JavaClassConstructorDescriptor]

'KotlinMavenConfigurator' @ [198:67] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator[FakeCallableDescriptorForObject]

'GROUP_ID' @ [198:91] ==> public final val GROUP_ID: String defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[PropertyDescriptorImpl]

'id' @ [198:101] ==> public final val id: String defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.FixAddStdlibLocalFix[PropertyDescriptorImpl]

'version' @ [198:105] ==> public final val version: String? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.FixAddStdlibLocalFix[PropertyDescriptorImpl]

'COMPILE' @ [198:134] ==> enum entry COMPILE defined in org.jetbrains.idea.maven.utils.MavenArtifactScope[FakeCallableDescriptorForObject]

'goal' @ [203:43] ==> public final val goal: String defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.ConfigurePluginExecutionLocalFix[PropertyDescriptorImpl]

'PomFile' @ [207:13] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'forFileOrNull' @ [207:21] ==> public final fun forFileOrNull(xmlFile: XmlFile): PomFile? defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion[SimpleFunctionDescriptorImpl]

'xmlFile' @ [207:35] ==> public final val xmlFile: XmlFile defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.ConfigurePluginExecutionLocalFix[PropertyDescriptorImpl]

'let' @ [207:45] ==> @InlineOnly public inline fun <T, R> PomFile.let(block: (PomFile) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PomFile
    <R> -> Unit

'pom' @ [208:30] ==> value-parameter pom: PomFile defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.ConfigurePluginExecutionLocalFix.applyFix.<anonymous>[ValueParameterDescriptorImpl]

'addKotlinPlugin' @ [208:34] ==> public final fun addKotlinPlugin(version: String?): MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'version' @ [208:50] ==> public final val version: String? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.ConfigurePluginExecutionLocalFix[PropertyDescriptorImpl]

'pom' @ [209:17] ==> value-parameter pom: PomFile defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.ConfigurePluginExecutionLocalFix.applyFix.<anonymous>[ValueParameterDescriptorImpl]

'addKotlinExecution' @ [209:21] ==> public final fun addKotlinExecution(module: Module, plugin: MavenDomPlugin, executionId: String, phase: String, isTest: Boolean, goals: List<String>): Unit defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'module' @ [209:40] ==> public final val module: Module defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.ConfigurePluginExecutionLocalFix[PropertyDescriptorImpl]

'plugin' @ [209:48] ==> val plugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.ConfigurePluginExecutionLocalFix.applyFix.<anonymous>[LocalVariableDescriptor]

'PomFile' @ [209:67] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'getPhase' @ [209:75] ==> @Deprecated public final fun getPhase(hasJavaFiles: Boolean, isTest: Boolean): String defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion[SimpleFunctionDescriptorImpl]

'module' @ [209:84] ==> public final val module: Module defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.ConfigurePluginExecutionLocalFix[PropertyDescriptorImpl]

'hasJavaFiles' @ [209:91] ==> public fun Module.hasJavaFiles(): Boolean defined in org.jetbrains.kotlin.idea.maven.inspections in file KotlinMavenPluginPhaseInspection.kt[SimpleFunctionDescriptorImpl]

'listOf' @ [209:122] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'goal' @ [209:129] ==> public final val goal: String defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection.ConfigurePluginExecutionLocalFix[PropertyDescriptorImpl]

'containsFileOfType' @ [216:26] ==> public open fun containsFileOfType(@NotNull p0: FileType, @NotNull p1: GlobalSearchScope): Boolean defined in com.intellij.psi.search.FileTypeIndex[JavaMethodDescriptor]

'INSTANCE' @ [216:58] ==> public final val INSTANCE: (JavaFileType..JavaFileType?) defined in com.intellij.ide.highlighter.JavaFileType[JavaPropertyDescriptor]

'moduleScope' @ [216:86] ==> @NotNull public open fun moduleScope(@NotNull p0: Module): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'this' @ [216:98] ==> <this> defined in org.jetbrains.kotlin.idea.maven.inspections.hasJavaFiles[ReceiverParameterDescriptorImpl]

'groupId' @ [219:49] ==> public final val MavenPlugin.groupId: (String..String?)[MyPropertyDescriptor]

'KotlinMavenConfigurator' @ [219:60] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator[FakeCallableDescriptorForObject]

'GROUP_ID' @ [219:84] ==> public final val GROUP_ID: String defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[PropertyDescriptorImpl]

'artifactId' @ [220:52] ==> public final val MavenPlugin.artifactId: (String..String?)[MyPropertyDescriptor]

'KotlinMavenConfigurator' @ [220:66] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator[FakeCallableDescriptorForObject]

'MAVEN_PLUGIN_ID' @ [220:90] ==> public final val MAVEN_PLUGIN_ID: String defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[PropertyDescriptorImpl]

'rawText' @ [222:39] ==> public final val MavenDomGoal.rawText: (String..String?)[MyPropertyDescriptor]

'PomFile' @ [222:50] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'Js' @ [222:70] ==> public final val Js: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'rawText' @ [222:76] ==> public final val MavenDomGoal.rawText: (String..String?)[MyPropertyDescriptor]

'PomFile' @ [222:87] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'TestJs' @ [222:107] ==> public final val TestJs: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'filter' @ [224:71] ==> public inline fun <T> Iterable<MavenDomPluginExecution>.filter(predicate: (MavenDomPluginExecution) -> Boolean): List<MavenDomPluginExecution> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenDomPluginExecution

'it' @ [224:80] ==> value-parameter it: MavenDomPluginExecution defined in org.jetbrains.kotlin.idea.maven.inspections.notAtPhase.<anonymous>[ValueParameterDescriptorImpl]

'phase' @ [224:83] ==> public final val MavenDomPluginExecution.phase: GenericDomValue<(String..String?)>[MyPropertyDescriptor]

'stringValue' @ [224:89] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'phase' @ [224:104] ==> value-parameter phase: String defined in org.jetbrains.kotlin.idea.maven.inspections.notAtPhase[ValueParameterDescriptorImpl]

