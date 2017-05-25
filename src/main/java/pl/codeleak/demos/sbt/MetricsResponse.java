package com.example.springbootthymeleafmmetrics;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MetricsResponse {

    @JsonProperty("mem")
    private Integer mem;

    @JsonProperty("mem.free")
    private Integer memFree;

    @JsonProperty("processors")
    private Integer processors;

    @JsonProperty("instance.uptime")
    private Integer instanceUptime;

    @JsonProperty("uptime")
    private Integer uptime;

    @JsonProperty("systemload.average")
    private Integer systemloadAverage;

    @JsonProperty("heap.committed")
    private Integer heapCommitted;

    @JsonProperty("heap.init")
    private Integer heapInit;

    @JsonProperty("heap.used")
    private Integer heapUsed;

    @JsonProperty("heap")
    private Integer heap;

    @JsonProperty("nonheap.committed")
    private Integer nonheapCommitted;

    @JsonProperty("nonheap.init")
    private Integer nonheapInit;

    @JsonProperty("nonheap.used")
    private Integer nonheapUsed;

    @JsonProperty("nonheap")
    private Integer nonheap;

    @JsonProperty("threads.peak")
    private Integer threadsPeak;

    @JsonProperty("threads.daemon")
    private Integer threadsDaemon;

    @JsonProperty("threads.totalStarted")
    private Integer threadsTotalStarted;

    @JsonProperty("threads")
    private Integer threads;

    @JsonProperty("classes")
    private Integer classes;

    @JsonProperty("classes.loaded")
    private Integer classesLoaded;

    @JsonProperty("classes.unloaded")
    private Integer classesUnloaded;

    @JsonProperty("gc.ps_scavenge.count")
    private Integer gcPsScavengeCount;

    @JsonProperty("gc.ps_scavenge.time")
    private Integer gcPsScavengeTime;

    @JsonProperty("gc.ps_marksweep.count")
    private Integer gcPsMarksweepCount;

    @JsonProperty("gc.ps_marksweep.time")
    private Integer gcPsMarksweepTime;

    @JsonProperty("gauge.response.root")
    private Integer gaugeResponseRoot;

    @JsonProperty("gauge.response.home")
    private Integer gaugeResponseHome;

    @JsonProperty("counter.status.200.root")
    private Integer counterStatus200Root;

    @JsonProperty("counter.status.200.home")
    private Integer counterStatus200Home;

    @JsonProperty("counter.status.404.star-star")
    private Integer counterStatus404StarStar;

    @JsonProperty("gauge.response.star-star")
    private Integer gaugeResponseStarStar;

    @JsonProperty("counter.status.200.metrics")
    private Integer counterStatus200Metrics;

    @JsonProperty("gauge.response.metrics")
    private Integer gaugeResponseMetrics;

    @JsonProperty("httpsessions.max")
    private Integer httpsessionsMax;

    @JsonProperty("httpsessions.active")
    private Integer httpsessionsActive;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("mem")
    public Integer getMem() {
        return mem;
    }

    @JsonProperty("mem")
    public void setMem(Integer mem) {
        this.mem = mem;
    }

    @JsonProperty("mem.free")
    public Integer getMemFree() {
        return memFree;
    }

    @JsonProperty("mem.free")
    public void setMemFree(Integer memFree) {
        this.memFree = memFree;
    }

    @JsonProperty("processors")
    public Integer getProcessors() {
        return processors;
    }

    @JsonProperty("processors")
    public void setProcessors(Integer processors) {
        this.processors = processors;
    }

    @JsonProperty("instance.uptime")
    public Integer getInstanceUptime() {
        return instanceUptime;
    }

    @JsonProperty("instance.uptime")
    public void setInstanceUptime(Integer instanceUptime) {
        this.instanceUptime = instanceUptime;
    }

    @JsonProperty("uptime")
    public Integer getUptime() {
        return uptime;
    }

    @JsonProperty("uptime")
    public void setUptime(Integer uptime) {
        this.uptime = uptime;
    }

    @JsonProperty("systemload.average")
    public Integer getSystemloadAverage() {
        return systemloadAverage;
    }

    @JsonProperty("systemload.average")
    public void setSystemloadAverage(Integer systemloadAverage) {
        this.systemloadAverage = systemloadAverage;
    }

    @JsonProperty("heap.committed")
    public Integer getHeapCommitted() {
        return heapCommitted;
    }

    @JsonProperty("heap.committed")
    public void setHeapCommitted(Integer heapCommitted) {
        this.heapCommitted = heapCommitted;
    }

    @JsonProperty("heap.init")
    public Integer getHeapInit() {
        return heapInit;
    }

    @JsonProperty("heap.init")
    public void setHeapInit(Integer heapInit) {
        this.heapInit = heapInit;
    }

    @JsonProperty("heap.used")
    public Integer getHeapUsed() {
        return heapUsed;
    }

    @JsonProperty("heap.used")
    public void setHeapUsed(Integer heapUsed) {
        this.heapUsed = heapUsed;
    }

    @JsonProperty("heap")
    public Integer getHeap() {
        return heap;
    }

    @JsonProperty("heap")
    public void setHeap(Integer heap) {
        this.heap = heap;
    }

    @JsonProperty("nonheap.committed")
    public Integer getNonheapCommitted() {
        return nonheapCommitted;
    }

    @JsonProperty("nonheap.committed")
    public void setNonheapCommitted(Integer nonheapCommitted) {
        this.nonheapCommitted = nonheapCommitted;
    }

    @JsonProperty("nonheap.init")
    public Integer getNonheapInit() {
        return nonheapInit;
    }

    @JsonProperty("nonheap.init")
    public void setNonheapInit(Integer nonheapInit) {
        this.nonheapInit = nonheapInit;
    }

    @JsonProperty("nonheap.used")
    public Integer getNonheapUsed() {
        return nonheapUsed;
    }

    @JsonProperty("nonheap.used")
    public void setNonheapUsed(Integer nonheapUsed) {
        this.nonheapUsed = nonheapUsed;
    }

    @JsonProperty("nonheap")
    public Integer getNonheap() {
        return nonheap;
    }

    @JsonProperty("nonheap")
    public void setNonheap(Integer nonheap) {
        this.nonheap = nonheap;
    }

    @JsonProperty("threads.peak")
    public Integer getThreadsPeak() {
        return threadsPeak;
    }

    @JsonProperty("threads.peak")
    public void setThreadsPeak(Integer threadsPeak) {
        this.threadsPeak = threadsPeak;
    }

    @JsonProperty("threads.daemon")
    public Integer getThreadsDaemon() {
        return threadsDaemon;
    }

    @JsonProperty("threads.daemon")
    public void setThreadsDaemon(Integer threadsDaemon) {
        this.threadsDaemon = threadsDaemon;
    }

    @JsonProperty("threads.totalStarted")
    public Integer getThreadsTotalStarted() {
        return threadsTotalStarted;
    }

    @JsonProperty("threads.totalStarted")
    public void setThreadsTotalStarted(Integer threadsTotalStarted) {
        this.threadsTotalStarted = threadsTotalStarted;
    }

    @JsonProperty("threads")
    public Integer getThreads() {
        return threads;
    }

    @JsonProperty("threads")
    public void setThreads(Integer threads) {
        this.threads = threads;
    }

    @JsonProperty("classes")
    public Integer getClasses() {
        return classes;
    }

    @JsonProperty("classes")
    public void setClasses(Integer classes) {
        this.classes = classes;
    }

    @JsonProperty("classes.loaded")
    public Integer getClassesLoaded() {
        return classesLoaded;
    }

    @JsonProperty("classes.loaded")
    public void setClassesLoaded(Integer classesLoaded) {
        this.classesLoaded = classesLoaded;
    }

    @JsonProperty("classes.unloaded")
    public Integer getClassesUnloaded() {
        return classesUnloaded;
    }

    @JsonProperty("classes.unloaded")
    public void setClassesUnloaded(Integer classesUnloaded) {
        this.classesUnloaded = classesUnloaded;
    }

    @JsonProperty("gc.ps_scavenge.count")
    public Integer getGcPsScavengeCount() {
        return gcPsScavengeCount;
    }

    @JsonProperty("gc.ps_scavenge.count")
    public void setGcPsScavengeCount(Integer gcPsScavengeCount) {
        this.gcPsScavengeCount = gcPsScavengeCount;
    }

    @JsonProperty("gc.ps_scavenge.time")
    public Integer getGcPsScavengeTime() {
        return gcPsScavengeTime;
    }

    @JsonProperty("gc.ps_scavenge.time")
    public void setGcPsScavengeTime(Integer gcPsScavengeTime) {
        this.gcPsScavengeTime = gcPsScavengeTime;
    }

    @JsonProperty("gc.ps_marksweep.count")
    public Integer getGcPsMarksweepCount() {
        return gcPsMarksweepCount;
    }

    @JsonProperty("gc.ps_marksweep.count")
    public void setGcPsMarksweepCount(Integer gcPsMarksweepCount) {
        this.gcPsMarksweepCount = gcPsMarksweepCount;
    }

    @JsonProperty("gc.ps_marksweep.time")
    public Integer getGcPsMarksweepTime() {
        return gcPsMarksweepTime;
    }

    @JsonProperty("gc.ps_marksweep.time")
    public void setGcPsMarksweepTime(Integer gcPsMarksweepTime) {
        this.gcPsMarksweepTime = gcPsMarksweepTime;
    }

    @JsonProperty("gauge.response.root")
    public Integer getGaugeResponseRoot() {
        return gaugeResponseRoot;
    }

    @JsonProperty("gauge.response.root")
    public void setGaugeResponseRoot(Integer gaugeResponseRoot) {
        this.gaugeResponseRoot = gaugeResponseRoot;
    }

    @JsonProperty("gauge.response.home")
    public Integer getGaugeResponseHome() {
        return gaugeResponseHome;
    }

    @JsonProperty("gauge.response.home")
    public void setGaugeResponseHome(Integer gaugeResponseHome) {
        this.gaugeResponseHome = gaugeResponseHome;
    }

    @JsonProperty("counter.status.200.root")
    public Integer getCounterStatus200Root() {
        return counterStatus200Root;
    }

    @JsonProperty("counter.status.200.root")
    public void setCounterStatus200Root(Integer counterStatus200Root) {
        this.counterStatus200Root = counterStatus200Root;
    }

    @JsonProperty("counter.status.200.home")
    public Integer getCounterStatus200Home() {
        return counterStatus200Home;
    }

    @JsonProperty("counter.status.200.home")
    public void setCounterStatus200Home(Integer counterStatus200Home) {
        this.counterStatus200Home = counterStatus200Home;
    }

    @JsonProperty("counter.status.404.star-star")
    public Integer getCounterStatus404StarStar() {
        return counterStatus404StarStar;
    }

    @JsonProperty("counter.status.404.star-star")
    public void setCounterStatus404StarStar(Integer counterStatus404StarStar) {
        this.counterStatus404StarStar = counterStatus404StarStar;
    }

    @JsonProperty("gauge.response.star-star")
    public Integer getGaugeResponseStarStar() {
        return gaugeResponseStarStar;
    }

    @JsonProperty("gauge.response.star-star")
    public void setGaugeResponseStarStar(Integer gaugeResponseStarStar) {
        this.gaugeResponseStarStar = gaugeResponseStarStar;
    }

    @JsonProperty("counter.status.200.metrics")
    public Integer getCounterStatus200Metrics() {
        return counterStatus200Metrics;
    }

    @JsonProperty("counter.status.200.metrics")
    public void setCounterStatus200Metrics(Integer counterStatus200Metrics) {
        this.counterStatus200Metrics = counterStatus200Metrics;
    }

    @JsonProperty("gauge.response.metrics")
    public Integer getGaugeResponseMetrics() {
        return gaugeResponseMetrics;
    }

    @JsonProperty("gauge.response.metrics")
    public void setGaugeResponseMetrics(Integer gaugeResponseMetrics) {
        this.gaugeResponseMetrics = gaugeResponseMetrics;
    }

    @JsonProperty("httpsessions.max")
    public Integer getHttpsessionsMax() {
        return httpsessionsMax;
    }

    @JsonProperty("httpsessions.max")
    public void setHttpsessionsMax(Integer httpsessionsMax) {
        this.httpsessionsMax = httpsessionsMax;
    }

    @JsonProperty("httpsessions.active")
    public Integer getHttpsessionsActive() {
        return httpsessionsActive;
    }

    @JsonProperty("httpsessions.active")
    public void setHttpsessionsActive(Integer httpsessionsActive) {
        this.httpsessionsActive = httpsessionsActive;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
